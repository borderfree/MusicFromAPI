package android.support.p009v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.view.e */
public final class C0605e {

    /* renamed from: a */
    static final C0607b f1773a = (VERSION.SDK_INT >= 21 ? new C0606a() : new C0607b());

    /* renamed from: b */
    private static Field f1774b;

    /* renamed from: c */
    private static boolean f1775c;

    /* renamed from: android.support.v4.view.e$a */
    static class C0606a extends C0607b {
        C0606a() {
        }

        /* renamed from: a */
        public void mo2443a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    /* renamed from: android.support.v4.view.e$b */
    static class C0607b {
        C0607b() {
        }

        /* renamed from: a */
        public void mo2443a(LayoutInflater layoutInflater, Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                C0605e.m2743a(layoutInflater, (Factory2) factory);
            } else {
                C0605e.m2743a(layoutInflater, factory2);
            }
        }
    }

    /* renamed from: a */
    static void m2743a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f1775c) {
            try {
                f1774b = LayoutInflater.class.getDeclaredField("mFactory2");
                f1774b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb.toString(), e);
            }
            f1775c = true;
        }
        if (f1774b != null) {
            try {
                f1774b.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", sb2.toString(), e2);
            }
        }
    }

    /* renamed from: b */
    public static void m2744b(LayoutInflater layoutInflater, Factory2 factory2) {
        f1773a.mo2443a(layoutInflater, factory2);
    }
}
