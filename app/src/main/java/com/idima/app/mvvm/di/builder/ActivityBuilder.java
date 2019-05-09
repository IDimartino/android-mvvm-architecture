package com.idima.app.mvvm.di.builder;

import com.idima.app.mvvm.ui.about.AboutFragmentProvider;
import com.idima.app.mvvm.ui.feed.FeedActivity;
import com.idima.app.mvvm.ui.feed.FeedActivityModule;
import com.idima.app.mvvm.ui.feed.blogs.BlogFragmentProvider;
import com.idima.app.mvvm.ui.feed.opensource.OpenSourceFragmentProvider;
import com.idima.app.mvvm.ui.login.LoginActivity;
import com.idima.app.mvvm.ui.main.MainActivity;
import com.idima.app.mvvm.ui.main.rating.RateUsDialogProvider;
import com.idima.app.mvvm.ui.splash.SplashActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {
            FeedActivityModule.class,
            BlogFragmentProvider.class,
            OpenSourceFragmentProvider.class})
    abstract FeedActivity bindFeedActivity();

    @ContributesAndroidInjector
    abstract LoginActivity bindLoginActivity();

    @ContributesAndroidInjector(modules = {
            AboutFragmentProvider.class,
            RateUsDialogProvider.class})
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector
    abstract SplashActivity bindSplashActivity();
}
