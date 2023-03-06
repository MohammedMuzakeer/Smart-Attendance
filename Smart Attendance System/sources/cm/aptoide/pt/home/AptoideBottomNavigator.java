package cm.aptoide.pt.home;

import cm.aptoide.pt.bottomNavigation.BottomNavigationItem;
import rx.e;

public interface AptoideBottomNavigator {
    void hideBottomNavigation();

    e<Integer> navigationEvent();

    void requestFocus(BottomNavigationItem bottomNavigationItem);

    void showFragment(Integer num);

    void toggleBottomNavigation();
}
