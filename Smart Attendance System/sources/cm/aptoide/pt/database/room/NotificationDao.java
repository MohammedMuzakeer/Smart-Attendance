package cm.aptoide.pt.database.room;

import java.util.List;
import q.a.n;
import q.a.w;

public interface NotificationDao {
    void deleteAllByType(int i);

    void deleteAllExcluding(List<String> list);

    void deleteByKey(List<String> list);

    n<List<RoomNotification>> getAll();

    n<List<RoomNotification>> getAllSortedDesc();

    w<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr);

    w<List<RoomNotification>> getDismissed(Integer[] numArr, long j, long j2);

    void insert(RoomNotification roomNotification);

    void insertAll(List<RoomNotification> list);
}
