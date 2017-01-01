package com.jgabrielfreitas.provider.demo.view.ui.todo

import com.jgabrielfreitas.alfred.Receiver
import com.jgabrielfreitas.provider.demo.model.Todo
import com.jgabrielfreitas.provider.demo.provider.TodoItemsProvider
import com.jgabrielfreitas.provider.demo.view.ui.BaseActivity as base

/**
 * Created by JGabrielFreitas on 31/12/16.
 */
class TodoListPresenterImpl(activity: base, val callback: TodoCallback) : TodoListPresenter, Receiver<MutableList<Todo>> {

    var listViewContent: MutableList<Todo> = mutableListOf()

    init {
        TodoItemsProvider(this)
    }

    override fun onReceiveData(data: MutableList<Todo>) {
        listViewContent = data
    }

    override fun onUpdate(data: MutableList<Todo>) {
        for (newData in data)
            listViewContent.add(newData)

        callback.onUpdate(getTodos())
    }

    override fun getTodos(): MutableList<Todo> {
        return listViewContent
    }
}