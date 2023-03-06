package cm.aptoide.pt.dataprovider.interfaces;

import java.util.List;
import rx.e;

public interface EndlessControllerWithCache<U> extends EndlessController<U> {
    e<List<U>> loadMore(boolean z);
}
