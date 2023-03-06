package cm.aptoide.pt.database.room;

import q.a.n;

public interface StoredMinimalAdDAO {
    void delete(RoomStoredMinimalAd roomStoredMinimalAd);

    n<RoomStoredMinimalAd> get(String str);

    void insert(RoomStoredMinimalAd roomStoredMinimalAd);
}
