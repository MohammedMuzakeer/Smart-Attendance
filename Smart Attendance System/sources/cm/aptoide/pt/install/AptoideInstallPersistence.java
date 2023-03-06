package cm.aptoide.pt.install;

import rx.Single;

public interface AptoideInstallPersistence {
    void insert(String str);

    Single<Boolean> isInstalledWithAptoide(String str);
}
