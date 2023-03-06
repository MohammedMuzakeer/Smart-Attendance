package cm.aptoide.analytics.implementation;

public interface CrashLogger {
    void log(String str, String str2);

    void log(Throwable th);
}
