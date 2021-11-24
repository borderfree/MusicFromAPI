package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3643iy;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.gmsg.q */
final class C2900q implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ JSONObject f10000a;

    /* renamed from: b */
    private final /* synthetic */ C2899p f10001b;

    C2900q(C2899p pVar, JSONObject jSONObject) {
        this.f10001b = pVar;
        this.f10000a = jSONObject;
    }

    public final void run() {
        this.f10001b.f9997a.mo12589a("fetchHttpRequestCompleted", this.f10000a);
        C3643iy.m19172b("Dispatched http response.");
    }
}
