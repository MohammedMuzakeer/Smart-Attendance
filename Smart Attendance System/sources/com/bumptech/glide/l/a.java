package com.bumptech.glide.l;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;

/* compiled from: GifDecoder */
public interface a {

    /* compiled from: GifDecoder */
    public interface a {
        Bitmap a(int i, int i2, Config config);

        void a(Bitmap bitmap);

        void a(byte[] bArr);

        void a(int[] iArr);

        int[] a(int i);

        byte[] b(int i);
    }

    Bitmap a();

    void a(Config config);

    void b();

    int c();

    void clear();

    int d();

    ByteBuffer e();

    void f();

    int g();

    int h();
}
