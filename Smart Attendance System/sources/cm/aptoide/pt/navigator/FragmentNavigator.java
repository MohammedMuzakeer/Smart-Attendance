package cm.aptoide.pt.navigator;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.b;
import rx.e;

public interface FragmentNavigator {
    public static final String REQUEST_CODE_EXTRA = "cm.aptoide.pt.view.navigator.extra.REQUEST_CODE";

    void cleanBackStack();

    int getBackStackEntryCount();

    Fragment getFragment();

    Fragment getFragment(String str);

    String getTagByBackStackEntry(int i);

    void navigateForResult(Fragment fragment, int i, boolean z);

    String navigateTo(Fragment fragment, boolean z);

    void navigateToCleaningBackStack(Fragment fragment, boolean z);

    void navigateToDialogForResult(b bVar, int i);

    void navigateToDialogFragment(b bVar);

    void navigateToWithoutBackSave(Fragment fragment, boolean z);

    Fragment peekLast();

    boolean popBackStack();

    void popBackStackUntil(String str);

    void popDialogWithResult(Result result);

    void popWithResult(Result result);

    e<Result> results(int i);
}
