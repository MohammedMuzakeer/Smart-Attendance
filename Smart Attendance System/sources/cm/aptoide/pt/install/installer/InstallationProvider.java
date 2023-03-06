package cm.aptoide.pt.install.installer;

import rx.e;

public interface InstallationProvider {
    e<Installation> getInstallation(String str);
}
