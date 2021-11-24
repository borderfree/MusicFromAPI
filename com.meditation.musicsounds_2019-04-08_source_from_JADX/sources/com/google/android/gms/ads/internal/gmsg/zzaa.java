package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3763nj;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
public final class zzaa implements zzv<Object> {

    /* renamed from: a */
    private final HashMap<String, C3763nj<JSONObject>> f10003a = new HashMap<>();

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("request_id");
        String str2 = (String) map.get("fetched_ad");
        C3643iy.m19172b("Received ad from the cache.");
        C3763nj njVar = (C3763nj) this.f10003a.get(str);
        if (njVar == null) {
            C3643iy.m19174c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        try {
            njVar.mo13296b(new JSONObject(str2));
        } catch (JSONException e) {
            C3643iy.m19173b("Failed constructing JSON object from value passed from javascript", e);
            njVar.mo13296b(null);
        } finally {
            this.f10003a.remove(str);
        }
    }

    public final Future<JSONObject> zzas(String str) {
        C3763nj njVar = new C3763nj();
        this.f10003a.put(str, njVar);
        return njVar;
    }

    public final void zzat(String str) {
        C3763nj njVar = (C3763nj) this.f10003a.get(str);
        if (njVar == null) {
            C3643iy.m19174c("Could not find the ad request for the corresponding ad response.");
            return;
        }
        if (!njVar.isDone()) {
            njVar.cancel(true);
        }
        this.f10003a.remove(str);
    }
}
