package com.idima.app.mvvm.ui.feed;

import com.idima.app.mvvm.data.DataManager;
import com.idima.app.mvvm.utils.rx.SchedulerProvider;
import com.idima.app.mvvm.ui.base.BaseViewModel;

/**
 * Created by Jyoti on 29/07/17.
 */

public class FeedViewModel extends BaseViewModel {

    public FeedViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}
