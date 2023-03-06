package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.FilterModel.CardHolder;
import com.airbnb.epoxy.f0;
import com.airbnb.epoxy.h0;
import com.airbnb.epoxy.i0;
import com.airbnb.epoxy.j0;
import com.airbnb.epoxy.s.c;

public interface FilterModelBuilder {
    FilterModelBuilder backgroundRes(Integer num);

    FilterModelBuilder eventListener(FilterEventListener filterEventListener);

    FilterModelBuilder filter(Filter filter);

    FilterModelBuilder id(long j);

    FilterModelBuilder id(long j, long j2);

    FilterModelBuilder id(CharSequence charSequence);

    FilterModelBuilder id(CharSequence charSequence, long j);

    FilterModelBuilder id(CharSequence charSequence, CharSequence... charSequenceArr);

    FilterModelBuilder id(Number... numberArr);

    FilterModelBuilder layout(int i);

    FilterModelBuilder onBind(f0<FilterModel_, CardHolder> f0Var);

    FilterModelBuilder onUnbind(h0<FilterModel_, CardHolder> h0Var);

    FilterModelBuilder onVisibilityChanged(i0<FilterModel_, CardHolder> i0Var);

    FilterModelBuilder onVisibilityStateChanged(j0<FilterModel_, CardHolder> j0Var);

    FilterModelBuilder spanSizeOverride(c cVar);

    FilterModelBuilder textColorStateList(Integer num);
}
