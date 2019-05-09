package com.idima.app.mvvm.ui.main.rating;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by idima on 14/09/17.
 */
@Module
public abstract class RateUsDialogProvider {

    @ContributesAndroidInjector
    abstract RateUsDialog provideRateUsDialogFactory();
}
