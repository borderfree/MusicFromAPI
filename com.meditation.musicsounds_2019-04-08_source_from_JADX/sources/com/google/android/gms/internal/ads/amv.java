package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.dynamic.C3327d;

final class amv extends C3412a<anv> {

    /* renamed from: a */
    private final /* synthetic */ Context f12461a;

    /* renamed from: b */
    private final /* synthetic */ zzjn f12462b;

    /* renamed from: c */
    private final /* synthetic */ String f12463c;

    /* renamed from: d */
    private final /* synthetic */ amt f12464d;

    amv(amt amt, Context context, zzjn zzjn, String str) {
        this.f12464d = amt;
        this.f12461a = context;
        this.f12462b = zzjn;
        this.f12463c = str;
        super();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12115a() {
        anv a = this.f12464d.f12448c.mo12099a(this.f12461a, this.f12462b, this.f12463c, null, 3);
        if (a != null) {
            return a;
        }
        amt.m16609a(this.f12461a, "search");
        return new apn();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo12116a(aoh aoh) {
        return aoh.createSearchAdManager(C3327d.m15136a(this.f12461a), this.f12462b, this.f12463c, C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }
}
