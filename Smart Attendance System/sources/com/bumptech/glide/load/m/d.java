package com.bumptech.glide.load.m;

import com.bumptech.glide.g;

/* compiled from: DataFetcher */
public interface d<T> {

    /* compiled from: DataFetcher */
    public interface a<T> {
        void a(Exception exception);

        void a(T t);
    }

    Class<T> a();

    void a(g gVar, a<? super T> aVar);

    void b();

    com.bumptech.glide.load.a c();

    void cancel();
}
