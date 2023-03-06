package cm.aptoide.pt.store;

import cm.aptoide.pt.database.room.RoomStore;
import java.util.List;
import rx.Single;
import rx.b;
import rx.e;

public interface StorePersistence {
    Single<RoomStore> get(long j);

    Single<RoomStore> get(String str);

    e<List<RoomStore>> getAll();

    e<Boolean> isSubscribed(long j);

    b remove(String str);

    b save(RoomStore roomStore);

    b saveAll(List<RoomStore> list);
}
