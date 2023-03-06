package cm.aptoide.pt.notification;

import rx.Single;

public interface Policy {
    Single<Boolean> shouldShow();
}
