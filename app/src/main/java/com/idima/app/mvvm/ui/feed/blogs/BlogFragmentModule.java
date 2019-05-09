package com.idima.app.mvvm.ui.feed.blogs;

import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.Module;
import dagger.Provides;
import java.util.ArrayList;

/**
 * Created by idima on 14/09/17.
 */
@Module
public class BlogFragmentModule {

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(BlogFragment fragment) {
        return new LinearLayoutManager(fragment.getActivity());
    }
}
