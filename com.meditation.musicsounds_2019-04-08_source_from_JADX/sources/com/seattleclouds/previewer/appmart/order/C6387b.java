package com.seattleclouds.previewer.appmart.order;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p007d.p008a.C0079i;
import android.support.p009v4.content.C0452b;

/* renamed from: com.seattleclouds.previewer.appmart.order.b */
public class C6387b {
    /* renamed from: a */
    public static Drawable m31011a(Context context, int i) {
        return VERSION.SDK_INT < 23 ? C0079i.m215a(context.getResources(), i, context.getTheme()) : context.getResources().getDrawable(i, context.getTheme());
    }

    /* renamed from: a */
    public static String m31012a(int i) {
        return String.format("#%08X", new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: b */
    public static int m31013b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? C0452b.m2068c(context, i) : context.getResources().getColor(i);
    }
}
