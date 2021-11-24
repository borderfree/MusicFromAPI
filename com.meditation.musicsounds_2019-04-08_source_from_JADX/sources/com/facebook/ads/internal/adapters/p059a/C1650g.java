package com.facebook.ads.internal.adapters.p059a;

import android.content.Context;
import com.facebook.ads.internal.adapters.p059a.C1652i.C1654a;
import com.facebook.ads.internal.p077s.p081d.C1831a;
import com.facebook.ads.internal.p077s.p081d.C1832b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.a.g */
public class C1650g implements Serializable {
    private static final long serialVersionUID = 8751287062553772011L;

    /* renamed from: a */
    private final C1652i f5378a;

    /* renamed from: b */
    private final C1640a f5379b;

    /* renamed from: c */
    private final List<C1651h> f5380c;

    /* renamed from: d */
    private final int f5381d;

    /* renamed from: e */
    private final int f5382e;

    /* renamed from: f */
    private int f5383f = 200;

    /* renamed from: g */
    private final String f5384g;

    /* renamed from: h */
    private final String f5385h;

    private C1650g(C1652i iVar, C1640a aVar, List<C1651h> list, String str, String str2, int i, int i2) {
        this.f5378a = iVar;
        this.f5379b = aVar;
        this.f5380c = list;
        this.f5384g = str;
        this.f5385h = str2;
        this.f5381d = i;
        this.f5382e = i2;
    }

    /* renamed from: a */
    public static C1650g m8269a(JSONObject jSONObject, Context context) {
        C1652i a = new C1654a().mo6736a(jSONObject.optString("title")).mo6738b(jSONObject.optJSONObject("icon") != null ? jSONObject.optJSONObject("icon").optString("url") : "").mo6739c(jSONObject.optString("ad_choices_link_url")).mo6740d(m8270a(jSONObject)).mo6737a();
        JSONObject optJSONObject = jSONObject.optJSONObject("layout");
        JSONObject jSONObject2 = null;
        C1647d a2 = C1647d.m8253a(optJSONObject != null ? optJSONObject.optJSONObject("portrait") : null);
        if (optJSONObject != null) {
            jSONObject2 = optJSONObject.optJSONObject("landscape");
        }
        C1640a aVar = new C1640a(a2, C1647d.m8253a(jSONObject2));
        int optInt = jSONObject.optInt("viewability_check_initial_delay", 0);
        int optInt2 = jSONObject.optInt("viewability_check_interval", 1000);
        String optString = jSONObject.optString("ct");
        String optString2 = jSONObject.optString("request_id", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("carousel");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            arrayList.add(C1651h.m8280a(jSONObject));
        } else {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(C1651h.m8280a(optJSONArray.getJSONObject(i)));
                } catch (JSONException e) {
                    C1831a.m8998a(context, "parsing", C1832b.f6011y, (Exception) e);
                    e.printStackTrace();
                }
            }
        }
        C1650g gVar = new C1650g(a, aVar, arrayList, optString, optString2, optInt, optInt2);
        return gVar;
    }

    /* renamed from: a */
    private static String m8270a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("generic_text");
        return optJSONObject == null ? "Sponsored" : optJSONObject.optString("sponsored", "Sponsored");
    }

    /* renamed from: a */
    public C1652i mo6720a() {
        return this.f5378a;
    }

    /* renamed from: a */
    public void mo6721a(int i) {
        this.f5383f = i;
    }

    /* renamed from: b */
    public C1640a mo6722b() {
        return this.f5379b;
    }

    /* renamed from: c */
    public String mo6723c() {
        return this.f5384g;
    }

    /* renamed from: d */
    public List<C1651h> mo6724d() {
        return Collections.unmodifiableList(this.f5380c);
    }

    /* renamed from: e */
    public String mo6725e() {
        return this.f5385h;
    }

    /* renamed from: f */
    public int mo6726f() {
        return this.f5381d;
    }

    /* renamed from: g */
    public int mo6727g() {
        return this.f5382e;
    }

    /* renamed from: h */
    public int mo6728h() {
        return this.f5383f;
    }
}
