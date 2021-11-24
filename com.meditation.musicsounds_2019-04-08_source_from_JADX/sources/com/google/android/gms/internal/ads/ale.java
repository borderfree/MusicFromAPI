package com.google.android.gms.internal.ads;

public final class ale extends adn<ale> {

    /* renamed from: a */
    public Integer f12288a;

    /* renamed from: b */
    public alh f12289b;

    /* renamed from: c */
    private Integer f12290c;

    /* renamed from: d */
    private alg f12291d;

    /* renamed from: e */
    private alf[] f12292e;

    /* renamed from: f */
    private ali f12293f;

    /* renamed from: g */
    private alr f12294g;

    /* renamed from: h */
    private alq f12295h;

    /* renamed from: i */
    private aln f12296i;

    /* renamed from: j */
    private alo f12297j;

    /* renamed from: k */
    private alx[] f12298k;

    public ale() {
        this.f12288a = null;
        this.f12290c = null;
        this.f12291d = null;
        this.f12289b = null;
        this.f12292e = alf.m16478b();
        this.f12293f = null;
        this.f12294g = null;
        this.f12295h = null;
        this.f12296i = null;
        this.f12297j = null;
        this.f12298k = alx.m16547b();
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.ale mo11511a(com.google.android.gms.internal.ads.adk r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.mo11782a()
            r1 = 0
            switch(r0) {
                case 0: goto L_0x0142;
                case 56: goto L_0x010b;
                case 64: goto L_0x00f7;
                case 74: goto L_0x00e5;
                case 82: goto L_0x00d7;
                case 90: goto L_0x0097;
                case 98: goto L_0x0089;
                case 106: goto L_0x007b;
                case 114: goto L_0x006c;
                case 122: goto L_0x005d;
                case 130: goto L_0x004e;
                case 138: goto L_0x000f;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r0 = super.mo11811a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x000f:
            r0 = 138(0x8a, float:1.93E-43)
            int r0 = com.google.android.gms.internal.ads.adv.m16022a(r7, r0)
            com.google.android.gms.internal.ads.alx[] r2 = r6.f12298k
            if (r2 != 0) goto L_0x001b
            r2 = 0
            goto L_0x001e
        L_0x001b:
            com.google.android.gms.internal.ads.alx[] r2 = r6.f12298k
            int r2 = r2.length
        L_0x001e:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.alx[] r0 = new com.google.android.gms.internal.ads.alx[r0]
            if (r2 == 0) goto L_0x0028
            com.google.android.gms.internal.ads.alx[] r3 = r6.f12298k
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x0028:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x003f
            com.google.android.gms.internal.ads.alx r1 = new com.google.android.gms.internal.ads.alx
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo11784a(r1)
            r7.mo11782a()
            int r2 = r2 + 1
            goto L_0x0028
        L_0x003f:
            com.google.android.gms.internal.ads.alx r1 = new com.google.android.gms.internal.ads.alx
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo11784a(r1)
            r6.f12298k = r0
            goto L_0x0000
        L_0x004e:
            com.google.android.gms.internal.ads.alo r0 = r6.f12297j
            if (r0 != 0) goto L_0x0059
            com.google.android.gms.internal.ads.alo r0 = new com.google.android.gms.internal.ads.alo
            r0.<init>()
            r6.f12297j = r0
        L_0x0059:
            com.google.android.gms.internal.ads.alo r0 = r6.f12297j
            goto L_0x00f2
        L_0x005d:
            com.google.android.gms.internal.ads.aln r0 = r6.f12296i
            if (r0 != 0) goto L_0x0068
            com.google.android.gms.internal.ads.aln r0 = new com.google.android.gms.internal.ads.aln
            r0.<init>()
            r6.f12296i = r0
        L_0x0068:
            com.google.android.gms.internal.ads.aln r0 = r6.f12296i
            goto L_0x00f2
        L_0x006c:
            com.google.android.gms.internal.ads.alq r0 = r6.f12295h
            if (r0 != 0) goto L_0x0077
            com.google.android.gms.internal.ads.alq r0 = new com.google.android.gms.internal.ads.alq
            r0.<init>()
            r6.f12295h = r0
        L_0x0077:
            com.google.android.gms.internal.ads.alq r0 = r6.f12295h
            goto L_0x00f2
        L_0x007b:
            com.google.android.gms.internal.ads.alr r0 = r6.f12294g
            if (r0 != 0) goto L_0x0086
            com.google.android.gms.internal.ads.alr r0 = new com.google.android.gms.internal.ads.alr
            r0.<init>()
            r6.f12294g = r0
        L_0x0086:
            com.google.android.gms.internal.ads.alr r0 = r6.f12294g
            goto L_0x00f2
        L_0x0089:
            com.google.android.gms.internal.ads.ali r0 = r6.f12293f
            if (r0 != 0) goto L_0x0094
            com.google.android.gms.internal.ads.ali r0 = new com.google.android.gms.internal.ads.ali
            r0.<init>()
            r6.f12293f = r0
        L_0x0094:
            com.google.android.gms.internal.ads.ali r0 = r6.f12293f
            goto L_0x00f2
        L_0x0097:
            r0 = 90
            int r0 = com.google.android.gms.internal.ads.adv.m16022a(r7, r0)
            com.google.android.gms.internal.ads.alf[] r2 = r6.f12292e
            if (r2 != 0) goto L_0x00a3
            r2 = 0
            goto L_0x00a6
        L_0x00a3:
            com.google.android.gms.internal.ads.alf[] r2 = r6.f12292e
            int r2 = r2.length
        L_0x00a6:
            int r0 = r0 + r2
            com.google.android.gms.internal.ads.alf[] r0 = new com.google.android.gms.internal.ads.alf[r0]
            if (r2 == 0) goto L_0x00b0
            com.google.android.gms.internal.ads.alf[] r3 = r6.f12292e
            java.lang.System.arraycopy(r3, r1, r0, r1, r2)
        L_0x00b0:
            int r1 = r0.length
            int r1 = r1 + -1
            if (r2 >= r1) goto L_0x00c7
            com.google.android.gms.internal.ads.alf r1 = new com.google.android.gms.internal.ads.alf
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo11784a(r1)
            r7.mo11782a()
            int r2 = r2 + 1
            goto L_0x00b0
        L_0x00c7:
            com.google.android.gms.internal.ads.alf r1 = new com.google.android.gms.internal.ads.alf
            r1.<init>()
            r0[r2] = r1
            r1 = r0[r2]
            r7.mo11784a(r1)
            r6.f12292e = r0
            goto L_0x0000
        L_0x00d7:
            com.google.android.gms.internal.ads.alh r0 = r6.f12289b
            if (r0 != 0) goto L_0x00e2
            com.google.android.gms.internal.ads.alh r0 = new com.google.android.gms.internal.ads.alh
            r0.<init>()
            r6.f12289b = r0
        L_0x00e2:
            com.google.android.gms.internal.ads.alh r0 = r6.f12289b
            goto L_0x00f2
        L_0x00e5:
            com.google.android.gms.internal.ads.alg r0 = r6.f12291d
            if (r0 != 0) goto L_0x00f0
            com.google.android.gms.internal.ads.alg r0 = new com.google.android.gms.internal.ads.alg
            r0.<init>()
            r6.f12291d = r0
        L_0x00f0:
            com.google.android.gms.internal.ads.alg r0 = r6.f12291d
        L_0x00f2:
            r7.mo11784a(r0)
            goto L_0x0000
        L_0x00f7:
            int r1 = r7.mo11799j()
            int r2 = r7.mo11796g()     // Catch:{ IllegalArgumentException -> 0x013a }
            int r2 = com.google.android.gms.internal.ads.ald.m16472a(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            r6.f12290c = r2     // Catch:{ IllegalArgumentException -> 0x013a }
            goto L_0x0000
        L_0x010b:
            int r1 = r7.mo11799j()
            int r2 = r7.mo11796g()     // Catch:{ IllegalArgumentException -> 0x013a }
            if (r2 < 0) goto L_0x0121
            r3 = 9
            if (r2 > r3) goto L_0x0121
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            r6.f12288a = r2     // Catch:{ IllegalArgumentException -> 0x013a }
            goto L_0x0000
        L_0x0121:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x013a }
            r4 = 43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x013a }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x013a }
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            java.lang.String r2 = " is not a valid enum AdInitiater"
            r5.append(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            java.lang.String r2 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x013a }
            r3.<init>(r2)     // Catch:{ IllegalArgumentException -> 0x013a }
            throw r3     // Catch:{ IllegalArgumentException -> 0x013a }
        L_0x013a:
            r7.mo11794e(r1)
            r6.mo11811a(r7, r0)
            goto L_0x0000
        L_0x0142:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ale.mo11511a(com.google.android.gms.internal.ads.adk):com.google.android.gms.internal.ads.ale");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12288a != null) {
            a += adm.m15974b(7, this.f12288a.intValue());
        }
        if (this.f12290c != null) {
            a += adm.m15974b(8, this.f12290c.intValue());
        }
        if (this.f12291d != null) {
            a += adm.m15975b(9, (C3401ads) this.f12291d);
        }
        if (this.f12289b != null) {
            a += adm.m15975b(10, (C3401ads) this.f12289b);
        }
        if (this.f12292e != null && this.f12292e.length > 0) {
            int i = a;
            for (alf alf : this.f12292e) {
                if (alf != null) {
                    i += adm.m15975b(11, (C3401ads) alf);
                }
            }
            a = i;
        }
        if (this.f12293f != null) {
            a += adm.m15975b(12, (C3401ads) this.f12293f);
        }
        if (this.f12294g != null) {
            a += adm.m15975b(13, (C3401ads) this.f12294g);
        }
        if (this.f12295h != null) {
            a += adm.m15975b(14, (C3401ads) this.f12295h);
        }
        if (this.f12296i != null) {
            a += adm.m15975b(15, (C3401ads) this.f12296i);
        }
        if (this.f12297j != null) {
            a += adm.m15975b(16, (C3401ads) this.f12297j);
        }
        if (this.f12298k != null && this.f12298k.length > 0) {
            for (alx alx : this.f12298k) {
                if (alx != null) {
                    a += adm.m15975b(17, (C3401ads) alx);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12288a != null) {
            adm.mo11801a(7, this.f12288a.intValue());
        }
        if (this.f12290c != null) {
            adm.mo11801a(8, this.f12290c.intValue());
        }
        if (this.f12291d != null) {
            adm.mo11803a(9, (C3401ads) this.f12291d);
        }
        if (this.f12289b != null) {
            adm.mo11803a(10, (C3401ads) this.f12289b);
        }
        if (this.f12292e != null && this.f12292e.length > 0) {
            for (alf alf : this.f12292e) {
                if (alf != null) {
                    adm.mo11803a(11, (C3401ads) alf);
                }
            }
        }
        if (this.f12293f != null) {
            adm.mo11803a(12, (C3401ads) this.f12293f);
        }
        if (this.f12294g != null) {
            adm.mo11803a(13, (C3401ads) this.f12294g);
        }
        if (this.f12295h != null) {
            adm.mo11803a(14, (C3401ads) this.f12295h);
        }
        if (this.f12296i != null) {
            adm.mo11803a(15, (C3401ads) this.f12296i);
        }
        if (this.f12297j != null) {
            adm.mo11803a(16, (C3401ads) this.f12297j);
        }
        if (this.f12298k != null && this.f12298k.length > 0) {
            for (alx alx : this.f12298k) {
                if (alx != null) {
                    adm.mo11803a(17, (C3401ads) alx);
                }
            }
        }
        super.mo11512a(adm);
    }
}
