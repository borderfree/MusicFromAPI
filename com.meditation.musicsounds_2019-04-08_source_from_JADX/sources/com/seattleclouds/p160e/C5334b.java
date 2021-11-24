package com.seattleclouds.p160e;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.C0152d;
import android.support.p009v4.p010a.C0310a;
import android.support.p009v4.p010a.p011a.C0311a;
import android.support.p009v4.view.C0626s;
import android.support.p009v4.widget.C0711p;
import android.support.p023v7.app.C0751a;
import android.support.p023v7.app.C0767e;
import android.support.p023v7.view.menu.ActionMenuItemView;
import android.support.p023v7.view.menu.C0859j;
import android.support.p023v7.widget.SearchView;
import android.support.p023v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5453b;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.util.C6594an;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.C6610f;
import com.seattleclouds.util.C6611g;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.e.b */
public class C5334b {

    /* renamed from: a */
    private static final String f19117a = "b";

    /* renamed from: b */
    private static final float[] f19118b = new float[3];

    /* renamed from: c */
    private static final int f19119c = Color.parseColor("#33000000");

    /* renamed from: a */
    private static float m26749a(C5338d dVar) {
        return dVar.mo17534b().equals("Theme.Base.Light") ? 0.62f : 0.7f;
    }

    /* renamed from: a */
    public static int m26750a(int i) {
        return C0310a.m1166a(f19119c, i);
    }

    /* renamed from: a */
    private static int m26751a(C5338d dVar, int i) {
        return C6610f.m31968a(i, m26749a(dVar));
    }

    /* renamed from: a */
    private static View m26752a(C0767e eVar) {
        View findViewById = eVar.findViewById(C5458g.action_context_bar);
        if (findViewById == null) {
            try {
                Field declaredField = Class.forName("android.support.v7.app.AppCompatDelegateImplV7").getDeclaredField("mActionModeView");
                declaredField.setAccessible(true);
                return (View) declaredField.get(eVar.mo3087l());
            } catch (Exception unused) {
            }
        }
        return findViewById;
    }

