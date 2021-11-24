package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ow */
public final class C3803ow {

    /* renamed from: a */
    private final boolean f14604a;

    /* renamed from: b */
    private final int f14605b;

    /* renamed from: c */
    private final int f14606c;

    /* renamed from: d */
    private final int f14607d;

    /* renamed from: e */
    private final String f14608e;

    /* renamed from: f */
    private final int f14609f;

    /* renamed from: g */
    private final int f14610g;

    /* renamed from: h */
    private final int f14611h;

    /* renamed from: i */
    private final boolean f14612i;

    public C3803ow(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f14604a = m19340a(jSONObject, "aggressive_media_codec_release", aqm.f12609B);
        this.f14605b = m19341b(jSONObject, "byte_buffer_precache_limit", aqm.f12903m);
        this.f14606c = m19341b(jSONObject, "exo_cache_buffer_size", aqm.f12906p);
        this.f14607d = m19341b(jSONObject, "exo_connect_timeout_millis", aqm.f12899i);
        this.f14608e = m19342c(jSONObject, "exo_player_version", aqm.f12898h);
        this.f14609f = m19341b(jSONObject, "exo_read_timeout_millis", aqm.f12900j);
        this.f14610g = m19341b(jSONObject, "load_check_interval_bytes", aqm.f12901k);
        this.f14611h = m19341b(jSONObject, "player_precache_limit", aqm.f12902l);
        this.f14612i = m19340a(jSONObject, "use_cache_data_source", aqm.f12748cH);
    }

    /* renamed from: a */
    private static boolean m19340a(JSONObject jSONObject, String str, aqc<Boolean> aqc) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return ((Boolean) ane.m16650f().mo12297a(aqc)).booleanValue();
    }

    /* renamed from: b */
    private static int m19341b(JSONObject jSONObject, String str, aqc<Integer> aqc) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) ane.m16650f().mo12297a(aqc)).intValue();
    }

    /* renamed from: c */
    private static String m19342c(JSONObject jSONObject, String str, aqc<String> aqc) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) ane.m16650f().mo12297a(aqc);
    }
}
