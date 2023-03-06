package cm.aptoide.pt.updates;

import cm.aptoide.pt.database.room.RoomUpdate;
import java.util.List;
import rx.Single;
import rx.b;
import rx.e;

public interface UpdatePersistence {
    Single<Boolean> contains(String str, boolean z);

    Single<RoomUpdate> get(String str);

    Single<List<RoomUpdate>> getAll(boolean z);

    e<List<RoomUpdate>> getAllSorted(boolean z);

    Single<Boolean> isExcluded(String str);

    b remove(String str);

    b removeAll(List<RoomUpdate> list);

    b save(RoomUpdate roomUpdate);

    b saveAll(List<RoomUpdate> list);
}
