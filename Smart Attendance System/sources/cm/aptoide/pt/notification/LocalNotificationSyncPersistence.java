package cm.aptoide.pt.notification;

import cm.aptoide.pt.notification.sync.LocalNotificationSync;
import cm.aptoide.pt.sync.Sync;
import rx.e;

public interface LocalNotificationSyncPersistence {
    e<Sync> get(String str);

    void remove(String str);

    void save(LocalNotificationSync localNotificationSync);
}
