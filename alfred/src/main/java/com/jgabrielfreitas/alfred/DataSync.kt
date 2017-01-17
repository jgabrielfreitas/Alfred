package com.jgabrielfreitas.alfred

/**
 * Created by JGabrielFreitas on 17/01/17.
 */
interface DataSync<Type> {

    fun save(type:Type) {}

    fun delete(id:Int) {}

    fun update(type:Type) {}

}