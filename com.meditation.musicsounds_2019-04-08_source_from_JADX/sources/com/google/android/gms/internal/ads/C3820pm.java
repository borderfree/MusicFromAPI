package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pm */
final class C3820pm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f14661a;

    /* renamed from: b */
    private final /* synthetic */ String f14662b;

    /* renamed from: c */
    private final /* synthetic */ String f14663c;

    /* renamed from: d */
    private final /* synthetic */ String f14664d;

    /* renamed from: e */
    private final /* synthetic */ C3817pj f14665e;

    C3820pm(C3817pj pjVar, String str, String str2, String str3, String str4) {
        this.f14665e = pjVar;
        this.f14661a = str;
        this.f14662b = str2;
        this.f14663c = str3;
        this.f14664d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.f14661a);
        if (!TextUtils.isEmpty(this.f14662b)) {
            hashMap.put("cachedSrc", this.f14662b);
        }
        hashMap.put("type", C3817pj.m19391b(this.f14663c));
        hashMap.put("reason", this.f14663c);
        if (!TextUtils.isEmpty(this.f14664d)) {
            hashMap.put("message", this.f14664d);
        }
        this.f14665e.m19390a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
