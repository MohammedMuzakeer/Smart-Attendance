package cm.aptoide.pt.downloadmanager;

import rx.e;

public interface CacheManager {
    e<Long> cleanCache();
}
