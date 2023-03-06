package cm.aptoide.pt.presenter;

import android.content.Context;
import cm.aptoide.pt.account.view.GooglePlayServicesView;
import rx.e;

public interface LoginSignUpCredentialsView extends GooglePlayServicesView {
    void dismiss();

    e<Boolean> facebookSignUpEvent();

    e<Void> facebookSignUpWithRequiredPermissionsInEvent();

    Context getApplicationContext();

    e<Boolean> googleSignUpEvent();

    void hideFacebookLogin();

    void hideGoogleLogin();

    void hideKeyboard();

    void hideLoading();

    void lockScreenRotation();

    e<Void> privacyPolicyClickEvent();

    void setCobrandText();

    void showAptoideLoginArea();

    e<Boolean> showAptoideLoginAreaClick();

    void showError(String str);

    void showFacebookLogin();

    void showFacebookPermissionsRequiredError(Throwable th);

    void showGoogleLogin();

    void showLoading();

    void showMagicLinkError(String str);

    void showTCandPP();

    void showTermsConditionError();

    e<Void> termsAndConditionsClickEvent();

    boolean tryCloseLoginBottomSheet(boolean z);

    void unlockScreenRotation();
}
