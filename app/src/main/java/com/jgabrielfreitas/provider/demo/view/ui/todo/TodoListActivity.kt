package com.jgabrielfreitas.provider.demo.view.ui.todo

import android.os.Bundle
import android.widget.ArrayAdapter
import com.jgabrielfreitas.layoutid.annotations.InjectLayout
import com.jgabrielfreitas.provider.demo.R
import com.jgabrielfreitas.provider.demo.model.Todo
import com.jgabrielfreitas.provider.demo.view.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_todo_list.todoListView

@InjectLayout(layout = R.layout.activity_todo_list)
class TodoListActivity : BaseActivity() {

  val presenterImplementation: TodoListPresenter by lazy{
    TodoListPresenterImpl(this)
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val arrayAdapter: ArrayAdapter<Todo> = ArrayAdapter(this, android.R.layout.simple_list_item_1, presenterImplementation.getTodos())

    todoListView.adapter = arrayAdapter
  }

}
