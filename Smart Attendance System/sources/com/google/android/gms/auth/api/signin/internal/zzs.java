package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public interface zzs extends IInterface {
    void a(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException;

    void b(Status status) throws RemoteException;

    void c(Status status) throws RemoteException;
}
