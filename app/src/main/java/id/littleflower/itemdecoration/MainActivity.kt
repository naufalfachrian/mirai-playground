package id.littleflower.itemdecoration

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import id.littleflower.itemdecoration.adapter.ChatAdapter
import id.littleflower.itemdecoration.adapter.ChatItemDecoration
import id.littleflower.itemdecoration.model.ChatList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapter: ChatAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ChatAdapter(ChatList.getList(), this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(ChatItemDecoration(adapter!!.sectionCallback(), this))
    }
}
