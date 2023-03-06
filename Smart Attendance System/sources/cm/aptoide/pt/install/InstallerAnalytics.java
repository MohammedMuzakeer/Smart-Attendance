package cm.aptoide.pt.install;

import cm.aptoide.pt.packageinstaller.InstallStatus.Status;

public interface InstallerAnalytics {
    void installationType(boolean z, boolean z2);

    void logInstallCancelEvent(String str, int i);

    void logInstallErrorEvent(String str, int i, Exception exception);

    void rootInstallCancelled();

    void rootInstallCompleted(int i);

    void rootInstallFail(Exception exception);

    void rootInstallStart();

    void rootInstallTimeout();

    void sendMiuiInstallResultEvent(Status status);
}
