package com.jgabrielfreitas.provider.demo.model

import com.google.gson.annotations.SerializedName

/**
 * Created by JGabrielFreitas on 30/12/16.
 */

class Todo {

  @SerializedName("content")   internal var content : String? = null
  @SerializedName("create_at") internal var createAt: String? = null

}
