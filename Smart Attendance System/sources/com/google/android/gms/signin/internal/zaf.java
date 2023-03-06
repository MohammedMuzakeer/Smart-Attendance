package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;

public interface zaf extends IInterface {
    void a(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException;

    void a(zah zah, zad zad) throws RemoteException;

    void g(int i) throws RemoteException;
}
