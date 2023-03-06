package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzatt extends IInterface {
    void a(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    void a(zzaao zzaao) throws RemoteException;

    void a(zzatw zzatw) throws RemoteException;

    void a(zzaue zzaue) throws RemoteException;

    void a(zzaum zzaum) throws RemoteException;

    void a(zzxz zzxz, zzaub zzaub) throws RemoteException;

    Bundle getAdMetadata() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    boolean isLoaded() throws RemoteException;

    zzatq k1() throws RemoteException;

    void y(IObjectWrapper iObjectWrapper) throws RemoteException;
}
