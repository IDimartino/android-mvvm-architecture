package com.idima.app.mvvm.ui.feed.opensource;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by idima on 14/09/17.
 */
@Module
public abstract class OpenSourceFragmentProvider {

    @ContributesAndroidInjector(modules = OpenSourceFragmentModule.class)
    abstract OpenSourceFragment provideOpenSourceFragmentFactory();
}
