package cm.aptoide.pt.search.view;

import android.content.DialogInterface;
import android.view.MenuItem;
import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.pt.download.view.DownloadClick;
import cm.aptoide.pt.search.model.SearchAppResult;
import cm.aptoide.pt.search.model.SearchAppResultWrapper;
import cm.aptoide.pt.search.model.SearchQueryModel;
import cm.aptoide.pt.search.model.SearchResultError;
import cm.aptoide.pt.search.suggestions.SearchQueryEvent;
import java.util.List;
import l.h.k.d;
import n.g.a.b.c.a.g;
import rx.e;

public interface SearchResultView extends SearchSuggestionsView {

    public interface Model {
        List<Filter> getFilters();

        SearchQueryModel getSearchQueryModel();

        String getStoreName();

        String getStoreTheme();

        boolean hasLoadedAds();

        boolean hasLoadedResults();
    }

    void addAllStoresResult(String str, List<SearchAppResult> list, boolean z, boolean z2, boolean z3, SearchResultError searchResultError);

    e<DialogInterface> adultContentDialogNegativeClick();

    e<DialogInterface> adultContentDialogPositiveClick();

    e<DialogInterface> adultContentPinDialogNegativeClick();

    e<CharSequence> adultContentWithPinDialogPositiveClick();

    void clearUnsubmittedQuery();

    e<Boolean> clickAdultContentSwitch();

    void disableAdultContent();

    void disableUpNavigation();

    void enableAdultContent();

    e<List<Filter>> filtersChangeEvents();

    e<DownloadClick> getDownloadClickEvents();

    e<ScreenShotClickEvent> getScreenshotClickEvent();

    Model getViewModel();

    boolean hasResults();

    void hideLoading();

    void hideSuggestionsViews();

    boolean isSearchViewExpanded();

    e<d<String, SearchQueryEvent>> listenToSuggestionClick();

    e<SearchAppResultWrapper> onViewItemClicked();

    e<g> queryChanged();

    void queryEvent(g gVar);

    e<Void> retryClicked();

    void scrollToTop();

    e<MenuItem> searchMenuItemClick();

    e<Void> searchResultsReachedBottom();

    e<Void> searchSetup();

    void setAdultContentSwitch(Boolean bool);

    void setUnsubmittedQuery(String str);

    void setVisibilityOnRestore();

    boolean shouldFocusInSearchBar();

    boolean shouldHideUpNavigation();

    boolean shouldShowSuggestions();

    void showAdultContentConfirmationDialog();

    void showAdultContentConfirmationDialogWithPin();

    void showBannerAd();

    void showGenericErrorView();

    void showLoading();

    void showMoreLoading();

    void showNativeAds();

    void showNoNetworkView();

    void showNoResultsView();

    void showResultsLoading();

    void showResultsView();

    void showWrongPinErrorMessage();

    void toggleSuggestionsView();

    void toggleTrendingView();

    e<Void> toolbarClick();

    e<Void> viewHasNoResults();
}
