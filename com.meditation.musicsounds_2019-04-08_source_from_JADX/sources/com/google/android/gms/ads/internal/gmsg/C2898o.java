package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3832py;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.o */
final class C2898o implements zzv<C3832py> {
    C2898o() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        if (map.keySet().contains("start")) {
            pyVar.mo13497e(true);
        }
        if (map.keySet().contains("stop")) {
            pyVar.mo13497e(false);
        }
    }
}
