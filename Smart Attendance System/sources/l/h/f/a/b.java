package l.h.f.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;

/* compiled from: SupportMenuItem */
public interface b extends MenuItem {
    b a(l.h.l.b bVar);

    l.h.l.b a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    b setTooltipText(CharSequence charSequence);
}
