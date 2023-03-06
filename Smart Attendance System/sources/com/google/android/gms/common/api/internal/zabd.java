package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;

public interface zabd {
    <A extends AnyClient, T extends ApiMethodImpl<? extends Result, A>> T a(T t);

    void a();

    void a(int i);

    void a(ConnectionResult connectionResult, Api<?> api, boolean z);

    <A extends AnyClient, R extends Result, T extends ApiMethodImpl<R, A>> T b(T t);

    void b();

    void d(Bundle bundle);

    boolean disconnect();
}
