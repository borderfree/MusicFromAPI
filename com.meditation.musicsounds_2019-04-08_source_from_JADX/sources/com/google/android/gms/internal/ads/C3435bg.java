package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bg */
final /* synthetic */ class C3435bg implements Runnable {

    /* renamed from: a */
    private final C3434bf f13610a;

    /* renamed from: b */
    private final JSONObject f13611b;

    /* renamed from: c */
    private final C3763nj f13612c;

    C3435bg(C3434bf bfVar, JSONObject jSONObject, C3763nj njVar) {
        this.f13610a = bfVar;
        this.f13611b = jSONObject;
        this.f13612c = njVar;
    }

    public final void run() {
        this.f13610a.mo12811a(this.f13611b, this.f13612c);
    }
}
