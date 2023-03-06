package cm.aptoide.pt.account.view.store;

import cm.aptoide.pt.account.view.ImagePickerView;
import rx.e;

public interface ManageStoreView extends ImagePickerView {
    e<ManageStoreViewModel> cancelClick();

    void dismissWaitProgressBar();

    void loadImageStateless(String str);

    e<ManageStoreViewModel> saveDataClick();

    void showError(String str);

    void showSuccessMessage();

    void showWaitProgressBar();
}
