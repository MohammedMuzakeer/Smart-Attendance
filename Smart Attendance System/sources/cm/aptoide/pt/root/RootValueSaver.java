package cm.aptoide.pt.root;

import rx.Single;
import rx.b;

public interface RootValueSaver {
    Single<Boolean> isPhoneRoot();

    b save(boolean z);
}
