package cm.aptoide.pt.database.room;

import java.util.List;
import q.a.n;
import q.a.w;

public interface StoreDao {
    n<List<RoomStore>> getAll();

    w<RoomStore> getByStoreId(long j);

    w<RoomStore> getByStoreName(String str);

    void insert(RoomStore roomStore);

    n<Integer> isSubscribed(long j);

    void removeByStoreName(String str);

    void saveAll(List<RoomStore> list);
}
