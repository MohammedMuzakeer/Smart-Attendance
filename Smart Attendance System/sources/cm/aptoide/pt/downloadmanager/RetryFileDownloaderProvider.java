package cm.aptoide.pt.downloadmanager;

import rx.s.b;

public interface RetryFileDownloaderProvider {
    RetryFileDownloader createRetryFileDownloader(String str, String str2, int i, String str3, int i2, String str4, b<FileDownloadCallback> bVar, String str5, String str6);
}
