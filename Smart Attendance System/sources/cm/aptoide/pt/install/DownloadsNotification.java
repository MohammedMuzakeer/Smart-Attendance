package cm.aptoide.pt.install;

public interface DownloadsNotification {
    void removeProgressNotificationAndStop();

    void setupProgressNotification(String str, String str2, int i, boolean z);
}
