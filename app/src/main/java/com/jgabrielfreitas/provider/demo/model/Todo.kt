package com.jgabrielfreitas.provider.demo.model

import com.activeandroid.Model
import com.activeandroid.annotation.Table
import com.google.gson.annotations.SerializedName

/**
 * Created by JGabrielFreitas on 30/12/16.
 */

@Table(name = "Todo")
class Todo() { //} : Model() {

    constructor(content: String, createAt: String) : this() {
        this.content  = content
        this.createAt = createAt
    }

    @SerializedName("content")   internal var content : String? = null
    @SerializedName("create_at") internal var createAt: String? = null

    override fun toString(): String {
        return "$content\n$createAt"
    }

}
