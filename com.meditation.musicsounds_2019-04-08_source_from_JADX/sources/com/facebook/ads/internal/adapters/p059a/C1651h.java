package com.facebook.ads.internal.adapters.p059a;

import com.facebook.ads.internal.adapters.p059a.C1644c.C1646a;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.a.h */
public class C1651h implements Serializable {
    private static final long serialVersionUID = 85021702336014823L;

    /* renamed from: a */
    private final C1644c f5386a;

    /* renamed from: b */
    private final C1648e f5387b;

    /* renamed from: c */
    private final C1641b f5388c;

    private C1651h(C1644c cVar, C1648e eVar, C1641b bVar) {
        this.f5386a = cVar;
        this.f5387b = eVar;
        this.f5388c = bVar;
    }

    /* renamed from: a */
    static C1651h m8280a(JSONObject jSONObject) {
        C1644c a = new C1646a().mo6702a(jSONObject.optString("title")).mo6704b(jSONObject.optString("subtitle")).mo6705c(jSONObject.optString("body")).mo6703a();
        C1648e eVar = new C1648e(jSONObject.optString("fbad_command"), jSONObject.optString("call_to_action"));
        boolean optBoolean = jSONObject.optBoolean("video_autoplay_enabled");
        C1643a b = new C1643a().mo6691a(jSONObject.optString("video_url")).mo6692a(optBoolean).mo6696b(jSONObject.optBoolean("video_autoplay_with_sound"));
        int i = 0;
        if (optBoolean) {
            i = jSONObject.optInt("unskippable_seconds", 0);
        }
        C1643a a2 = b.mo6689a(i);
        JSONObject optJSONObject = jSONObject.optJSONObject("image");
        if (optJSONObject != null) {
            a2.mo6695b(optJSONObject.optString("url")).mo6697c(optJSONObject.optInt("width")).mo6698d(optJSONObject.optInt("height"));
        }
        return new C1651h(a, eVar, a2.mo6693a());
    }

    /* renamed from: a */
    public C1644c mo6729a() {
        return this.f5386a;
    }

    /* renamed from: b */
    public C1648e mo6730b() {
        return this.f5387b;
    }

    /* renamed from: c */
    public C1641b mo6731c() {
        return this.f5388c;
    }
}
