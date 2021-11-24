package com.pollfish.p145a;

import android.app.Activity;
import android.graphics.Point;
import android.location.Location;
import com.pollfish.constants.Position;
import com.pollfish.p150f.C5162b;
import com.pollfish.p150f.C5166c;

/* renamed from: com.pollfish.a.c */
public class C5108c {

    /* renamed from: A */
    private Location f18213A;

    /* renamed from: B */
    private Point f18214B;

    /* renamed from: C */
    private boolean f18215C;

    /* renamed from: D */
    private boolean f18216D;

    /* renamed from: E */
    private boolean f18217E;

    /* renamed from: F */
    private Position f18218F;

    /* renamed from: G */
    private int f18219G;

    /* renamed from: a */
    private String f18220a;

    /* renamed from: b */
    private String f18221b;

    /* renamed from: c */
    private String f18222c;

    /* renamed from: d */
    private String f18223d = null;

    /* renamed from: e */
    private Boolean f18224e = Boolean.valueOf(true);

    /* renamed from: f */
    private String f18225f;

    /* renamed from: g */
    private String f18226g;

    /* renamed from: h */
    private String f18227h;

    /* renamed from: i */
    private String f18228i;

    /* renamed from: j */
    private String f18229j;

    /* renamed from: k */
    private String f18230k;

    /* renamed from: l */
    private String f18231l;

    /* renamed from: m */
    private String f18232m;

    /* renamed from: n */
    private String f18233n = null;

    /* renamed from: o */
    private String f18234o;

    /* renamed from: p */
    private String f18235p;

    /* renamed from: q */
    private String f18236q;

    /* renamed from: r */
    private String f18237r;

    /* renamed from: s */
    private String f18238s;

    /* renamed from: t */
    private String f18239t;

    /* renamed from: u */
    private String f18240u;

    /* renamed from: v */
    private String f18241v;

    /* renamed from: w */
    private String f18242w;

    /* renamed from: x */
    private String f18243x;

    /* renamed from: y */
    private String f18244y;

    /* renamed from: z */
    private String f18245z;

