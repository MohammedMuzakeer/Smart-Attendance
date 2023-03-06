package cm.aptoide.pt.downloadmanager;

import rx.b;
import rx.e;

public interface AppDownloader {
    e<AppDownloadStatus> observeDownloadProgress();

    b pauseAppDownload();

    b removeAppDownload();

    void startAppDownload();

    void stop();
}
