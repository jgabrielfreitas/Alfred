package com.jgabrielfreitas.alfred

/**
 * Created by JGabrielFreitas on 31/12/16.
 */

interface Receiver<DataType> {

  fun onReceiveData(data: DataType)

  fun onUpdate(data: DataType)

}
