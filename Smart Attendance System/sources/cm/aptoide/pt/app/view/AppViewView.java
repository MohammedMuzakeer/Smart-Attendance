package cm.aptoide.pt.app.view;

import android.util.Pair;
import android.view.MenuItem;
import cm.aptoide.pt.app.AppModel;
import cm.aptoide.pt.app.DownloadModel;
import cm.aptoide.pt.app.ReviewsViewModel;
import cm.aptoide.pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.pt.app.view.similar.SimilarAppClickEvent;
import cm.aptoide.pt.app.view.similar.SimilarAppsBundle;
import cm.aptoide.pt.appview.InstallAppView;
import cm.aptoide.pt.bonus.BonusAppcModel;
import cm.aptoide.pt.donations.Donation;
import cm.aptoide.pt.promotions.Promotion;
import cm.aptoide.pt.promotions.Promotion.ClaimAction;
import cm.aptoide.pt.promotions.WalletApp;
import cm.aptoide.pt.search.model.SearchAdResult;
import cm.aptoide.pt.utils.GenericDialogs.EResponse;
import cm.aptoide.pt.view.app.DetailedAppRequestResult.Error;
import cm.aptoide.pt.view.app.FlagsVote.VoteType;
import java.util.List;
import n.g.a.c.f;
import rx.e;

public interface AppViewView extends InstallAppView {
    e<String> apkfyDialogPositiveClick();

    e<WalletApp> cancelPromotionDownload();

    e<Promotion> claimAppClick();

    e<Void> clickBonusAppcFlair();

    e<Void> clickCatappultCard();

    e<Void> clickDeveloperEmail();

    e<Void> clickDeveloperPermissions();

    e<Void> clickDeveloperPrivacy();

    e<Void> clickDeveloperWebsite();

    e<Void> clickErrorRetry();

    e<VoteType> clickFakeFlag();

    e<Void> clickFollowStore();

    e<Void> clickGetAppcInfo();

    e<VoteType> clickLicenseFlag();

    e<Void> clickLoginSnack();

    e<Void> clickOtherVersions();

    e<Void> clickRateApp();

    e<Void> clickRateAppLarge();

    e<Void> clickRateAppLayout();

    e<Void> clickReadAllReviews();

    e<Void> clickReviewsLayout();

    e<SimilarAppClickEvent> clickSimilarApp();

    e<Void> clickStoreLayout();

    e<MenuItem> clickToolbar();

    e<Void> clickTopDonorsDonateButton();

    e<Void> clickTrustedBadge();

    e<VoteType> clickVirusFlag();

    e<VoteType> clickWorkingFlag();

    e<ReadMoreClickEvent> clickedReadMore();

    void defaultShare(String str, String str2);

    void disableFlags();

    e<Promotion> dismissWalletPromotionClick();

    void dismissWalletPromotionView();

    void displayNotLoggedInSnack();

    void displayStoreFollowedSnack(String str);

    e<Void> eSkillsCardClick();

    void enableFlags();

    void extractReferrer(SearchAdResult searchAdResult);

    String getLanguageFilter();

    e<ScreenShotClickEvent> getScreenshotClickEvent();

    void handleError(Error error);

    void hideReviews();

    void hideSimilarApps();

    e<Void> iabInfoClick();

    void incrementFlags(VoteType voteType);

    e<Pair<Promotion, WalletApp>> installWalletButtonClick();

    boolean isSimilarAppsVisible();

    void navigateToDeveloperEmail(AppModel appModel);

    void navigateToDeveloperPermissions(AppModel appModel);

    void navigateToDeveloperPrivacy(AppModel appModel);

    void navigateToDeveloperWebsite(AppModel appModel);

    e<WalletApp> pausePromotionDownload();

    void populateReviews(ReviewsViewModel reviewsViewModel, AppModel appModel);

    void populateSimilar(List<SimilarAppsBundle> list);

    void recoverScrollViewState();

    e<WalletApp> resumePromotionDownload();

    void scrollReviews(Integer num);

    e<Integer> scrollReviewsResponse();

    e<f> scrollVisibleSimilarApps();

    void setFollowButton(boolean z);

    void setInstallButton(AppCoinsViewModel appCoinsViewModel);

    void setupAppcAppView(boolean z, BonusAppcModel bonusAppcModel);

    void showApkfyElement(String str);

    void showAppView(AppModel appModel);

    void showAppcWalletPromotionView(Promotion promotion, WalletApp walletApp, ClaimAction claimAction, DownloadModel downloadModel);

    void showDonations(List<Donation> list);

    void showDownloadError(DownloadModel downloadModel);

    void showDownloadingSimilarApps(boolean z);

    void showFlagVoteSubmittedMessage();

    void showLoading();

    e<Void> showOpenAndInstallApkFyDialog(String str, String str2, double d, float f, String str3, int i);

    e<Void> showOpenAndInstallDialog(String str, String str2);

    e<EResponse> showRateDialog(String str, String str2, String str3);

    void showShareOnTvDialog(long j);

    void showTrustedDialog(AppModel appModel);

    e<Boolean> similarAppsVisibilityFromInstallClick();
}