    /* renamed from: a */
    public static void m26753a(int i, SearchView searchView) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) searchView.findViewById(C5458g.search_src_text);
        if (autoCompleteTextView != null) {
            m26755a(i, (EditText) autoCompleteTextView);
        }
    }

    /* renamed from: a */
    public static void m26754a(int i, Button button) {
        C6611g.m31980a(button, C5339e.m26797b(button.getContext(), i));
    }

    /* renamed from: a */
    public static void m26755a(int i, EditText editText) {
        C0626s.m2840a((View) editText, C5339e.m26799d(editText.getContext(), i));
        C6611g.m31981a(editText, i);
        C6611g.m31982b(editText, i);
        editText.setHighlightColor(C6610f.m31968a(i, 0.4f));
        editText.setImeOptions(editText.getImeOptions() | 33554432);
    }

    /* renamed from: a */
    public static void m26756a(int i, ImageView imageView) {
        m26761a(ColorStateList.valueOf(i), imageView);
    }

    @TargetApi(21)
    /* renamed from: a */
    public static void m26757a(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
        }
    }

    /* renamed from: a */
    private static void m26758a(Activity activity, final ColorStateList colorStateList) {
        final String string = activity.getString(C5462k.abc_action_menu_overflow_description);
        final ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        final ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                ArrayList arrayList = new ArrayList();
                viewGroup.findViewsWithText(arrayList, string, 2);
                if (!arrayList.isEmpty()) {
                    if (arrayList.get(0) instanceof ImageView) {
                        C5334b.m26761a(colorStateList, (ImageView) arrayList.get(0));
                    }
                    if (viewTreeObserver.isAlive()) {
                        C6611g.m31979a(viewTreeObserver, (OnGlobalLayoutListener) this);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private static void m26759a(final ColorStateList colorStateList, C0767e eVar) {
        final View findViewById = eVar.findViewById(C5458g.action_bar);
        if (findViewById instanceof ViewGroup) {
            final ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    C5334b.m26776c((ViewGroup) findViewById, colorStateList);
                    if (viewTreeObserver.isAlive()) {
                        C6611g.m31979a(viewTreeObserver, (OnGlobalLayoutListener) this);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static void m26760a(ColorStateList colorStateList, SearchView searchView) {
        if (colorStateList.getDefaultColor() == C6594an.m31920b(searchView.getContext(), C5453b.colorControlNormal).getDefaultColor()) {
            Log.d(f19117a, "SearchView: no need to tint with default color");
        } else {
            m26773b((ViewGroup) searchView, colorStateList);
        }
    }

    /* renamed from: a */
    public static void m26761a(ColorStateList colorStateList, ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                Drawable g = C0311a.m1186g(drawable);
                imageView.setImageDrawable(g);
                C0311a.m1175a(g, colorStateList);
            }
        }
    }

    /* renamed from: a */
    private static void m26762a(ColorStateList colorStateList, TextView textView) {
        textView.setTextColor(colorStateList);
    }

    @TargetApi(17)
    /* renamed from: a */
    public static void m26764a(TextView textView, int i) {
        boolean z = VERSION.SDK_INT >= 17;
        Drawable[] compoundDrawablesRelative = z ? textView.getCompoundDrawablesRelative() : textView.getCompoundDrawables();
        for (int i2 = 0; i2 < compoundDrawablesRelative.length; i2++) {
            Drawable drawable = compoundDrawablesRelative[i2];
            if (drawable != null) {
                compoundDrawablesRelative[i2] = C6611g.m31975a(drawable, i);
            }
        }
        if (!z) {
            int compoundDrawablePadding = textView.getCompoundDrawablePadding();
            textView.setCompoundDrawablePadding(0);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setCompoundDrawablePadding(compoundDrawablePadding);
        }
        C0711p.m3330b(textView, compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    /* renamed from: a */
    public static void m26765a(C5338d dVar, TabLayout tabLayout) {
        Context context = tabLayout.getContext();
        if (context instanceof C0767e) {
            C0751a i = ((C0767e) context).mo3083i();
            if (i != null) {
                context = i.mo3005e();
            }
        }
        tabLayout.setBackgroundColor(dVar.mo17544a(context));
        C6600as.m31945a(tabLayout, dVar.mo17551h(context));
        int i2 = dVar.mo17552i(context);
        int a = m26751a(dVar, i2);
        tabLayout.setTabTextColors(a, i2);
        ColorStateList b = C6610f.m31972b(a, i2);
        for (int i3 = 0; i3 < tabLayout.getTabCount(); i3++) {
            C0152d tabAt = tabLayout.getTabAt(i3);
            if (tabAt.mo731b() != null) {
                tabAt.mo727a(C6611g.m31976a(tabAt.mo731b(), b));
            }
        }
    }

    /* renamed from: a */
    private static void m26766a(C5338d dVar, C0751a aVar) {
        if ((aVar.mo2983a() & 4) == 4) {
            int f = dVar.mo17549f(aVar.mo3005e());
            int i = C5453b.homeAsUpIndicator;
            aVar.mo2997b(C6611g.m31975a(VERSION.SDK_INT < 21 ? C6594an.m31925g(aVar.mo3005e(), i) : C6594an.m31924f(aVar.mo3005e(), i), f));
        }
    }

    /* renamed from: a */
    public static void m26767a(C5338d dVar, C0767e eVar) {
        C0751a i = eVar.mo3083i();
        if (i != null) {
            i.mo2988a((Drawable) new ColorDrawable(dVar.mo17544a(eVar)));
            m26766a(dVar, i);
            View findViewById = eVar.findViewById(C5458g.action_bar);
            if (findViewById instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) findViewById;
                int g = dVar.mo17550g(i.mo3005e());
                int a = m26751a(dVar, g);
                toolbar.setTitleTextColor(g);
                toolbar.setSubtitleTextColor(a);
            }
        }
    }

    /* renamed from: a */
    public static void m26768a(C5338d dVar, C0767e eVar, Menu menu) {
        if (menu.size() != 0 && eVar.mo3083i() != null) {
            Context e = eVar.mo3083i().mo3005e();
            ColorStateList a = C6610f.m31970a(e, dVar.mo17549f(e));
            boolean z = false;
            for (int i = 0; i < menu.size(); i++) {
                MenuItem item = menu.getItem(i);
                Drawable icon = item.getIcon();
                if (icon != null) {
                    item.setIcon(C6611g.m31976a(icon, a));
                }
                if (item.getActionView() instanceof SearchView) {
                    m26760a(a, (SearchView) item.getActionView());
                    m26753a(dVar.mo17548e(e), (SearchView) item.getActionView());
                }
                z = z || m26772a(item);
            }
            if (z) {
                m26759a(a, eVar);
            }
            m26758a((Activity) eVar, a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m26769a(com.seattleclouds.p160e.C5338d r3, android.support.p023v7.app.C0767e r4, boolean r5) {
        /*
            java.lang.String r0 = r3.mo17534b()
            if (r5 == 0) goto L_0x0009
            int r1 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Light_Dialog
            goto L_0x000b
        L_0x0009:
            int r1 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Light_DarkActionBar
        L_0x000b:
            java.lang.String r2 = "Theme.Base"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x001c
            if (r5 == 0) goto L_0x0019
            int r0 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Dialog
        L_0x0017:
            r1 = r0
            goto L_0x006f
        L_0x0019:
            int r0 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme
            goto L_0x0017
        L_0x001c:
            java.lang.String r2 = "Theme.Base.Light"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x002c
            if (r5 == 0) goto L_0x0029
            int r0 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Light_Dialog
            goto L_0x0017
        L_0x0029:
            int r0 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Light
            goto L_0x0017
        L_0x002c:
            if (r5 != 0) goto L_0x006f
            java.lang.String r2 = "Theme.Base.NoActionBar"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0039
            int r1 = com.seattleclouds.C5451m.C5463l.DefaultAppTheme_NoActionBar
            goto L_0x006f
        L_0x0039:
            java.lang.String r2 = "Theme.Base.Light.NoActionBar"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0044
            int r1 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Light_NoActionBar
            goto L_0x006f
        L_0x0044:
            java.lang.String r2 = "Theme.Base.Light.DarkBars.NoActionBar"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x004f
            int r1 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Light_DarkActionBar_NoActionBar
            goto L_0x006f
        L_0x004f:
            java.lang.String r2 = "Theme.Base.FullScreen"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x005a
            int r1 = com.seattleclouds.C5451m.C5463l.DefaultAppTheme_Fullscreen
            goto L_0x006f
        L_0x005a:
            java.lang.String r2 = "Theme.Base.Light.FullScreen"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0065
            int r1 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Light_Fullscreen
            goto L_0x006f
        L_0x0065:
            java.lang.String r2 = "Theme.Base.Light.DarkBars.FullScreen"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006f
            int r1 = com.seattleclouds.C5451m.C5463l.SCAppBaseTheme_Light_DarkActionBar_Fullscreen
        L_0x006f:
            r4.setTheme(r1)
            if (r5 == 0) goto L_0x0083
            android.view.Window r5 = r4.getWindow()
            r0 = 16842836(0x1010054, float:2.3693793E-38)
            android.graphics.drawable.Drawable r0 = com.seattleclouds.util.C6594an.m31924f(r4, r0)
        L_0x007f:
            r5.setBackgroundDrawable(r0)
            goto L_0x0091
        L_0x0083:
            android.view.Window r5 = r4.getWindow()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            int r1 = r3.mo17547d(r4)
            r0.<init>(r1)
            goto L_0x007f
        L_0x0091:
            int r3 = r3.mo17545b(r4)
            m26757a(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p160e.C5334b.m26769a(com.seattleclouds.e.d, android.support.v7.app.e, boolean):void");
    }

    /* renamed from: a */
    public static void m26770a(C5338d dVar, Button button) {
        Context context = button.getContext();
        int c = dVar.mo17546c(context);
        if (c == C6594an.m31917a(context, C5453b.colorAccent)) {
            c = C6594an.m31917a(context, C5453b.colorButtonNormal);
        }
        m26754a(c, button);
    }

    /* renamed from: a */
    public static void m26771a(C5338d dVar, EditText editText) {
        m26755a(dVar.mo17546c(editText.getContext()), editText);
    }

    /* renamed from: a */
    private static boolean m26772a(MenuItem menuItem) {
        if (TextUtils.isEmpty(menuItem.getTitle())) {
            return false;
        }
        if (menuItem instanceof C0859j) {
            C0859j jVar = (C0859j) menuItem;
            if (!jVar.mo3589k() && !jVar.mo3590l()) {
                return false;
            }
            if ((menuItem.getIcon() != null && !jVar.mo3591m()) || (menuItem.getActionView() instanceof SearchView)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static void m26773b(ViewGroup viewGroup, ColorStateList colorStateList) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                m26773b((ViewGroup) childAt, colorStateList);
            } else if (childAt instanceof ImageView) {
                m26761a(colorStateList, (ImageView) childAt);
            }
        }
    }

    /* renamed from: b */
    public static void m26774b(C5338d dVar, C0767e eVar) {
        View a = m26752a(eVar);
        if (a != null) {
            Drawable background = a.getBackground();
            if (background instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                if (layerDrawable.getNumberOfLayers() > 1) {
                    layerDrawable.getDrawable(1).setColorFilter(dVar.mo17546c(eVar), Mode.SRC_IN);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m26775b(C5338d dVar, Button button) {
        Context context = button.getContext();
        button.setTextColor(C5339e.m26798c(context, dVar.mo17546c(context)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m26776c(ViewGroup viewGroup, ColorStateList colorStateList) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                m26776c((ViewGroup) childAt, colorStateList);
            } else if ((childAt instanceof ActionMenuItemView) && (childAt instanceof TextView)) {
                m26762a(colorStateList, (TextView) childAt);
            }
        }
    }
}
