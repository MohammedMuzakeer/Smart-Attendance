package cm.aptoide.analytics.implementation;

public interface SessionPersistence {
    long getTimestamp();

    void saveSessionTimestamp(long j);
}
