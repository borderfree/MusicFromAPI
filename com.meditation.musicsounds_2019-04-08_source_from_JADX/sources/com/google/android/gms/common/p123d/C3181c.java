package com.google.android.gms.common.p123d;

import android.content.Context;

/* renamed from: com.google.android.gms.common.d.c */
public class C3181c {

    /* renamed from: b */
    private static C3181c f10963b = new C3181c();

    /* renamed from: a */
    private C3180b f10964a = null;

    /* renamed from: a */
    public static C3180b m14658a(Context context) {
        return f10963b.m14659b(context);
    }

    /* renamed from: b */
    private final synchronized C3180b m14659b(Context context) {
        if (this.f10964a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f10964a = new C3180b(context);
        }
        return this.f10964a;
    }
}
