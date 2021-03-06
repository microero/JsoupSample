package com.image.mvp.presenter;

import android.support.annotation.MenuRes;
import android.support.annotation.NonNull;

/**
 * by y on 2017/5/23.
 */

public interface PresenterManager {

    interface ImageDetailPresenter {
        void netWorkRequest(String url);
    }

    interface ImageListPresenter {
        void netWorkRequest(int id, int page);
    }

    interface MainPresenter {
        void switchId(@MenuRes int id);

        void onBackPressed();

        void onMainDestroy();
    }

    interface SearchListPresenter {
        void netWorkRequest(@NonNull String searchType, @NonNull String content, int page);
    }

    interface TagPresenter {
        void netWorkRequest();
    }

    interface TagImageListPresenter {
        void netWorkRequest(@NonNull String url);
    }
}
