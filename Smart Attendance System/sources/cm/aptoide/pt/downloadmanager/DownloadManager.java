package cm.aptoide.pt.downloadmanager;

import cm.aptoide.pt.database.room.RoomDownload;
import java.util.List;
import rx.Single;
import rx.b;
import rx.e;

public interface DownloadManager {
    e<List<RoomDownload>> getCurrentActiveDownloads();

    e<RoomDownload> getCurrentInProgressDownload();

    e<RoomDownload> getDownloadAsObservable(String str);

    Single<RoomDownload> getDownloadAsSingle(String str);

    e<RoomDownload> getDownloadsByMd5(String str);

    e<List<RoomDownload>> getDownloadsList();

    b invalidateDatabase();

    b pauseAllDownloads();

    b pauseDownload(String str);

    b removeDownload(String str);

    void start();

    b startDownload(RoomDownload roomDownload);

    void stop();
}
