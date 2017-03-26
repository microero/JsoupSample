package com.framework.base;

/**
 * by y on 2016/10/30.
 */

public interface BaseView<T> {

    void netWorkSuccess(T data);

    void netWorkError(Throwable e);

    void showProgress();

    void hideProgress();
}