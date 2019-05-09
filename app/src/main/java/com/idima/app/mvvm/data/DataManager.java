package com.idima.app.mvvm.data;

import com.idima.app.mvvm.data.local.db.DbHelper;
import com.idima.app.mvvm.data.local.prefs.PreferencesHelper;
import com.idima.app.mvvm.data.model.others.QuestionCardData;
import com.idima.app.mvvm.data.remote.ApiHelper;

import io.reactivex.Observable;
import java.util.List;

/**
 * Created by idima on 07/07/17.
 */

public interface DataManager extends DbHelper, PreferencesHelper, ApiHelper {

    Observable<List<QuestionCardData>> getQuestionCardData();

    Observable<Boolean> seedDatabaseOptions();

    Observable<Boolean> seedDatabaseQuestions();

    void setUserAsLoggedOut();

    void updateApiHeader(Long userId, String accessToken);

    void updateUserInfo(
            String accessToken,
            Long userId,
            LoggedInMode loggedInMode,
            String userName,
            String email,
            String profilePicPath);

    enum LoggedInMode {

        LOGGED_IN_MODE_LOGGED_OUT(0),
        LOGGED_IN_MODE_GOOGLE(1),
        LOGGED_IN_MODE_FB(2),
        LOGGED_IN_MODE_SERVER(3);

        private final int mType;

        LoggedInMode(int type) {
            mType = type;
        }

        public int getType() {
            return mType;
        }
    }
}
