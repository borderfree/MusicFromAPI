package com.seattleclouds.modules.dynamiclist;

import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6610f;

/* renamed from: com.seattleclouds.modules.dynamiclist.a */
public class C5556a {

    /* renamed from: a */
    private String f19767a;

    /* renamed from: b */
    private String f19768b;

    /* renamed from: c */
    private int f19769c;

    /* renamed from: d */
    private int f19770d;

    /* renamed from: e */
    private int f19771e;

    /* renamed from: f */
    private int f19772f;

    /* renamed from: g */
    private int f19773g;

    /* renamed from: h */
    private int f19774h;

    /* renamed from: i */
    private int f19775i;

    /* renamed from: j */
    private int f19776j;

    /* renamed from: k */
    private int f19777k;

    /* renamed from: l */
    private int f19778l;

    /* renamed from: m */
    private int f19779m;

    /* renamed from: n */
    private int f19780n;

    /* renamed from: o */
    private int f19781o;

    /* renamed from: p */
    private String f19782p;

    /* renamed from: q */
    private int f19783q;

    /* renamed from: r */
    private int f19784r;

    /* renamed from: s */
    private String f19785s;

    /* renamed from: t */
    private int f19786t;

    /* renamed from: u */
    private int f19787u;

    /* renamed from: v */
    private SCDynamicStyleAlign f19788v;

    /* renamed from: w */
    private int f19789w;

    /* renamed from: x */
    private int f19790x;

    /* renamed from: y */
    private int f19791y;

    public C5556a() {
        this.f19772f = Integer.MIN_VALUE;
        this.f19773g = Integer.MIN_VALUE;
        this.f19775i = Integer.MIN_VALUE;
        this.f19774h = Integer.MIN_VALUE;
        this.f19780n = Integer.MIN_VALUE;
        this.f19781o = Integer.MIN_VALUE;
        this.f19782p = null;
        this.f19771e = Integer.MIN_VALUE;
        this.f19776j = Integer.MIN_VALUE;
        this.f19777k = Integer.MIN_VALUE;
        this.f19779m = Integer.MIN_VALUE;
        this.f19778l = Integer.MIN_VALUE;
        this.f19783q = Integer.MIN_VALUE;
        this.f19784r = Integer.MIN_VALUE;
        this.f19785s = null;
        this.f19768b = "";
        this.f19788v = SCDynamicStyleAlign.SCDynamicStyleAlignLeft;
        this.f19786t = Integer.MIN_VALUE;
        this.f19787u = Integer.MIN_VALUE;
        this.f19789w = Integer.MIN_VALUE;
        this.f19790x = Integer.MIN_VALUE;
        this.f19791y = Integer.MIN_VALUE;
        this.f19770d = Integer.MIN_VALUE;
        this.f19769c = Integer.MIN_VALUE;
    }

    public C5556a(String str, String str2) {
        this();
        if (str != null) {
            mo17973e(str);
        }
        if (str2 != null) {
            this.f19768b = str2;
        }
    }

