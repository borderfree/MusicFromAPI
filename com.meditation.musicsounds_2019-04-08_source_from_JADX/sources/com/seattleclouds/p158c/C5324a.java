package com.seattleclouds.p158c;

import android.util.Base64;
import android.util.Log;
import com.seattleclouds.util.C6592al;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.c.a */
public class C5324a {

    /* renamed from: a */
    private static final String f19080a = "a";

    /* renamed from: b */
    private String f19081b = "";

    /* renamed from: c */
    private String f19082c = "";

    /* renamed from: d */
    private String f19083d = "";

    /* renamed from: e */
    private String f19084e = "";

    public C5324a() {
    }

    public C5324a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("password")) {
                try {
                    this.f19081b = jSONObject.getString("password");
                } catch (JSONException e) {
                    Log.e(f19080a, "ERROR: Unable to get password by key 'password'", e);
                }
            }
            if (jSONObject.has("username")) {
                try {
                    this.f19082c = jSONObject.getString("username");
                } catch (JSONException e2) {
                    Log.e(f19080a, "ERROR: Unable to get username by key 'username'", e2);
                }
            }
            if (jSONObject.has("base64")) {
                try {
                    this.f19083d = jSONObject.getString("base64");
                } catch (JSONException e3) {
                    Log.e(f19080a, "ERROR: Unable to get base64credentials by key 'base64'", e3);
                }
            }
            if (jSONObject.has("header")) {
                try {
                    this.f19084e = jSONObject.getString("header");
                } catch (JSONException e4) {
                    Log.e(f19080a, "ERROR: Unable to get header by key 'header'", e4);
                }
            }
        }
    }

    /* renamed from: f */
    private void m26642f() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19082c);
        sb.append(":");
        sb.append(this.f19081b);
        this.f19083d = Base64.encodeToString(sb.toString().getBytes(), 2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Basic ");
        sb2.append(this.f19083d);
        this.f19084e = sb2.toString();
    }

    /* renamed from: a */
    public String mo17463a() {
        return this.f19081b;
    }

    /* renamed from: a */
    public void mo17464a(String str) {
        if (str != null) {
            this.f19081b = str;
            m26642f();
        }
    }

    /* renamed from: b */
    public String mo17465b() {
        return this.f19082c;
    }

    /* renamed from: b */
    public void mo17466b(String str) {
        if (str != null) {
            this.f19082c = str;
            m26642f();
        }
    }

    /* renamed from: c */
    public String mo17467c() {
        if (C6592al.m31909b(this.f19084e)) {
            m26642f();
        }
        return this.f19084e;
    }

    /* renamed from: c */
    public void mo17468c(String str) {
        if (!C6592al.m31909b(str) && str.length() >= 6) {
            this.f19084e = str;
            mo17469d(str.substring(6, str.length()));
        }
    }

    /* renamed from: d */
    public void mo17469d(String str) {
        if (!C6592al.m31909b(str)) {
            try {
                String str2 = new String(Base64.decode(str, 2), "UTF-8");
                if (!C6592al.m31909b(str2)) {
                    String[] split = str2.split(":");
                    if (split.length == 2) {
                        this.f19082c = split[0];
                        this.f19081b = split[1];
                        this.f19083d = str;
                    }
                }
            } catch (UnsupportedEncodingException | IllegalArgumentException e) {
                Log.e(f19080a, "ERROR: Unable to decode autorization string", e);
            }
        }
    }

    /* renamed from: d */
    public boolean mo17470d() {
        return !C6592al.m31909b(this.f19081b) && !C6592al.m31909b(this.f19082c);
    }

    /* renamed from: e */
    public JSONObject mo17471e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("password", this.f19081b);
        jSONObject.put("username", this.f19082c);
        jSONObject.put("base64", this.f19083d);
        jSONObject.put("header", this.f19084e);
        return jSONObject;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5324a aVar = (C5324a) obj;
        return this.f19082c.equals(aVar.f19082c) && this.f19081b.equals(aVar.f19081b);
    }
}
