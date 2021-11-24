package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.i */
public final class C3618i {

    /* renamed from: a */
    private final boolean f14108a;

    /* renamed from: b */
    private final boolean f14109b;

    /* renamed from: c */
    private final boolean f14110c;

    /* renamed from: d */
    private final boolean f14111d;

    /* renamed from: e */
    private final boolean f14112e;

    private C3618i(C3672k kVar) {
        this.f14108a = kVar.f14295a;
        this.f14109b = kVar.f14296b;
        this.f14110c = kVar.f14297c;
        this.f14111d = kVar.f14298d;
        this.f14112e = kVar.f14299e;
    }

    /* renamed from: a */
    public final JSONObject mo13019a() {
        try {
            return new JSONObject().put("sms", this.f14108a).put("tel", this.f14109b).put("calendar", this.f14110c).put("storePicture", this.f14111d).put("inlineVideo", this.f14112e);
        } catch (JSONException e) {
            C3643iy.m19173b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
