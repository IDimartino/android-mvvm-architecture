package com.idima.app.mvvm.ui.login;

/**
 * Created by amitshekhar on 08/07/17.
 */

public interface LoginNavigator {

    void handleError(Throwable throwable);

    void login();

    void openMainActivity();
}
