package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;

final class amw extends C3412a<anv> {

    /* renamed from: a */
    private final /* synthetic */ Context f12465a;

    /* renamed from: b */
    private final /* synthetic */ zzjn f12466b;

    /* renamed from: c */
    private final /* synthetic */ String f12467c;

    /* renamed from: d */
    private final /* synthetic */ bas f12468d;

    /* renamed from: e */
    private final /* synthetic */ amt f12469e;

    amw(amt amt, Context context, zzjn zzjn, String str, bas bas) {
        this.f12469e = amt;
        this.f12465a = context;
        this.f12466b = zzjn;
        this.f12467c = str;
        this.f12468d = bas;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        anv a = this.f12469e.f12448c.mo12099a(this.f12465a, this.f12466b, this.f12467c, this.f12468d, 2);
        if (a != null) {
            return a;
        }
        amt.m16609a(this.f12465a, "interstitial");
        return new apn();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.createInterstitialAdManager(C3327d.m15136a(this.f12465a), this.f12466b, this.f12467c, this.f12468d, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}