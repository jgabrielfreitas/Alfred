package com.jgabrielfreitas.alfred

/**
 * Created by JGabrielFreitas on 31/12/16.
 */

abstract class Provider<T>(protected var receiver: Receiver<T>) {

  protected var data: T? = null

  init {
    init()
  }

  protected fun updateData(diffResult: T) {}

  protected abstract fun recoverData(): T

  protected open fun init() {}

  /**
   * For each provider, a new rule to check if is necessary update or not need to be created.
   * The use cases for each provider will be declared here.
   */
  protected abstract val isNecessaryUpdate: Boolean

  /**
   * Receive the older data and newest data to check difference.
   * After that, call onReceiveData() from Receiver

   * @param older  Older data from application, for instance the local data.
   * *
   * @param newest Newest data, for instance the API
   */
  protected abstract fun diff(older: T, newest: T)

}
