package cm.aptoide.pt.notification;

public interface NotificationSyncScheduler {
    void forceSync();

    void removeSchedules();

    void schedule();

    void setEnabled(boolean z);
}
