package cm.aptoide.pt.downloadmanager;

import cm.aptoide.pt.database.room.RoomDownload;

public interface DownloadAnalytics {
    void onDownloadComplete(String str, String str2, int i);

    void onError(String str, int i, String str2, Throwable th);

    void startProgress(RoomDownload roomDownload);
}
