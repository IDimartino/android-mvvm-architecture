package com.idima.app.mvvm.ui.feed.blogs;

import com.idima.app.mvvm.data.model.api.BlogResponse;

import java.util.List;

/**
 * Created by idima on 8/01/18.
 */

public interface BlogNavigator {

    void handleError(Throwable throwable);

    void updateBlog(List<BlogResponse.Blog> blogList);
}
