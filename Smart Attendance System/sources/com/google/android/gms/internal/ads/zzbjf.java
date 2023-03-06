package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

public interface zzbjf extends IInterface {
    String J0() throws RemoteException;

    Map a(String str, String str2, boolean z) throws RemoteException;

    void a(String str, String str2, Bundle bundle) throws RemoteException;

    void a(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException;

    List b(String str, String str2) throws RemoteException;

    void b(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;

    void b(String str, String str2, Bundle bundle) throws RemoteException;

    String b0() throws RemoteException;

    void f(Bundle bundle) throws RemoteException;

    long f0() throws RemoteException;

    Bundle g(Bundle bundle) throws RemoteException;

    void i(Bundle bundle) throws RemoteException;

    String i0() throws RemoteException;

    int j(String str) throws RemoteException;

    void p(String str) throws RemoteException;

    void s(String str) throws RemoteException;

    String x0() throws RemoteException;

    String y0() throws RemoteException;
}
