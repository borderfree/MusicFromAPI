package com.google.android.gms.ads.internal;

import android.webkit.CookieManager;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.ai */
final class C2860ai implements Callable<String> {

    /* renamed from: a */
    private final /* synthetic */ zzd f9944a;

    C2860ai(zzd zzd) {
        this.f9944a = zzd;
    }

    public final /* synthetic */ Object call() {
        String str = "";
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12743cC)).booleanValue()) {
            return str;
        }
        CookieManager c = zzbv.zzem().mo13160c(this.f9944a.f10120e.zzrt);
        return c != null ? c.getCookie("googleads.g.doubleclick.net") : str;
    }
}
