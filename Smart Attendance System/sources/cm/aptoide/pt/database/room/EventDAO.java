package cm.aptoide.pt.database.room;

import java.util.List;
import q.a.n;

public interface EventDAO {
    void delete(RoomEvent roomEvent);

    n<List<RoomEvent>> getAll();

    void insert(RoomEvent roomEvent);
}
