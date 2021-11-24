package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ih */
public final class C3626ih {

    /* renamed from: a */
    private final long f14184a;

    /* renamed from: b */
    private final List<String> f14185b = new ArrayList();

    /* renamed from: c */
    private final List<String> f14186c = new ArrayList();

    /* renamed from: d */
    private final Map<String, bac> f14187d = new HashMap();

    /* renamed from: e */
    private String f14188e;

    /* renamed from: f */
    private String f14189f;

    /* renamed from: g */
    private boolean f14190g;

    public C3626ih(String str, long j) {
        this.f14190g = false;
        this.f14189f = str;
        this.f14184a = j;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f14190g = false;
                    C3643iy.m19178e("App settings could not be fetched successfully.");
                    return;
                }
                this.f14190g = true;
                this.f14188e = jSONObject.optString("app_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString)) {
                            if (!TextUtils.isEmpty(optString2)) {
                                if ("interstitial".equalsIgnoreCase(optString)) {
                                    this.f14186c.add(optString2);
                                } else if ("rewarded".equalsIgnoreCase(optString)) {
                                    JSONObject optJSONObject = jSONObject2.optJSONObject("mediation_config");
                                    if (optJSONObject != null) {
                                        this.f14187d.put(optString2, new bac(optJSONObject));
                                    }
                                }
                            }
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        this.f14185b.add(optJSONArray2.optString(i2));
                    }
                }
            } catch (JSONException e) {
                C3643iy.m19175c("Exception occurred while processing app setting json", e);
                zzbv.zzeo().mo13047a((Throwable) e, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long mo13037a() {
        return this.f14184a;
    }

    /* renamed from: b */
    public final boolean mo13038b() {
        return this.f14190g;
    }

    /* renamed from: c */
    public final String mo13039c() {
        return this.f14189f;
    }

    /* renamed from: d */
    public final String mo13040d() {
        return this.f14188e;
    }

    /* renamed from: e */
    public final Map<String, bac> mo13041e() {
        return this.f14187d;
    }
}
