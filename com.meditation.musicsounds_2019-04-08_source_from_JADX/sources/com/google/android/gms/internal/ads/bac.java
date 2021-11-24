package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@C3464ci
public final class bac {

    /* renamed from: a */
    public final List<bab> f13423a;

    /* renamed from: b */
    public final long f13424b;

    /* renamed from: c */
    public final List<String> f13425c;

    /* renamed from: d */
    public final List<String> f13426d;

    /* renamed from: e */
    public final List<String> f13427e;

    /* renamed from: f */
    public final List<String> f13428f;

    /* renamed from: g */
    public final List<String> f13429g;

    /* renamed from: h */
    public final boolean f13430h;

    /* renamed from: i */
    public final String f13431i;

    /* renamed from: j */
    public final long f13432j;

    /* renamed from: k */
    public final String f13433k;

    /* renamed from: l */
    public final int f13434l;

    /* renamed from: m */
    public final int f13435m;

    /* renamed from: n */
    public final long f13436n;

    /* renamed from: o */
    public final boolean f13437o;

    /* renamed from: p */
    public final boolean f13438p;

    /* renamed from: q */
    public final boolean f13439q;

    /* renamed from: r */
    public int f13440r;

    /* renamed from: s */
    public int f13441s;

    /* renamed from: t */
    public boolean f13442t;

    public bac(String str) {
        this(new JSONObject(str));
    }

    public bac(List<bab> list, long j, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6, boolean z, String str, long j2, int i, int i2, String str2, int i3, int i4, long j3, boolean z2) {
        this.f13423a = list;
        this.f13424b = j;
        this.f13425c = list2;
        this.f13426d = list3;
        this.f13427e = list4;
        this.f13428f = list5;
        this.f13429g = list6;
        this.f13430h = z;
        this.f13431i = str;
        this.f13432j = -1;
        this.f13440r = 0;
        this.f13441s = 1;
        this.f13433k = null;
        this.f13434l = 0;
        this.f13435m = -1;
        this.f13436n = -1;
        this.f13437o = false;
        this.f13438p = false;
        this.f13439q = false;
        this.f13442t = false;
    }

    public bac(JSONObject jSONObject) {
        if (C3643iy.m19171a(2)) {
            String str = "Mediation Response JSON: ";
            String valueOf = String.valueOf(jSONObject.toString(2));
            C3643iy.m18780a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            bab bab = new bab(jSONArray.getJSONObject(i2));
            boolean z = true;
            if (bab.mo12656a()) {
                this.f13442t = true;
            }
            arrayList.add(bab);
            if (i < 0) {
                Iterator it = bab.f13404c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    i = i2;
                }
            }
        }
        this.f13440r = i;
        this.f13441s = jSONArray.length();
        this.f13423a = Collections.unmodifiableList(arrayList);
        this.f13431i = jSONObject.optString("qdata");
        this.f13435m = jSONObject.optInt("fs_model_type", -1);
        long j = -1;
        this.f13436n = jSONObject.optLong("timeout_ms", -1);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.f13424b = optJSONObject.optLong("ad_network_timeout_millis", -1);
            zzbv.zzfd();
            this.f13425c = bal.m17779a(optJSONObject, "click_urls");
            zzbv.zzfd();
            this.f13426d = bal.m17779a(optJSONObject, "imp_urls");
            zzbv.zzfd();
            this.f13427e = bal.m17779a(optJSONObject, "downloaded_imp_urls");
            zzbv.zzfd();
            this.f13428f = bal.m17779a(optJSONObject, "nofill_urls");
            zzbv.zzfd();
            this.f13429g = bal.m17779a(optJSONObject, "remote_ping_urls");
            this.f13430h = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1);
            if (optLong > 0) {
                j = 1000 * optLong;
            }
            this.f13432j = j;
            zzaig a = zzaig.m20617a(optJSONObject.optJSONArray("rewards"));
            if (a == null) {
                this.f13433k = null;
                this.f13434l = 0;
            } else {
                this.f13433k = a.f15350a;
                this.f13434l = a.f15351b;
            }
            this.f13437o = optJSONObject.optBoolean("use_displayed_impression", false);
            this.f13438p = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.f13439q = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            return;
        }
        this.f13424b = -1;
        this.f13425c = null;
        this.f13426d = null;
        this.f13427e = null;
        this.f13428f = null;
        this.f13429g = null;
        this.f13432j = -1;
        this.f13433k = null;
        this.f13434l = 0;
        this.f13437o = false;
        this.f13430h = false;
        this.f13438p = false;
        this.f13439q = false;
    }
}
