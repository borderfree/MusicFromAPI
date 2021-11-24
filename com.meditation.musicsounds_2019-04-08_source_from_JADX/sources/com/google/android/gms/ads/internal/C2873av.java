package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3871rj;

/* renamed from: com.google.android.gms.ads.internal.av */
final /* synthetic */ class C2873av implements C3871rj {

    /* renamed from: a */
    private final C3622id f9967a;

    /* renamed from: b */
    private final Runnable f9968b;

    C2873av(C3622id idVar, Runnable runnable) {
        this.f9967a = idVar;
        this.f9968b = runnable;
    }

    /* renamed from: a */
    public final void mo10010a() {
        C3622id idVar = this.f9967a;
        Runnable runnable = this.f9968b;
        if (!idVar.f14146m) {
            zzbv.zzek();
            C3653jh.m18878a(runnable);
        }
    }
}
