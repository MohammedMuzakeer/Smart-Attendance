package cm.aptoide.pt.downloadmanager;

import rx.b;
import rx.e;

public interface FileDownloader {
    e<FileDownloadCallback> observeFileDownloadProgress();

    b pauseDownload();

    b removeDownloadFile();

    b startFileDownload();

    void stopFailedDownload();
}
