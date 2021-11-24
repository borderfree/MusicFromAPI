package com.facebook.ads.internal.adapters.p059a;

import android.graphics.Color;
import android.text.TextUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.a.d */
public class C1647d implements Serializable {

    /* renamed from: a */
    public static final int f5359a = Color.parseColor("#90949c");

    /* renamed from: b */
    public static final int f5360b = Color.parseColor("#4b4f56");

    /* renamed from: c */
    public static final int f5361c = Color.parseColor("#f6f7f9");

    /* renamed from: d */
    public static final int f5362d = Color.parseColor("#ff4080ff");

    /* renamed from: e */
    public static final int f5363e = Color.parseColor("#23272F");

    /* renamed from: f */
    public static final int f5364f = Color.parseColor("#ff4080ff");
    private static final long serialVersionUID = 8946536326456653736L;

    /* renamed from: g */
    private int f5365g = f5359a;

    /* renamed from: h */
    private int f5366h = f5360b;

    /* renamed from: i */
    private int f5367i = -16777216;

    /* renamed from: j */
    private int f5368j = f5361c;

    /* renamed from: k */
    private int f5369k = f5362d;

    /* renamed from: l */
    private int f5370l = -1;

    /* renamed from: m */
    private int f5371m = -16777216;

    /* renamed from: a */
    public static C1647d m8253a(JSONObject jSONObject) {
        C1647d dVar = new C1647d();
        if (jSONObject != null) {
            String optString = jSONObject.optString("accent_color");
            String optString2 = jSONObject.optString("body_color");
            String optString3 = jSONObject.optString("subtitle_color");
            String optString4 = jSONObject.optString("bg_color");
            String optString5 = jSONObject.optString("cta_color");
            String optString6 = jSONObject.optString("cta_text_color");
            String optString7 = jSONObject.optString("title_color");
            if (!TextUtils.isEmpty(optString)) {
                dVar.f5365g = Color.parseColor(optString);
            }
            if (!TextUtils.isEmpty(optString2)) {
                dVar.f5366h = Color.parseColor(optString2);
            }
            if (!TextUtils.isEmpty(optString3)) {
                dVar.f5367i = Color.parseColor(optString3);
            }
            if (!TextUtils.isEmpty(optString4)) {
                dVar.f5368j = Color.parseColor(optString4);
            }
            if (!TextUtils.isEmpty(optString5)) {
                dVar.f5369k = Color.parseColor(optString5);
            }
            if (!TextUtils.isEmpty(optString6)) {
                dVar.f5370l = Color.parseColor(optString6);
            }
            if (!TextUtils.isEmpty(optString7)) {
                dVar.f5371m = Color.parseColor(optString7);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public int mo6706a(boolean z) {
        if (z) {
            return -1;
        }
        return this.f5365g;
    }

    /* renamed from: b */
    public int mo6707b(boolean z) {
        if (z) {
            return -1;
        }
        return this.f5366h;
    }

    /* renamed from: c */
    public int mo6708c(boolean z) {
        if (z) {
            return -1;
        }
        return this.f5367i;
    }

    /* renamed from: d */
    public int mo6709d(boolean z) {
        return z ? f5363e : this.f5368j;
    }

    /* renamed from: e */
    public int mo6710e(boolean z) {
        if (z) {
            return -1;
        }
        return this.f5369k;
    }

    /* renamed from: f */
    public int mo6711f(boolean z) {
        return z ? f5364f : this.f5370l;
    }

    /* renamed from: g */
    public int mo6712g(boolean z) {
        if (z) {
            return -1;
        }
        return this.f5371m;
    }
}
