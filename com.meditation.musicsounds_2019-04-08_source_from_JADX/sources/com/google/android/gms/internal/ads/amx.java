package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;

final class amx extends C3412a<anq> {

    /* renamed from: a */
    private final /* synthetic */ Context f12470a;

    /* renamed from: b */
    private final /* synthetic */ String f12471b;

    /* renamed from: c */
    private final /* synthetic */ bas f12472c;

    /* renamed from: d */
    private final /* synthetic */ amt f12473d;

    amx(amt amt, Context context, String str, bas bas) {
        this.f12473d = amt;
        this.f12470a = context;
        this.f12471b = str;
        this.f12472c = bas;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        anq a = this.f12473d.f12449d.mo12098a(this.f12470a, this.f12471b, this.f12472c);
        if (a != null) {
            return a;
        }
        amt.m16609a(this.f12470a, "native_ad");
        return new apj();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.createAdLoaderBuilder(C3327d.m15136a(this.f12470a), this.f12471b, this.f12472c, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
