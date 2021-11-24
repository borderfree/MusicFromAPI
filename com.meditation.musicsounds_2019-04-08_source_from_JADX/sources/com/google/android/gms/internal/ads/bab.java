package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@C3464ci
public final class bab {

    /* renamed from: a */
    public final String f13402a;

    /* renamed from: b */
    public final String f13403b;

    /* renamed from: c */
    public final List<String> f13404c;

    /* renamed from: d */
    public final String f13405d;

    /* renamed from: e */
    public final String f13406e;

    /* renamed from: f */
    public final List<String> f13407f;

    /* renamed from: g */
    public final List<String> f13408g;

    /* renamed from: h */
    public final List<String> f13409h;

    /* renamed from: i */
    public final List<String> f13410i;

    /* renamed from: j */
    public final List<String> f13411j;

    /* renamed from: k */
    public final String f13412k;

    /* renamed from: l */
    public final List<String> f13413l;

    /* renamed from: m */
    public final List<String> f13414m;

    /* renamed from: n */
    public final List<String> f13415n;

    /* renamed from: o */
    public final String f13416o;

    /* renamed from: p */
    public final String f13417p;

    /* renamed from: q */
    public final String f13418q;

    /* renamed from: r */
    public final List<String> f13419r;

    /* renamed from: s */
    public final String f13420s;

    /* renamed from: t */
    public final long f13421t;

    /* renamed from: u */
    private final String f13422u;

    public bab(String str, String str2, List<String> list, String str3, String str4, List<String> list2, List<String> list3, List<String> list4, List<String> list5, String str5, String str6, List<String> list6, List<String> list7, List<String> list8, String str7, String str8, String str9, List<String> list9, String str10, List<String> list10, String str11, long j) {
        this.f13402a = str;
        this.f13403b = null;
        this.f13404c = list;
        this.f13405d = null;
        this.f13406e = null;
        this.f13407f = list2;
        this.f13408g = list3;
        this.f13409h = list4;
        this.f13410i = list5;
        this.f13412k = str5;
        this.f13413l = list6;
        this.f13414m = list7;
        this.f13415n = list8;
        this.f13416o = null;
        this.f13417p = null;
        this.f13418q = null;
        this.f13419r = null;
        this.f13420s = null;
        this.f13411j = list10;
        this.f13422u = null;
        this.f13421t = -1;
    }

    public bab(JSONObject jSONObject) {
        List<String> list;
        this.f13403b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.f13404c = Collections.unmodifiableList(arrayList);
        this.f13405d = jSONObject.optString("allocation_id", null);
        zzbv.zzfd();
        this.f13407f = bal.m17779a(jSONObject, "clickurl");
        zzbv.zzfd();
        this.f13408g = bal.m17779a(jSONObject, "imp_urls");
        zzbv.zzfd();
        this.f13409h = bal.m17779a(jSONObject, "downloaded_imp_urls");
        zzbv.zzfd();
        this.f13411j = bal.m17779a(jSONObject, "fill_urls");
        zzbv.zzfd();
        this.f13413l = bal.m17779a(jSONObject, "video_start_urls");
        zzbv.zzfd();
        this.f13415n = bal.m17779a(jSONObject, "video_complete_urls");
        zzbv.zzfd();
        List<String> a = bal.m17779a(jSONObject, "video_reward_urls");
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12684ax)).booleanValue()) {
            a = this.f13415n;
        }
        this.f13414m = a;
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzbv.zzfd();
            list = bal.m17779a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f13410i = list;
        this.f13402a = optJSONObject != null ? optJSONObject.toString() : null;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        this.f13412k = optJSONObject2 != null ? optJSONObject2.toString() : null;
        this.f13406e = optJSONObject2 != null ? optJSONObject2.optString("class_name") : null;
        this.f13416o = jSONObject.optString("html_template", null);
        this.f13417p = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        this.f13418q = optJSONObject3 != null ? optJSONObject3.toString() : null;
        zzbv.zzfd();
        this.f13419r = bal.m17779a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.f13420s = optJSONObject4 != null ? optJSONObject4.toString() : null;
        this.f13422u = jSONObject.optString("response_type", null);
        this.f13421t = jSONObject.optLong("ad_network_timeout_millis", -1);
    }

    /* renamed from: a */
    public final boolean mo12656a() {
        return "banner".equalsIgnoreCase(this.f13422u);
    }

    /* renamed from: b */
    public final boolean mo12657b() {
        return "native".equalsIgnoreCase(this.f13422u);
    }
}
