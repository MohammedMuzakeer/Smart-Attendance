package cm.aptoide.pt.home.apps.list.models;

import cm.aptoide.pt.home.apps.AppClick;
import cm.aptoide.pt.home.apps.list.models.DownloadCardModel.CardHolder;
import cm.aptoide.pt.home.apps.model.DownloadApp;
import com.airbnb.epoxy.f0;
import com.airbnb.epoxy.h0;
import com.airbnb.epoxy.i0;
import com.airbnb.epoxy.j0;
import com.airbnb.epoxy.s.c;
import rx.s.b;

public interface DownloadCardModelBuilder {
    DownloadCardModelBuilder application(DownloadApp downloadApp);

    DownloadCardModelBuilder eventSubject(b<AppClick> bVar);

    DownloadCardModelBuilder id(long j);

    DownloadCardModelBuilder id(long j, long j2);

    DownloadCardModelBuilder id(CharSequence charSequence);

    DownloadCardModelBuilder id(CharSequence charSequence, long j);

    DownloadCardModelBuilder id(CharSequence charSequence, CharSequence... charSequenceArr);

    DownloadCardModelBuilder id(Number... numberArr);

    DownloadCardModelBuilder layout(int i);

    DownloadCardModelBuilder onBind(f0<DownloadCardModel_, CardHolder> f0Var);

    DownloadCardModelBuilder onUnbind(h0<DownloadCardModel_, CardHolder> h0Var);

    DownloadCardModelBuilder onVisibilityChanged(i0<DownloadCardModel_, CardHolder> i0Var);

    DownloadCardModelBuilder onVisibilityStateChanged(j0<DownloadCardModel_, CardHolder> j0Var);

    DownloadCardModelBuilder spanSizeOverride(c cVar);
}
