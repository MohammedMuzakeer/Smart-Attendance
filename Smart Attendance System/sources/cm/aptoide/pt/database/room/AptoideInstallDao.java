package cm.aptoide.pt.database.room;

import q.a.w;

public interface AptoideInstallDao {
    w<RoomAptoideInstallApp> get(String str);

    void insert(RoomAptoideInstallApp roomAptoideInstallApp);
}
