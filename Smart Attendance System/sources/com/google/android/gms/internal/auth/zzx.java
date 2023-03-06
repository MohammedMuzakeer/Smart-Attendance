package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public interface zzx extends IInterface {
    void H0() throws RemoteException;

    void a(DeviceMetaData deviceMetaData) throws RemoteException;

    void a(Status status, zzl zzl) throws RemoteException;

    void a(Status status, zzt zzt) throws RemoteException;

    void b(byte[] bArr) throws RemoteException;

    void g(Status status) throws RemoteException;

    void h(Status status) throws RemoteException;
}
