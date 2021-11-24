package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3832py;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.h */
final class C2891h implements zzv<C3832py> {
    C2891h() {
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        zzd p = pyVar.mo13517p();
        if (p != null) {
            p.close();
            return;
        }
        zzd q = pyVar.mo13518q();
        if (q != null) {
            q.close();
        } else {
            C3643iy.m19178e("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
