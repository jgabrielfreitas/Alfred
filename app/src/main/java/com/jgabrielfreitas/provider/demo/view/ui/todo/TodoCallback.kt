package com.jgabrielfreitas.provider.demo.view.ui.todo

import com.jgabrielfreitas.provider.demo.model.Todo

/**
 * Created by JGabrielFreitas on 31/12/16.
 */
interface TodoCallback {

    fun onUpdate(todoUpdated : MutableList<Todo>)

}