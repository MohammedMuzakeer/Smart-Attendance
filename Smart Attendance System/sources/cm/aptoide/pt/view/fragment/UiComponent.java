package cm.aptoide.pt.view.fragment;

import android.os.Bundle;
import android.view.View;

public interface UiComponent {
    void bindViews(View view);

    int getContentViewId();

    void loadExtras(Bundle bundle);

    void setupToolbar();

    void setupViews();
}