    public C5108c(Activity activity, String str, boolean z, Position position, int i, boolean z2) {
        this.f18220a = str;
        StringBuilder sb = new StringBuilder();
        sb.append("api_key: ");
        sb.append(str);
        C5162b.m25518a("PollfishParamsObj", sb.toString());
        this.f18221b = C5166c.m25558o(activity);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("device_id: ");
        sb2.append(this.f18221b);
        C5162b.m25518a("PollfishParamsObj", sb2.toString());
        this.f18222c = String.valueOf(10);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("version: ");
        sb3.append(this.f18222c);
        C5162b.m25518a("PollfishParamsObj", sb3.toString());
        this.f18225f = C5166c.m25547e();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("device_descr: ");
        sb4.append(this.f18225f);
        C5162b.m25518a("PollfishParamsObj", sb4.toString());
        this.f18226g = C5166c.m25546d(activity);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("provider_mcc: ");
        sb5.append(this.f18226g);
        C5162b.m25518a("PollfishParamsObj", sb5.toString());
        this.f18227h = C5166c.m25548e(activity);
        StringBuilder sb6 = new StringBuilder();
        sb6.append("provider_mnc: ");
        sb6.append(this.f18227h);
        C5162b.m25518a("PollfishParamsObj", sb6.toString());
        this.f18228i = "0";
        StringBuilder sb7 = new StringBuilder();
        sb7.append("os: ");
        sb7.append(this.f18228i);
        C5162b.m25518a("PollfishParamsObj", sb7.toString());
        this.f18229j = C5166c.m25543c();
        StringBuilder sb8 = new StringBuilder();
        sb8.append("os_ver: ");
        sb8.append(this.f18229j);
        C5162b.m25518a("PollfishParamsObj", sb8.toString());
        this.f18230k = C5166c.m25541b();
        StringBuilder sb9 = new StringBuilder();
        sb9.append("locale: ");
        sb9.append(this.f18230k);
        C5162b.m25518a("PollfishParamsObj", sb9.toString());
        this.f18231l = C5166c.m25545d();
        StringBuilder sb10 = new StringBuilder();
        sb10.append("manufacturer: ");
        sb10.append(this.f18231l);
        C5162b.m25518a("PollfishParamsObj", sb10.toString());
        this.f18232m = C5166c.m25549f(activity);
        StringBuilder sb11 = new StringBuilder();
        sb11.append("is_roaming: ");
        sb11.append(this.f18232m);
        C5162b.m25518a("PollfishParamsObj", sb11.toString());
        this.f18234o = C5166c.m25550g(activity);
        StringBuilder sb12 = new StringBuilder();
        sb12.append("accesibility_enabled: ");
        sb12.append(this.f18234o);
        C5162b.m25518a("PollfishParamsObj", sb12.toString());
        this.f18235p = C5166c.m25551h(activity);
        StringBuilder sb13 = new StringBuilder();
        sb13.append("developer_enabled: ");
        sb13.append(this.f18235p);
        C5162b.m25518a("PollfishParamsObj", sb13.toString());
        this.f18245z = C5166c.m25555l(activity);
        StringBuilder sb14 = new StringBuilder();
        sb14.append("app_package_name: ");
        sb14.append(this.f18245z);
        C5162b.m25518a("PollfishParamsObj", sb14.toString());
        this.f18236q = C5166c.m25552i(activity);
        StringBuilder sb15 = new StringBuilder();
        sb15.append("install_non_market_apps: ");
        sb15.append(this.f18236q);
        C5162b.m25518a("PollfishParamsObj", sb15.toString());
        this.f18237r = C5166c.m25553j(activity);
        StringBuilder sb16 = new StringBuilder();
        sb16.append("nfc_exists: ");
        sb16.append(this.f18237r);
        C5162b.m25518a("PollfishParamsObj", sb16.toString());
        this.f18238s = C5166c.m25554k(activity);
        StringBuilder sb17 = new StringBuilder();
        sb17.append("nfc_enabled: ");
        sb17.append(this.f18238s);
        C5162b.m25518a("PollfishParamsObj", sb17.toString());
        this.f18239t = C5166c.m25559p(activity);
        StringBuilder sb18 = new StringBuilder();
        sb18.append("provider: ");
        sb18.append(this.f18239t);
        C5162b.m25518a("PollfishParamsObj", sb18.toString());
        this.f18240u = C5166c.m25565v(activity);
        StringBuilder sb19 = new StringBuilder();
        sb19.append("screenInch: ");
        sb19.append(this.f18240u);
        C5162b.m25518a("PollfishParamsObj", sb19.toString());
        this.f18213A = C5166c.m25563t(activity);
        StringBuilder sb20 = new StringBuilder();
        sb20.append("loc: ");
        sb20.append(this.f18213A);
        C5162b.m25518a("PollfishParamsObj", sb20.toString());
        this.f18243x = C5166c.m25560q(activity);
        StringBuilder sb21 = new StringBuilder();
        sb21.append("app_version: ");
        sb21.append(this.f18243x);
        C5162b.m25518a("PollfishParamsObj", sb21.toString());
        this.f18244y = C5166c.m25562s(activity);
        StringBuilder sb22 = new StringBuilder();
        sb22.append("con_type: ");
        sb22.append(this.f18244y);
        C5162b.m25518a("PollfishParamsObj", sb22.toString());
        this.f18214B = C5166c.m25564u(activity);
        StringBuilder sb23 = new StringBuilder();
        sb23.append("screenSizePointPixels: ");
        sb23.append(this.f18214B);
        C5162b.m25518a("PollfishParamsObj", sb23.toString());
        this.f18215C = z;
        StringBuilder sb24 = new StringBuilder();
        sb24.append("isDebuggable: ");
        sb24.append(z);
        C5162b.m25518a("PollfishParamsObj", sb24.toString());
        this.f18216D = z2;
        StringBuilder sb25 = new StringBuilder();
        sb25.append("customMode: ");
        sb25.append(z2);
        C5162b.m25518a("PollfishParamsObj", sb25.toString());
        this.f18218F = position;
        StringBuilder sb26 = new StringBuilder();
        sb26.append("indicatorPosition: ");
        sb26.append(position);
        C5162b.m25518a("PollfishParamsObj", sb26.toString());
        this.f18219G = i;
        StringBuilder sb27 = new StringBuilder();
        sb27.append("indicatorPadding: ");
        sb27.append(i);
        C5162b.m25518a("PollfishParamsObj", sb27.toString());
        this.f18217E = C5166c.m25544c(activity);
        StringBuilder sb28 = new StringBuilder();
        sb28.append("top view hardware_accelerated: ");
        sb28.append(this.f18217E);
        C5162b.m25518a("PollfishParamsObj", sb28.toString());
    }

    /* renamed from: A */
    public String mo16611A() {
        return String.valueOf(this.f18215C);
    }

    /* renamed from: B */
    public boolean mo16612B() {
        return this.f18216D;
    }

    /* renamed from: C */
    public Position mo16613C() {
        return this.f18218F;
    }

    /* renamed from: D */
    public int mo16614D() {
        return this.f18219G;
    }

