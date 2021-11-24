package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;

final class anb extends C3412a<C3559fv> {

    /* renamed from: a */
    private final /* synthetic */ Context f12484a;

    /* renamed from: b */
    private final /* synthetic */ bas f12485b;

    /* renamed from: c */
    private final /* synthetic */ amt f12486c;

    anb(amt amt, Context context, bas bas) {
        this.f12486c = amt;
        this.f12484a = context;
        this.f12485b = bas;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        C3559fv a = this.f12486c.f12452g.mo12930a(this.f12484a, this.f12485b);
        if (a != null) {
            return a;
        }
        amt.m16609a(this.f12484a, "rewarded_video");
        return new aps();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.createRewardedVideoAd(C3327d.m15136a(this.f12484a), this.f12485b, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
