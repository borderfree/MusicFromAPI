package com.seattleclouds.modules.rsspro;

import android.content.Context;
import android.util.Log;
import com.seattleclouds.modules.p168f.C5614a;
import com.seattleclouds.util.C6592al;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.C6748a;
import org.jsoup.nodes.C6766f;
import org.jsoup.p201a.C6751b;

/* renamed from: com.seattleclouds.modules.rsspro.d */
public class C6250d implements C6249c {

    /* renamed from: a */
    private C6247a f22158a = new C6247a();

    /* renamed from: b */
    private JSONObject f22159b = new JSONObject();

    /* renamed from: c */
    private ArrayList<JSONObject> f22160c = new ArrayList<>();

    /* renamed from: d */
    private String f22161d = "";

    /* renamed from: e */
    private int f22162e = 0;

    /* renamed from: f */
    private int f22163f = 100;

    /* renamed from: g */
    private String f22164g = C6250d.class.toString();

    /* renamed from: a */
    public JSONObject mo19572a(String str) {
        this.f22161d = str;
        new RssFeedsPullParser(this, str).mo19537a();
        return this.f22159b;
    }

    /* renamed from: a */
    public void mo19567a() {
    }

    /* renamed from: a */
    public void mo19568a(C6247a aVar) {
        this.f22158a = aVar;
    }

    /* renamed from: a */
    public void mo19569a(C6248b bVar) {
        if (bVar != null && this.f22162e < this.f22163f) {
            JSONObject jSONObject = new JSONObject();
            try {
                String b = bVar.mo19552b();
                String c = bVar.mo19554c();
                String a = bVar.mo19550a();
                jSONObject.put("title", b);
                jSONObject.put("content", bVar.mo19560f());
                jSONObject.put("description", bVar.mo19556d());
                jSONObject.put("link", c);
                jSONObject.put("baseURL", bVar.mo19566i());
                int i = this.f22162e;
                this.f22162e = i + 1;
                jSONObject.put("itemid", Integer.toString(i));
                jSONObject.put("date", bVar.mo19558e());
                jSONObject.put("identifier", a);
                String str = "rssfeed-item.png";
                String b2 = mo19573b(bVar.mo19560f());
                if (bVar.mo19562g() != null && !bVar.mo19562g().equalsIgnoreCase("")) {
                    str = bVar.mo19562g();
                } else if (b2 != null && !b2.equalsIgnoreCase("")) {
                    str = b2;
                }
                jSONObject.put("itemimg", str);
                if (a.length() > 0) {
                    C5614a a2 = C5614a.m27865a((Context) null);
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f22161d);
                    sb.append(a);
                    String e = C6592al.m31912e(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("favorite://add|RSSItem|");
                    sb2.append(URLEncoder.encode(this.f22161d));
                    sb2.append("|");
                    sb2.append(URLEncoder.encode(a));
                    sb2.append("|");
                    sb2.append(URLEncoder.encode(b));
                    sb2.append("|");
                    sb2.append(URLEncoder.encode(str));
                    String sb3 = sb2.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("<img id='");
                    sb4.append(e);
                    sb4.append("' onclick=\"document.location.href = '");
                    sb4.append(sb3);
                    sb4.append("'\" src='");
                    sb4.append(a2.mo18139b(e) ? C5614a.m27866a() : C5614a.m27868b());
                    sb4.append("' />");
                    jSONObject.put("favorite", sb4.toString());
                } else {
                    jSONObject.put("favorite", "");
                }
                this.f22160c.add(jSONObject);
            } catch (JSONException unused) {
                Log.e(this.f22164g, "Error creating JSONObject");
            }
        }
    }

    /* renamed from: a */
    public void mo19570a(Error error) {
        Log.e(this.f22164g, error.toString());
    }

    /* renamed from: b */
    public String mo19573b(String str) {
        int i;
        int i2;
        String str2 = "";
        C6751b a = C6748a.m32582a(String.format("<html><head></head><body>%s</body></html>", new Object[]{str})).mo21274a("img");
        if (a == null || a.size() == 0) {
            return "";
        }
        if (a.size() == 1) {
            return a.get(0).mo21303p().mo21255a("src");
        }
        Iterator it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C6766f fVar = (C6766f) it.next();
            String b = fVar.mo21294b("width");
            String b2 = fVar.mo21294b("height");
            if (!(b == null || b2 == null)) {
                try {
                    i2 = Integer.parseInt(b.trim());
                    i = Integer.parseInt(b2.trim());
                } catch (Exception unused) {
                    i2 = 0;
                    i = 0;
                }
                if (i2 > 50 && i > 50) {
                    str2 = fVar.mo21303p().mo21255a("src");
                    break;
                }
            }
        }
        return str2.equalsIgnoreCase("") ? a.get(0).mo21294b("src") : str2;
    }

    /* renamed from: b */
    public void mo19571b() {
        try {
            this.f22159b = new JSONObject();
            String str = "";
            String str2 = "";
            String str3 = "";
            String str4 = "";
            if (this.f22158a != null) {
                str = this.f22158a.mo19542a() == null ? "" : this.f22158a.mo19542a();
                str2 = this.f22158a.mo19544b() == null ? "" : this.f22158a.mo19544b();
                str3 = this.f22158a.mo19546c() == null ? "" : this.f22158a.mo19546c();
                str4 = this.f22158a.mo19548d() == null ? "" : this.f22158a.mo19548d();
            }
            this.f22159b.put("title", str);
            this.f22159b.put("link", str2);
            this.f22159b.put("description", str3);
            this.f22159b.put("baseURL", str4);
            this.f22159b.put("items", new JSONArray(this.f22160c));
        } catch (JSONException unused) {
            Log.e(this.f22164g, "JSON Initialization exception");
        }
    }
}
