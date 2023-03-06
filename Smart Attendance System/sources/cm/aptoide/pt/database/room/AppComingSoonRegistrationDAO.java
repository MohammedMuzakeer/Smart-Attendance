package cm.aptoide.pt.database.room;

import q.a.n;

public interface AppComingSoonRegistrationDAO {
    n<Integer> isRegisteredForApp(String str);

    void remove(RoomAppComingSoonRegistration roomAppComingSoonRegistration);

    void save(RoomAppComingSoonRegistration roomAppComingSoonRegistration);
}
