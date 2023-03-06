package cm.aptoide.pt.downloadmanager;

import cm.aptoide.pt.downloadmanager.AppDownloadStatus.AppDownloadState;

public interface FileDownloadCallback {
    FileDownloadProgressResult getDownloadProgress();

    AppDownloadState getDownloadState();

    Throwable getError();

    String getMd5();

    boolean hasError();
}
