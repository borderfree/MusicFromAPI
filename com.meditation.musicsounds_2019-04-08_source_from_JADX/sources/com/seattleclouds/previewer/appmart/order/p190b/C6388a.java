package com.seattleclouds.previewer.appmart.order.p190b;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.seattleclouds.previewer.appmart.order.b.a */
public class C6388a {

    /* renamed from: a */
    public static final String f22686a = "com.seattleclouds.previewer.appmart.order.b.a";

    /* renamed from: b */
    private static C6388a f22687b;

    /* renamed from: A */
    private ArrayList<String> f22688A;

    /* renamed from: B */
    private String f22689B;

    /* renamed from: C */
    private String f22690C;

    /* renamed from: D */
    private ArrayList<C6389b> f22691D;

    /* renamed from: E */
    private String f22692E;

    /* renamed from: F */
    private String f22693F;

    /* renamed from: G */
    private C6389b f22694G;

    /* renamed from: H */
    private String f22695H;

    /* renamed from: I */
    private String f22696I;

    /* renamed from: J */
    private String f22697J;

    /* renamed from: K */
    private String f22698K;

    /* renamed from: L */
    private String f22699L;

    /* renamed from: M */
    private String f22700M;

    /* renamed from: N */
    private String f22701N;

    /* renamed from: O */
    private String f22702O;

    /* renamed from: P */
    private String f22703P;

    /* renamed from: Q */
    private String f22704Q;

    /* renamed from: R */
    private String f22705R;

    /* renamed from: S */
    private String f22706S;

    /* renamed from: T */
    private String f22707T;

    /* renamed from: U */
    private String f22708U;

    /* renamed from: V */
    private String f22709V;

    /* renamed from: c */
    private boolean f22710c = false;

    /* renamed from: d */
    private boolean f22711d = true;

    /* renamed from: e */
    private boolean f22712e = false;

    /* renamed from: f */
    private boolean f22713f = false;

    /* renamed from: g */
    private boolean f22714g = false;

    /* renamed from: h */
    private int f22715h = -1;

    /* renamed from: i */
    private String f22716i;

    /* renamed from: j */
    private String f22717j;

    /* renamed from: k */
    private String f22718k;

    /* renamed from: l */
    private String f22719l;

    /* renamed from: m */
    private String f22720m;

    /* renamed from: n */
    private String f22721n;

    /* renamed from: o */
    private String f22722o;

    /* renamed from: p */
    private String f22723p;

    /* renamed from: q */
    private String f22724q;

    /* renamed from: r */
    private String f22725r;

    /* renamed from: s */
    private String f22726s;

    /* renamed from: t */
    private String f22727t;

    /* renamed from: u */
    private String f22728u;

    /* renamed from: v */
    private String f22729v;

    /* renamed from: w */
    private String f22730w;

    /* renamed from: x */
    private String f22731x;

    /* renamed from: y */
    private String f22732y;

    /* renamed from: z */
    private String f22733z;

    private C6388a() {
    }

    /* renamed from: a */
    public static C6388a m31014a() {
        if (f22687b == null) {
            f22687b = new C6388a();
        }
        return f22687b;
    }

    /* renamed from: b */
    public static void m31015b() {
        f22687b = null;
    }

    /* renamed from: A */
    public void mo19847A(String str) {
        this.f22696I = str;
    }

    /* renamed from: A */
    public boolean mo19848A() {
        return this.f22689B != null && !this.f22689B.isEmpty();
    }

    /* renamed from: B */
    public void mo19849B(String str) {
        this.f22697J = str;
    }

    /* renamed from: B */
    public boolean mo19850B() {
        return (this.f22690C != null && !this.f22690C.isEmpty()) || mo19848A();
    }

    /* renamed from: C */
    public void mo19851C(String str) {
        this.f22698K = str;
    }

    /* renamed from: C */
    public boolean mo19852C() {
        return this.f22691D != null && !this.f22691D.isEmpty();
    }

