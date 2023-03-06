package cm.aptoide.pt.app;

import cm.aptoide.pt.ads.data.ApplicationAd;
import cm.aptoide.pt.ads.data.ApplicationAdError;

public interface ApplicationAdResult {
    ApplicationAd getAd();

    ApplicationAdError getError();
}
