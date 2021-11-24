package com.seattleclouds.modules.p177o;

import com.seattleclouds.p159d.C5329b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.modules.o.g */
public class C5931g extends C5329b {

    /* renamed from: a */
    private String f20967a;

    /* renamed from: b */
    private String f20968b;

    /* renamed from: c */
    private String f20969c;

    /* renamed from: d */
    private String f20970d;

    /* renamed from: e */
    private ArrayList<C5946k> f20971e;

    /* renamed from: f */
    private ArrayList<C5945j> f20972f;

    /* renamed from: g */
    private int f20973g;

    /* renamed from: h */
    private int f20974h;

    public C5931g() {
        this.f20967a = "undefined";
        this.f20968b = "undefined";
        this.f20969c = "undefined";
        this.f20970d = "undefined";
        this.f20974h = -1;
        this.f20973g = -1;
        this.f20971e = new ArrayList<>();
        this.f20972f = new ArrayList<>();
    }

    public C5931g(JSONObject jSONObject) {
        try {
            super.mo17507a(jSONObject.getString("name"));
        } catch (JSONException unused) {
            super.mo17507a("undefined");
        }
        try {
            super.mo17506a(jSONObject.getDouble("price"));
        } catch (JSONException unused2) {
            super.mo17506a(0.0d);
        }
        try {
            this.f20967a = jSONObject.getString("category");
        } catch (JSONException unused3) {
            this.f20967a = "undefined";
        }
        try {
            this.f20968b = jSONObject.getString("description");
        } catch (JSONException unused4) {
            this.f20968b = "undefined";
        }
        try {
            this.f20969c = jSONObject.getString("imageName");
        } catch (JSONException unused5) {
            this.f20969c = "undefined";
        }
        try {
            this.f20970d = jSONObject.getString("urlInfo");
        } catch (JSONException unused6) {
            this.f20970d = "undefined";
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("sizes");
            this.f20971e = new ArrayList<>();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                this.f20971e.add(new C5946k(jSONArray.getJSONObject(i)));
            }
        } catch (JSONException unused7) {
            this.f20971e = new ArrayList<>();
        }
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("options");
            this.f20972f = new ArrayList<>();
            int length2 = jSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                this.f20972f.add(new C5945j(jSONArray2.getJSONObject(i2)));
            }
        } catch (JSONException unused8) {
            this.f20972f = new ArrayList<>();
        }
        try {
            if (jSONObject.has("categoryIndex")) {
                this.f20973g = jSONObject.getInt("categoryIndex");
            }
        } catch (JSONException unused9) {
            this.f20973g = -1;
        }
        try {
            if (jSONObject.has("productIndex")) {
                this.f20974h = jSONObject.getInt("productIndex");
            }
        } catch (JSONException unused10) {
            this.f20974h = -1;
        }
    }

    /* renamed from: a */
    public String mo18752a() {
        return this.f20968b;
    }

    /* renamed from: b */
    public String mo18753b() {
        return this.f20969c;
    }

    /* renamed from: c */
    public ArrayList<C5946k> mo18754c() {
        return this.f20971e;
    }

    /* renamed from: d */
    public ArrayList<C5945j> mo18755d() {
        return this.f20972f;
    }

    /* renamed from: e */
    public String mo18756e() {
        return this.f20970d;
    }

    /* renamed from: f */
    public int mo18757f() {
        return this.f20973g;
    }

    /* renamed from: g */
    public int mo18758g() {
        return this.f20974h;
    }
}
