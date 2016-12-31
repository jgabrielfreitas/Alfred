package com.jgabrielfreitas.provider.demo.model

import com.activeandroid.Model
import com.activeandroid.annotation.Table
import com.google.gson.annotations.SerializedName

/**
 * Created by JGabrielFreitas on 30/12/16.
 */

@Table(name = "Todo")
class Todo(content: String, createAt: String) : Model() {

    @SerializedName("content")   internal var content : String? = content
    @SerializedName("create_at") internal var createAt: String? = createAt

    override fun toString(): String {
        return "$content\n$createAt"
    }

}
