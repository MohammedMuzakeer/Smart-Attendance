package com.bumptech.glide.load.engine.z;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* compiled from: LruPoolStrategy */
interface l {
    Bitmap a(int i, int i2, Config config);

    void a(Bitmap bitmap);

    int b(Bitmap bitmap);

    String b(int i, int i2, Config config);

    String c(Bitmap bitmap);

    Bitmap removeLast();
}
