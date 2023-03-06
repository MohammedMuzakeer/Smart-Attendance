package cm.aptoide.pt.database.room;

import java.util.List;
import q.a.n;
import q.a.w;

public interface DownloadDAO {
    n<List<RoomDownload>> getAll();

    n<List<RoomDownload>> getAsList(String str);

    n<RoomDownload> getAsObservable(String str);

    w<RoomDownload> getAsSingle(String str);

    n<List<RoomDownload>> getInQueueSortedDownloads();

    n<List<RoomDownload>> getOutOfSpaceDownloads();

    n<List<RoomDownload>> getRunningDownloads();

    n<List<RoomDownload>> getUnmovedFilesDownloads();

    void insert(RoomDownload roomDownload);

    void insertAll(List<RoomDownload> list);

    void remove(String str);

    void remove(String str, int i);
}
