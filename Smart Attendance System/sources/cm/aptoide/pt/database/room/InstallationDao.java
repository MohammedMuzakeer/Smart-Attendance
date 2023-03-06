package cm.aptoide.pt.database.room;

import java.util.List;
import q.a.n;

public interface InstallationDao {
    n<List<RoomInstallation>> getAll();

    void insert(RoomInstallation roomInstallation);

    void insertAll(List<RoomInstallation> list);
}
