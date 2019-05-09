package com.idima.app.mvvm.di.component;

import android.app.Application;
import com.idima.app.mvvm.MvvmApp;
import com.idima.app.mvvm.di.builder.ActivityBuilder;
import com.idima.app.mvvm.di.module.AppModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import javax.inject.Singleton;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityBuilder.class})
public interface AppComponent {

    void inject(MvvmApp app);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
