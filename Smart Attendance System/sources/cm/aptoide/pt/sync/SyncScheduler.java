package cm.aptoide.pt.sync;

public interface SyncScheduler {
    void cancel(String str);

    void reschedule(Sync sync);

    void schedule(Sync sync);
}
