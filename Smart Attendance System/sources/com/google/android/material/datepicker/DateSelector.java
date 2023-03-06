package com.google.android.material.datepicker;

import android.os.Parcelable;
import java.util.Collection;
import l.h.k.d;

public interface DateSelector<S> extends Parcelable {
    void g(long j);

    Collection<d<Long, Long>> i();

    Collection<Long> l();

    S m();
}
