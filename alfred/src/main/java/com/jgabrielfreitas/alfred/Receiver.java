package com.jgabrielfreitas.alfred;

import android.support.annotation.NonNull;

/**
 * Created by JGabrielFreitas on 31/12/16.
 */

public interface Receiver<DataType> {

    void onReceiveData(@NonNull DataType data);

    void onUpdate(@NonNull DataType data);

}
