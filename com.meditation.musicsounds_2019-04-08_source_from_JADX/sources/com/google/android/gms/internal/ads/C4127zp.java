package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zp */
final class C4127zp implements acd {

    /* renamed from: a */
    private final C4124zm f15190a;

    /* renamed from: b */
    private int f15191b;

    /* renamed from: c */
    private int f15192c;

    /* renamed from: d */
    private int f15193d = 0;

    private C4127zp(C4124zm zmVar) {
        this.f15190a = (C4124zm) aak.m15383a(zmVar, "input");
        this.f15190a.f15179c = this;
    }

    /* renamed from: a */
    public static C4127zp m20493a(C4124zm zmVar) {
        return zmVar.f15179c != null ? zmVar.f15179c : new C4127zp(zmVar);
    }

    /* renamed from: a */
    private final Object m20494a(zzbes zzbes, Class<?> cls, C4135zx zxVar) {
        switch (C4128zq.f15194a[zzbes.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo11623k());
            case 2:
                return mo11628n();
            case 3:
                return Double.valueOf(mo11608d());
            case 4:
                return Integer.valueOf(mo11632p());
            case 5:
                return Integer.valueOf(mo11620j());
            case 6:
                return Long.valueOf(mo11618i());
            case 7:
                return Float.valueOf(mo11610e());
            case 8:
                return Integer.valueOf(mo11616h());
            case 9:
                return Long.valueOf(mo11614g());
            case 10:
                m20495a(2);
                return m20498c(aby.m15554a().mo11567a(cls), zxVar);
            case 11:
                return Integer.valueOf(mo11634q());
            case 12:
                return Long.valueOf(mo11636r());
            case 13:
                return Integer.valueOf(mo11637s());
            case 14:
                return Long.valueOf(mo11638t());
            case 15:
                return mo11626m();
            case 16:
                return Integer.valueOf(mo11630o());
            case 17:
                return Long.valueOf(mo11612f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: a */
    private final void m20495a(int i) {
        if ((this.f15191b & 7) != i) {
            throw zzbbu.zzadq();
        }
    }

    /* renamed from: a */
    private final void m20496a(List<String> list, boolean z) {
        int a;
        int a2;
        if ((this.f15191b & 7) != 2) {
            throw zzbbu.zzadq();
        } else if (!(list instanceof aav) || z) {
            do {
                list.add(z ? mo11626m() : mo11624l());
                if (!this.f15190a.mo13869t()) {
                    a = this.f15190a.mo13845a();
                } else {
                    return;
                }
            } while (a == this.f15191b);
            this.f15193d = a;
        } else {
            aav aav = (aav) list;
            do {
                aav.mo11519a(mo11628n());
                if (!this.f15190a.mo13869t()) {
                    a2 = this.f15190a.mo13845a();
                } else {
                    return;
                }
            } while (a2 == this.f15191b);
            this.f15193d = a2;
        }
    }

    /* renamed from: b */
    private static void m20497b(int i) {
        if ((i & 7) != 0) {
            throw zzbbu.zzadr();
        }
    }

    /* renamed from: c */
    private final <T> T m20498c(ace<T> ace, C4135zx zxVar) {
        int m = this.f15190a.mo13862m();
        if (this.f15190a.f15177a < this.f15190a.f15178b) {
            int c = this.f15190a.mo13850c(m);
            T a = ace.mo11556a();
            this.f15190a.f15177a++;
            ace.mo11557a(a, this, zxVar);
            ace.mo11563c(a);
            this.f15190a.mo13846a(0);
            this.f15190a.f15177a--;
            this.f15190a.mo13852d(c);
            return a;
        }
        throw new zzbbu("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: c */
    private static void m20499c(int i) {
        if ((i & 3) != 0) {
            throw zzbbu.zzadr();
        }
    }

    /* renamed from: d */
    private final <T> T m20500d(ace<T> ace, C4135zx zxVar) {
        int i = this.f15192c;
        this.f15192c = ((this.f15191b >>> 3) << 3) | 4;
        try {
            T a = ace.mo11556a();
            ace.mo11557a(a, this, zxVar);
            ace.mo11563c(a);
            if (this.f15191b == this.f15192c) {
                return a;
            }
            throw zzbbu.zzadr();
        } finally {
            this.f15192c = i;
        }
    }

    /* renamed from: d */
    private final void m20501d(int i) {
        if (this.f15190a.mo13870u() != i) {
            throw zzbbu.zzadl();
        }
    }

    /* renamed from: a */
    public final int mo11597a() {
        if (this.f15193d != 0) {
            this.f15191b = this.f15193d;
            this.f15193d = 0;
        } else {
            this.f15191b = this.f15190a.mo13845a();
        }
        if (this.f15191b == 0 || this.f15191b == this.f15192c) {
            return Integer.MAX_VALUE;
        }
        return this.f15191b >>> 3;
    }

    /* renamed from: a */
    public final <T> T mo11598a(ace<T> ace, C4135zx zxVar) {
        m20495a(2);
        return m20498c(ace, zxVar);
    }

    /* renamed from: a */
    public final void mo11599a(List<Double> list) {
        int a;
        int a2;
        if (list instanceof C4131zt) {
            C4131zt ztVar = (C4131zt) list;
            switch (this.f15191b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f15190a.mo13862m();
                    m20497b(m);
                    int u = this.f15190a.mo13870u() + m;
                    do {
                        ztVar.mo13871a(this.f15190a.mo13847b());
                    } while (this.f15190a.mo13870u() < u);
                    return;
                default:
                    throw zzbbu.zzadq();
            }
            do {
                ztVar.mo13871a(this.f15190a.mo13847b());
                if (!this.f15190a.mo13869t()) {
                    a2 = this.f15190a.mo13845a();
                } else {
                    return;
                }
            } while (a2 == this.f15191b);
            this.f15193d = a2;
            return;
        }
        switch (this.f15191b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f15190a.mo13862m();
                m20497b(m2);
                int u2 = this.f15190a.mo13870u() + m2;
                do {
                    list.add(Double.valueOf(this.f15190a.mo13847b()));
                } while (this.f15190a.mo13870u() < u2);
                return;
            default:
                throw zzbbu.zzadq();
        }
        do {
            list.add(Double.valueOf(this.f15190a.mo13847b()));
            if (!this.f15190a.mo13869t()) {
                a = this.f15190a.mo13845a();
            } else {
                return;
            }
        } while (a == this.f15191b);
        this.f15193d = a;
    }

    /* renamed from: a */
    public final <T> void mo11600a(List<T> list, ace<T> ace, C4135zx zxVar) {
        int a;
        if ((this.f15191b & 7) == 2) {
            int i = this.f15191b;
            do {
                list.add(m20498c(ace, zxVar));
                if (!this.f15190a.mo13869t() && this.f15193d == 0) {
                    a = this.f15190a.mo13845a();
                } else {
                    return;
                }
            } while (a == i);
            this.f15193d = a;
            return;
        }
        throw zzbbu.zzadq();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (mo11607c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.ads.zzbbu("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo11601a(java.util.Map<K, V> r6, com.google.android.gms.internal.ads.abf<K, V> r7, com.google.android.gms.internal.ads.C4135zx r8) {
        /*
            r5 = this;
            r0 = 2
            r5.m20495a(r0)
            com.google.android.gms.internal.ads.zm r0 = r5.f15190a
            int r0 = r0.mo13862m()
            com.google.android.gms.internal.ads.zm r1 = r5.f15190a
            int r0 = r1.mo13850c(r0)
            K r1 = r7.f11391b
            V r2 = r7.f11393d
        L_0x0014:
            int r3 = r5.mo11597a()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.ads.zm r4 = r5.f15190a     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.mo13869t()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo11607c()     // Catch:{ zzbbv -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.ads.zzbes r3 = r7.f11392c     // Catch:{ zzbbv -> 0x004f }
            V r4 = r7.f11393d     // Catch:{ zzbbv -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ zzbbv -> 0x004f }
            java.lang.Object r3 = r5.m20494a(r3, r4, r8)     // Catch:{ zzbbv -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.ads.zzbes r3 = r7.f11390a     // Catch:{ zzbbv -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.m20494a(r3, r4, r4)     // Catch:{ zzbbv -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.ads.zzbbu r3 = new com.google.android.gms.internal.ads.zzbbu     // Catch:{ zzbbv -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ zzbbv -> 0x004f }
            throw r3     // Catch:{ zzbbv -> 0x004f }
        L_0x004f:
            boolean r3 = r5.mo11607c()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.ads.zzbbu r6 = new com.google.android.gms.internal.ads.zzbbu     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.ads.zm r6 = r5.f15190a
            r6.mo13852d(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.ads.zm r7 = r5.f15190a
            r7.mo13852d(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4127zp.mo11601a(java.util.Map, com.google.android.gms.internal.ads.abf, com.google.android.gms.internal.ads.zx):void");
    }

    /* renamed from: b */
    public final int mo11602b() {
        return this.f15191b;
    }

    /* renamed from: b */
    public final <T> T mo11603b(ace<T> ace, C4135zx zxVar) {
        m20495a(3);
        return m20500d(ace, zxVar);
    }

    /* renamed from: b */
    public final void mo11604b(List<Float> list) {
        int a;
        int a2;
        if (list instanceof aag) {
            aag aag = (aag) list;
            int i = this.f15191b & 7;
            if (i == 2) {
                int m = this.f15190a.mo13862m();
                m20499c(m);
                int u = this.f15190a.mo13870u() + m;
                do {
                    aag.mo11461a(this.f15190a.mo13849c());
                } while (this.f15190a.mo13870u() < u);
            } else if (i == 5) {
                do {
                    aag.mo11461a(this.f15190a.mo13849c());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 2) {
                int m2 = this.f15190a.mo13862m();
                m20499c(m2);
                int u2 = this.f15190a.mo13870u() + m2;
                do {
                    list.add(Float.valueOf(this.f15190a.mo13849c()));
                } while (this.f15190a.mo13870u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f15190a.mo13849c()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo11605b(List<T> list, ace<T> ace, C4135zx zxVar) {
        int a;
        if ((this.f15191b & 7) == 3) {
            int i = this.f15191b;
            do {
                list.add(m20500d(ace, zxVar));
                if (!this.f15190a.mo13869t() && this.f15193d == 0) {
                    a = this.f15190a.mo13845a();
                } else {
                    return;
                }
            } while (a == i);
            this.f15193d = a;
            return;
        }
        throw zzbbu.zzadq();
    }

    /* renamed from: c */
    public final void mo11606c(List<Long> list) {
        int a;
        int a2;
        if (list instanceof aba) {
            aba aba = (aba) list;
            int i = this.f15191b & 7;
            if (i == 0) {
                do {
                    aba.mo11535a(this.f15190a.mo13851d());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else if (i == 2) {
                int u = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    aba.mo11535a(this.f15190a.mo13851d());
                } while (this.f15190a.mo13870u() < u);
                m20501d(u);
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f15190a.mo13851d()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else if (i2 == 2) {
                int u2 = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    list.add(Long.valueOf(this.f15190a.mo13851d()));
                } while (this.f15190a.mo13870u() < u2);
                m20501d(u2);
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo11607c() {
        if (this.f15190a.mo13869t() || this.f15191b == this.f15192c) {
            return false;
        }
        return this.f15190a.mo13848b(this.f15191b);
    }

    /* renamed from: d */
    public final double mo11608d() {
        m20495a(1);
        return this.f15190a.mo13847b();
    }

    /* renamed from: d */
    public final void mo11609d(List<Long> list) {
        int a;
        int a2;
        if (list instanceof aba) {
            aba aba = (aba) list;
            int i = this.f15191b & 7;
            if (i == 0) {
                do {
                    aba.mo11535a(this.f15190a.mo13853e());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else if (i == 2) {
                int u = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    aba.mo11535a(this.f15190a.mo13853e());
                } while (this.f15190a.mo13870u() < u);
                m20501d(u);
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f15190a.mo13853e()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else if (i2 == 2) {
                int u2 = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    list.add(Long.valueOf(this.f15190a.mo13853e()));
                } while (this.f15190a.mo13870u() < u2);
                m20501d(u2);
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: e */
    public final float mo11610e() {
        m20495a(5);
        return this.f15190a.mo13849c();
    }

    /* renamed from: e */
    public final void mo11611e(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            int i = this.f15191b & 7;
            if (i == 0) {
                do {
                    aaj.mo11495c(this.f15190a.mo13855f());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else if (i == 2) {
                int u = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    aaj.mo11495c(this.f15190a.mo13855f());
                } while (this.f15190a.mo13870u() < u);
                m20501d(u);
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13855f()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else if (i2 == 2) {
                int u2 = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13855f()));
                } while (this.f15190a.mo13870u() < u2);
                m20501d(u2);
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: f */
    public final long mo11612f() {
        m20495a(0);
        return this.f15190a.mo13851d();
    }

    /* renamed from: f */
    public final void mo11613f(List<Long> list) {
        int a;
        int a2;
        if (list instanceof aba) {
            aba aba = (aba) list;
            switch (this.f15191b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f15190a.mo13862m();
                    m20497b(m);
                    int u = this.f15190a.mo13870u() + m;
                    do {
                        aba.mo11535a(this.f15190a.mo13856g());
                    } while (this.f15190a.mo13870u() < u);
                    return;
                default:
                    throw zzbbu.zzadq();
            }
            do {
                aba.mo11535a(this.f15190a.mo13856g());
                if (!this.f15190a.mo13869t()) {
                    a2 = this.f15190a.mo13845a();
                } else {
                    return;
                }
            } while (a2 == this.f15191b);
            this.f15193d = a2;
            return;
        }
        switch (this.f15191b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f15190a.mo13862m();
                m20497b(m2);
                int u2 = this.f15190a.mo13870u() + m2;
                do {
                    list.add(Long.valueOf(this.f15190a.mo13856g()));
                } while (this.f15190a.mo13870u() < u2);
                return;
            default:
                throw zzbbu.zzadq();
        }
        do {
            list.add(Long.valueOf(this.f15190a.mo13856g()));
            if (!this.f15190a.mo13869t()) {
                a = this.f15190a.mo13845a();
            } else {
                return;
            }
        } while (a == this.f15191b);
        this.f15193d = a;
    }

    /* renamed from: g */
    public final long mo11614g() {
        m20495a(0);
        return this.f15190a.mo13853e();
    }

    /* renamed from: g */
    public final void mo11615g(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            int i = this.f15191b & 7;
            if (i == 2) {
                int m = this.f15190a.mo13862m();
                m20499c(m);
                int u = this.f15190a.mo13870u() + m;
                do {
                    aaj.mo11495c(this.f15190a.mo13857h());
                } while (this.f15190a.mo13870u() < u);
            } else if (i == 5) {
                do {
                    aaj.mo11495c(this.f15190a.mo13857h());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 2) {
                int m2 = this.f15190a.mo13862m();
                m20499c(m2);
                int u2 = this.f15190a.mo13870u() + m2;
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13857h()));
                } while (this.f15190a.mo13870u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13857h()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: h */
    public final int mo11616h() {
        m20495a(0);
        return this.f15190a.mo13855f();
    }

    /* renamed from: h */
    public final void mo11617h(List<Boolean> list) {
        int a;
        int a2;
        if (list instanceof C4117zf) {
            C4117zf zfVar = (C4117zf) list;
            int i = this.f15191b & 7;
            if (i == 0) {
                do {
                    zfVar.mo13834a(this.f15190a.mo13858i());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else if (i == 2) {
                int u = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    zfVar.mo13834a(this.f15190a.mo13858i());
                } while (this.f15190a.mo13870u() < u);
                m20501d(u);
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f15190a.mo13858i()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else if (i2 == 2) {
                int u2 = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    list.add(Boolean.valueOf(this.f15190a.mo13858i()));
                } while (this.f15190a.mo13870u() < u2);
                m20501d(u2);
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: i */
    public final long mo11618i() {
        m20495a(1);
        return this.f15190a.mo13856g();
    }

    /* renamed from: i */
    public final void mo11619i(List<String> list) {
        m20496a(list, false);
    }

    /* renamed from: j */
    public final int mo11620j() {
        m20495a(5);
        return this.f15190a.mo13857h();
    }

    /* renamed from: j */
    public final void mo11621j(List<String> list) {
        m20496a(list, true);
    }

    /* renamed from: k */
    public final void mo11622k(List<zzbah> list) {
        int a;
        if ((this.f15191b & 7) == 2) {
            do {
                list.add(mo11628n());
                if (!this.f15190a.mo13869t()) {
                    a = this.f15190a.mo13845a();
                } else {
                    return;
                }
            } while (a == this.f15191b);
            this.f15193d = a;
            return;
        }
        throw zzbbu.zzadq();
    }

    /* renamed from: k */
    public final boolean mo11623k() {
        m20495a(0);
        return this.f15190a.mo13858i();
    }

    /* renamed from: l */
    public final String mo11624l() {
        m20495a(2);
        return this.f15190a.mo13859j();
    }

    /* renamed from: l */
    public final void mo11625l(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            int i = this.f15191b & 7;
            if (i == 0) {
                do {
                    aaj.mo11495c(this.f15190a.mo13862m());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else if (i == 2) {
                int u = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    aaj.mo11495c(this.f15190a.mo13862m());
                } while (this.f15190a.mo13870u() < u);
                m20501d(u);
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13862m()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else if (i2 == 2) {
                int u2 = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13862m()));
                } while (this.f15190a.mo13870u() < u2);
                m20501d(u2);
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: m */
    public final String mo11626m() {
        m20495a(2);
        return this.f15190a.mo13860k();
    }

    /* renamed from: m */
    public final void mo11627m(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            int i = this.f15191b & 7;
            if (i == 0) {
                do {
                    aaj.mo11495c(this.f15190a.mo13863n());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else if (i == 2) {
                int u = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    aaj.mo11495c(this.f15190a.mo13863n());
                } while (this.f15190a.mo13870u() < u);
                m20501d(u);
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13863n()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else if (i2 == 2) {
                int u2 = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13863n()));
                } while (this.f15190a.mo13870u() < u2);
                m20501d(u2);
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: n */
    public final zzbah mo11628n() {
        m20495a(2);
        return this.f15190a.mo13861l();
    }

    /* renamed from: n */
    public final void mo11629n(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            int i = this.f15191b & 7;
            if (i == 2) {
                int m = this.f15190a.mo13862m();
                m20499c(m);
                int u = this.f15190a.mo13870u() + m;
                do {
                    aaj.mo11495c(this.f15190a.mo13864o());
                } while (this.f15190a.mo13870u() < u);
            } else if (i == 5) {
                do {
                    aaj.mo11495c(this.f15190a.mo13864o());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 2) {
                int m2 = this.f15190a.mo13862m();
                m20499c(m2);
                int u2 = this.f15190a.mo13870u() + m2;
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13864o()));
                } while (this.f15190a.mo13870u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13864o()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: o */
    public final int mo11630o() {
        m20495a(0);
        return this.f15190a.mo13862m();
    }

    /* renamed from: o */
    public final void mo11631o(List<Long> list) {
        int a;
        int a2;
        if (list instanceof aba) {
            aba aba = (aba) list;
            switch (this.f15191b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f15190a.mo13862m();
                    m20497b(m);
                    int u = this.f15190a.mo13870u() + m;
                    do {
                        aba.mo11535a(this.f15190a.mo13865p());
                    } while (this.f15190a.mo13870u() < u);
                    return;
                default:
                    throw zzbbu.zzadq();
            }
            do {
                aba.mo11535a(this.f15190a.mo13865p());
                if (!this.f15190a.mo13869t()) {
                    a2 = this.f15190a.mo13845a();
                } else {
                    return;
                }
            } while (a2 == this.f15191b);
            this.f15193d = a2;
            return;
        }
        switch (this.f15191b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f15190a.mo13862m();
                m20497b(m2);
                int u2 = this.f15190a.mo13870u() + m2;
                do {
                    list.add(Long.valueOf(this.f15190a.mo13865p()));
                } while (this.f15190a.mo13870u() < u2);
                return;
            default:
                throw zzbbu.zzadq();
        }
        do {
            list.add(Long.valueOf(this.f15190a.mo13865p()));
            if (!this.f15190a.mo13869t()) {
                a = this.f15190a.mo13845a();
            } else {
                return;
            }
        } while (a == this.f15191b);
        this.f15193d = a;
    }

    /* renamed from: p */
    public final int mo11632p() {
        m20495a(0);
        return this.f15190a.mo13863n();
    }

    /* renamed from: p */
    public final void mo11633p(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof aaj) {
            aaj aaj = (aaj) list;
            int i = this.f15191b & 7;
            if (i == 0) {
                do {
                    aaj.mo11495c(this.f15190a.mo13866q());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else if (i == 2) {
                int u = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    aaj.mo11495c(this.f15190a.mo13866q());
                } while (this.f15190a.mo13870u() < u);
                m20501d(u);
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13866q()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else if (i2 == 2) {
                int u2 = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    list.add(Integer.valueOf(this.f15190a.mo13866q()));
                } while (this.f15190a.mo13870u() < u2);
                m20501d(u2);
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: q */
    public final int mo11634q() {
        m20495a(5);
        return this.f15190a.mo13864o();
    }

    /* renamed from: q */
    public final void mo11635q(List<Long> list) {
        int a;
        int a2;
        if (list instanceof aba) {
            aba aba = (aba) list;
            int i = this.f15191b & 7;
            if (i == 0) {
                do {
                    aba.mo11535a(this.f15190a.mo13867r());
                    if (!this.f15190a.mo13869t()) {
                        a2 = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a2 == this.f15191b);
                this.f15193d = a2;
            } else if (i == 2) {
                int u = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    aba.mo11535a(this.f15190a.mo13867r());
                } while (this.f15190a.mo13870u() < u);
                m20501d(u);
            } else {
                throw zzbbu.zzadq();
            }
        } else {
            int i2 = this.f15191b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f15190a.mo13867r()));
                    if (!this.f15190a.mo13869t()) {
                        a = this.f15190a.mo13845a();
                    } else {
                        return;
                    }
                } while (a == this.f15191b);
                this.f15193d = a;
            } else if (i2 == 2) {
                int u2 = this.f15190a.mo13870u() + this.f15190a.mo13862m();
                do {
                    list.add(Long.valueOf(this.f15190a.mo13867r()));
                } while (this.f15190a.mo13870u() < u2);
                m20501d(u2);
            } else {
                throw zzbbu.zzadq();
            }
        }
    }

    /* renamed from: r */
    public final long mo11636r() {
        m20495a(1);
        return this.f15190a.mo13865p();
    }

    /* renamed from: s */
    public final int mo11637s() {
        m20495a(0);
        return this.f15190a.mo13866q();
    }

    /* renamed from: t */
    public final long mo11638t() {
        m20495a(0);
        return this.f15190a.mo13867r();
    }
}
