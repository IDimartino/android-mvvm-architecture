package com.idima.app.mvvm.ui.feed.opensource;

/**
 * Created by idima on 8/01/18.
 */

public class OpenSourceEmptyItemViewModel {

    private final OpenSourceEmptyItemViewModelListener mListener;

    public OpenSourceEmptyItemViewModel(OpenSourceEmptyItemViewModelListener listener) {
        this.mListener = listener;
    }

    public void onRetryClick() {
        mListener.onRetryClick();
    }

    public interface OpenSourceEmptyItemViewModelListener {

        void onRetryClick();
    }
}