    /* renamed from: a */
    public static int m27601a(int i) {
        if (i == Integer.MIN_VALUE || i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public static int m27602a(int i, int i2) {
        return (i == Integer.MIN_VALUE || i == Integer.MAX_VALUE) ? i2 : i;
    }

    /* renamed from: a */
    public static final int m27603a(SCDynamicStyleAlign sCDynamicStyleAlign) {
        if (sCDynamicStyleAlign == SCDynamicStyleAlign.SCDynamicStyleAlignCenter) {
            return 13;
        }
        return sCDynamicStyleAlign == SCDynamicStyleAlign.SCDynamicStyleAlignRight ? 11 : 9;
    }

    /* renamed from: a */
    public static final int m27604a(String str) {
        if (str == null || !str.equalsIgnoreCase("italic")) {
            return (str == null || !str.equalsIgnoreCase("bold")) ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: a */
    public int mo17962a() {
        return this.f19769c;
    }

    /* renamed from: a */
    public void mo17963a(C5556a aVar) {
        if (aVar != null) {
            if (aVar.mo17981m() != Integer.MIN_VALUE) {
                this.f19780n = aVar.mo17981m();
            }
            if (aVar.mo17982n() != Integer.MIN_VALUE) {
                this.f19781o = aVar.mo17982n();
            }
            if (!C6592al.m31909b(aVar.mo17983o())) {
                this.f19782p = aVar.mo17983o();
            }
            if (aVar.mo17970d() != Integer.MIN_VALUE) {
                this.f19772f = aVar.mo17970d();
            }
            if (aVar.mo17972e() != Integer.MIN_VALUE) {
                this.f19773g = aVar.mo17972e();
            }
            if (aVar.mo17974f() != Integer.MIN_VALUE) {
                this.f19774h = aVar.mo17974f();
            }
            if (aVar.mo17975g() != Integer.MIN_VALUE) {
                this.f19775i = aVar.mo17975g();
            }
        }
    }

    /* renamed from: a */
    public void mo17964a(String str, String str2) {
        if (str != null && str2 != null) {
            if (str.equalsIgnoreCase("textLines")) {
                this.f19772f = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("textPaddingLeft")) {
                this.f19773g = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("textPaddingTop")) {
                this.f19774h = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("textPaddingBottom")) {
                this.f19775i = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("textColor")) {
                this.f19780n = C6610f.m31971a(str2, Integer.valueOf(0)).intValue();
                this.f19783q = this.f19780n;
            }
            if (str.equalsIgnoreCase("textSize")) {
                this.f19781o = Integer.parseInt(str2);
                this.f19784r = this.f19781o;
            }
            if (str.equalsIgnoreCase("textStyle")) {
                this.f19782p = str2;
                this.f19785s = this.f19782p;
            }
            if (str.equalsIgnoreCase("textWidth")) {
                this.f19771e = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("detailTextLines")) {
                this.f19776j = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("detailTextPaddingLeft")) {
                this.f19777k = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("detailTextPaddingTop")) {
                this.f19778l = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("detailTextPaddingBottom")) {
                this.f19779m = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("imageHeight")) {
                mo17967b(str2);
            }
            if (str.equalsIgnoreCase("imageWidth")) {
                mo17969c(str2);
            }
            if (str.equalsIgnoreCase("imageAlign")) {
                mo17971d(str2);
            }
            if (str.equalsIgnoreCase("imagePaddingLeft")) {
                this.f19789w = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("imagePaddingTop")) {
                this.f19791y = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("imagePaddingBottom")) {
                this.f19790x = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("height")) {
                this.f19770d = Integer.parseInt(str2);
            }
            if (str.equalsIgnoreCase("backgroundColor")) {
                this.f19769c = C6610f.m31971a(str2, Integer.valueOf(0)).intValue();
            }
        }
    }

    /* renamed from: b */
    public int mo17965b() {
        return this.f19770d;
    }

    /* renamed from: b */
    public void mo17966b(C5556a aVar) {
        if (aVar != null) {
            if (aVar.mo17981m() != Integer.MIN_VALUE) {
                this.f19783q = aVar.mo17981m();
            }
            if (aVar.mo17982n() != Integer.MIN_VALUE) {
                this.f19784r = aVar.mo17982n();
            }
            if (!C6592al.m31909b(aVar.mo17983o())) {
                this.f19785s = aVar.mo17983o();
            }
            if (aVar.mo17976h() != Integer.MIN_VALUE) {
                this.f19776j = aVar.mo17976h();
            }
            if (aVar.mo17977i() != Integer.MIN_VALUE) {
                this.f19777k = aVar.mo17977i();
            }
            if (aVar.mo17978j() != Integer.MIN_VALUE) {
                this.f19778l = aVar.mo17978j();
            }
            if (aVar.mo17979k() != Integer.MIN_VALUE) {
                this.f19779m = aVar.mo17979k();
            }
        }
    }

    /* renamed from: b */
    public void mo17967b(String str) {
        int parseInt = C6592al.m31909b(str) ? Integer.MIN_VALUE : str.equalsIgnoreCase("auto") ? Integer.MAX_VALUE : Integer.parseInt(str);
        this.f19786t = parseInt;
    }

    /* renamed from: c */
    public int mo17968c() {
        return this.f19771e;
    }

    /* renamed from: c */
    public void mo17969c(String str) {
        int parseInt = C6592al.m31909b(str) ? Integer.MIN_VALUE : str.equalsIgnoreCase("auto") ? Integer.MAX_VALUE : Integer.parseInt(str);
        this.f19787u = parseInt;
    }

    /* renamed from: d */
    public int mo17970d() {
        return this.f19772f;
    }

    /* renamed from: d */
    public void mo17971d(String str) {
        SCDynamicStyleAlign sCDynamicStyleAlign;
        if (C6592al.m31909b(str) || str.equalsIgnoreCase("left")) {
            sCDynamicStyleAlign = SCDynamicStyleAlign.SCDynamicStyleAlignLeft;
        } else if (str.equalsIgnoreCase("right")) {
            sCDynamicStyleAlign = SCDynamicStyleAlign.SCDynamicStyleAlignRight;
        } else if (str.equalsIgnoreCase("center")) {
            sCDynamicStyleAlign = SCDynamicStyleAlign.SCDynamicStyleAlignCenter;
        } else {
            return;
        }
        this.f19788v = sCDynamicStyleAlign;
    }

    /* renamed from: e */
    public int mo17972e() {
        return this.f19773g;
    }

    /* renamed from: e */
    public void mo17973e(String str) {
        this.f19767a = str;
    }

    /* renamed from: f */
    public int mo17974f() {
        return this.f19774h;
    }

    /* renamed from: g */
    public int mo17975g() {
        return this.f19775i;
    }

    /* renamed from: h */
    public int mo17976h() {
        return this.f19776j;
    }

    /* renamed from: i */
    public int mo17977i() {
        return this.f19777k;
    }

    /* renamed from: j */
    public int mo17978j() {
        return this.f19778l;
    }

    /* renamed from: k */
    public int mo17979k() {
        return this.f19779m;
    }

    /* renamed from: l */
    public String mo17980l() {
        return this.f19768b;
    }

    /* renamed from: m */
    public int mo17981m() {
        return this.f19780n;
    }

    /* renamed from: n */
    public int mo17982n() {
        return this.f19781o;
    }

    /* renamed from: o */
    public String mo17983o() {
        return this.f19782p;
    }

    /* renamed from: p */
    public int mo17984p() {
        return this.f19783q;
    }

    /* renamed from: q */
    public int mo17985q() {
        return this.f19784r;
    }

    /* renamed from: r */
    public String mo17986r() {
        return this.f19785s;
    }

    /* renamed from: s */
    public int mo17987s() {
        return this.f19786t;
    }

    /* renamed from: t */
    public int mo17988t() {
        return this.f19787u;
    }

    /* renamed from: u */
    public SCDynamicStyleAlign mo17989u() {
        return this.f19788v;
    }

    /* renamed from: v */
    public int mo17990v() {
        return this.f19789w;
    }

    /* renamed from: w */
    public int mo17991w() {
        return this.f19790x;
    }

    /* renamed from: x */
    public int mo17992x() {
        return this.f19791y;
    }
}
