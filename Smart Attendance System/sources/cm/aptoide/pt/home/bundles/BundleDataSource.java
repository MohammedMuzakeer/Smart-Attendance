package cm.aptoide.pt.home.bundles;

import rx.Single;
import rx.e;

public interface BundleDataSource {
    boolean hasMore(Integer num, String str);

    Single<HomeBundlesModel> loadFreshBundleForEvent(String str, String str2);

    e<HomeBundlesModel> loadFreshHomeBundles(String str);

    Single<HomeBundlesModel> loadNextBundleForEvent(String str, int i, String str2, int i2);

    e<HomeBundlesModel> loadNextHomeBundles(int i, int i2, String str, boolean z);
}
