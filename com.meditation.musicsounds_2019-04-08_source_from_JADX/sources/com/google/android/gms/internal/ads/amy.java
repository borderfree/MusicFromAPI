package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;

final class amy extends C3412a<aon> {

    /* renamed from: a */
    private final /* synthetic */ Context f12474a;

    /* renamed from: b */
    private final /* synthetic */ amt f12475b;

    amy(amt amt, Context context) {
        this.f12475b = amt;
        this.f12474a = context;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        aon b = this.f12475b.f12450e.mo12243b(this.f12474a);
        if (b != null) {
            return b;
        }
        amt.m16609a(this.f12474a, "mobile_ads_settings");
        return new C3417app();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.getMobileAdsSettingsManagerWithClientJarVersion(C3327d.m15136a(this.f12474a), C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
