package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.C3327d;

final class amz extends C3412a<atc> {

    /* renamed from: a */
    private final /* synthetic */ FrameLayout f12476a;

    /* renamed from: b */
    private final /* synthetic */ FrameLayout f12477b;

    /* renamed from: c */
    private final /* synthetic */ Context f12478c;

    /* renamed from: d */
    private final /* synthetic */ amt f12479d;

    amz(amt amt, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f12479d = amt;
        this.f12476a = frameLayout;
        this.f12477b = frameLayout2;
        this.f12478c = context;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        atc a = this.f12479d.f12451f.mo12519a(this.f12478c, this.f12476a, this.f12477b);
        if (a != null) {
            return a;
        }
        amt.m16609a(this.f12478c, "native_ad_view_delegate");
        return new apq();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.createNativeAdViewDelegate(C3327d.m15136a(this.f12476a), C3327d.m15136a(this.f12477b));
    }
}
