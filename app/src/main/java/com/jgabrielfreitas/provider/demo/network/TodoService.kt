package com.jgabrielfreitas.provider.demo.network

import com.jgabrielfreitas.provider.demo.model.Todo
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by JGabrielFreitas on 31/12/16.
 */
interface TodoService {

    @GET("/todo")
    fun getTodoFromApi() : Call<MutableList<Todo>>
}