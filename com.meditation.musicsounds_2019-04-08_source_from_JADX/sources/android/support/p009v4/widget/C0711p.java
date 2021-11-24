package android.support.p009v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p009v4.p020os.C0556a;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.p */
public final class C0711p {

    /* renamed from: a */
    static final C0718g f2051a;

    /* renamed from: android.support.v4.widget.p$a */
    static class C0712a extends C0718g {
        C0712a() {
        }

        /* renamed from: a */
        public int mo2902a(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: android.support.v4.widget.p$b */
    static class C0713b extends C0712a {
        C0713b() {
        }

        /* renamed from: a */
        public void mo2903a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        }

        /* renamed from: b */
        public void mo2904b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo2905b(TextView textView) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            if (z) {
                Drawable drawable = compoundDrawables[2];
                Drawable drawable2 = compoundDrawables[0];
                compoundDrawables[0] = drawable;
                compoundDrawables[2] = drawable2;
            }
            return compoundDrawables;
        }
    }

    /* renamed from: android.support.v4.widget.p$c */
    static class C0714c extends C0713b {
        C0714c() {
        }

        /* renamed from: a */
        public void mo2903a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public void mo2904b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo2905b(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }
    }

    /* renamed from: android.support.v4.widget.p$d */
    static class C0715d extends C0714c {
        C0715d() {
        }

        /* renamed from: a */
        public void mo2906a(TextView textView, int i) {
            textView.setTextAppearance(i);
        }
    }

    /* renamed from: android.support.v4.widget.p$e */
    static class C0716e extends C0715d {
        C0716e() {
        }
    }

    /* renamed from: android.support.v4.widget.p$f */
    static class C0717f extends C0716e {
        C0717f() {
        }
    }

    /* renamed from: android.support.v4.widget.p$g */
    static class C0718g {

        /* renamed from: a */
        private static Field f2052a;

        /* renamed from: b */
        private static boolean f2053b;

        /* renamed from: c */
        private static Field f2054c;

        /* renamed from: d */
        private static boolean f2055d;

        C0718g() {
        }

        /* renamed from: a */
        private static int m3340a(Field field, TextView textView) {
            try {
                return field.getInt(textView);
            } catch (IllegalAccessException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not retrieve value of ");
                sb.append(field.getName());
                sb.append(" field.");
                Log.d("TextViewCompatBase", sb.toString());
                return -1;
            }
        }

        /* renamed from: a */
        private static Field m3341a(String str) {
            Field field;
            try {
                field = TextView.class.getDeclaredField(str);
                try {
                    field.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
            } catch (NoSuchFieldException unused2) {
                field = null;
                StringBuilder sb = new StringBuilder();
                sb.append("Could not retrieve ");
                sb.append(str);
                sb.append(" field.");
                Log.e("TextViewCompatBase", sb.toString());
                return field;
            }
            return field;
        }

        /* renamed from: a */
        public int mo2902a(TextView textView) {
            if (!f2055d) {
                f2054c = m3341a("mMaxMode");
                f2055d = true;
            }
            if (f2054c != null && m3340a(f2054c, textView) == 1) {
                if (!f2053b) {
                    f2052a = m3341a("mMaximum");
                    f2053b = true;
                }
                if (f2052a != null) {
                    return m3340a(f2052a, textView);
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo2906a(TextView textView, int i) {
            textView.setTextAppearance(textView.getContext(), i);
        }

        /* renamed from: a */
        public void mo2903a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public void mo2904b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public Drawable[] mo2905b(TextView textView) {
            return textView.getCompoundDrawables();
        }
    }

    static {
        C0718g gVar = C0556a.m2553a() ? new C0717f() : VERSION.SDK_INT >= 26 ? new C0716e() : VERSION.SDK_INT >= 23 ? new C0715d() : VERSION.SDK_INT >= 18 ? new C0714c() : VERSION.SDK_INT >= 17 ? new C0713b() : VERSION.SDK_INT >= 16 ? new C0712a() : new C0718g();
        f2051a = gVar;
    }

    /* renamed from: a */
    public static int m3327a(TextView textView) {
        return f2051a.mo2902a(textView);
    }

    /* renamed from: a */
    public static void m3328a(TextView textView, int i) {
        f2051a.mo2906a(textView, i);
    }

    /* renamed from: a */
    public static void m3329a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f2051a.mo2903a(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: b */
    public static void m3330b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        f2051a.mo2904b(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: b */
    public static Drawable[] m3331b(TextView textView) {
        return f2051a.mo2905b(textView);
    }
}
