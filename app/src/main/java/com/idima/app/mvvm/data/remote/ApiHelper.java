package com.idima.app.mvvm.data.remote;

import com.idima.app.mvvm.data.model.api.BlogResponse;
import com.idima.app.mvvm.data.model.api.LoginRequest;
import com.idima.app.mvvm.data.model.api.LoginResponse;
import com.idima.app.mvvm.data.model.api.LogoutResponse;
import com.idima.app.mvvm.data.model.api.OpenSourceResponse;
import io.reactivex.Single;

/**
 * Created by amitshekhar on 07/07/17.
 */

public interface ApiHelper {

    Single<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Single<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Single<LogoutResponse> doLogoutApiCall();

    Single<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    ApiHeader getApiHeader();

    Single<BlogResponse> getBlogApiCall();

    Single<OpenSourceResponse> getOpenSourceApiCall();
}
