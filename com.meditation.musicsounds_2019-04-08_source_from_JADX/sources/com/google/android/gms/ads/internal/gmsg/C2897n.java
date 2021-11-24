package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3832py;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.n */
final class C2897n implements zzv<C3832py> {
    C2897n() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        if (map.keySet().contains("start")) {
            pyVar.mo13527t().mo13558h();
        } else if (map.keySet().contains("stop")) {
            pyVar.mo13527t().mo13559i();
        } else {
            if (map.keySet().contains("cancel")) {
                pyVar.mo13527t().mo13560j();
            }
        }
    }
}