    /* renamed from: E */
    public String mo16615E() {
        return this.f18241v;
    }

    /* renamed from: F */
    public String mo16616F() {
        return String.valueOf(this.f18217E);
    }

    /* renamed from: G */
    public String mo16617G() {
        return this.f18242w;
    }

    /* renamed from: H */
    public String mo16618H() {
        return this.f18243x;
    }

    /* renamed from: I */
    public String mo16619I() {
        return this.f18244y;
    }

    /* renamed from: J */
    public String mo16620J() {
        return this.f18223d;
    }

    /* renamed from: K */
    public Boolean mo16621K() {
        return this.f18224e;
    }

    /* renamed from: L */
    public String mo16622L() {
        return this.f18245z;
    }

    /* renamed from: a */
    public String mo16623a() {
        return this.f18220a;
    }

    /* renamed from: a */
    public void mo16624a(Boolean bool) {
        StringBuilder sb = new StringBuilder();
        sb.append("setOptOutFromAdsEnabled: ");
        sb.append(bool);
        C5162b.m25518a("PollfishParamsObj", sb.toString());
        this.f18224e = bool;
    }

    /* renamed from: a */
    public void mo16625a(String str) {
        this.f18233n = str;
        StringBuilder sb = new StringBuilder();
        sb.append("applications: ");
        sb.append(str);
        C5162b.m25518a("PollfishParamsObj", sb.toString());
    }

    /* renamed from: b */
    public String mo16626b() {
        return this.f18221b;
    }

    /* renamed from: b */
    public void mo16627b(String str) {
        this.f18241v = str;
        StringBuilder sb = new StringBuilder();
        sb.append("wifis: ");
        sb.append(str);
        C5162b.m25518a("PollfishParamsObj", sb.toString());
    }

    /* renamed from: c */
    public String mo16628c() {
        return this.f18222c;
    }

    /* renamed from: c */
    public void mo16629c(String str) {
        this.f18242w = str;
    }

    /* renamed from: d */
    public String mo16630d() {
        return this.f18225f;
    }

    /* renamed from: d */
    public void mo16631d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("setAdvertising_id: ");
        sb.append(str);
        C5162b.m25518a("PollfishParamsObj", sb.toString());
        this.f18223d = str;
    }

    /* renamed from: e */
    public String mo16632e() {
        return this.f18226g;
    }

    /* renamed from: f */
    public String mo16633f() {
        return this.f18227h;
    }

    /* renamed from: g */
    public String mo16634g() {
        return this.f18228i;
    }

    /* renamed from: h */
    public String mo16635h() {
        return this.f18229j;
    }

    /* renamed from: i */
    public String mo16636i() {
        return this.f18230k;
    }

    /* renamed from: j */
    public String mo16637j() {
        return this.f18231l;
    }

    /* renamed from: k */
    public String mo16638k() {
        return this.f18232m;
    }

    /* renamed from: l */
    public String mo16639l() {
        return this.f18233n;
    }

    /* renamed from: m */
    public String mo16640m() {
        return this.f18234o;
    }

    /* renamed from: n */
    public String mo16641n() {
        return this.f18235p;
    }

    /* renamed from: o */
    public String mo16642o() {
        return this.f18236q;
    }

    /* renamed from: p */
    public String mo16643p() {
        return this.f18237r;
    }

    /* renamed from: q */
    public String mo16644q() {
        return this.f18238s;
    }

    /* renamed from: r */
    public String mo16645r() {
        return this.f18239t;
    }

    /* renamed from: s */
    public String mo16646s() {
        return this.f18240u;
    }

    /* renamed from: t */
    public Location mo16647t() {
        return this.f18213A;
    }

    /* renamed from: u */
    public Point mo16648u() {
        return this.f18214B;
    }

    /* renamed from: v */
    public String mo16649v() {
        return this.f18214B != null ? String.valueOf(this.f18214B.y) : "unknown";
    }

    /* renamed from: w */
    public String mo16650w() {
        return this.f18214B != null ? String.valueOf(this.f18214B.x) : "unknown";
    }

    /* renamed from: x */
    public String mo16651x() {
        if (this.f18213A != null) {
            return String.valueOf((int) (this.f18213A.getLatitude() * 1000000.0d));
        }
        return null;
    }

    /* renamed from: y */
    public String mo16652y() {
        if (this.f18213A != null) {
            return String.valueOf((int) (this.f18213A.getLongitude() * 1000000.0d));
        }
        return null;
    }

    /* renamed from: z */
    public String mo16653z() {
        if (this.f18213A != null) {
            return String.valueOf(this.f18213A.getAccuracy());
        }
        return null;
    }
}
