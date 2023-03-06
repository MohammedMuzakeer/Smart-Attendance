package cm.aptoide.accountmanager;

import rx.Single;
import rx.b;

public interface AccountPersistence {
    Single<Account> getAccount();

    b removeAccount();

    b saveAccount(Account account);
}
