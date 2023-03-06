package cm.aptoide.pt;

import cm.aptoide.pt.dataprovider.ws.v7.store.StoreContext;

public interface NavigationTrackerPagerAdapterHelper {
    String getItemName(int i);

    StoreContext getItemStore();

    String getItemTag(int i);
}
