package cm.aptoide.pt.home;

import cm.aptoide.pt.home.apps.BundleView;
import cm.aptoide.pt.home.bundles.HomeBundlesModel;
import cm.aptoide.pt.home.bundles.base.AppComingSoonPromotionalBundle;
import cm.aptoide.pt.home.bundles.base.HomeEvent;
import cm.aptoide.pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.pt.reactions.ReactionsHomeEvent;
import rx.e;

public interface HomeView extends BundleView {
    e<HomeEvent> cancelNotifyMeClicked();

    e<HomeEvent> dismissBundleClicked();

    e<HomeEvent> eSkillsKnowMoreClick();

    e<EditorialHomeEvent> editorialCardClicked();

    void hideBundle(int i);

    e<Void> imageClick();

    e<HomeEvent> infoBundleKnowMoreClicked();

    e<HomeEvent> notifyMeClicked();

    e<HomeEvent> onLoadMoreRetryClicked();

    e<EditorialHomeEvent> reactionButtonLongPress();

    e<ReactionsHomeEvent> reactionClicked();

    e<EditorialHomeEvent> reactionsButtonClicked();

    void removeLoadMoreError();

    void scrollToTop();

    void sendDeeplinkToWalletAppView(String str);

    void setAdsTest(boolean z);

    void setUserImage(String str);

    void showBundlesSkeleton(HomeBundlesModel homeBundlesModel);

    void showConsentDialog();

    void showGenericErrorToast();

    void showLoadMoreError();

    void showLogInDialog();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2, int i);

    e<Void> snackLogInClick();

    void updateAppComingSoonStatus(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle, boolean z);

    e<HomeEvent> walletOfferCardInstallWalletClick();
}
