package com.bumptech.glide.p.l;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p.d;

/* compiled from: Target */
public interface i<R> extends com.bumptech.glide.m.i {
    d getRequest();

    void getSize(h hVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, com.bumptech.glide.p.m.d<? super R> dVar);

    void removeCallback(h hVar);

    void setRequest(d dVar);
}
