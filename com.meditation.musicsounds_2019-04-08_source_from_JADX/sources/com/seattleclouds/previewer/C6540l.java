package com.seattleclouds.previewer;

import com.seattleclouds.util.C6592al;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.seattleclouds.previewer.l */
public class C6540l {

    /* renamed from: a */
    private JSONObject f23161a;

    /* renamed from: b */
    private String f23162b;

    /* renamed from: c */
    private String f23163c;

    /* renamed from: d */
    private String f23164d;

    /* renamed from: e */
    private int f23165e;

    /* renamed from: f */
    private String f23166f;

    /* renamed from: g */
    private String f23167g;

    /* renamed from: h */
    private String f23168h;

    /* renamed from: i */
    private long f23169i;

    private C6540l() {
        mo20252c("");
        mo20250b("unknown");
        mo20254d("");
        mo20248b(1);
        mo20256e("1.0");
        mo20258f("");
        mo20249b(0);
    }

    public C6540l(JSONObject jSONObject) {
        this();
        mo20252c(jSONObject.getString("title"));
        mo20250b(jSONObject.getString("id"));
        mo20254d(jSONObject.getString("iconLink"));
        mo20248b(jSONObject.getInt("platform"));
        mo20256e(jSONObject.getString("version"));
        mo20258f(jSONObject.getString("description"));
        this.f23161a = jSONObject;
    }

    /* renamed from: a */
    public static int m31606a(String str) {
        if (C6592al.m31909b(str)) {
            return 0;
        }
        if (str.equalsIgnoreCase("Android")) {
            return 1;
        }
        if (str.equalsIgnoreCase("Kindle")) {
            return 4;
        }
        if (str.equalsIgnoreCase("iPhone")) {
            return 2;
        }
        if (str.equalsIgnoreCase("iPad")) {
            return 3;
        }
        return str.equalsIgnoreCase("WebApp") ? 5 : 0;
    }

    /* renamed from: a */
    public static String m31607a(int i) {
        switch (i) {
            case 1:
                return "Android";
            case 3:
                return "iPad";
            case 4:
                return "Kindle";
            case 5:
                return "WebApp";
            default:
                return "iPhone";
        }
    }

    /* renamed from: a */
    public static String m31608a(long j) {
        Locale locale;
        String str;
        Object[] objArr;
        double d = (double) j;
        Double.isNaN(d);
        double d2 = (d / 1024.0d) / 1024.0d;
        if (j >= 104857600) {
            locale = Locale.getDefault();
            str = "%.0f MB";
            objArr = new Object[]{Double.valueOf(d2)};
        } else {
            locale = Locale.getDefault();
            str = "%.1f MB";
            objArr = new Object[]{Double.valueOf(d2)};
        }
        return String.format(locale, str, objArr);
    }

    /* renamed from: a */
    public String mo20246a() {
        return this.f23162b;
    }

    /* renamed from: b */
    public String mo20247b() {
        return this.f23163c;
    }

    /* renamed from: b */
    public void mo20248b(int i) {
        this.f23165e = i;
        this.f23166f = m31607a(i);
    }

    /* renamed from: b */
    public void mo20249b(long j) {
        this.f23169i = j;
    }

    /* renamed from: b */
    public void mo20250b(String str) {
        this.f23162b = str;
        if (this.f23163c == null || this.f23163c.trim().length() == 0) {
            this.f23163c = this.f23162b;
        }
    }

    /* renamed from: c */
    public String mo20251c() {
        return this.f23164d;
    }

    /* renamed from: c */
    public void mo20252c(String str) {
        this.f23163c = str;
    }

    /* renamed from: d */
    public int mo20253d() {
        return this.f23165e;
    }

    /* renamed from: d */
    public void mo20254d(String str) {
        this.f23164d = str;
    }

    /* renamed from: e */
    public String mo20255e() {
        return this.f23166f;
    }

    /* renamed from: e */
    public void mo20256e(String str) {
        this.f23167g = str;
        if (str == null || str.trim().length() == 0) {
            this.f23167g = "1.0";
        }
    }

    /* renamed from: f */
    public String mo20257f() {
        return this.f23167g;
    }

    /* renamed from: f */
    public void mo20258f(String str) {
        this.f23168h = str;
    }

    /* renamed from: g */
    public String mo20259g() {
        return this.f23168h;
    }

    /* renamed from: h */
    public long mo20260h() {
        return this.f23169i;
    }
}
