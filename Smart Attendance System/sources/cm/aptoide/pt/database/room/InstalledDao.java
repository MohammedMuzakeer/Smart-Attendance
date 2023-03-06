package cm.aptoide.pt.database.room;

import java.util.List;
import q.a.b;
import q.a.n;
import q.a.w;

public interface InstalledDao {
    n<RoomInstalled> get(String str, int i);

    n<List<RoomInstalled>> getAll();

    n<List<RoomInstalled>> getAllFilteringSystemApps();

    n<List<RoomInstalled>> getAllSortedAsc();

    n<List<RoomInstalled>> getAsList(String str, int i);

    n<List<RoomInstalled>> getAsListByPackageName(String str);

    void insert(RoomInstalled roomInstalled);

    void insertAll(List<RoomInstalled> list);

    w<RoomInstalled> isInstalledByVersion(String str, int i);

    b remove(String str, int i);

    void removeAll();
}
