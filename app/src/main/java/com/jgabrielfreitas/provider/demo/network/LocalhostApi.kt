package com.jgabrielfreitas.provider.demo.network

import com.jgabrielfreitas.provider.demo.model.Todo

import retrofit2.Callback
import retrofit2.Retrofit

import com.jgabrielfreitas.provider.demo.BuildConfig.URL_API
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by JGabrielFreitas on 31/12/16.
 */

object LocalhostApi {

    fun getTodosFromApi(callback: Callback<MutableList<Todo>>) {

        val retrofit = Retrofit.Builder()
                               .baseUrl(URL_API)
                               .addConverterFactory(GsonConverterFactory.create())
                               .build()

        val service = retrofit.create(TodoService::class.java)
        service.getTodoFromApi().enqueue(callback)
    }

}
