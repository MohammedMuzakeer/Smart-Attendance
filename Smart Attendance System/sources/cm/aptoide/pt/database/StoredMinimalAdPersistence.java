package cm.aptoide.pt.database;

import cm.aptoide.pt.database.room.RoomStoredMinimalAd;
import rx.e;

public interface StoredMinimalAdPersistence {
    e<RoomStoredMinimalAd> get(String str);

    void insert(RoomStoredMinimalAd roomStoredMinimalAd);

    void remove(RoomStoredMinimalAd roomStoredMinimalAd);
}
