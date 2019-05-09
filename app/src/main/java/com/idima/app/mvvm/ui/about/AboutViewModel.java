package com.idima.app.mvvm.ui.about;

import com.idima.app.mvvm.data.DataManager;
import com.idima.app.mvvm.utils.rx.SchedulerProvider;
import com.idima.app.mvvm.ui.base.BaseViewModel;

public class AboutViewModel extends BaseViewModel<AboutNavigator> {

    public AboutViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }

    public void onNavBackClick() {
        getNavigator().goBack();
    }
}
