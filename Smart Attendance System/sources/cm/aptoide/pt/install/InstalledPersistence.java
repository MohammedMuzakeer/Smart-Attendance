package cm.aptoide.pt.install;

import cm.aptoide.pt.database.room.RoomInstalled;
import java.util.List;
import rx.Single;
import rx.b;
import rx.e;

public interface InstalledPersistence {
    e<RoomInstalled> get(String str, int i);

    e<List<RoomInstalled>> getAll();

    e<List<RoomInstalled>> getAllAsList(String str);

    e<List<RoomInstalled>> getAllInstalled();

    e<List<RoomInstalled>> getAllInstalledSorted();

    e<List<RoomInstalled>> getAllInstalling();

    e<List<RoomInstalled>> getAsList(String str, int i);

    e<RoomInstalled> getInstalled(String str);

    e<List<RoomInstalled>> getInstalledFilteringSystemApps();

    b insert(RoomInstalled roomInstalled);

    Single<Boolean> isInstalled(String str, int i);

    e<Boolean> isInstalled(String str);

    b remove(String str, int i);

    b replaceAllBy(List<RoomInstalled> list);
}
