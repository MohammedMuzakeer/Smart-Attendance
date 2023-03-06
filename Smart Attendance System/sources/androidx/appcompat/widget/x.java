package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m.a;
import l.h.l.z;

/* compiled from: DecorToolbar */
public interface x {
    z a(int i, long j);

    void a(int i);

    void a(Menu menu, a aVar);

    void a(a aVar, g.a aVar2);

    void a(j0 j0Var);

    void a(boolean z);

    boolean a();

    void b();

    void b(int i);

    void b(boolean z);

    void c(int i);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    Menu i();

    int j();

    ViewGroup k();

    int l();

    void m();

    void n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setWindowCallback(Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
