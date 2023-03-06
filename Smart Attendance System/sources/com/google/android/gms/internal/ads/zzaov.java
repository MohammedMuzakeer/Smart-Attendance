package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzaov extends IInterface {
    zzapj O0() throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzyd zzyd, zzaoy zzaoy) throws RemoteException;

    void a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaoj zzaoj, zzamv zzamv, zzyd zzyd) throws RemoteException;

    void a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaom zzaom, zzamv zzamv) throws RemoteException;

    void a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaop zzaop, zzamv zzamv) throws RemoteException;

    void a(String str, String str2, zzxz zzxz, IObjectWrapper iObjectWrapper, zzaos zzaos, zzamv zzamv) throws RemoteException;

    void a(String[] strArr, Bundle[] bundleArr) throws RemoteException;

    zzapj a1() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    boolean l(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean m(IObjectWrapper iObjectWrapper) throws RemoteException;

    void p(IObjectWrapper iObjectWrapper) throws RemoteException;
}
