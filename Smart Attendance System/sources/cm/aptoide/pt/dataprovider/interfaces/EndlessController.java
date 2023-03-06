package cm.aptoide.pt.dataprovider.interfaces;

import java.util.List;
import rx.e;

public interface EndlessController<U> {
    e<List<U>> get();

    e<List<U>> loadMore();
}
