package com.google.android.gms.internal.ads;

public final class adw extends adn<adw> {

    /* renamed from: a */
    public Integer f11581a;

    /* renamed from: b */
    public String f11582b;

    /* renamed from: c */
    public String f11583c;

    /* renamed from: d */
    public adx f11584d;

    /* renamed from: e */
    public aee[] f11585e;

    /* renamed from: f */
    public String f11586f;

    /* renamed from: g */
    public aed f11587g;

    /* renamed from: h */
    public aef f11588h;

    /* renamed from: i */
    public String[] f11589i;

    /* renamed from: j */
    public String[] f11590j;

    /* renamed from: k */
    private Integer f11591k;

    /* renamed from: l */
    private String f11592l;

    /* renamed from: m */
    private Boolean f11593m;

    /* renamed from: n */
    private String[] f11594n;

    /* renamed from: o */
    private String f11595o;

    /* renamed from: p */
    private Boolean f11596p;

    /* renamed from: q */
    private Boolean f11597q;

    /* renamed from: r */
    private byte[] f11598r;

    public adw() {
        this.f11581a = null;
        this.f11591k = null;
        this.f11582b = null;
        this.f11583c = null;
        this.f11592l = null;
        this.f11584d = null;
        this.f11585e = aee.m16051b();
        this.f11586f = null;
        this.f11587g = null;
        this.f11593m = null;
        this.f11594n = adv.f11571c;
        this.f11595o = null;
        this.f11596p = null;
        this.f11597q = null;
        this.f11598r = null;
        this.f11588h = null;
        this.f11589i = adv.f11571c;
        this.f11590j = adv.f11571c;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.adw mo11511a(com.google.android.gms.internal.ads.adk r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.mo11782a()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x01d0;
                case 10: goto L_0x01c8;
                case 18: goto L_0x01c0;
                case 26: goto L_0x01b8;
                case 34: goto L_0x0178;
                case 40: goto L_0x016c;
                case 50: goto L_0x0138;
                case 58: goto L_0x0130;
                case 64: goto L_0x0124;
                case 72: goto L_0x0118;
                case 80: goto L_0x00e1;
                case 88: goto L_0x00b3;
                case 98: goto L_0x00a1;
                case 106: goto L_0x0099;
                case 114: goto L_0x008b;
                case 122: goto L_0x0083;
                case 138: goto L_0x0075;
                case 162: goto L_0x0042;
                case 170: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.mo11811a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000f:
            r0 = 170(0xaa, float:2.38E-43)
            int r0 = com.google.android.gms.internal.ads.adv.m16022a(r7, r0)
            java.lang.String[] r2 = r6.f11590j
            if (r2 != 0) goto L_0x001b
            r2 = 0
            goto L_0x001e
        L_0x001b:
            java.lang.String[] r2 = r6.f11590j
            int r2 = r2.length
        L_0x001e:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x0028
            java.lang.String[] r3 = r6.f11590j
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0028:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x0039
            java.lang.String r1 = r7.mo11793e()
            r0[r2] = r1
            r7.mo11782a()
            int r2 = r2 + 1
            goto L_0x0028
        L_0x0039:
            java.lang.String r1 = r7.mo11793e()
            r0[r2] = r1
            r6.f11590j = r0
            goto L_0x0000
        L_0x0042:
            r0 = 162(0xa2, float:2.27E-43)
            int r0 = com.google.android.gms.internal.ads.adv.m16022a(r7, r0)
            java.lang.String[] r2 = r6.f11589i
            if (r2 != 0) goto L_0x004e
            r2 = 0
            goto L_0x0051
        L_0x004e:
            java.lang.String[] r2 = r6.f11589i
            int r2 = r2.length
        L_0x0051:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x005b
            java.lang.String[] r3 = r6.f11589i
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x005b:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x006c
            java.lang.String r1 = r7.mo11793e()
            r0[r2] = r1
            r7.mo11782a()
            int r2 = r2 + 1
            goto L_0x005b
        L_0x006c:
            java.lang.String r1 = r7.mo11793e()
            r0[r2] = r1
            r6.f11589i = r0
            goto L_0x0000
        L_0x0075:
            com.google.android.gms.internal.ads.aef r0 = r6.f11588h
            if (r0 != 0) goto L_0x0080
            com.google.android.gms.internal.ads.aef r0 = new com.google.android.gms.internal.ads.aef
            r0.<init>()
            r6.f11588h = r0
        L_0x0080:
            com.google.android.gms.internal.ads.aef r0 = r6.f11588h
            goto L_0x00ae
        L_0x0083:
            byte[] r0 = r7.mo11795f()
            r6.f11598r = r0
            goto L_0x0000
        L_0x008b:
            com.google.android.gms.internal.ads.aed r0 = r6.f11587g
            if (r0 != 0) goto L_0x0096
            com.google.android.gms.internal.ads.aed r0 = new com.google.android.gms.internal.ads.aed
            r0.<init>()
            r6.f11587g = r0
        L_0x0096:
            com.google.android.gms.internal.ads.aed r0 = r6.f11587g
            goto L_0x00ae
        L_0x0099:
            java.lang.String r0 = r7.mo11793e()
            r6.f11586f = r0
            goto L_0x0000
        L_0x00a1:
            com.google.android.gms.internal.ads.adx r0 = r6.f11584d
            if (r0 != 0) goto L_0x00ac
            com.google.android.gms.internal.ads.adx r0 = new com.google.android.gms.internal.ads.adx
            r0.<init>()
            r6.f11584d = r0
        L_0x00ac:
            com.google.android.gms.internal.ads.adx r0 = r6.f11584d
        L_0x00ae:
            r7.mo11784a(r0)
            goto L_0x0000
        L_0x00b3:
            int r1 = r7.mo11799j()
            int r2 = r7.mo11789c()     // Catch:{ IllegalArgumentException -> 0x0110 }
            if (r2 < 0) goto L_0x00c8
            r3 = 4
            if (r2 > r3) goto L_0x00c8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r6.f11591k = r2     // Catch:{ IllegalArgumentException -> 0x0110 }
            goto L_0x0000
        L_0x00c8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0110 }
            r4 = 39
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0110 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = " is not a valid enum Verdict"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0110 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0110 }
        L_0x00e1:
            int r1 = r7.mo11799j()
            int r2 = r7.mo11789c()     // Catch:{ IllegalArgumentException -> 0x0110 }
            if (r2 < 0) goto L_0x00f7
            r3 = 9
            if (r2 > r3) goto L_0x00f7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r6.f11581a = r2     // Catch:{ IllegalArgumentException -> 0x0110 }
            goto L_0x0000
        L_0x00f7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0110 }
            r4 = 42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0110 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0110 }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = " is not a valid enum ReportType"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0110 }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x0110 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0110 }
        L_0x0110:
            r7.mo11794e(r1)
            r6.mo11811a(r7, r0)
            goto L_0x0000
        L_0x0118:
            boolean r0 = r7.mo11792d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f11597q = r0
            goto L_0x0000
        L_0x0124:
            boolean r0 = r7.mo11792d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f11596p = r0
            goto L_0x0000
        L_0x0130:
            java.lang.String r0 = r7.mo11793e()
            r6.f11595o = r0
            goto L_0x0000
        L_0x0138:
            r0 = 50
            int r0 = com.google.android.gms.internal.ads.adv.m16022a(r7, r0)
            java.lang.String[] r2 = r6.f11594n
            if (r2 != 0) goto L_0x0144
            r2 = 0
            goto L_0x0147
        L_0x0144:
            java.lang.String[] r2 = r6.f11594n
            int r2 = r2.length
        L_0x0147:
            int r0 = r0 + r2
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r2 == 0) goto L_0x0151
            java.lang.String[] r3 = r6.f11594n
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0151:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x0162
            java.lang.String r1 = r7.mo11793e()
            r0[r2] = r1
            r7.mo11782a()
            int r2 = r2 + 1
            goto L_0x0151
        L_0x0162:
            java.lang.String r1 = r7.mo11793e()
            r0[r2] = r1
            r6.f11594n = r0
            goto L_0x0000
        L_0x016c:
            boolean r0 = r7.mo11792d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.f11593m = r0
            goto L_0x0000
        L_0x0178:
            r0 = 34
            int r0 = com.google.android.gms.internal.ads.adv.m16022a(r7, r0)
            com.google.android.gms.internal.ads.aee[] r2 = r6.f11585e
            if (r2 != 0) goto L_0x0184
            r2 = 0
            goto L_0x0187
        L_0x0184:
            com.google.android.gms.internal.ads.aee[] r2 = r6.f11585e
            int r2 = r2.length
        L_0x0187:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.aee[] r0 = new com.google.android.gms.internal.ads.aee[r0]
            if (r2 == 0) goto L_0x0191
            com.google.android.gms.internal.ads.aee[] r3 = r6.f11585e
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0191:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x01a8
            com.google.android.gms.internal.ads.aee r1 = new com.google.android.gms.internal.ads.aee
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo11784a(r1)
            r7.mo11782a()
            int r2 = r2 + 1
            goto L_0x0191
        L_0x01a8:
            com.google.android.gms.internal.ads.aee r1 = new com.google.android.gms.internal.ads.aee
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo11784a(r1)
            r6.f11585e = r0
            goto L_0x0000
        L_0x01b8:
            java.lang.String r0 = r7.mo11793e()
            r6.f11592l = r0
            goto L_0x0000
        L_0x01c0:
            java.lang.String r0 = r7.mo11793e()
            r6.f11583c = r0
            goto L_0x0000
        L_0x01c8:
            java.lang.String r0 = r7.mo11793e()
            r6.f11582b = r0
            goto L_0x0000
        L_0x01d0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adw.mo11511a(com.google.android.gms.internal.ads.adk):com.google.android.gms.internal.ads.adw");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f11582b != null) {
            a += adm.m15976b(1, this.f11582b);
        }
        if (this.f11583c != null) {
            a += adm.m15976b(2, this.f11583c);
        }
        if (this.f11592l != null) {
            a += adm.m15976b(3, this.f11592l);
        }
        if (this.f11585e != null && this.f11585e.length > 0) {
            int i = a;
            for (aee aee : this.f11585e) {
                if (aee != null) {
                    i += adm.m15975b(4, (C3401ads) aee);
                }
            }
            a = i;
        }
        if (this.f11593m != null) {
            this.f11593m.booleanValue();
            a += adm.m15973b(5) + 1;
        }
        if (this.f11594n != null && this.f11594n.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f11594n) {
                if (str != null) {
                    i3++;
                    i2 += adm.m15969a(str);
                }
            }
            a = a + i2 + (i3 * 1);
        }
        if (this.f11595o != null) {
            a += adm.m15976b(7, this.f11595o);
        }
        if (this.f11596p != null) {
            this.f11596p.booleanValue();
            a += adm.m15973b(8) + 1;
        }
        if (this.f11597q != null) {
            this.f11597q.booleanValue();
            a += adm.m15973b(9) + 1;
        }
        if (this.f11581a != null) {
            a += adm.m15974b(10, this.f11581a.intValue());
        }
        if (this.f11591k != null) {
            a += adm.m15974b(11, this.f11591k.intValue());
        }
        if (this.f11584d != null) {
            a += adm.m15975b(12, (C3401ads) this.f11584d);
        }
        if (this.f11586f != null) {
            a += adm.m15976b(13, this.f11586f);
        }
        if (this.f11587g != null) {
            a += adm.m15975b(14, (C3401ads) this.f11587g);
        }
        if (this.f11598r != null) {
            a += adm.m15977b(15, this.f11598r);
        }
        if (this.f11588h != null) {
            a += adm.m15975b(17, (C3401ads) this.f11588h);
        }
        if (this.f11589i != null && this.f11589i.length > 0) {
            int i4 = 0;
            int i5 = 0;
            for (String str2 : this.f11589i) {
                if (str2 != null) {
                    i5++;
                    i4 += adm.m15969a(str2);
                }
            }
            a = a + i4 + (i5 * 2);
        }
        if (this.f11590j == null || this.f11590j.length <= 0) {
            return a;
        }
        int i6 = 0;
        int i7 = 0;
        for (String str3 : this.f11590j) {
            if (str3 != null) {
                i7++;
                i6 += adm.m15969a(str3);
            }
        }
        return a + i6 + (i7 * 2);
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f11582b != null) {
            adm.mo11804a(1, this.f11582b);
        }
        if (this.f11583c != null) {
            adm.mo11804a(2, this.f11583c);
        }
        if (this.f11592l != null) {
            adm.mo11804a(3, this.f11592l);
        }
        if (this.f11585e != null && this.f11585e.length > 0) {
            for (aee aee : this.f11585e) {
                if (aee != null) {
                    adm.mo11803a(4, (C3401ads) aee);
                }
            }
        }
        if (this.f11593m != null) {
            adm.mo11805a(5, this.f11593m.booleanValue());
        }
        if (this.f11594n != null && this.f11594n.length > 0) {
            for (String str : this.f11594n) {
                if (str != null) {
                    adm.mo11804a(6, str);
                }
            }
        }
        if (this.f11595o != null) {
            adm.mo11804a(7, this.f11595o);
        }
        if (this.f11596p != null) {
            adm.mo11805a(8, this.f11596p.booleanValue());
        }
        if (this.f11597q != null) {
            adm.mo11805a(9, this.f11597q.booleanValue());
        }
        if (this.f11581a != null) {
            adm.mo11801a(10, this.f11581a.intValue());
        }
        if (this.f11591k != null) {
            adm.mo11801a(11, this.f11591k.intValue());
        }
        if (this.f11584d != null) {
            adm.mo11803a(12, (C3401ads) this.f11584d);
        }
        if (this.f11586f != null) {
            adm.mo11804a(13, this.f11586f);
        }
        if (this.f11587g != null) {
            adm.mo11803a(14, (C3401ads) this.f11587g);
        }
        if (this.f11598r != null) {
            adm.mo11806a(15, this.f11598r);
        }
        if (this.f11588h != null) {
            adm.mo11803a(17, (C3401ads) this.f11588h);
        }
        if (this.f11589i != null && this.f11589i.length > 0) {
            for (String str2 : this.f11589i) {
                if (str2 != null) {
                    adm.mo11804a(20, str2);
                }
            }
        }
        if (this.f11590j != null && this.f11590j.length > 0) {
            for (String str3 : this.f11590j) {
                if (str3 != null) {
                    adm.mo11804a(21, str3);
                }
            }
        }
        super.mo11512a(adm);
    }
}
