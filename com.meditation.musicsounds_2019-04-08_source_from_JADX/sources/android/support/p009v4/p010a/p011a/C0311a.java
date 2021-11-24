package android.support.p009v4.p010a.p011a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.a.a.a */
public final class C0311a {

    /* renamed from: a */
    private static Method f858a;

    /* renamed from: b */
    private static boolean f859b;

    /* renamed from: c */
    private static Method f860c;

    /* renamed from: d */
    private static boolean f861d;

    @Deprecated
    /* renamed from: a */
    public static void m1171a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: a */
    public static void m1172a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m1173a(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof C0312b) {
            ((C0312b) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m1174a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m1175a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof C0312b) {
            ((C0312b) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m1176a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static void m1177a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: a */
    public static void m1178a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof C0312b) {
            ((C0312b) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m1179a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: b */
    public static boolean m1180b(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m1181b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (VERSION.SDK_INT >= 17) {
            if (!f859b) {
                try {
                    f858a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f858a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f859b = true;
            }
            if (f858a != null) {
                try {
                    f858a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f858a = null;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static int m1182c(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m1183d(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: e */
    public static ColorFilter m1184e(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: f */
    public static void m1185f(Drawable drawable) {
        Drawable a;
        if (VERSION.SDK_INT < 23 && VERSION.SDK_INT >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                a = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof C0313c) {
                a = ((C0313c) drawable).mo1131a();
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            m1185f(child);
                        }
                    }
                    return;
                }
                return;
            } else {
                return;
            }
            m1185f(a);
            return;
        }
        drawable.clearColorFilter();
    }

    /* renamed from: g */
    public static Drawable m1186g(Drawable drawable) {
        return VERSION.SDK_INT >= 23 ? drawable : VERSION.SDK_INT >= 21 ? !(drawable instanceof C0312b) ? new C0319f(drawable) : drawable : VERSION.SDK_INT >= 19 ? !(drawable instanceof C0312b) ? new C0317e(drawable) : drawable : !(drawable instanceof C0312b) ? new C0314d(drawable) : drawable;
    }

    /* renamed from: h */
    public static <T extends Drawable> T m1187h(Drawable drawable) {
        return drawable instanceof C0313c ? ((C0313c) drawable).mo1131a() : drawable;
    }

    /* renamed from: i */
    public static int m1188i(Drawable drawable) {
        if (VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (VERSION.SDK_INT >= 17) {
            if (!f861d) {
                try {
                    f860c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f860c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
                }
                f861d = true;
            }
            if (f860c != null) {
                try {
                    return ((Integer) f860c.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                    f860c = null;
                }
            }
        }
        return 0;
    }
}
