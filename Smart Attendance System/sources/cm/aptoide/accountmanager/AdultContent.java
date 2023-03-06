package cm.aptoide.accountmanager;

import rx.b;
import rx.e;

public interface AdultContent {
    b disable(boolean z);

    b enable(int i);

    b enable(boolean z);

    e<Boolean> enabled();

    e<Boolean> pinRequired();

    b removePin(int i);

    b requirePin(int i);
}
