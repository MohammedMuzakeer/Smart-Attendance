package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzams extends IInterface {
    Bundle B0() throws RemoteException;

    IObjectWrapper Q() throws RemoteException;

    zzang U() throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzaiq zzaiq, List<zzaiw> list) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzatk zzatk, List<String> list) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzatk zzatk, String str2) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, String str2, zzamv zzamv, zzady zzady, List<String> list) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, zzamv zzamv) throws RemoteException;

    void a(IObjectWrapper iObjectWrapper, zzyd zzyd, zzxz zzxz, String str, String str2, zzamv zzamv) throws RemoteException;

    void a(zzxz zzxz, String str) throws RemoteException;

    void a(zzxz zzxz, String str, String str2) throws RemoteException;

    void b(IObjectWrapper iObjectWrapper, zzxz zzxz, String str, zzamv zzamv) throws RemoteException;

    zzand c1() throws RemoteException;

    void destroy() throws RemoteException;

    zzafe g0() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzaar getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    boolean n0() throws RemoteException;

    zzana n1() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void t(IObjectWrapper iObjectWrapper) throws RemoteException;

    void w(IObjectWrapper iObjectWrapper) throws RemoteException;

    Bundle zzsh() throws RemoteException;
}
