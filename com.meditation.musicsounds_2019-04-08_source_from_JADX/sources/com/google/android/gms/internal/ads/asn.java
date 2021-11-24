package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class asn implements zzv<Object> {

    /* renamed from: a */
    private final /* synthetic */ C3442bn f13090a;

    /* renamed from: b */
    private final /* synthetic */ asi f13091b;

    asn(asi asi, C3442bn bnVar) {
        this.f13091b = asi;
        this.f13090a = bnVar;
    }

    public final void zza(Object obj, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : map.keySet()) {
                jSONObject.put(str, map.get(str));
            }
            jSONObject.put("id", this.f13091b.f13080b);
            this.f13090a.mo12818a("sendMessageToNativeJs", jSONObject);
        } catch (JSONException e) {
            C3643iy.m19173b("Unable to dispatch sendMessageToNativeJs event", e);
        }
    }
}
