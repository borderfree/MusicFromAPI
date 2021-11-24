package android.support.p023v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.p023v7.p024a.C0726a.C0727a;
import android.support.p023v7.p024a.C0726a.C0728b;
import android.support.p023v7.p024a.C0726a.C0730d;
import android.support.p023v7.p024a.C0726a.C0736j;
import android.view.ViewConfiguration;

/* renamed from: android.support.v7.view.a */
public class C0826a {

    /* renamed from: a */
    private Context f2433a;

    private C0826a(Context context) {
        this.f2433a = context;
    }

    /* renamed from: a */
    public static C0826a m3900a(Context context) {
        return new C0826a(context);
    }

    /* renamed from: a */
    public int mo3278a() {
        Configuration configuration = this.f2433a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: b */
    public boolean mo3279b() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f2433a).hasPermanentMenuKey();
    }

    /* renamed from: c */
    public int mo3280c() {
        return this.f2433a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public boolean mo3281d() {
        return this.f2433a.getResources().getBoolean(C0728b.abc_action_bar_embed_tabs);
    }

    /* renamed from: e */
    public int mo3282e() {
        TypedArray obtainStyledAttributes = this.f2433a.obtainStyledAttributes(null, C0736j.ActionBar, C0727a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0736j.ActionBar_height, 0);
        Resources resources = this.f2433a.getResources();
        if (!mo3281d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0730d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo3283f() {
        return this.f2433a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: g */
    public int mo3284g() {
        return this.f2433a.getResources().getDimensionPixelSize(C0730d.abc_action_bar_stacked_tab_max_width);
    }
}