    /* renamed from: D */
    public String mo19853D() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append("Owneremail: ");
        sb.append(this.f22717j);
        sb.append("<br>Owner_name: ");
        sb.append(this.f22716i);
        sb.append("<br>Owner_phone: ");
        sb.append(this.f22718k);
        sb.append("<br>Company_name: ");
        sb.append(this.f22719l);
        sb.append("<br>Companyphone: ");
        sb.append(this.f22720m);
        sb.append("<br>Companyeml: ");
        sb.append(this.f22721n);
        sb.append("<br>Companyaddress: ");
        sb.append(this.f22722o);
        sb.append(" <br>Country: ");
        sb.append(this.f22723p);
        sb.append(" <br>Language: ");
        sb.append(this.f22724q);
        sb.append("<br>");
        String sb2 = sb.toString();
        if (this.f22725r != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("Companywebsite: ");
            sb3.append(this.f22725r);
            sb3.append("<br> ");
            sb2 = sb3.toString();
        }
        if (this.f22726s != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("WeChatID: ");
            sb4.append(this.f22726s);
            sb4.append("<br> ");
            sb2 = sb4.toString();
        }
        if (this.f22727t != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("Device_type: ");
            sb5.append(this.f22727t);
            sb5.append("<br> ");
            sb2 = sb5.toString();
        }
        if (this.f22728u != null) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(sb2);
            sb6.append("AdditionalRequirements: ");
            sb6.append(this.f22728u);
            sb6.append("<br> ");
            sb2 = sb6.toString();
        }
        if (this.f22729v != null) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb2);
            sb7.append("Notes: ");
            sb7.append(this.f22729v);
            sb7.append("<br> ");
            sb2 = sb7.toString();
        }
        if (this.f22730w != null) {
            StringBuilder sb8 = new StringBuilder();
            sb8.append(sb2);
            sb8.append("Template: ");
            sb8.append(this.f22730w);
            sb8.append("<br> ");
            sb2 = sb8.toString();
        }
        if (this.f22731x != null) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb2);
            sb9.append("Theme: ");
            sb9.append(this.f22731x);
            sb9.append("<br> ");
            sb2 = sb9.toString();
        }
        if (this.f22732y != null) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb2);
            sb10.append("PrimaryColor: ");
            sb10.append(this.f22732y);
            sb10.append("<br> ");
            sb2 = sb10.toString();
        }
        if (this.f22733z != null) {
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb2);
            sb11.append("AccentColor: ");
            sb11.append(this.f22733z);
            sb11.append("<br> ");
            sb2 = sb11.toString();
        }
        if (this.f22688A != null && !this.f22688A.isEmpty()) {
            StringBuilder sb12 = new StringBuilder();
            sb12.append(str);
            sb12.append("Features: ");
            str = sb12.toString();
            Iterator it = this.f22688A.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(str2);
                sb13.append("<br>");
                str = sb13.toString();
            }
        }
        return str;
    }

    /* renamed from: D */
    public void mo19854D(String str) {
        this.f22699L = str;
    }

    /* renamed from: E */
    public String mo19855E() {
        if (this.f22688A == null || this.f22688A.isEmpty()) {
            return null;
        }
        String str = (String) this.f22688A.get(0);
        this.f22688A.size();
        for (int i = 1; i < this.f22688A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", ");
            sb.append((String) this.f22688A.get(i));
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: E */
    public void mo19856E(String str) {
        this.f22700M = str;
    }

    /* renamed from: F */
    public C6389b mo19857F() {
        return this.f22694G;
    }

    /* renamed from: F */
    public void mo19858F(String str) {
        this.f22701N = str;
    }

    /* renamed from: G */
    public String mo19859G() {
        return this.f22707T;
    }

    /* renamed from: G */
    public void mo19860G(String str) {
        this.f22702O = str;
    }

    /* renamed from: H */
    public String mo19861H() {
        return this.f22695H;
    }

    /* renamed from: H */
    public void mo19862H(String str) {
        this.f22703P = str;
    }

    /* renamed from: I */
    public String mo19863I() {
        return this.f22697J;
    }

    /* renamed from: I */
    public void mo19864I(String str) {
        this.f22704Q = str;
    }

    /* renamed from: J */
    public String mo19865J() {
        return this.f22698K;
    }

    /* renamed from: J */
    public void mo19866J(String str) {
        this.f22705R = str;
    }

    /* renamed from: K */
    public String mo19867K() {
        return this.f22699L;
    }

    /* renamed from: K */
    public void mo19868K(String str) {
        this.f22706S = str;
    }

    /* renamed from: L */
    public String mo19869L() {
        return this.f22700M;
    }

    /* renamed from: L */
    public void mo19870L(String str) {
        this.f22708U = str;
    }

    /* renamed from: M */
    public String mo19871M() {
        return this.f22701N;
    }

    /* renamed from: M */
    public void mo19872M(String str) {
        this.f22709V = str;
    }

    /* renamed from: N */
    public String mo19873N() {
        return this.f22702O;
    }

    /* renamed from: O */
    public String mo19874O() {
        return this.f22703P;
    }

    /* renamed from: P */
    public String mo19875P() {
        return this.f22704Q;
    }

    /* renamed from: Q */
    public String mo19876Q() {
        return this.f22705R;
    }

    /* renamed from: R */
    public String mo19877R() {
        return this.f22706S;
    }

    /* renamed from: S */
    public String mo19878S() {
        return this.f22708U;
    }

    /* renamed from: T */
    public String mo19879T() {
        return this.f22709V;
    }

    /* renamed from: U */
    public boolean mo19880U() {
        return this.f22710c;
    }

    /* renamed from: V */
    public boolean mo19881V() {
        return this.f22713f;
    }

    /* renamed from: W */
    public int mo19882W() {
        return this.f22715h;
    }

    /* renamed from: X */
    public boolean mo19883X() {
        return this.f22712e;
    }

    /* renamed from: Y */
    public boolean mo19884Y() {
        return this.f22711d;
    }

    /* renamed from: Z */
    public boolean mo19885Z() {
        return this.f22714g;
    }

    /* renamed from: a */
    public void mo19886a(int i) {
        this.f22715h = i;
    }

    /* renamed from: a */
    public void mo19887a(C6389b bVar) {
        this.f22694G = bVar;
    }

    /* renamed from: a */
    public void mo19888a(String str) {
        this.f22716i = str;
    }

    /* renamed from: a */
    public void mo19889a(ArrayList<C6389b> arrayList) {
        this.f22691D = arrayList;
    }

    /* renamed from: a */
    public void mo19890a(boolean z) {
        this.f22713f = z;
    }

    /* renamed from: b */
    public void mo19891b(String str) {
        this.f22717j = str;
    }

    /* renamed from: b */
    public void mo19892b(boolean z) {
        this.f22712e = z;
    }

    /* renamed from: c */
    public void mo19893c() {
        this.f22690C = "";
        this.f22689B = "";
        this.f22691D = null;
    }

    /* renamed from: c */
    public void mo19894c(String str) {
        this.f22718k = str;
    }

    /* renamed from: c */
    public void mo19895c(boolean z) {
        this.f22711d = z;
    }

    /* renamed from: d */
    public String mo19896d() {
        return this.f22716i;
    }

    /* renamed from: d */
    public void mo19897d(String str) {
        this.f22719l = str;
    }

    /* renamed from: d */
    public void mo19898d(boolean z) {
        this.f22714g = z;
    }

    /* renamed from: e */
    public String mo19899e() {
        return this.f22717j;
    }

    /* renamed from: e */
    public void mo19900e(String str) {
        this.f22720m = str;
    }

    /* renamed from: f */
    public String mo19901f() {
        return this.f22718k;
    }

    /* renamed from: f */
    public void mo19902f(String str) {
        this.f22721n = str;
    }

    /* renamed from: g */
    public String mo19903g() {
        return this.f22719l;
    }

    /* renamed from: g */
    public void mo19904g(String str) {
        this.f22722o = str;
    }

    /* renamed from: h */
    public String mo19905h() {
        return this.f22720m;
    }

    /* renamed from: h */
    public void mo19906h(String str) {
        this.f22723p = str;
    }

    /* renamed from: i */
    public String mo19907i() {
        return this.f22721n;
    }

    /* renamed from: i */
    public void mo19908i(String str) {
        this.f22724q = str;
    }

    /* renamed from: j */
    public String mo19909j() {
        return this.f22722o;
    }

    /* renamed from: j */
    public void mo19910j(String str) {
        this.f22725r = str;
    }

    /* renamed from: k */
    public String mo19911k() {
        return this.f22723p;
    }

    /* renamed from: k */
    public void mo19912k(String str) {
        this.f22726s = str;
    }

    /* renamed from: l */
    public String mo19913l() {
        return this.f22724q;
    }

    /* renamed from: l */
    public void mo19914l(String str) {
        this.f22727t = str;
    }

    /* renamed from: m */
    public String mo19915m() {
        return this.f22725r;
    }

    /* renamed from: m */
    public void mo19916m(String str) {
        this.f22728u = str;
    }

    /* renamed from: n */
    public String mo19917n() {
        return this.f22726s;
    }

    /* renamed from: n */
    public void mo19918n(String str) {
        this.f22729v = str;
    }

    /* renamed from: o */
    public String mo19919o() {
        return this.f22727t;
    }

    /* renamed from: o */
    public void mo19920o(String str) {
        this.f22730w = str;
    }

    /* renamed from: p */
    public String mo19921p() {
        return this.f22728u;
    }

    /* renamed from: p */
    public void mo19922p(String str) {
        this.f22731x = str;
    }

    /* renamed from: q */
    public String mo19923q() {
        return this.f22729v;
    }

    /* renamed from: q */
    public void mo19924q(String str) {
        this.f22732y = str;
    }

    /* renamed from: r */
    public String mo19925r() {
        return this.f22730w;
    }

    /* renamed from: r */
    public void mo19926r(String str) {
        this.f22733z = str;
    }

    /* renamed from: s */
    public String mo19927s() {
        return this.f22731x;
    }

    /* renamed from: s */
    public void mo19928s(String str) {
        this.f22692E = str;
    }

    /* renamed from: t */
    public String mo19929t() {
        return this.f22732y;
    }

    /* renamed from: t */
    public void mo19930t(String str) {
        this.f22693F = str;
    }

    /* renamed from: u */
    public String mo19931u() {
        return this.f22733z;
    }

    /* renamed from: u */
    public void mo19932u(String str) {
        if (this.f22688A == null) {
            this.f22688A = new ArrayList<>();
        }
        this.f22688A.add(str);
    }

    /* renamed from: v */
    public String mo19933v() {
        return this.f22692E;
    }

    /* renamed from: v */
    public void mo19934v(String str) {
        if (this.f22688A != null && !this.f22688A.isEmpty()) {
            this.f22688A.remove(str);
        }
    }

    /* renamed from: w */
    public String mo19935w() {
        return this.f22693F;
    }

    /* renamed from: w */
    public void mo19936w(String str) {
        this.f22689B = str;
    }

    /* renamed from: x */
    public String mo19937x() {
        return this.f22689B;
    }

    /* renamed from: x */
    public void mo19938x(String str) {
        this.f22690C = str;
    }

    /* renamed from: y */
    public String mo19939y() {
        return this.f22690C;
    }

    /* renamed from: y */
    public void mo19940y(String str) {
        this.f22707T = str;
    }

    /* renamed from: z */
    public ArrayList<C6389b> mo19941z() {
        return this.f22691D;
    }

    /* renamed from: z */
    public void mo19942z(String str) {
        this.f22695H = str;
    }
}
