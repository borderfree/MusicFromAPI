package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3832py;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.m */
final class C2896m implements zzv<C3832py> {
    C2896m() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            pyVar.zzcl();
            return;
        }
        if ("resume".equals(str)) {
            pyVar.zzcm();
        }
    }
}
