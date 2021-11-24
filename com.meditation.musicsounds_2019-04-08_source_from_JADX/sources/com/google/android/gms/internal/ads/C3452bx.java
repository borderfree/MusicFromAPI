package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bx */
final class C3452bx implements zzv<C3832py> {

    /* renamed from: a */
    private final /* synthetic */ C3832py f13648a;

    /* renamed from: b */
    private final /* synthetic */ C3763nj f13649b;

    /* renamed from: c */
    private final /* synthetic */ C3446br f13650c;

    C3452bx(C3446br brVar, C3832py pyVar, C3763nj njVar) {
        this.f13650c = brVar;
        this.f13648a = pyVar;
        this.f13649b = njVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        JSONObject jSONObject;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str2);
                z = false;
            } else {
                jSONObject = new JSONObject(str);
                z = true;
            }
            if (this.f13650c.f13638h.equals(jSONObject.optString("ads_id", ""))) {
                this.f13648a.mo13492b("/nativeAdPreProcess", this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                this.f13649b.mo13296b(jSONObject2);
            }
        } catch (Throwable th) {
            C3643iy.m19173b("Error while preprocessing json.", th);
            this.f13649b.mo13295a(th);
        }
    }
}
