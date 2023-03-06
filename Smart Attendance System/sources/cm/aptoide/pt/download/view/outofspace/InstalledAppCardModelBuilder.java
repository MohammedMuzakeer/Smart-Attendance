package cm.aptoide.pt.download.view.outofspace;

import cm.aptoide.pt.download.view.outofspace.InstalledAppCardModel.CardHolder;
import com.airbnb.epoxy.f0;
import com.airbnb.epoxy.h0;
import com.airbnb.epoxy.i0;
import com.airbnb.epoxy.j0;
import com.airbnb.epoxy.s.c;
import rx.s.b;

public interface InstalledAppCardModelBuilder {
    InstalledAppCardModelBuilder application(InstalledApp installedApp);

    InstalledAppCardModelBuilder eventSubject(b<String> bVar);

    InstalledAppCardModelBuilder id(long j);

    InstalledAppCardModelBuilder id(long j, long j2);

    InstalledAppCardModelBuilder id(CharSequence charSequence);

    InstalledAppCardModelBuilder id(CharSequence charSequence, long j);

    InstalledAppCardModelBuilder id(CharSequence charSequence, CharSequence... charSequenceArr);

    InstalledAppCardModelBuilder id(Number... numberArr);

    InstalledAppCardModelBuilder layout(int i);

    InstalledAppCardModelBuilder onBind(f0<InstalledAppCardModel_, CardHolder> f0Var);

    InstalledAppCardModelBuilder onUnbind(h0<InstalledAppCardModel_, CardHolder> h0Var);

    InstalledAppCardModelBuilder onVisibilityChanged(i0<InstalledAppCardModel_, CardHolder> i0Var);

    InstalledAppCardModelBuilder onVisibilityStateChanged(j0<InstalledAppCardModel_, CardHolder> j0Var);

    InstalledAppCardModelBuilder spanSizeOverride(c cVar);
}
