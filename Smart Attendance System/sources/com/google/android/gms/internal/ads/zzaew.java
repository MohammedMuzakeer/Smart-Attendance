package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzaew extends IInterface {
    zzaea a() throws RemoteException;

    void a(Bundle bundle) throws RemoteException;

    String b() throws RemoteException;

    boolean b(Bundle bundle) throws RemoteException;

    String c() throws RemoteException;

    void c(Bundle bundle) throws RemoteException;

    String d() throws RemoteException;

    void destroy() throws RemoteException;

    IObjectWrapper e() throws RemoteException;

    List f() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    String getMediationAdapterClassName() throws RemoteException;

    String getStore() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    zzaei h() throws RemoteException;

    String i() throws RemoteException;

    IObjectWrapper j() throws RemoteException;

    double k() throws RemoteException;
}
