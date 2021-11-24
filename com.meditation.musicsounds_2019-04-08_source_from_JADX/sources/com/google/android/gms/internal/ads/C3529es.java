package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.es */
public final class C3529es {

    /* renamed from: A */
    private boolean f13855A = false;

    /* renamed from: B */
    private zzael f13856B;

    /* renamed from: C */
    private boolean f13857C = false;

    /* renamed from: D */
    private String f13858D;

    /* renamed from: E */
    private List<String> f13859E;

    /* renamed from: F */
    private boolean f13860F;

    /* renamed from: G */
    private String f13861G;

    /* renamed from: H */
    private zzaiq f13862H;

    /* renamed from: I */
    private boolean f13863I;

    /* renamed from: J */
    private boolean f13864J;

    /* renamed from: K */
    private boolean f13865K;

    /* renamed from: L */
    private boolean f13866L;

    /* renamed from: M */
    private String f13867M;

    /* renamed from: N */
    private final zzaef f13868N;

    /* renamed from: a */
    private String f13869a;

    /* renamed from: b */
    private String f13870b;

    /* renamed from: c */
    private String f13871c;

    /* renamed from: d */
    private List<String> f13872d;

    /* renamed from: e */
    private String f13873e;

    /* renamed from: f */
    private String f13874f;

    /* renamed from: g */
    private String f13875g;

    /* renamed from: h */
    private List<String> f13876h;

    /* renamed from: i */
    private List<String> f13877i;

    /* renamed from: j */
    private long f13878j = -1;

    /* renamed from: k */
    private boolean f13879k = false;

    /* renamed from: l */
    private final long f13880l = -1;

    /* renamed from: m */
    private List<String> f13881m;

    /* renamed from: n */
    private long f13882n = -1;

    /* renamed from: o */
    private int f13883o = -1;

    /* renamed from: p */
    private boolean f13884p = false;

    /* renamed from: q */
    private boolean f13885q = false;

    /* renamed from: r */
    private boolean f13886r = false;

    /* renamed from: s */
    private boolean f13887s = true;

    /* renamed from: t */
    private boolean f13888t = true;

    /* renamed from: u */
    private String f13889u = "";

    /* renamed from: v */
    private boolean f13890v = false;

    /* renamed from: w */
    private boolean f13891w = false;

    /* renamed from: x */
    private zzaig f13892x;

    /* renamed from: y */
    private List<String> f13893y;

    /* renamed from: z */
    private List<String> f13894z;

    public C3529es(zzaef zzaef, String str) {
        this.f13870b = str;
        this.f13868N = zzaef;
    }

