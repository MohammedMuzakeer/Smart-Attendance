package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public interface LifecycleFragment {
    @KeepForSdk
    Activity a();

    @KeepForSdk
    <T extends LifecycleCallback> T a(String str, Class<T> cls);

    @KeepForSdk
    void a(String str, LifecycleCallback lifecycleCallback);

    @KeepForSdk
    void startActivityForResult(Intent intent, int i);
}
