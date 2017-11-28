package id.littleflower.itemdecoration.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import id.littleflower.itemdecoration.model.Chat
import id.littleflower.itemdecoration.R
import java.text.SimpleDateFormat
import java.util.*

class ChatAdapter (

        private val chatList: List<Chat>,
        private val context: Context

) : RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textView?.text = chatList[position].content
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.view_item, parent, false))
    }

    override fun getItemCount(): Int {
        return chatList.count()
    }

    fun sectionCallback(): SectionCallback {
        return object : SectionCallback {
            override fun isSection(position: Int): Boolean {
                return position == 0 || chatList[position - 1].timestamp != chatList[position].timestamp
            }

            override fun sectionHeader(position: Int): CharSequence {
                val dateFormatter = SimpleDateFormat("dd MMMM yyyy", Locale.US)
                return dateFormatter.format(chatList[position].timestamp)
            }
        }
    }

    inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView? = itemView?.findViewById<TextView>(R.id.itemText)
    }

    interface SectionCallback {
        fun isSection(position: Int): Boolean
        fun sectionHeader(position: Int): CharSequence
    }
}