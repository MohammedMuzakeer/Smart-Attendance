package cm.aptoide.pt.app.view.donations.view;

import cm.aptoide.pt.app.view.donations.model.DonationsDialogResult;
import rx.e;

public interface DonateDialogView {
    e<DonationsDialogResult> cancelClick();

    void dismissDialog();

    e<DonationsDialogResult> donateClick();

    e<Void> noWalletContinueClick();

    void sendWalletIntent(float f, String str, String str2, String str3);

    void showErrorMessage();

    void showLoading();

    void showNoWalletView();
}
