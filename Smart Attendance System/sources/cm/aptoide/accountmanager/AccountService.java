package cm.aptoide.accountmanager;

import com.aptoide.authentication.model.CodeAuth;
import l.h.k.d;
import rx.Single;
import rx.b;

public interface AccountService {
    Single<Account> createAccount(String str, String str2);

    Single<Account> createAccount(String str, String str2, String str3);

    Single<Account> getAccount(String str);

    Single<d<Account, Boolean>> getAccount(String str, String str2, String str3, String str4);

    b removeAccount();

    Single<CodeAuth> sendMagicLink(String str);

    b subscribeStore(String str, String str2, String str3);

    b unsubscribeStore(String str, String str2, String str3);

    b updateAccount(String str);

    b updateAccount(String str, String str2);

    b updateAccount(boolean z);

    b updateAccountUsername(String str);

    b updateTermsAndConditions();
}
