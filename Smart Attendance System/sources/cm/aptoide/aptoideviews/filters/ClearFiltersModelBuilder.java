package cm.aptoide.aptoideviews.filters;

import cm.aptoide.aptoideviews.filters.ClearFiltersModel.CardHolder;
import com.airbnb.epoxy.f0;
import com.airbnb.epoxy.h0;
import com.airbnb.epoxy.i0;
import com.airbnb.epoxy.j0;
import com.airbnb.epoxy.s.c;

public interface ClearFiltersModelBuilder {
    ClearFiltersModelBuilder eventListener(FilterEventListener filterEventListener);

    ClearFiltersModelBuilder id(long j);

    ClearFiltersModelBuilder id(long j, long j2);

    ClearFiltersModelBuilder id(CharSequence charSequence);

    ClearFiltersModelBuilder id(CharSequence charSequence, long j);

    ClearFiltersModelBuilder id(CharSequence charSequence, CharSequence... charSequenceArr);

    ClearFiltersModelBuilder id(Number... numberArr);

    ClearFiltersModelBuilder layout(int i);

    ClearFiltersModelBuilder onBind(f0<ClearFiltersModel_, CardHolder> f0Var);

    ClearFiltersModelBuilder onUnbind(h0<ClearFiltersModel_, CardHolder> h0Var);

    ClearFiltersModelBuilder onVisibilityChanged(i0<ClearFiltersModel_, CardHolder> i0Var);

    ClearFiltersModelBuilder onVisibilityStateChanged(j0<ClearFiltersModel_, CardHolder> j0Var);

    ClearFiltersModelBuilder spanSizeOverride(c cVar);

    ClearFiltersModelBuilder textColorStateList(Integer num);
}
