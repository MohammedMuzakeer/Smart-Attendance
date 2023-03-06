package cm.aptoide.pt.navigator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import rx.e;

public interface ActivityNavigator {
    Activity getActivity();

    void navigateBack();

    void navigateBackWithResult(int i, Bundle bundle);

    e<Result> navigateForResult(String str, Uri uri, int i);

    void navigateForResult(Intent intent, int i);

    void navigateForResult(Class<? extends Activity> cls, int i, Bundle bundle);

    void navigateForResult(String str, Uri uri, int i, String str2, String str3);

    e<Result> navigateForResultWithOutput(String str, Uri uri, int i);

    void navigateTo(Uri uri);

    void navigateTo(Class<? extends Activity> cls);

    void navigateTo(Class<? extends Activity> cls, Bundle bundle);

    void navigateWithIntent(Intent intent);

    e<Result> results();

    e<Result> results(int i);
}
