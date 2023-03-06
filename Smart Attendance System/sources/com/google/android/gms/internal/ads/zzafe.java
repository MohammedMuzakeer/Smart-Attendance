package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzafe extends IInterface {
    IObjectWrapper L0() throws RemoteException;

    String c(String str) throws RemoteException;

    void destroy() throws RemoteException;

    zzaei e(String str) throws RemoteException;

    List<String> getAvailableAssetNames() throws RemoteException;

    String getCustomTemplateId() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    IObjectWrapper j() throws RemoteException;

    void performClick(String str) throws RemoteException;

    boolean r(IObjectWrapper iObjectWrapper) throws RemoteException;

    void recordImpression() throws RemoteException;
}
