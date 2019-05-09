package com.idima.app.mvvm.ui.main.rating;

import com.idima.app.mvvm.data.DataManager;
import com.idima.app.mvvm.utils.rx.SchedulerProvider;
import com.idima.app.mvvm.ui.base.BaseViewModel;

/**
 * Created by idima on 8/01/18.
 */

public class RateUsViewModel extends BaseViewModel<RateUsCallback> {

    public RateUsViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void onLaterClick() {
        getNavigator().dismissDialog();
    }

    public void onSubmitClick() {
        getNavigator().dismissDialog();
    }
}
