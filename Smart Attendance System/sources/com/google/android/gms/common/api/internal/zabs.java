package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public interface zabs {
    <A extends AnyClient, T extends ApiMethodImpl<? extends Result, A>> T a(T t);

    void a();

    boolean a(SignInConnectionListener signInConnectionListener);

    <A extends AnyClient, R extends Result, T extends ApiMethodImpl<R, A>> T b(T t);

    void b();

    void c();

    ConnectionResult d();

    void disconnect();

    void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    boolean isConnected();
}
