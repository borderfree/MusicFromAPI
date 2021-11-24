package com.seattleclouds.p160e;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.support.p009v4.content.C0452b;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5453b;
import com.seattleclouds.C5451m.C5455d;
import com.seattleclouds.util.C6594an;

/* renamed from: com.seattleclouds.e.d */
public class C5338d extends C5333a {

    /* renamed from: a */
    public static final C5338d f19131a = new C5338d("Theme.Empty");

    /* renamed from: b */
    private static final String f19132b = C5338d.class.getSimpleName();

    public C5338d(String str) {
        super(str);
    }

    /* renamed from: e */
    public static C5338d m26782e(String str) {
        C5333a aVar = (C5333a) App.f18501c.mo16991z().get(str);
        if (aVar instanceof C5338d) {
            return (C5338d) aVar;
        }
        return null;
    }

    /* renamed from: a */
    public int mo17544a(Context context) {
        Integer d = mo17538d("primaryColor");
        return d == null ? C6594an.m31917a(context, C5453b.colorPrimary) : d.intValue();
    }

    /* renamed from: b */
    public int mo17545b(Context context) {
        Integer d = mo17538d("primaryColor");
        return d == null ? C6594an.m31917a(context, C5453b.colorPrimaryDark) : C5334b.m26750a(d.intValue());
    }

    /* renamed from: b */
    public String mo17534b() {
        return super.mo17534b() != null ? super.mo17534b() : "Theme.Base.Light.DarkBars";
    }

    /* renamed from: c */
    public int mo17546c(Context context) {
        Integer d = mo17538d("accentColor");
        if (d == null) {
            d = mo17538d("primaryColor");
        }
        return d == null ? C6594an.m31917a(context, C5453b.colorAccent) : d.intValue();
    }

    /* renamed from: d */
    public int mo17547d(Context context) {
        if (C6594an.m31921c(context, 16842839)) {
            return C0452b.m2068c(context, mo17534b().equals("Theme.Base") ? C5455d.background_floating_material_dark : C5455d.background_floating_material_light);
        }
        Integer d = mo17538d("windowBackgroundColor");
        if (d != null) {
            return d.intValue();
        }
        try {
            return C6594an.m31917a(context, 16842836);
        } catch (NotFoundException unused) {
            Log.w(f19132b, "android.R.attr.windowBackground is not a color => use hardcoded ones");
            return C0452b.m2068c(context, mo17534b().equals("Theme.Base") ? C5455d.background_material_dark : C5455d.background_material_light);
        }
    }

    /* renamed from: e */
    public int mo17548e(Context context) {
        C5333a c = mo17536c("appBarStyle");
        Integer d = c != null ? c.mo17538d("accentColor") : null;
        if (d == null) {
            d = Integer.valueOf(mo17546c(context));
        }
        if (d.intValue() == mo17544a(context)) {
            d = Integer.valueOf(C6594an.m31917a(context, C5453b.colorControlNormal));
        }
        return d.intValue();
    }

    /* renamed from: f */
    public int mo17549f(Context context) {
        C5333a c = mo17536c("appBarStyle");
        Integer d = c != null ? c.mo17538d("itemColor") : null;
        if (d == null || d.intValue() == mo17544a(context)) {
            d = Integer.valueOf(C6594an.m31917a(context, C5453b.colorControlNormal));
        }
        return d.intValue();
    }

    /* renamed from: g */
    public int mo17550g(Context context) {
        C5333a c = mo17536c("appBarStyle");
        Integer d = c != null ? c.mo17538d("titleTextColor") : null;
        if (d == null) {
            d = Integer.valueOf(mo17549f(context));
        }
        return d.intValue() == mo17544a(context) ? C6594an.m31917a(context, 16842806) : d.intValue();
    }

    /* renamed from: h */
    public int mo17551h(Context context) {
        C5333a c = mo17536c("tabBarStyle");
        Integer d = c != null ? c.mo17538d("accentColor") : null;
        if (d == null) {
            d = Integer.valueOf(mo17546c(context));
        }
        if (d.intValue() == mo17544a(context)) {
            d = Integer.valueOf(C6594an.m31917a(context, C5453b.colorControlNormal));
        }
        return d.intValue();
    }

    /* renamed from: i */
    public int mo17552i(Context context) {
        C5333a c = mo17536c("tabBarStyle");
        Integer d = c != null ? c.mo17538d("itemColor") : null;
        return (d == null || d.intValue() == mo17544a(context)) ? C6594an.m31917a(context, 16842806) : d.intValue();
    }

    /* renamed from: j */
    public int mo17553j(Context context) {
        C5333a aVar = (C5333a) mo17537c().get("Side.Menu");
        Integer d = aVar != null ? aVar.mo17538d("containerColor") : null;
        if (d == null) {
            return mo17544a(context);
        }
        if (d == null || d.intValue() == mo17554k(context)) {
            d = Integer.valueOf(C6594an.m31917a(context, C5453b.colorBackgroundFloating));
        }
        return d.intValue();
    }

    /* renamed from: k */
    public int mo17554k(Context context) {
        C5333a aVar = (C5333a) mo17537c().get("Side.Menu");
        Integer d = aVar != null ? aVar.mo17538d("itemColor") : null;
        if (d == null || d.intValue() == mo17544a(context)) {
            d = Integer.valueOf(C6594an.m31917a(context, C5453b.colorControlNormal));
        }
        return d.intValue();
    }

    /* renamed from: l */
    public int mo17555l(Context context) {
        C5333a aVar = (C5333a) mo17537c().get("Side.Menu");
        Integer d = aVar != null ? aVar.mo17538d("accentColor") : null;
        if (d == null) {
            d = Integer.valueOf(mo17546c(context));
        }
        if (d.intValue() == mo17544a(context)) {
            d = Integer.valueOf(C6594an.m31917a(context, C5453b.colorAccent));
        }
        return d.intValue();
    }
}
