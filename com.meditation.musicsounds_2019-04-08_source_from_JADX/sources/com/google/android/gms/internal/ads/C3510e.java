package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.Map;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.e */
public final class C3510e {

    /* renamed from: a */
    private final C3832py f13803a;

    /* renamed from: b */
    private final boolean f13804b;

    /* renamed from: c */
    private final String f13805c;

    public C3510e(C3832py pyVar, Map<String, String> map) {
        this.f13803a = pyVar;
        this.f13805c = (String) map.get("forceOrientation");
        this.f13804b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
    }

    /* renamed from: a */
    public final void mo12873a() {
        if (this.f13803a == null) {
            C3643iy.m19178e("AdWebView is null");
            return;
        }
        int i = "portrait".equalsIgnoreCase(this.f13805c) ? zzbv.zzem().mo13156b() : "landscape".equalsIgnoreCase(this.f13805c) ? zzbv.zzem().mo13143a() : this.f13804b ? -1 : zzbv.zzem().mo13159c();
        this.f13803a.setRequestedOrientation(i);
    }
}
