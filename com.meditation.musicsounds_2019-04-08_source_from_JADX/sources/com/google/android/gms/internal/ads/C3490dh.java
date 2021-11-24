package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.dh */
public final class C3490dh extends C3497do {

    /* renamed from: a */
    private final WeakReference<C3479cx> f13776a;

    public C3490dh(C3479cx cxVar) {
        this.f13776a = new WeakReference<>(cxVar);
    }

    /* renamed from: a */
    public final void mo12854a(zzaej zzaej) {
        C3479cx cxVar = (C3479cx) this.f13776a.get();
        if (cxVar != null) {
            cxVar.mo12843a(zzaej);
        }
    }
}
