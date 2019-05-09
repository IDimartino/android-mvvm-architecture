package com.idima.app.mvvm.ui.feed;

import dagger.Module;
import dagger.Provides;

/**
 * Created by idima on 14/09/17.
 */
@Module
public class FeedActivityModule {

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(FeedActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

}
