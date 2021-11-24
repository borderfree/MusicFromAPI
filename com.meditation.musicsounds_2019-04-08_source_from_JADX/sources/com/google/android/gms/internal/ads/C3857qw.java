package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.zzbv;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.qw */
public class C3857qw extends C3833pz {
    public C3857qw(C3832py pyVar, boolean z) {
        super(pyVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final WebResourceResponse mo13599a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof C3832py)) {
            C3643iy.m19178e("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        C3832py pyVar = (C3832py) webView;
        if (this.f14685a != null) {
            this.f14685a.mo12980a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.mo13534a(str, map);
        }
        if (pyVar.mo13527t() != null) {
            pyVar.mo13527t().mo13564n();
        }
        aqc<String> aqc = pyVar.mo13519r().mo13607d() ? aqm.f12618K : pyVar.mo13531x() ? aqm.f12617J : aqm.f12616I;
        String str2 = (String) ane.m16650f().mo12297a(aqc);
        zzbv.zzek();
        return C3653jh.m18894c(pyVar.getContext(), pyVar.mo13417i().f15360a, str2);
    }
}
