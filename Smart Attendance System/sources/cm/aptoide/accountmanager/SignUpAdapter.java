package cm.aptoide.accountmanager;

import rx.Single;
import rx.b;

public interface SignUpAdapter<T> {
    boolean isEnabled();

    b logout();

    Single<Account> signUp(T t, AccountService accountService);
}
