package com.seattleclouds.modules.p177o;

import android.util.Log;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.a */
public class C5917a {

    /* renamed from: a */
    private static String f20916a = "a";

    /* renamed from: b */
    private String f20917b = "undefined";

    /* renamed from: c */
    private ArrayList<C5931g> f20918c = new ArrayList<>();

    /* renamed from: a */
    public static C5917a m29033a(JSONObject jSONObject) {
        C5917a aVar = new C5917a();
        try {
            aVar.mo18715a(jSONObject.getString("name"));
        } catch (JSONException unused) {
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("products");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    jSONObject2.put("productIndex", i);
                    aVar.f20918c.add(new C5931g(jSONObject2));
                } catch (JSONException unused2) {
                    Log.w(f20916a, "Warning: can't get a product object");
                }
            }
        } catch (JSONException unused3) {
        }
        return aVar;
    }

    /* renamed from: a */
    public ArrayList<C5931g> mo18714a() {
        return this.f20918c;
    }

    /* renamed from: a */
    public void mo18715a(String str) {
        this.f20917b = str;
    }

    /* renamed from: b */
    public String mo18716b() {
        return this.f20917b;
    }
}
