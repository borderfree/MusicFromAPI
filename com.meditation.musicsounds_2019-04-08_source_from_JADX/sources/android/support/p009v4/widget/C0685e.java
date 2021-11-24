package android.support.p009v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.e */
public final class C0685e {

    /* renamed from: a */
    private static final C0688c f2022a;

    /* renamed from: android.support.v4.widget.e$a */
    static class C0686a extends C0688c {
        C0686a() {
        }

        /* renamed from: a */
        public void mo2857a(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        /* renamed from: a */
        public void mo2858a(CompoundButton compoundButton, Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: android.support.v4.widget.e$b */
    static class C0687b extends C0686a {
        C0687b() {
        }

        /* renamed from: a */
        public Drawable mo2859a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    /* renamed from: android.support.v4.widget.e$c */
    static class C0688c {

        /* renamed from: a */
        private static Field f2023a;

        /* renamed from: b */
        private static boolean f2024b;

        C0688c() {
        }

        /* renamed from: a */
        public Drawable mo2859a(CompoundButton compoundButton) {
            if (!f2024b) {
                try {
                    f2023a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    f2023a.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
                }
                f2024b = true;
            }
            if (f2023a != null) {
                try {
                    return (Drawable) f2023a.get(compoundButton);
                } catch (IllegalAccessException e2) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                    f2023a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo2857a(CompoundButton compoundButton, ColorStateList colorStateList) {
            if (compoundButton instanceof C0719q) {
                ((C0719q) compoundButton).setSupportButtonTintList(colorStateList);
            }
        }

        /* renamed from: a */
        public void mo2858a(CompoundButton compoundButton, Mode mode) {
            if (compoundButton instanceof C0719q) {
                ((C0719q) compoundButton).setSupportButtonTintMode(mode);
            }
        }
    }

    static {
        C0688c cVar = VERSION.SDK_INT >= 23 ? new C0687b() : VERSION.SDK_INT >= 21 ? new C0686a() : new C0688c();
        f2022a = cVar;
    }

    /* renamed from: a */
    public static Drawable m3256a(CompoundButton compoundButton) {
        return f2022a.mo2859a(compoundButton);
    }

    /* renamed from: a */
    public static void m3257a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f2022a.mo2857a(compoundButton, colorStateList);
    }

    /* renamed from: a */
    public static void m3258a(CompoundButton compoundButton, Mode mode) {
        f2022a.mo2858a(compoundButton, mode);
    }
}
