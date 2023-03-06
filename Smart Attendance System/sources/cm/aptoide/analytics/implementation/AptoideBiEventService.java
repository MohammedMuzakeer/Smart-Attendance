package cm.aptoide.analytics.implementation;

import cm.aptoide.analytics.implementation.data.Event;
import rx.b;

public interface AptoideBiEventService {
    b send(Event event);
}
