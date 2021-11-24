package android.support.p009v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.support.p009v4.p012b.p013a.C0428b;
import android.util.Log;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.View;

/* renamed from: android.support.v4.view.g */
public final class C0609g {

    /* renamed from: a */
    static final C0613c f1776a = (VERSION.SDK_INT >= 26 ? new C0611a() : new C0612b());

    /* renamed from: android.support.v4.view.g$a */
    static class C0611a extends C0612b {
        C0611a() {
        }

        /* renamed from: a */
        public void mo2446a(MenuItem menuItem, char c, int i) {
            menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: a */
        public void mo2447a(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo2448a(MenuItem menuItem, Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        /* renamed from: a */
        public void mo2449a(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        /* renamed from: b */
        public void mo2450b(MenuItem menuItem, char c, int i) {
            menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: b */
        public void mo2451b(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: android.support.v4.view.g$b */
    static class C0612b implements C0613c {
        C0612b() {
        }

        /* renamed from: a */
        public void mo2446a(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: a */
        public void mo2447a(MenuItem menuItem, ColorStateList colorStateList) {
        }

        /* renamed from: a */
        public void mo2448a(MenuItem menuItem, Mode mode) {
        }

        /* renamed from: a */
        public void mo2449a(MenuItem menuItem, CharSequence charSequence) {
        }

        /* renamed from: b */
        public void mo2450b(MenuItem menuItem, char c, int i) {
        }

        /* renamed from: b */
        public void mo2451b(MenuItem menuItem, CharSequence charSequence) {
        }
    }

    /* renamed from: android.support.v4.view.g$c */
    interface C0613c {
        /* renamed from: a */
        void mo2446a(MenuItem menuItem, char c, int i);

        /* renamed from: a */
        void mo2447a(MenuItem menuItem, ColorStateList colorStateList);

        /* renamed from: a */
        void mo2448a(MenuItem menuItem, Mode mode);

        /* renamed from: a */
        void mo2449a(MenuItem menuItem, CharSequence charSequence);

        /* renamed from: b */
        void mo2450b(MenuItem menuItem, char c, int i);

        /* renamed from: b */
        void mo2451b(MenuItem menuItem, CharSequence charSequence);
    }

    @Deprecated
    /* renamed from: android.support.v4.view.g$d */
    public interface C0614d {
        /* renamed from: a */
        boolean mo2452a(MenuItem menuItem);

        /* renamed from: b */
        boolean mo2453b(MenuItem menuItem);
    }

    /* renamed from: a */
    public static MenuItem m2749a(MenuItem menuItem, C0592b bVar) {
        if (menuItem instanceof C0428b) {
            return ((C0428b) menuItem).mo1743a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    /* renamed from: a */
    public static MenuItem m2750a(MenuItem menuItem, final C0614d dVar) {
        return menuItem.setOnActionExpandListener(new OnActionExpandListener() {
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                return dVar.mo2453b(menuItem);
            }

            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return dVar.mo2452a(menuItem);
            }
        });
    }

    @Deprecated
    /* renamed from: a */
    public static View m2751a(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    /* renamed from: a */
    public static void m2752a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0428b) {
            ((C0428b) menuItem).setNumericShortcut(c, i);
        } else {
            f1776a.mo2450b(menuItem, c, i);
        }
    }

    /* renamed from: a */
    public static void m2753a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0428b) {
            ((C0428b) menuItem).setIconTintList(colorStateList);
        } else {
            f1776a.mo2447a(menuItem, colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2754a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0428b) {
            ((C0428b) menuItem).setIconTintMode(mode);
        } else {
            f1776a.mo2448a(menuItem, mode);
        }
    }

    /* renamed from: a */
    public static void m2755a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0428b) {
            ((C0428b) menuItem).mo1744a(charSequence);
        } else {
            f1776a.mo2449a(menuItem, charSequence);
        }
    }

    /* renamed from: b */
    public static void m2756b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0428b) {
            ((C0428b) menuItem).setAlphabeticShortcut(c, i);
        } else {
            f1776a.mo2446a(menuItem, c, i);
        }
    }

    /* renamed from: b */
    public static void m2757b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0428b) {
            ((C0428b) menuItem).mo1746b(charSequence);
        } else {
            f1776a.mo2451b(menuItem, charSequence);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m2758b(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }
}
