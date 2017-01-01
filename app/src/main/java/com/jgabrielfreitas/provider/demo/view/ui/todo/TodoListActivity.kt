package com.jgabrielfreitas.provider.demo.view.ui.todo

import android.R.layout.simple_list_item_1 as default_list
import android.os.Bundle
import android.widget.ArrayAdapter
import com.jgabrielfreitas.layoutid.annotations.InjectLayout
import com.jgabrielfreitas.provider.demo.R
import com.jgabrielfreitas.provider.demo.model.Todo
import com.jgabrielfreitas.provider.demo.view.ui.BaseActivity
import kotlinx.android.synthetic.main.activity_todo_list.todoListView

@InjectLayout(layout = R.layout.activity_todo_list)
class TodoListActivity : BaseActivity(), TodoCallback {

    val presenterImplementation: TodoListPresenter by lazy { TodoListPresenterImpl(this, this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setAdapter(presenterImplementation.getTodos())
    }

    // if has any new todo, update list
    override fun onUpdate(todoUpdated: MutableList<Todo>) {
        setAdapter(todoUpdated)
    }

    // set todos to UI
    private fun setAdapter(list: MutableList<Todo>) {
        val arrayAdapter: ArrayAdapter<Todo> = ArrayAdapter(this, default_list, list)
        todoListView.adapter = arrayAdapter
    }

}
