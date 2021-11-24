package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pk */
final class C3818pk implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f14651a;

    /* renamed from: b */
    private final /* synthetic */ String f14652b;

    /* renamed from: c */
    private final /* synthetic */ int f14653c;

    /* renamed from: d */
    private final /* synthetic */ int f14654d;

    /* renamed from: e */
    private final /* synthetic */ boolean f14655e = false;

    /* renamed from: f */
    private final /* synthetic */ C3817pj f14656f;

    C3818pk(C3817pj pjVar, String str, String str2, int i, int i2, boolean z) {
        this.f14656f = pjVar;
        this.f14651a = str;
        this.f14652b = str2;
        this.f14653c = i;
        this.f14654d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14651a);
        hashMap.put("cachedSrc", this.f14652b);
        hashMap.put("bytesLoaded", Integer.toString(this.f14653c));
        hashMap.put("totalBytes", Integer.toString(this.f14654d));
        hashMap.put("cacheReady", this.f14655e ? "1" : "0");
        this.f14656f.m19390a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
