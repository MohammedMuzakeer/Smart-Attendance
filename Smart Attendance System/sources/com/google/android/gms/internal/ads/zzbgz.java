package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;

@VisibleForTesting
@zzard
public interface zzbgz extends zzj, zzaji, zzakg, zzbdf, zzbhx, zzbhy, zzbic, zzbif, zzbig, zzbih, zzue {
    void A();

    Context B();

    void C();

    zzd F();

    void G();

    void H();

    boolean I();

    zzd K();

    boolean L();

    Activity a();

    void a(int i);

    void a(zzd zzd);

    void a(IObjectWrapper iObjectWrapper);

    void a(zzadv zzadv);

    void a(zzadx zzadx);

    void a(zzbhq zzbhq);

    void a(zzbin zzbin);

    void a(String str, Predicate<zzaho<? super zzbgz>> predicate);

    void a(String str, zzaho<? super zzbgz> zzaho);

    void a(String str, zzbft zzbft);

    void a(String str, String str2, String str3);

    void a(boolean z);

    boolean a(boolean z, int i);

    zzbai b();

    void b(zzd zzd);

    void b(String str, zzaho<? super zzbgz> zzaho);

    void b(boolean z);

    zza c();

    void c(Context context);

    void c(boolean z);

    zzdh d();

    void d(boolean z);

    void destroy();

    zzbhq e();

    void e(boolean z);

    boolean f();

    boolean g();

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    View getView();

    WebView getWebView();

    int getWidth();

    zzadh h();

    zzbin i();

    zzbii k();

    boolean l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    String m();

    void measure(int i, int i2);

    void onPause();

    void onResume();

    WebViewClient p();

    void q();

    boolean r();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t();

    void u();

    void v();

    zzadx x();

    IObjectWrapper z();
}
