package cm.aptoide.pt.downloadmanager;

import cm.aptoide.pt.database.room.RoomDownload;
import java.util.List;
import rx.Single;
import rx.b;
import rx.e;

public interface DownloadPersistence {
    b delete(String str);

    b delete(String str, int i);

    e<List<RoomDownload>> getAll();

    e<List<RoomDownload>> getAsList(String str);

    e<RoomDownload> getAsObservable(String str);

    Single<RoomDownload> getAsSingle(String str);

    e<List<RoomDownload>> getInQueueSortedDownloads();

    e<List<RoomDownload>> getOutOfSpaceDownloads();

    e<List<RoomDownload>> getRunningDownloads();

    e<List<RoomDownload>> getUnmovedFilesDownloads();

    b save(RoomDownload roomDownload);
}
