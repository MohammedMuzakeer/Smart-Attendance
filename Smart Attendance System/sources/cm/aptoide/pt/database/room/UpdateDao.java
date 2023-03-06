package cm.aptoide.pt.database.room;

import java.util.List;
import q.a.n;
import q.a.w;

public interface UpdateDao {
    void deleteAll(List<RoomUpdate> list);

    void deleteByPackageName(String str);

    w<RoomUpdate> get(String str);

    w<List<RoomUpdate>> getAllByExcluded(boolean z);

    n<List<RoomUpdate>> getAllByExcludedSorted(boolean z);

    w<RoomUpdate> getByPackageAndExcluded(String str, boolean z);

    void insert(RoomUpdate roomUpdate);

    void insertAll(List<RoomUpdate> list);
}
