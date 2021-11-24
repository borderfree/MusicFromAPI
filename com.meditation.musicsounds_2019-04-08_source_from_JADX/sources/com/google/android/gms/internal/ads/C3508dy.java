package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dy */
final class C3508dy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f13799a;

    /* renamed from: b */
    final /* synthetic */ String f13800b;

    /* renamed from: c */
    private final /* synthetic */ C3506dw f13801c;

    C3508dy(C3506dw dwVar, JSONObject jSONObject, String str) {
        this.f13801c = dwVar;
        this.f13799a = jSONObject;
        this.f13800b = str;
    }

    public final void run() {
        this.f13801c.f13795l = C3506dw.f13787d.mo12631b((afm) null);
        this.f13801c.f13795l.mo13301a(new C3509dz(this), new C3511ea(this));
    }
}
