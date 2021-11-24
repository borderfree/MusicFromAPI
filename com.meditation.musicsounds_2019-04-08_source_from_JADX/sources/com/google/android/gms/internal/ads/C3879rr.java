package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.rr */
public final class C3879rr {
    /* renamed from: a */
    public static C3832py m19737a(Context context, C3873rl rlVar, String str, boolean z, boolean z2, afm afm, zzang zzang, aqz aqz, zzbo zzbo, zzw zzw, akv akv) {
        try {
            C3880rs rsVar = new C3880rs(context, rlVar, str, z, z2, afm, zzang, aqz, zzbo, zzw, akv);
            return (C3832py) C3710lk.m19089a(rsVar);
        } catch (Throwable th) {
            zzbv.zzeo().mo13047a(th, "AdWebViewFactory.newAdWebView2");
            throw new zzarg("Webview initialization failed.", th);
        }
    }
}
