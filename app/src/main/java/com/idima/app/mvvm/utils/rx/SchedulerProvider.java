package com.idima.app.mvvm.utils.rx;

import io.reactivex.Scheduler;

/**
 * Created by idima on 03/02/18.
 */

public interface SchedulerProvider {

    Scheduler computation();

    Scheduler io();

    Scheduler ui();
}
