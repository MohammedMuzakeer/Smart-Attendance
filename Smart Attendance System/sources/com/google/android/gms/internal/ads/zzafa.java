package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzafa extends IInterface {
    zzaei C() throws RemoteException;

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

    zzaar getVideoController() throws RemoteException;

    IObjectWrapper j() throws RemoteException;

    String l() throws RemoteException;
}
