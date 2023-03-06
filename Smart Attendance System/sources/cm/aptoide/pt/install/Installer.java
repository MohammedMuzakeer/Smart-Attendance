package cm.aptoide.pt.install;

import cm.aptoide.pt.install.installer.InstallationState;
import rx.b;
import rx.e;

public interface Installer {
    void dispatchInstallations();

    b downgrade(String str, boolean z, boolean z2);

    e<InstallationState> getState(String str, int i);

    b install(String str, boolean z, boolean z2);

    void stopDispatching();

    b uninstall(String str);

    b update(String str, boolean z, boolean z2);
}
