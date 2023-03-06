package cm.aptoide.pt.home.apps.list.models;

import cm.aptoide.pt.home.apps.AppClick;
import cm.aptoide.pt.home.apps.list.models.UpdateCardModel.CardHolder;
import cm.aptoide.pt.home.apps.model.UpdateApp;
import cm.aptoide.pt.themes.ThemeManager;
import com.airbnb.epoxy.f0;
import com.airbnb.epoxy.h0;
import com.airbnb.epoxy.i0;
import com.airbnb.epoxy.j0;
import com.airbnb.epoxy.s.c;
import rx.s.b;

public interface UpdateCardModelBuilder {
    UpdateCardModelBuilder application(UpdateApp updateApp);

    UpdateCardModelBuilder eventSubject(b<AppClick> bVar);

    UpdateCardModelBuilder id(long j);

    UpdateCardModelBuilder id(long j, long j2);

    UpdateCardModelBuilder id(CharSequence charSequence);

    UpdateCardModelBuilder id(CharSequence charSequence, long j);

    UpdateCardModelBuilder id(CharSequence charSequence, CharSequence... charSequenceArr);

    UpdateCardModelBuilder id(Number... numberArr);

    UpdateCardModelBuilder layout(int i);

    UpdateCardModelBuilder onBind(f0<UpdateCardModel_, CardHolder> f0Var);

    UpdateCardModelBuilder onUnbind(h0<UpdateCardModel_, CardHolder> h0Var);

    UpdateCardModelBuilder onVisibilityChanged(i0<UpdateCardModel_, CardHolder> i0Var);

    UpdateCardModelBuilder onVisibilityStateChanged(j0<UpdateCardModel_, CardHolder> j0Var);

    UpdateCardModelBuilder spanSizeOverride(c cVar);

    UpdateCardModelBuilder themeManager(ThemeManager themeManager);
}
