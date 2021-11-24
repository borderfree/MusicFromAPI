package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.pl */
final class C3819pl implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f14657a;

    /* renamed from: b */
    private final /* synthetic */ String f14658b;

    /* renamed from: c */
    private final /* synthetic */ int f14659c;

    /* renamed from: d */
    private final /* synthetic */ C3817pj f14660d;

    C3819pl(C3817pj pjVar, String str, String str2, int i) {
        this.f14660d = pjVar;
        this.f14657a = str;
        this.f14658b = str2;
        this.f14659c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f14657a);
        hashMap.put("cachedSrc", this.f14658b);
        hashMap.put("totalBytes", Integer.toString(this.f14659c));
        this.f14660d.m19390a("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
