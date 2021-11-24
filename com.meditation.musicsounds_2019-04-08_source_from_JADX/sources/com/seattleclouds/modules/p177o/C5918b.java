package com.seattleclouds.modules.p177o;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.b */
public class C5918b {

    /* renamed from: a */
    private C5920d f20919a = new C5920d();

    /* renamed from: b */
    private C5953m f20920b = new C5953m();

    /* renamed from: c */
    private ArrayList<C5921e> f20921c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<C5917a> f20922d = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<C5931g> f20923e = new ArrayList<>();

    /* renamed from: a */
    public static C5918b m29037a(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C5918b bVar = new C5918b();
        try {
            bVar.f20919a = C5920d.m29056a(jSONObject.getJSONObject("general"));
        } catch (JSONException unused) {
        }
        try {
            bVar.f20920b = C5953m.m29178a(jSONObject.getJSONObject("serviceDetails"));
        } catch (JSONException unused2) {
        }
        try {
            jSONArray = jSONObject.getJSONArray("locations");
        } catch (JSONException unused3) {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    bVar.f20921c.add(C5921e.m29060a(jSONArray.getJSONObject(i)));
                } catch (JSONException unused4) {
                }
            }
        }
        try {
            jSONArray2 = jSONObject.getJSONArray("categories");
        } catch (JSONException unused5) {
            jSONArray2 = null;
        }
        if (jSONArray2 != null) {
            int length2 = jSONArray2.length();
            bVar.f20922d = new ArrayList<>();
            for (int i2 = 0; i2 < length2; i2++) {
                try {
                    bVar.f20922d.add(C5917a.m29033a(jSONArray2.getJSONObject(i2)));
                } catch (JSONException unused6) {
                }
            }
        }
        try {
            JSONArray jSONArray3 = new JSONArray();
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONArray jSONArray4 = jSONArray2.getJSONObject(i3).getJSONArray("products");
                if (jSONArray4 != null) {
                    for (int i4 = 0; i4 < jSONArray4.length(); i4++) {
                        JSONObject jSONObject2 = jSONArray4.getJSONObject(i4);
                        jSONObject2.put("categoryIndex", i3);
                        jSONObject2.put("productIndex", i4);
                        jSONArray3.put(jSONObject2);
                    }
                }
            }
            for (int i5 = 0; i5 < jSONArray3.length(); i5++) {
                JSONObject jSONObject3 = jSONArray3.getJSONObject(i5);
                if (jSONObject3 != null) {
                    bVar.f20923e.add(new C5931g(jSONObject3));
                }
            }
        } catch (JSONException unused7) {
        }
        return bVar;
    }

    /* renamed from: a */
    public C5920d mo18717a() {
        return this.f20919a;
    }

    /* renamed from: b */
    public ArrayList<C5921e> mo18718b() {
        return this.f20921c;
    }

    /* renamed from: c */
    public ArrayList<C5917a> mo18719c() {
        return this.f20922d;
    }

    /* renamed from: d */
    public ArrayList<C5931g> mo18720d() {
        return this.f20923e;
    }
}
