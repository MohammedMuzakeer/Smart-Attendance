package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.RemoteException;

public interface zzam extends IInterface {
    void a(int i, PendingIntent pendingIntent) throws RemoteException;

    void a(int i, String[] strArr) throws RemoteException;

    void c(int i, String[] strArr) throws RemoteException;
}
