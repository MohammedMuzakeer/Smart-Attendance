package cm.aptoide.pt.util.schedulers;

import rx.h;

public interface SchedulerProvider {
    h computation();

    h io();

    h ui();
}
