package cm.aptoide.pt.database.room;

import q.a.n;

public interface LocalNotificationSyncDao {
    void delete(String str);

    n<RoomLocalNotificationSync> get(String str);

    void save(RoomLocalNotificationSync roomLocalNotificationSync);
}
