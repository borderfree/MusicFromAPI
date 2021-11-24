package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzw;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.qf */
public final class C3840qf {
    /* renamed from: a */
    public static C3751my<C3832py> m19489a(Context context, zzang zzang, String str, afm afm, zzw zzw) {
        C3750mx a = C3740mn.m19191a(null);
        C3841qg qgVar = new C3841qg(context, afm, zzang, zzw, str);
        return C3740mn.m19193a((C3751my<A>) a, (C3735mi<? super A, ? extends B>) qgVar, C3758ne.f14481a);
    }

    /* renamed from: a */
    public static C3832py m19490a(Context context, C3873rl rlVar, String str, boolean z, boolean z2, afm afm, zzang zzang, aqz aqz, zzbo zzbo, zzw zzw, akv akv) {
        aqm.m16920a(context);
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12686az)).booleanValue()) {
            return C3879rr.m19737a(context, rlVar, str, z2, z, afm, zzang, aqz, zzbo, zzw, akv);
        }
        try {
            C3842qh qhVar = new C3842qh(context, rlVar, str, z, z2, afm, zzang, aqz, zzbo, zzw, akv);
            return (C3832py) C3710lk.m19089a(qhVar);
        } catch (Throwable th) {
            throw new zzarg("Webview initialization failed.", th);
        }
    }
}
