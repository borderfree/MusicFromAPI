package android.support.p009v4.widget;

import android.os.Build.VERSION;
import android.support.p009v4.view.C0604d;
import android.support.p009v4.view.C0626s;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.m */
public final class C0704m {

    /* renamed from: a */
    static final C0708d f2044a;

    /* renamed from: android.support.v4.widget.m$a */
    static class C0705a extends C0708d {
        C0705a() {
        }

        /* renamed from: a */
        public void mo2897a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.m$b */
    static class C0706b extends C0705a {

        /* renamed from: a */
        private static Field f2045a;

        static {
            try {
                f2045a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2045a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
            }
        }

        C0706b() {
        }

        /* renamed from: a */
        public void mo2898a(PopupWindow popupWindow, boolean z) {
            if (f2045a != null) {
                try {
                    f2045a.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
                }
            }
        }
    }

    /* renamed from: android.support.v4.widget.m$c */
    static class C0707c extends C0706b {
        C0707c() {
        }

        /* renamed from: a */
        public void mo2899a(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }

        /* renamed from: a */
        public void mo2898a(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }
    }

    /* renamed from: android.support.v4.widget.m$d */
    static class C0708d {

        /* renamed from: a */
        private static Method f2046a;

        /* renamed from: b */
        private static boolean f2047b;

        C0708d() {
        }

        /* renamed from: a */
        public void mo2899a(PopupWindow popupWindow, int i) {
            if (!f2047b) {
                try {
                    f2046a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                    f2046a.setAccessible(true);
                } catch (Exception unused) {
                }
                f2047b = true;
            }
            if (f2046a != null) {
                try {
                    f2046a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
                } catch (Exception unused2) {
                }
            }
        }

        /* renamed from: a */
        public void mo2897a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C0604d.m2741a(i3, C0626s.m2861e(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* renamed from: a */
        public void mo2898a(PopupWindow popupWindow, boolean z) {
        }
    }

    static {
        C0708d dVar = VERSION.SDK_INT >= 23 ? new C0707c() : VERSION.SDK_INT >= 21 ? new C0706b() : VERSION.SDK_INT >= 19 ? new C0705a() : new C0708d();
        f2044a = dVar;
    }

    /* renamed from: a */
    public static void m3314a(PopupWindow popupWindow, int i) {
        f2044a.mo2899a(popupWindow, i);
    }

    /* renamed from: a */
    public static void m3315a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f2044a.mo2897a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m3316a(PopupWindow popupWindow, boolean z) {
        f2044a.mo2898a(popupWindow, z);
    }
}