    /* renamed from: a */
    private static String m18358a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    /* renamed from: b */
    private static long m18359b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
                sb.append("Could not parse float from ");
                sb.append(str);
                sb.append(" header: ");
                sb.append(str2);
                C3643iy.m19178e(sb.toString());
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static List<String> m18360c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list != null && !list.isEmpty()) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m18361d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return false;
        }
        return Boolean.valueOf((String) list.get(0)).booleanValue();
    }

    /* renamed from: a */
    public final zzaej mo12881a(long j, boolean z) {
        String str;
        int i;
        zzaef zzaef = this.f13868N;
        String str2 = this.f13870b;
        String str3 = this.f13871c;
        List<String> list = this.f13872d;
        List<String> list2 = this.f13876h;
        long j2 = this.f13878j;
        boolean z2 = this.f13879k;
        List<String> list3 = this.f13881m;
        long j3 = this.f13882n;
        int i2 = this.f13883o;
        String str4 = this.f13869a;
        String str5 = this.f13874f;
        String str6 = this.f13875g;
        String str7 = str5;
        boolean z3 = this.f13884p;
        boolean z4 = this.f13885q;
        boolean z5 = this.f13886r;
        boolean z6 = this.f13887s;
        String str8 = this.f13889u;
        boolean z7 = this.f13890v;
        boolean z8 = this.f13891w;
        zzaig zzaig = this.f13892x;
        List<String> list4 = this.f13893y;
        List<String> list5 = this.f13894z;
        boolean z9 = this.f13855A;
        zzael zzael = this.f13856B;
        boolean z10 = this.f13857C;
        String str9 = this.f13858D;
        List<String> list6 = this.f13859E;
        boolean z11 = this.f13860F;
        String str10 = this.f13861G;
        zzaiq zzaiq = this.f13862H;
        String str11 = this.f13873e;
        boolean z12 = this.f13888t;
        boolean z13 = this.f13863I;
        boolean z14 = this.f13864J;
        if (z) {
            str = str4;
            i = 2;
        } else {
            str = str4;
            i = 1;
        }
        String str12 = str6;
        String str13 = str7;
        boolean z15 = z3;
        boolean z16 = z4;
        boolean z17 = z5;
        boolean z18 = z6;
        String str14 = str8;
        boolean z19 = z7;
        boolean z20 = z8;
        zzaig zzaig2 = zzaig;
        List<String> list7 = list4;
        List<String> list8 = list5;
        boolean z21 = z9;
        zzael zzael2 = zzael;
        boolean z22 = z10;
        String str15 = str9;
        List<String> list9 = list6;
        boolean z23 = z11;
        String str16 = str10;
        zzaiq zzaiq2 = zzaiq;
        String str17 = str11;
        boolean z24 = z12;
        boolean z25 = z13;
        String str18 = str;
        long j4 = j;
        zzaej zzaej = new zzaej(zzaef, str2, str3, list, list2, j2, z2, -1, list3, j3, i2, str18, j4, str13, str12, z15, z16, z17, z18, false, str14, z19, z20, zzaig2, list7, list8, z21, zzael2, z22, str15, list9, z23, str16, zzaiq2, str17, z24, z25, z14, i, this.f13865K, this.f13877i, this.f13866L, this.f13867M);
        return zzaej;
    }

    /* renamed from: a */
    public final void mo12882a(String str, Map<String, List<String>> map, String str2) {
        this.f13871c = str2;
        mo12883a(map);
    }

    /* renamed from: a */
    public final void mo12883a(Map<String, List<String>> map) {
        int a;
        this.f13869a = m18358a(map, "X-Afma-Ad-Size");
        this.f13861G = m18358a(map, "X-Afma-Ad-Slot-Size");
        List<String> c = m18360c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f13872d = c;
        }
        this.f13873e = m18358a(map, "X-Afma-Debug-Signals");
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f13874f = (String) list.get(0);
        }
        List<String> c2 = m18360c(map, "X-Afma-Tracking-Urls");
        if (c2 != null) {
            this.f13876h = c2;
        }
        List<String> c3 = m18360c(map, "X-Afma-Downloaded-Impression-Urls");
        if (c3 != null) {
            this.f13877i = c3;
        }
        long b = m18359b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f13878j = b;
        }
        this.f13879k |= m18361d(map, "X-Afma-Mediation");
        List<String> c4 = m18360c(map, "X-Afma-Manual-Tracking-Urls");
        if (c4 != null) {
            this.f13881m = c4;
        }
        long b2 = m18359b(map, "X-Afma-Refresh-Rate");
        if (b2 != -1) {
            this.f13882n = b2;
        }
        List list2 = (List) map.get("X-Afma-Orientation");
        if (list2 != null && !list2.isEmpty()) {
            String str = (String) list2.get(0);
            if ("portrait".equalsIgnoreCase(str)) {
                a = zzbv.zzem().mo13156b();
            } else if ("landscape".equalsIgnoreCase(str)) {
                a = zzbv.zzem().mo13143a();
            }
            this.f13883o = a;
        }
        this.f13875g = m18358a(map, "X-Afma-ActiveView");
        List list3 = (List) map.get("X-Afma-Use-HTTPS");
        if (list3 != null && !list3.isEmpty()) {
            this.f13886r = Boolean.valueOf((String) list3.get(0)).booleanValue();
        }
        this.f13884p |= m18361d(map, "X-Afma-Custom-Rendering-Allowed");
        this.f13885q = "native".equals(m18358a(map, "X-Afma-Ad-Format"));
        List list4 = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list4 != null && !list4.isEmpty()) {
            this.f13887s = Boolean.valueOf((String) list4.get(0)).booleanValue();
        }
        List list5 = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list5 != null && !list5.isEmpty()) {
            this.f13888t = Boolean.valueOf((String) list5.get(0)).booleanValue();
        }
        List list6 = (List) map.get("X-Afma-Gws-Query-Id");
        if (list6 != null && !list6.isEmpty()) {
            this.f13889u = (String) list6.get(0);
        }
        String a2 = m18358a(map, "X-Afma-Fluid");
        if (a2 != null && a2.equals("height")) {
            this.f13890v = true;
        }
        this.f13891w = "native_express".equals(m18358a(map, "X-Afma-Ad-Format"));
        this.f13892x = zzaig.m20616a(m18358a(map, "X-Afma-Rewards"));
        if (this.f13893y == null) {
            this.f13893y = m18360c(map, "X-Afma-Reward-Video-Start-Urls");
        }
        if (this.f13894z == null) {
            this.f13894z = m18360c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
        this.f13855A |= m18361d(map, "X-Afma-Use-Displayed-Impression");
        this.f13857C |= m18361d(map, "X-Afma-Auto-Collect-Location");
        this.f13858D = m18358a(map, "Set-Cookie");
        String a3 = m18358a(map, "X-Afma-Auto-Protection-Configuration");
        if (a3 == null || TextUtils.isEmpty(a3)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f13874f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f13874f);
            }
            boolean booleanValue = ((Boolean) ane.m16650f().mo12297a(aqm.f12897g)).booleanValue();
            String builder = buildUpon.toString();
            StringBuilder sb = new StringBuilder(String.valueOf(builder).length() + 31);
            sb.append(builder);
            sb.append("&navigationURL={NAVIGATION_URL}");
            this.f13856B = new zzael(booleanValue, Arrays.asList(new String[]{sb.toString()}));
        } else {
            try {
                this.f13856B = zzael.m20612a(new JSONObject(a3));
            } catch (JSONException e) {
                C3643iy.m19175c("Error parsing configuration JSON", e);
                this.f13856B = new zzael();
            }
        }
        List<String> c5 = m18360c(map, "X-Afma-Remote-Ping-Urls");
        if (c5 != null) {
            this.f13859E = c5;
        }
        String a4 = m18358a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a4)) {
            try {
                this.f13862H = zzaiq.m20618a(new JSONObject(a4));
            } catch (JSONException e2) {
                C3643iy.m19175c("Error parsing safe browsing header", e2);
            }
        }
        this.f13860F |= m18361d(map, "X-Afma-Render-In-Browser");
        String a5 = m18358a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a5)) {
            try {
                this.f13863I = new JSONObject(a5).getBoolean("never_pool");
            } catch (JSONException e3) {
                C3643iy.m19175c("Error parsing interstitial pool header", e3);
            }
        }
        this.f13864J = m18361d(map, "X-Afma-Custom-Close-Blocked");
        this.f13865K = m18361d(map, "X-Afma-Enable-Omid");
        this.f13866L = m18361d(map, "X-Afma-Disable-Closable-Area");
        this.f13867M = m18358a(map, "X-Afma-Omid-Settings");
    }
}
