package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.er */
final class C3528er implements zzv<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3525eo f13854a;

    C3528er(C3525eo eoVar) {
        this.f13854a = eoVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f13854a.f13845b) {
            if (!this.f13854a.f13848e.isDone()) {
                C3531eu euVar = new C3531eu(-2, map);
                if (this.f13854a.f13846c.equals(euVar.mo12892h())) {
                    this.f13854a.f13848e.mo13296b(euVar);
                }
            }
        }
    }
}
