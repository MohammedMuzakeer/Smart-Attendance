package cm.aptoide.pt.app.migration;

import rx.e;

public interface AppcMigrationPersistence {
    void insert(String str);

    e<Boolean> isAppMigrated(String str);
}
