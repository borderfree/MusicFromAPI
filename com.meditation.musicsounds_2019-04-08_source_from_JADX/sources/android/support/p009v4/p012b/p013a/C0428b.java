package android.support.p009v4.p012b.p013a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.p009v4.view.C0592b;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.b.a.b */
public interface C0428b extends MenuItem {
    /* renamed from: a */
    C0428b mo1743a(C0592b bVar);

    /* renamed from: a */
    C0428b mo1744a(CharSequence charSequence);

    /* renamed from: a */
    C0592b mo1745a();

    /* renamed from: b */
    C0428b mo1746b(CharSequence charSequence);

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

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
