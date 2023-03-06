package cm.aptoide.pt.view;

import android.os.Bundle;

public interface LifecycleSchim {
    void onDestroyView();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onViewCreated();

    void onViewStateRestored(Bundle bundle);
}
