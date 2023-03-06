package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzaem extends IInterface {
    void a(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    void b(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void c(IObjectWrapper iObjectWrapper) throws RemoteException;

    void d(IObjectWrapper iObjectWrapper) throws RemoteException;

    void destroy() throws RemoteException;

    IObjectWrapper l(String str) throws RemoteException;
}
