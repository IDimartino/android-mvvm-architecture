package com.idima.app.mvvm.di.module;

import android.app.Application;
import androidx.room.Room;
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.idima.app.mvvm.data.AppDataManager;
import com.idima.app.mvvm.data.DataManager;
import com.idima.app.mvvm.data.local.db.AppDatabase;
import com.idima.app.mvvm.data.local.db.AppDbHelper;
import com.idima.app.mvvm.data.local.db.DbHelper;
import com.idima.app.mvvm.data.local.prefs.AppPreferencesHelper;
import com.idima.app.mvvm.data.local.prefs.PreferencesHelper;
import com.idima.app.mvvm.data.remote.ApiHeader;
import com.idima.app.mvvm.data.remote.ApiHelper;
import com.idima.app.mvvm.data.remote.AppApiHelper;
import com.idima.app.mvvm.di.DatabaseInfo;
import com.idima.app.mvvm.utils.AppConstants;
import com.idima.app.mvvm.utils.rx.AppSchedulerProvider;
import com.idima.app.mvvm.utils.rx.SchedulerProvider;
import com.idima.app.mvvm.BuildConfig;
import com.idima.app.mvvm.R;
import com.idima.app.mvvm.di.ApiInfo;
import com.idima.app.mvvm.di.PreferenceInfo;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Module
public class AppModule {

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @Singleton
    AppDatabase provideAppDatabase(@DatabaseInfo String dbName, Context context) {
        return Room.databaseBuilder(context, AppDatabase.class, dbName).fallbackToDestructiveMigration()
                .build();
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @Singleton
    DbHelper provideDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(@ApiInfo String apiKey,
                                                           PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                preferencesHelper.getCurrentUserId(),
                preferencesHelper.getAccessToken());
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

}
