package cm.aptoide.pt.home.apps.list.models;

import cm.aptoide.pt.home.apps.list.models.TitleModel.Holder;
import com.airbnb.epoxy.f0;
import com.airbnb.epoxy.h0;
import com.airbnb.epoxy.i0;
import com.airbnb.epoxy.j0;
import com.airbnb.epoxy.s.c;
import rx.s.b;

public interface TitleModelBuilder {
    TitleModelBuilder eventSubject(b<Void> bVar);

    TitleModelBuilder id(long j);

    TitleModelBuilder id(long j, long j2);

    TitleModelBuilder id(CharSequence charSequence);

    TitleModelBuilder id(CharSequence charSequence, long j);

    TitleModelBuilder id(CharSequence charSequence, CharSequence... charSequenceArr);

    TitleModelBuilder id(Number... numberArr);

    TitleModelBuilder layout(int i);

    TitleModelBuilder onBind(f0<TitleModel_, Holder> f0Var);

    TitleModelBuilder onUnbind(h0<TitleModel_, Holder> h0Var);

    TitleModelBuilder onVisibilityChanged(i0<TitleModel_, Holder> i0Var);

    TitleModelBuilder onVisibilityStateChanged(j0<TitleModel_, Holder> j0Var);

    TitleModelBuilder shouldShowButton(boolean z);

    TitleModelBuilder spanSizeOverride(c cVar);

    TitleModelBuilder title(Integer num);
}
