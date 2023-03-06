package cm.aptoide.pt.account.view.user;

import cm.aptoide.pt.account.view.ImagePickerView;
import rx.b;
import rx.e;

public interface ManageUserView extends ImagePickerView {
    e<Void> cancelButtonClick();

    void hideProgressDialog();

    void loadImageStateless(String str);

    e<ViewModel> saveUserDataButtonClick();

    void setUserName(String str);

    b showErrorMessage(String str);

    void showProgressDialog();
}
