package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public interface zzu extends IInterface {
    void a(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException;

    void b(zzs zzs, GoogleSignInOptions googleSignInOptions) throws RemoteException;
}
