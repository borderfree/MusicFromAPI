package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3735mi;
import com.google.android.gms.internal.ads.C3740mn;
import com.google.android.gms.internal.ads.C3751my;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.c */
final /* synthetic */ class C2875c implements C3735mi {

    /* renamed from: a */
    static final C3735mi f9970a = new C2875c();

    private C2875c() {
    }

    /* renamed from: a */
    public final C3751my mo10012a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzbv.zzeo().mo13060l().mo13113f(jSONObject.getString("appSettingsJson"));
        }
        return C3740mn.m19191a(null);
    }
}
