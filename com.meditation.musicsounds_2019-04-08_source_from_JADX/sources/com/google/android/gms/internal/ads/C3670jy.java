package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.zzbv;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.jy */
public final class C3670jy extends C3668jw {
    /* renamed from: a */
    public final WebResourceResponse mo13145a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        WebResourceResponse webResourceResponse = new WebResourceResponse(str, str2, i, str3, map, inputStream);
        return webResourceResponse;
    }

    /* renamed from: a */
    public final C3833pz mo13146a(C3832py pyVar, boolean z) {
        return new C3858qx(pyVar, z);
    }

    /* renamed from: c */
    public final CookieManager mo13160c(Context context) {
        if (m18934e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            C3643iy.m19173b("Failed to obtain CookieManager.", th);
            zzbv.zzeo().mo13047a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: f */
    public final int mo13163f() {
        return 16974374;
    }
}
