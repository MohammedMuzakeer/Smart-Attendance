package com.google.android.gms.internal.auth-api;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public interface zzu extends IInterface {
    void a(Status status, Credential credential) throws RemoteException;

    void a(Status status, String str) throws RemoteException;

    void i(Status status) throws RemoteException;
}
