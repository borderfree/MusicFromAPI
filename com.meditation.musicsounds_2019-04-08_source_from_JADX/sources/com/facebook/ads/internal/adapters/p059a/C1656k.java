package com.facebook.ads.internal.adapters.p059a;

import android.text.TextUtils;
import com.facebook.ads.internal.adapters.p059a.C1644c.C1646a;
import com.facebook.ads.internal.adapters.p059a.C1652i.C1654a;
import com.facebook.ads.internal.p070l.C1717c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.a.k */
public class C1656k implements Serializable {
    private static final long serialVersionUID = -5352540727250859603L;

    /* renamed from: a */
    private final C1652i f5404a;

    /* renamed from: b */
    private final C1644c f5405b;

    /* renamed from: c */
    private final C1648e f5406c;

    /* renamed from: d */
    private final C1640a f5407d;

    /* renamed from: e */
    private final C1641b f5408e;

    /* renamed from: f */
    private final C1649f f5409f;

    /* renamed from: g */
    private final String f5410g;

    /* renamed from: h */
    private int f5411h = 200;

    private C1656k(C1652i iVar, C1644c cVar, C1648e eVar, C1640a aVar, C1641b bVar, C1649f fVar, String str) {
        this.f5404a = iVar;
        this.f5405b = cVar;
        this.f5406c = eVar;
        this.f5407d = aVar;
        this.f5408e = bVar;
        this.f5409f = fVar;
        this.f5410g = str;
    }

    /* renamed from: a */
    public static C1656k m8304a(JSONObject jSONObject) {
        C1652i a = new C1654a().mo6736a(jSONObject.optString("advertiser_name")).mo6738b(jSONObject.optJSONObject("icon") != null ? jSONObject.optJSONObject("icon").optString("url") : "").mo6739c(jSONObject.optString("ad_choices_link_url")).mo6740d(m8306b(jSONObject)).mo6737a();
        C1644c a2 = new C1646a().mo6702a(jSONObject.optString("title")).mo6704b(jSONObject.optString("subtitle")).mo6705c(jSONObject.optString("body")).mo6703a();
        C1648e eVar = new C1648e(jSONObject.optString("fbad_command"), jSONObject.optString("call_to_action"));
        JSONObject optJSONObject = jSONObject.optJSONObject("layout");
        C1655j jVar = null;
        C1640a aVar = new C1640a(C1647d.m8253a(optJSONObject != null ? optJSONObject.optJSONObject("portrait") : null), C1647d.m8253a(optJSONObject != null ? optJSONObject.optJSONObject("landscape") : null));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("playable_data");
        if (optJSONObject2 != null) {
            jVar = new C1655j(optJSONObject2.optString("uri"), optJSONObject2.optString("intro_card_icon_url"), jSONObject.optInt("skippable_seconds", 0), m8307c(optJSONObject2), m8308d(optJSONObject2), optJSONObject2.optBoolean("enable_intro_card", true), optJSONObject2.optBoolean("enable_end_card"));
        }
        C1656k kVar = new C1656k(a, a2, eVar, aVar, new C1643a().mo6691a(jSONObject.optString("video_url")).mo6695b(jSONObject.optJSONObject("image") != null ? jSONObject.optJSONObject("image").optString("url") : "").mo6689a(jSONObject.optInt("skippable_seconds")).mo6694b(jSONObject.optInt("video_duration_sec")).mo6690a(jVar).mo6693a(), new C1649f(C1717c.m8604a(jSONObject.optString("end_card_markup")), jSONObject.optString("activation_command"), m8305a(jSONObject.optJSONArray("end_card_images"))), jSONObject.optString("ct"));
        return kVar;
    }

    /* renamed from: a */
    private static List<String> m8305a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                arrayList.add(optString);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static String m8306b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("generic_text");
        return optJSONObject == null ? "Sponsored" : optJSONObject.optString("sponsored", "Sponsored");
    }

    /* renamed from: c */
    private static String m8307c(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("generic_text");
        return optJSONObject == null ? "Rewarded Play" : optJSONObject.optString("rewarded_play_text", "Rewarded Play");
    }

    /* renamed from: d */
    private static String m8308d(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("generic_text");
        return optJSONObject == null ? "Play Store will automatically open in [secs]s" : optJSONObject.optString("delay_click_text", "Play Store will automatically open in [secs]s");
    }

    /* renamed from: a */
    public C1652i mo6748a() {
        return this.f5404a;
    }

    /* renamed from: a */
    public void mo6749a(int i) {
        this.f5411h = i;
    }

    /* renamed from: a */
    public void mo6750a(String str) {
        this.f5409f.mo6716a(str);
    }

    /* renamed from: b */
    public C1644c mo6751b() {
        return this.f5405b;
    }

    /* renamed from: b */
    public void mo6752b(String str) {
        this.f5408e.mo6679a(str);
    }

    /* renamed from: c */
    public C1648e mo6753c() {
        return this.f5406c;
    }

    /* renamed from: d */
    public C1640a mo6754d() {
        return this.f5407d;
    }

    /* renamed from: e */
    public C1641b mo6755e() {
        return this.f5408e;
    }

    /* renamed from: f */
    public C1649f mo6756f() {
        return this.f5409f;
    }

    /* renamed from: g */
    public String mo6757g() {
        return this.f5410g;
    }

    /* renamed from: h */
    public int mo6758h() {
        return this.f5411h;
    }
}
