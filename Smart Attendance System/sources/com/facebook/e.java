package com.facebook;

/* compiled from: FacebookCallback */
public interface e<RESULT> {
    void onCancel();

    void onError(FacebookException facebookException);

    void onSuccess(RESULT result);
}
