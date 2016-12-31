package com.jgabrielfreitas.provider.demo.view.ui.todo

import com.jgabrielfreitas.provider.demo.model.Todo
import com.jgabrielfreitas.provider.demo.view.ui.BaseActivity

/**
 * Created by JGabrielFreitas on 31/12/16.
 */
class TodoListPresenterImpl(activity: BaseActivity) : TodoListPresenter {


    override fun getTodos(): MutableList<Todo> {

        val listViewContent: MutableList<Todo> = mutableListOf()
        for (i in 0..5)
            listViewContent.add(Todo("Todo number....${listViewContent.count() + 1}", "31/12/2016"))

        return listViewContent
    }

}