package cm.aptoide.pt.view.fragment;

import cm.aptoide.pt.view.recycler.displayable.Displayable;
import java.util.List;

public interface DisplayableManager {
    DisplayableManager addDisplayable(int i, Displayable displayable, boolean z);

    DisplayableManager addDisplayable(Displayable displayable, boolean z);

    @Deprecated
    DisplayableManager addDisplayables(int i, List<? extends Displayable> list, boolean z);

    DisplayableManager addDisplayables(List<? extends Displayable> list, boolean z);

    DisplayableManager clearDisplayables();

    int getDisplayablesSize();

    boolean hasDisplayables();

    void removeDisplayables(int i, int i2);
}
