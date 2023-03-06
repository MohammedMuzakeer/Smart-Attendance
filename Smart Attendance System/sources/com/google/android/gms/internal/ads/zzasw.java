package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzasw extends IInterface {
    void B(IObjectWrapper iObjectWrapper) throws RemoteException;

    void F(IObjectWrapper iObjectWrapper) throws RemoteException;

    void a(zzasu zzasu) throws RemoteException;

    void a(zzatb zzatb) throws RemoteException;

    void a(zzath zzath) throws RemoteException;

    void a(zzzp zzzp) throws RemoteException;

    void destroy() throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    void k(IObjectWrapper iObjectWrapper) throws RemoteException;

    void o(String str) throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setCustomData(String str) throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void setUserId(String str) throws RemoteException;

    void show() throws RemoteException;

    void v(IObjectWrapper iObjectWrapper) throws RemoteException;
}
