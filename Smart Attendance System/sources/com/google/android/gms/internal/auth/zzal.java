package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public interface zzal extends IInterface {
    void a(ProxyResponse proxyResponse) throws RemoteException;

    void d(String str) throws RemoteException;
}
