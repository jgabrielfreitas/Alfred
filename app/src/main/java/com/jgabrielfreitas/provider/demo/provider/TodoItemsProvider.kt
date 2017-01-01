package com.jgabrielfreitas.provider.demo.provider

import android.util.Log.e
import com.jgabrielfreitas.alfred.Provider
import com.jgabrielfreitas.alfred.Receiver
import com.jgabrielfreitas.provider.demo.model.Todo
import com.jgabrielfreitas.provider.demo.network.LocalhostApi
import org.jetbrains.anko.doAsync
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by JGabrielFreitas on 31/12/16.
 */
class TodoItemsProvider(receiver: Receiver<MutableList<Todo>>) : Provider<MutableList<Todo>>(receiver), Callback<MutableList<Todo>> {

    override fun onResponse(call: Call<MutableList<Todo>>?, response: Response<MutableList<Todo>>) {
        receiver.onUpdate(response.body())
    }

    override fun onFailure(call: Call<MutableList<Todo>>?, t: Throwable?) {
        e("exception", t.toString())
    }

    // just return fake data
    // TODO: select * from database
    override fun recoverData(): MutableList<Todo> {
        val fakeList: MutableList<Todo> = mutableListOf()
        for (i in 0..2)
            fakeList.add(Todo("Todo n${fakeList.count() + 1}", "31/12/2016"))

        doAsync { LocalhostApi.getTodosFromApi(this@TodoItemsProvider) }
        return fakeList
    }

    override fun diff(older: MutableList<Todo>?, newest: MutableList<Todo>?) {
        // filter only the new items
        // and call receiver.onUpdate
    }

    override fun init() {
        receiver.onReceiveData(recoverData())
    }

    override fun isNecessaryUpdate(): Boolean {
        return true
    }
}