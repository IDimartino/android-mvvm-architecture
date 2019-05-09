package com.idima.app.mvvm.ui.about;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by idima on 14/09/17.
 */
@Module
public abstract class AboutFragmentProvider {

    @ContributesAndroidInjector
    abstract AboutFragment provideAboutFragmentFactory();
}
