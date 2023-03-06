package cm.aptoide.pt.home;

import cm.aptoide.pt.database.room.RoomAppComingSoonRegistration;
import rx.b;
import rx.e;

public interface AppComingSoonRegistrationPersistence {
    e<Boolean> isRegisteredForApp(String str);

    b registerForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration);

    b unregisterForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration);
}
