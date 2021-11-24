package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;

final class amu extends C3412a<anv> {

    /* renamed from: a */
    private final /* synthetic */ Context f12456a;

    /* renamed from: b */
    private final /* synthetic */ zzjn f12457b;

    /* renamed from: c */
    private final /* synthetic */ String f12458c;

    /* renamed from: d */
    private final /* synthetic */ bas f12459d;

    /* renamed from: e */
    private final /* synthetic */ amt f12460e;

    amu(amt amt, Context context, zzjn zzjn, String str, bas bas) {
        this.f12460e = amt;
        this.f12456a = context;
        this.f12457b = zzjn;
        this.f12458c = str;
        this.f12459d = bas;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        anv a = this.f12460e.f12448c.mo12099a(this.f12456a, this.f12457b, this.f12458c, this.f12459d, 1);
        if (a != null) {
            return a;
        }
        amt.m16609a(this.f12456a, "banner");
        return new apn();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.createBannerAdManager(C3327d.m15136a(this.f12456a), this.f12457b, this.f12458c, this.f12459d, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
