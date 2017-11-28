package id.littleflower.itemdecoration.adapter

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import id.littleflower.itemdecoration.R

class ChatItemDecoration(

        private val sectionCallback: ChatAdapter.SectionCallback,
        context: Context

) : RecyclerView.ItemDecoration() {

    // Item Decoration Setting
    private val offset = context.resources.getDimensionPixelSize(R.dimen.headerOffset)
    private val sticky = true

    private var headerView: View? = null
    private var headerText: TextView? = null

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.getItemOffsets(outRect, view, parent, state)
        val position = parent?.getChildAdapterPosition(view)
        if (sectionCallback.isSection(position!!)) {
            outRect?.top = offset
        }
    }

    override fun onDrawOver(c: Canvas?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.onDrawOver(c, parent, state)

        if (headerView == null) {
            headerView = inflateHeaderView(parent!!)
            headerText = headerView?.findViewById<TextView>(R.id.headerText)
        }

        var previousHeader: CharSequence = ""
        for (i in 0 until parent!!.childCount) {
            val child = parent.getChildAt(i)
            val position = parent.getChildAdapterPosition(child)
            val title = sectionCallback.sectionHeader(position)
            headerText?.text = title
            fixLayoutSize(headerView, parent)
            if (title != previousHeader && sectionCallback.isSection(position)) {
                drawHeader(c, child, headerView)
                previousHeader = title
            }
        }
    }

    private fun drawHeader(c: Canvas?, child: View, headerView: View?) {
        c?.save()
        if (sticky)
            c?.translate(0f, Math.max(0, child.top - headerView!!.height).toFloat())
        else
            c?.translate(0f, (child.top - headerView!!.height).toFloat())
        headerView?.draw(c)
        c?.restore()
    }

    private fun inflateHeaderView(parent: RecyclerView): View {
        return LayoutInflater.from(parent.context)
                .inflate(R.layout.view_header, parent, false)
    }

    private fun fixLayoutSize(view: View?, parent: RecyclerView) {
        val widthSpec = View.MeasureSpec.makeMeasureSpec(parent.width, View.MeasureSpec.EXACTLY)
        val heightSpec = View.MeasureSpec.makeMeasureSpec(parent.height, View.MeasureSpec.UNSPECIFIED)
        val childWidth = ViewGroup.getChildMeasureSpec(widthSpec, parent.paddingLeft + parent.paddingRight, view?.layoutParams!!.width)
        val childHeight = ViewGroup.getChildMeasureSpec(heightSpec, parent.paddingTop + parent.paddingBottom, view.layoutParams!!.height)
        view.measure(childWidth, childHeight)
        view.layout(0, 0, view.measuredWidth, view.measuredHeight)
    }

}