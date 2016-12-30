package com.jgabrielfreitas.provider.demo.view.ui.todo

import android.os.Bundle
import android.widget.ArrayAdapter
import com.jgabrielfreitas.layoutid.annotations.InjectLayout
import com.jgabrielfreitas.provider.demo.R
import com.jgabrielfreitas.provider.demo.view.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_todo_list.todoListView

@InjectLayout(layout = R.layout.activity_todo_list)
class TodoListActivity : BaseActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val listViewContent: MutableList<String> = mutableListOf()

    for (i in 0..5)
      listViewContent.add("Blah ${listViewContent.count() + 1}")

    val arrayAdapter: ArrayAdapter<String> = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listViewContent)

    todoListView.adapter = arrayAdapter
  }

}
