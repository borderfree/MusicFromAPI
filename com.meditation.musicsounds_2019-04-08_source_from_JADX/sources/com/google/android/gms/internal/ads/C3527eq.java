package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eq */
final class C3527eq implements zzv<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3525eo f13853a;

    C3527eq(C3525eo eoVar) {
        this.f13853a = eoVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f13853a.f13845b) {
            if (!this.f13853a.f13848e.isDone()) {
                C3531eu euVar = new C3531eu(-2, map);
                if (this.f13853a.f13846c.equals(euVar.mo12892h())) {
                    String e = euVar.mo12889e();
                    if (e == null) {
                        C3643iy.m19178e("URL missing in loadAdUrl GMSG.");
                        return;
                    }
                    if (e.contains("%40mediation_adapters%40")) {
                        String replaceAll = e.replaceAll("%40mediation_adapters%40", C3637is.m18767a(this.f13853a.f13844a, (String) map.get("check_adapters"), this.f13853a.f13847d));
                        euVar.mo12885a(replaceAll);
                        String str = "Ad request URL modified to ";
                        String valueOf = String.valueOf(replaceAll);
                        C3643iy.m18780a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                    this.f13853a.f13848e.mo13296b(euVar);
                }
            }
        }
    }
}
