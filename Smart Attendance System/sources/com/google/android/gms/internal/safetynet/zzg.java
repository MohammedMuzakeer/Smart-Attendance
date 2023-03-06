package com.google.android.gms.internal.safetynet;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import com.google.android.gms.safetynet.zzh;

public interface zzg extends IInterface {
    void a(Status status) throws RemoteException;

    void a(Status status, SafeBrowsingData safeBrowsingData) throws RemoteException;

    void a(Status status, zza zza) throws RemoteException;

    void a(Status status, zzd zzd) throws RemoteException;

    void a(Status status, zzf zzf) throws RemoteException;

    void a(Status status, zzh zzh) throws RemoteException;

    void a(Status status, boolean z) throws RemoteException;

    void b(Status status, boolean z) throws RemoteException;

    void b(String str) throws RemoteException;
}
