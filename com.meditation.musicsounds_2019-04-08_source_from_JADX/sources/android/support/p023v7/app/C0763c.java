package android.support.p023v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.app.c */
class C0763c {

    /* renamed from: a */
    private static final int[] f2225a = {16843531};

    /* renamed from: android.support.v7.app.c$a */
    static class C0764a {

        /* renamed from: a */
        public Method f2226a;

        /* renamed from: b */
        public Method f2227b;

        /* renamed from: c */
        public ImageView f2228c;

        C0764a(Activity activity) {
            try {
                this.f2226a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f2227b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(16908332);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        View childAt2 = viewGroup.getChildAt(1);
                        if (childAt.getId() != 16908332) {
                            childAt2 = childAt;
                        }
                        if (childAt2 instanceof ImageView) {
                            this.f2228c = (ImageView) childAt2;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static Drawable m3532a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f2225a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: a */
    public static C0764a m3533a(C0764a aVar, Activity activity, int i) {
        if (aVar == null) {
            aVar = new C0764a(activity);
        }
        if (aVar.f2226a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f2227b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
                if (VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static C0764a m3534a(C0764a aVar, Activity activity, Drawable drawable, int i) {
        C0764a aVar2 = new C0764a(activity);
        if (aVar2.f2226a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar2.f2226a.invoke(actionBar, new Object[]{drawable});
                aVar2.f2227b.invoke(actionBar, new Object[]{Integer.valueOf(i)});
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else if (aVar2.f2228c != null) {
            aVar2.f2228c.setImageDrawable(drawable);
        } else {
            Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
        }
        return aVar2;
    }
}
