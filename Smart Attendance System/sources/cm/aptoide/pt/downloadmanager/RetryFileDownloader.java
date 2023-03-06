package cm.aptoide.pt.downloadmanager;

import rx.b;
import rx.e;

public interface RetryFileDownloader {
    e<FileDownloadCallback> observeFileDownloadProgress();

    b pauseDownload();

    b removeDownloadFile();

    void startFileDownload();

    void stop();

    void stopFailedDownload();
}
