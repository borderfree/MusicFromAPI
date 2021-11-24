package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ep */
final class C3526ep implements zzv<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3525eo f13852a;

    C3526ep(C3525eo eoVar) {
        this.f13852a = eoVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        synchronized (this.f13852a.f13845b) {
            if (!this.f13852a.f13848e.isDone()) {
                if (this.f13852a.f13846c.equals(map.get("request_id"))) {
                    C3531eu euVar = new C3531eu(1, map);
                    String f = euVar.mo12890f();
                    String valueOf = String.valueOf(euVar.mo12886b());
                    StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 24 + String.valueOf(valueOf).length());
                    sb.append("Invalid ");
                    sb.append(f);
                    sb.append(" request error: ");
                    sb.append(valueOf);
                    C3643iy.m19178e(sb.toString());
                    this.f13852a.f13848e.mo13296b(euVar);
                }
            }
        }
    }
}
