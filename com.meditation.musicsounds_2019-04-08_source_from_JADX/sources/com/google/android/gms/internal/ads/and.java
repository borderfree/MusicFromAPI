package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.dynamic.C3327d;

final class and extends C3412a<C3834q> {

    /* renamed from: a */
    private final /* synthetic */ Activity f12490a;

    /* renamed from: b */
    private final /* synthetic */ amt f12491b;

    and(amt amt, Activity activity) {
        this.f12491b = amt;
        this.f12490a = activity;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        C3834q a = this.f12491b.f12453h.mo13430a(this.f12490a);
        if (a != null) {
            return a;
        }
        amt.m16609a(this.f12490a, "ad_overlay");
        return null;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.createAdOverlay(C3327d.m15136a(this.f12490a));
    }
}
