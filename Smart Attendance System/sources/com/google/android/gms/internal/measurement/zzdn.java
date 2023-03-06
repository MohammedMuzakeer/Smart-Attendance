package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

public interface zzdn extends IInterface {
    void a(int i, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void a(long j) throws RemoteException;

    void a(Bundle bundle, long j) throws RemoteException;

    void a(Bundle bundle, zzdq zzdq, long j) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, Bundle bundle, long j) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzdq zzdq, long j) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzdy zzdy, long j) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, String str, String str2, long j) throws RemoteException;

    void a(zzdq zzdq) throws RemoteException;

    void a(zzdq zzdq, int i) throws RemoteException;

    void a(zzdt zzdt) throws RemoteException;

    void a(zzdw zzdw) throws RemoteException;

    void a(String str, long j) throws RemoteException;

    void a(String str, zzdq zzdq) throws RemoteException;

    void a(String str, String str2, Bundle bundle) throws RemoteException;

    void a(String str, String str2, Bundle bundle, zzdq zzdq, long j) throws RemoteException;

    void a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void a(String str, String str2, IObjectWrapper iObjectWrapper, boolean z, long j) throws RemoteException;

    void a(String str, String str2, zzdq zzdq) throws RemoteException;

    void a(String str, String str2, boolean z, zzdq zzdq) throws RemoteException;

    void a(Map map) throws RemoteException;

    void a(boolean z, long j) throws RemoteException;

    void b(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    void b(zzdq zzdq) throws RemoteException;

    void b(zzdt zzdt) throws RemoteException;

    void b(String str, long j) throws RemoteException;

    void c(long j) throws RemoteException;

    void c(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    void c(zzdq zzdq) throws RemoteException;

    void c(zzdt zzdt) throws RemoteException;

    void c(String str, long j) throws RemoteException;

    void d(long j) throws RemoteException;

    void d(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    void d(zzdq zzdq) throws RemoteException;

    void e(IObjectWrapper iObjectWrapper, long j) throws RemoteException;

    void e(zzdq zzdq) throws RemoteException;

    void f(zzdq zzdq) throws RemoteException;
}
