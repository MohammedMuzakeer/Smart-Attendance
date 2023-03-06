package cm.aptoide.pt.database.room;

import q.a.n;

public interface MigratedAppDAO {
    n<Integer> isAppMigrated(String str);

    void save(RoomMigratedApp roomMigratedApp);
}
