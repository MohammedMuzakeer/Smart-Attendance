package cm.aptoide.pt.home.apps.list.models;

import cm.aptoide.pt.home.apps.list.models.InstalledCardModel.CardHolder;
import cm.aptoide.pt.home.apps.model.InstalledApp;
import com.airbnb.epoxy.f0;
import com.airbnb.epoxy.h0;
import com.airbnb.epoxy.i0;
import com.airbnb.epoxy.j0;
import com.airbnb.epoxy.s.c;

public interface InstalledCardModelBuilder {
    InstalledCardModelBuilder application(InstalledApp installedApp);

    InstalledCardModelBuilder id(long j);

    InstalledCardModelBuilder id(long j, long j2);

    InstalledCardModelBuilder id(CharSequence charSequence);

    InstalledCardModelBuilder id(CharSequence charSequence, long j);

    InstalledCardModelBuilder id(CharSequence charSequence, CharSequence... charSequenceArr);

    InstalledCardModelBuilder id(Number... numberArr);

    InstalledCardModelBuilder layout(int i);

    InstalledCardModelBuilder onBind(f0<InstalledCardModel_, CardHolder> f0Var);

    InstalledCardModelBuilder onUnbind(h0<InstalledCardModel_, CardHolder> h0Var);

    InstalledCardModelBuilder onVisibilityChanged(i0<InstalledCardModel_, CardHolder> i0Var);

    InstalledCardModelBuilder onVisibilityStateChanged(j0<InstalledCardModel_, CardHolder> j0Var);

    InstalledCardModelBuilder spanSizeOverride(c cVar);
}
