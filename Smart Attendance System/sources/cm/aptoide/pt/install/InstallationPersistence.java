package cm.aptoide.pt.install;

import cm.aptoide.pt.database.room.RoomInstallation;
import java.util.List;
import rx.b;
import rx.e;

public interface InstallationPersistence {
    e<List<RoomInstallation>> getInstallationsHistory();

    b insert(RoomInstallation roomInstallation);

    b insertAll(List<RoomInstallation> list);
}
