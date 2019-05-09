package com.idima.app.mvvm.data.local.db;

import com.idima.app.mvvm.data.model.db.Option;
import com.idima.app.mvvm.data.model.db.Question;
import com.idima.app.mvvm.data.model.db.User;

import io.reactivex.Observable;
import java.util.List;

/**
 * Created by idima on 07/07/17.
 */

public interface DbHelper {

    Observable<List<Question>> getAllQuestions();

    Observable<List<User>> getAllUsers();

    Observable<List<Option>> getOptionsForQuestionId(Long questionId);

    Observable<Boolean> insertUser(final User user);

    Observable<Boolean> isOptionEmpty();

    Observable<Boolean> isQuestionEmpty();

    Observable<Boolean> saveOption(Option option);

    Observable<Boolean> saveOptionList(List<Option> optionList);

    Observable<Boolean> saveQuestion(Question question);

    Observable<Boolean> saveQuestionList(List<Question> questionList);
}
