package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.et */
final class C4362et implements C4436hg {

    /* renamed from: a */
    private final C4359eq f16080a;

    /* renamed from: b */
    private int f16081b;

    /* renamed from: c */
    private int f16082c;

    /* renamed from: d */
    private int f16083d = 0;

    private C4362et(C4359eq eqVar) {
        this.f16080a = (C4359eq) C4390fo.m21609a(eqVar, "input");
        this.f16080a.f16069c = this;
    }

    /* renamed from: a */
    public static C4362et m21398a(C4359eq eqVar) {
        return eqVar.f16069c != null ? eqVar.f16069c : new C4362et(eqVar);
    }

    /* renamed from: a */
    private final Object m21399a(zzxs zzxs, Class<?> cls, C4371fb fbVar) {
        switch (C4363eu.f16084a[zzxs.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo14390k());
            case 2:
                return mo14395n();
            case 3:
                return Double.valueOf(mo14375d());
            case 4:
                return Integer.valueOf(mo14399p());
            case 5:
                return Integer.valueOf(mo14387j());
            case 6:
                return Long.valueOf(mo14385i());
            case 7:
                return Float.valueOf(mo14377e());
            case 8:
                return Integer.valueOf(mo14383h());
            case 9:
                return Long.valueOf(mo14381g());
            case 10:
                m21400a(2);
                return m21403c(C4433hd.m21780a().mo14585a(cls), fbVar);
            case 11:
                return Integer.valueOf(mo14401q());
            case 12:
                return Long.valueOf(mo14403r());
            case 13:
                return Integer.valueOf(mo14404s());
            case 14:
                return Long.valueOf(mo14405t());
            case 15:
                return mo14393m();
            case 16:
                return Integer.valueOf(mo14397o());
            case 17:
                return Long.valueOf(mo14379f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: a */
    private final void m21400a(int i) {
        if ((this.f16081b & 7) != i) {
            throw zzuv.zzwu();
        }
    }

    /* renamed from: a */
    private final void m21401a(List<String> list, boolean z) {
        int a;
        int a2;
        if ((this.f16081b & 7) != 2) {
            throw zzuv.zzwu();
        } else if (!(list instanceof C4403ga) || z) {
            do {
                list.add(z ? mo14393m() : mo14391l());
                if (!this.f16080a.mo14362t()) {
                    a = this.f16080a.mo14336a();
                } else {
                    return;
                }
            } while (a == this.f16081b);
            this.f16083d = a;
        } else {
            C4403ga gaVar = (C4403ga) list;
            do {
                gaVar.mo14529a(mo14395n());
                if (!this.f16080a.mo14362t()) {
                    a2 = this.f16080a.mo14336a();
                } else {
                    return;
                }
            } while (a2 == this.f16081b);
            this.f16083d = a2;
        }
    }

    /* renamed from: b */
    private static void m21402b(int i) {
        if ((i & 7) != 0) {
            throw zzuv.zzww();
        }
    }

    /* renamed from: c */
    private final <T> T m21403c(C4437hh<T> hhVar, C4371fb fbVar) {
        int m = this.f16080a.mo14355m();
        if (this.f16080a.f16067a < this.f16080a.f16068b) {
            int d = this.f16080a.mo14343d(m);
            T a = hhVar.mo14571a();
            this.f16080a.f16067a++;
            hhVar.mo14572a(a, this, fbVar);
            hhVar.mo14577c(a);
            this.f16080a.mo14338a(0);
            this.f16080a.f16067a--;
            this.f16080a.mo14346e(d);
            return a;
        }
        throw zzuv.zzwv();
    }

    /* renamed from: c */
    private static void m21404c(int i) {
        if ((i & 3) != 0) {
            throw zzuv.zzww();
        }
    }

    /* renamed from: d */
    private final <T> T m21405d(C4437hh<T> hhVar, C4371fb fbVar) {
        int i = this.f16082c;
        this.f16082c = ((this.f16081b >>> 3) << 3) | 4;
        try {
            T a = hhVar.mo14571a();
            hhVar.mo14572a(a, this, fbVar);
            hhVar.mo14577c(a);
            if (this.f16081b == this.f16082c) {
                return a;
            }
            throw zzuv.zzww();
        } finally {
            this.f16082c = i;
        }
    }

    /* renamed from: d */
    private final void m21406d(int i) {
        if (this.f16080a.mo14363u() != i) {
            throw zzuv.zzwq();
        }
    }

    /* renamed from: a */
    public final int mo14364a() {
        if (this.f16083d != 0) {
            this.f16081b = this.f16083d;
            this.f16083d = 0;
        } else {
            this.f16081b = this.f16080a.mo14336a();
        }
        if (this.f16081b == 0 || this.f16081b == this.f16082c) {
            return Integer.MAX_VALUE;
        }
        return this.f16081b >>> 3;
    }

    /* renamed from: a */
    public final <T> T mo14365a(C4437hh<T> hhVar, C4371fb fbVar) {
        m21400a(2);
        return m21403c(hhVar, fbVar);
    }

    /* renamed from: a */
    public final void mo14366a(List<Double> list) {
        int a;
        int a2;
        if (list instanceof C4366ex) {
            C4366ex exVar = (C4366ex) list;
            switch (this.f16081b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f16080a.mo14355m();
                    m21402b(m);
                    int u = this.f16080a.mo14363u() + m;
                    do {
                        exVar.mo14447a(this.f16080a.mo14339b());
                    } while (this.f16080a.mo14363u() < u);
                    return;
                default:
                    throw zzuv.zzwu();
            }
            do {
                exVar.mo14447a(this.f16080a.mo14339b());
                if (!this.f16080a.mo14362t()) {
                    a2 = this.f16080a.mo14336a();
                } else {
                    return;
                }
            } while (a2 == this.f16081b);
            this.f16083d = a2;
            return;
        }
        switch (this.f16081b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f16080a.mo14355m();
                m21402b(m2);
                int u2 = this.f16080a.mo14363u() + m2;
                do {
                    list.add(Double.valueOf(this.f16080a.mo14339b()));
                } while (this.f16080a.mo14363u() < u2);
                return;
            default:
                throw zzuv.zzwu();
        }
        do {
            list.add(Double.valueOf(this.f16080a.mo14339b()));
            if (!this.f16080a.mo14362t()) {
                a = this.f16080a.mo14336a();
            } else {
                return;
            }
        } while (a == this.f16081b);
        this.f16083d = a;
    }

    /* renamed from: a */
    public final <T> void mo14367a(List<T> list, C4437hh<T> hhVar, C4371fb fbVar) {
        int a;
        if ((this.f16081b & 7) == 2) {
            int i = this.f16081b;
            do {
                list.add(m21403c(hhVar, fbVar));
                if (!this.f16080a.mo14362t() && this.f16083d == 0) {
                    a = this.f16080a.mo14336a();
                } else {
                    return;
                }
            } while (a == i);
            this.f16083d = a;
            return;
        }
        throw zzuv.zzwu();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (mo14374c() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        throw new com.google.android.gms.internal.measurement.zzuv("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> void mo14368a(java.util.Map<K, V> r6, com.google.android.gms.internal.measurement.C4413gk<K, V> r7, com.google.android.gms.internal.measurement.C4371fb r8) {
        /*
            r5 = this;
            r0 = 2
            r5.m21400a(r0)
            com.google.android.gms.internal.measurement.eq r0 = r5.f16080a
            int r0 = r0.mo14355m()
            com.google.android.gms.internal.measurement.eq r1 = r5.f16080a
            int r0 = r1.mo14343d(r0)
            K r1 = r7.f16168b
            V r2 = r7.f16170d
        L_0x0014:
            int r3 = r5.mo14364a()     // Catch:{ all -> 0x0067 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r4) goto L_0x005e
            com.google.android.gms.internal.measurement.eq r4 = r5.f16080a     // Catch:{ all -> 0x0067 }
            boolean r4 = r4.mo14362t()     // Catch:{ all -> 0x0067 }
            if (r4 != 0) goto L_0x005e
            switch(r3) {
                case 1: goto L_0x003b;
                case 2: goto L_0x002d;
                default: goto L_0x0028;
            }
        L_0x0028:
            boolean r3 = r5.mo14374c()     // Catch:{ zzuw -> 0x004f }
            goto L_0x0044
        L_0x002d:
            com.google.android.gms.internal.measurement.zzxs r3 = r7.f16169c     // Catch:{ zzuw -> 0x004f }
            V r4 = r7.f16170d     // Catch:{ zzuw -> 0x004f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ zzuw -> 0x004f }
            java.lang.Object r3 = r5.m21399a(r3, r4, r8)     // Catch:{ zzuw -> 0x004f }
            r2 = r3
            goto L_0x0014
        L_0x003b:
            com.google.android.gms.internal.measurement.zzxs r3 = r7.f16167a     // Catch:{ zzuw -> 0x004f }
            r4 = 0
            java.lang.Object r3 = r5.m21399a(r3, r4, r4)     // Catch:{ zzuw -> 0x004f }
            r1 = r3
            goto L_0x0014
        L_0x0044:
            if (r3 == 0) goto L_0x0047
            goto L_0x0014
        L_0x0047:
            com.google.android.gms.internal.measurement.zzuv r3 = new com.google.android.gms.internal.measurement.zzuv     // Catch:{ zzuw -> 0x004f }
            java.lang.String r4 = "Unable to parse map entry."
            r3.<init>(r4)     // Catch:{ zzuw -> 0x004f }
            throw r3     // Catch:{ zzuw -> 0x004f }
        L_0x004f:
            boolean r3 = r5.mo14374c()     // Catch:{ all -> 0x0067 }
            if (r3 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.android.gms.internal.measurement.zzuv r6 = new com.google.android.gms.internal.measurement.zzuv     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            throw r6     // Catch:{ all -> 0x0067 }
        L_0x005e:
            r6.put(r1, r2)     // Catch:{ all -> 0x0067 }
            com.google.android.gms.internal.measurement.eq r6 = r5.f16080a
            r6.mo14346e(r0)
            return
        L_0x0067:
            r6 = move-exception
            com.google.android.gms.internal.measurement.eq r7 = r5.f16080a
            r7.mo14346e(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4362et.mo14368a(java.util.Map, com.google.android.gms.internal.measurement.gk, com.google.android.gms.internal.measurement.fb):void");
    }

    /* renamed from: b */
    public final int mo14369b() {
        return this.f16081b;
    }

    /* renamed from: b */
    public final <T> T mo14370b(C4437hh<T> hhVar, C4371fb fbVar) {
        m21400a(3);
        return m21405d(hhVar, fbVar);
    }

    /* renamed from: b */
    public final void mo14371b(List<Float> list) {
        int a;
        int a2;
        if (list instanceof C4380fj) {
            C4380fj fjVar = (C4380fj) list;
            int i = this.f16081b & 7;
            if (i == 2) {
                int m = this.f16080a.mo14355m();
                m21404c(m);
                int u = this.f16080a.mo14363u() + m;
                do {
                    fjVar.mo14485a(this.f16080a.mo14341c());
                } while (this.f16080a.mo14363u() < u);
            } else if (i == 5) {
                do {
                    fjVar.mo14485a(this.f16080a.mo14341c());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 2) {
                int m2 = this.f16080a.mo14355m();
                m21404c(m2);
                int u2 = this.f16080a.mo14363u() + m2;
                do {
                    list.add(Float.valueOf(this.f16080a.mo14341c()));
                } while (this.f16080a.mo14363u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f16080a.mo14341c()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: b */
    public final <T> void mo14372b(List<T> list, C4437hh<T> hhVar, C4371fb fbVar) {
        int a;
        if ((this.f16081b & 7) == 3) {
            int i = this.f16081b;
            do {
                list.add(m21405d(hhVar, fbVar));
                if (!this.f16080a.mo14362t() && this.f16083d == 0) {
                    a = this.f16080a.mo14336a();
                } else {
                    return;
                }
            } while (a == i);
            this.f16083d = a;
            return;
        }
        throw zzuv.zzwu();
    }

    /* renamed from: c */
    public final void mo14373c(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C4408gf) {
            C4408gf gfVar = (C4408gf) list;
            int i = this.f16081b & 7;
            if (i == 0) {
                do {
                    gfVar.mo14553a(this.f16080a.mo14344d());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else if (i == 2) {
                int u = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    gfVar.mo14553a(this.f16080a.mo14344d());
                } while (this.f16080a.mo14363u() < u);
                m21406d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16080a.mo14344d()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else if (i2 == 2) {
                int u2 = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    list.add(Long.valueOf(this.f16080a.mo14344d()));
                } while (this.f16080a.mo14363u() < u2);
                m21406d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo14374c() {
        if (this.f16080a.mo14362t() || this.f16081b == this.f16082c) {
            return false;
        }
        return this.f16080a.mo14340b(this.f16081b);
    }

    /* renamed from: d */
    public final double mo14375d() {
        m21400a(1);
        return this.f16080a.mo14339b();
    }

    /* renamed from: d */
    public final void mo14376d(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C4408gf) {
            C4408gf gfVar = (C4408gf) list;
            int i = this.f16081b & 7;
            if (i == 0) {
                do {
                    gfVar.mo14553a(this.f16080a.mo14345e());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else if (i == 2) {
                int u = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    gfVar.mo14553a(this.f16080a.mo14345e());
                } while (this.f16080a.mo14363u() < u);
                m21406d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16080a.mo14345e()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else if (i2 == 2) {
                int u2 = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    list.add(Long.valueOf(this.f16080a.mo14345e()));
                } while (this.f16080a.mo14363u() < u2);
                m21406d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: e */
    public final float mo14377e() {
        m21400a(5);
        return this.f16080a.mo14341c();
    }

    /* renamed from: e */
    public final void mo14378e(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            int i = this.f16081b & 7;
            if (i == 0) {
                do {
                    fnVar.mo14511c(this.f16080a.mo14347f());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else if (i == 2) {
                int u = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    fnVar.mo14511c(this.f16080a.mo14347f());
                } while (this.f16080a.mo14363u() < u);
                m21406d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14347f()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else if (i2 == 2) {
                int u2 = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14347f()));
                } while (this.f16080a.mo14363u() < u2);
                m21406d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: f */
    public final long mo14379f() {
        m21400a(0);
        return this.f16080a.mo14344d();
    }

    /* renamed from: f */
    public final void mo14380f(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C4408gf) {
            C4408gf gfVar = (C4408gf) list;
            switch (this.f16081b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f16080a.mo14355m();
                    m21402b(m);
                    int u = this.f16080a.mo14363u() + m;
                    do {
                        gfVar.mo14553a(this.f16080a.mo14349g());
                    } while (this.f16080a.mo14363u() < u);
                    return;
                default:
                    throw zzuv.zzwu();
            }
            do {
                gfVar.mo14553a(this.f16080a.mo14349g());
                if (!this.f16080a.mo14362t()) {
                    a2 = this.f16080a.mo14336a();
                } else {
                    return;
                }
            } while (a2 == this.f16081b);
            this.f16083d = a2;
            return;
        }
        switch (this.f16081b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f16080a.mo14355m();
                m21402b(m2);
                int u2 = this.f16080a.mo14363u() + m2;
                do {
                    list.add(Long.valueOf(this.f16080a.mo14349g()));
                } while (this.f16080a.mo14363u() < u2);
                return;
            default:
                throw zzuv.zzwu();
        }
        do {
            list.add(Long.valueOf(this.f16080a.mo14349g()));
            if (!this.f16080a.mo14362t()) {
                a = this.f16080a.mo14336a();
            } else {
                return;
            }
        } while (a == this.f16081b);
        this.f16083d = a;
    }

    /* renamed from: g */
    public final long mo14381g() {
        m21400a(0);
        return this.f16080a.mo14345e();
    }

    /* renamed from: g */
    public final void mo14382g(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            int i = this.f16081b & 7;
            if (i == 2) {
                int m = this.f16080a.mo14355m();
                m21404c(m);
                int u = this.f16080a.mo14363u() + m;
                do {
                    fnVar.mo14511c(this.f16080a.mo14350h());
                } while (this.f16080a.mo14363u() < u);
            } else if (i == 5) {
                do {
                    fnVar.mo14511c(this.f16080a.mo14350h());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 2) {
                int m2 = this.f16080a.mo14355m();
                m21404c(m2);
                int u2 = this.f16080a.mo14363u() + m2;
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14350h()));
                } while (this.f16080a.mo14363u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14350h()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: h */
    public final int mo14383h() {
        m21400a(0);
        return this.f16080a.mo14347f();
    }

    /* renamed from: h */
    public final void mo14384h(List<Boolean> list) {
        int a;
        int a2;
        if (list instanceof C4349eg) {
            C4349eg egVar = (C4349eg) list;
            int i = this.f16081b & 7;
            if (i == 0) {
                do {
                    egVar.mo14323a(this.f16080a.mo14351i());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else if (i == 2) {
                int u = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    egVar.mo14323a(this.f16080a.mo14351i());
                } while (this.f16080a.mo14363u() < u);
                m21406d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f16080a.mo14351i()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else if (i2 == 2) {
                int u2 = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    list.add(Boolean.valueOf(this.f16080a.mo14351i()));
                } while (this.f16080a.mo14363u() < u2);
                m21406d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: i */
    public final long mo14385i() {
        m21400a(1);
        return this.f16080a.mo14349g();
    }

    /* renamed from: i */
    public final void mo14386i(List<String> list) {
        m21401a(list, false);
    }

    /* renamed from: j */
    public final int mo14387j() {
        m21400a(5);
        return this.f16080a.mo14350h();
    }

    /* renamed from: j */
    public final void mo14388j(List<String> list) {
        m21401a(list, true);
    }

    /* renamed from: k */
    public final void mo14389k(List<zzte> list) {
        int a;
        if ((this.f16081b & 7) == 2) {
            do {
                list.add(mo14395n());
                if (!this.f16080a.mo14362t()) {
                    a = this.f16080a.mo14336a();
                } else {
                    return;
                }
            } while (a == this.f16081b);
            this.f16083d = a;
            return;
        }
        throw zzuv.zzwu();
    }

    /* renamed from: k */
    public final boolean mo14390k() {
        m21400a(0);
        return this.f16080a.mo14351i();
    }

    /* renamed from: l */
    public final String mo14391l() {
        m21400a(2);
        return this.f16080a.mo14352j();
    }

    /* renamed from: l */
    public final void mo14392l(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            int i = this.f16081b & 7;
            if (i == 0) {
                do {
                    fnVar.mo14511c(this.f16080a.mo14355m());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else if (i == 2) {
                int u = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    fnVar.mo14511c(this.f16080a.mo14355m());
                } while (this.f16080a.mo14363u() < u);
                m21406d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14355m()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else if (i2 == 2) {
                int u2 = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14355m()));
                } while (this.f16080a.mo14363u() < u2);
                m21406d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: m */
    public final String mo14393m() {
        m21400a(2);
        return this.f16080a.mo14353k();
    }

    /* renamed from: m */
    public final void mo14394m(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            int i = this.f16081b & 7;
            if (i == 0) {
                do {
                    fnVar.mo14511c(this.f16080a.mo14356n());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else if (i == 2) {
                int u = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    fnVar.mo14511c(this.f16080a.mo14356n());
                } while (this.f16080a.mo14363u() < u);
                m21406d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14356n()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else if (i2 == 2) {
                int u2 = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14356n()));
                } while (this.f16080a.mo14363u() < u2);
                m21406d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: n */
    public final zzte mo14395n() {
        m21400a(2);
        return this.f16080a.mo14354l();
    }

    /* renamed from: n */
    public final void mo14396n(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            int i = this.f16081b & 7;
            if (i == 2) {
                int m = this.f16080a.mo14355m();
                m21404c(m);
                int u = this.f16080a.mo14363u() + m;
                do {
                    fnVar.mo14511c(this.f16080a.mo14357o());
                } while (this.f16080a.mo14363u() < u);
            } else if (i == 5) {
                do {
                    fnVar.mo14511c(this.f16080a.mo14357o());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 2) {
                int m2 = this.f16080a.mo14355m();
                m21404c(m2);
                int u2 = this.f16080a.mo14363u() + m2;
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14357o()));
                } while (this.f16080a.mo14363u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14357o()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: o */
    public final int mo14397o() {
        m21400a(0);
        return this.f16080a.mo14355m();
    }

    /* renamed from: o */
    public final void mo14398o(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C4408gf) {
            C4408gf gfVar = (C4408gf) list;
            switch (this.f16081b & 7) {
                case 1:
                    break;
                case 2:
                    int m = this.f16080a.mo14355m();
                    m21402b(m);
                    int u = this.f16080a.mo14363u() + m;
                    do {
                        gfVar.mo14553a(this.f16080a.mo14358p());
                    } while (this.f16080a.mo14363u() < u);
                    return;
                default:
                    throw zzuv.zzwu();
            }
            do {
                gfVar.mo14553a(this.f16080a.mo14358p());
                if (!this.f16080a.mo14362t()) {
                    a2 = this.f16080a.mo14336a();
                } else {
                    return;
                }
            } while (a2 == this.f16081b);
            this.f16083d = a2;
            return;
        }
        switch (this.f16081b & 7) {
            case 1:
                break;
            case 2:
                int m2 = this.f16080a.mo14355m();
                m21402b(m2);
                int u2 = this.f16080a.mo14363u() + m2;
                do {
                    list.add(Long.valueOf(this.f16080a.mo14358p()));
                } while (this.f16080a.mo14363u() < u2);
                return;
            default:
                throw zzuv.zzwu();
        }
        do {
            list.add(Long.valueOf(this.f16080a.mo14358p()));
            if (!this.f16080a.mo14362t()) {
                a = this.f16080a.mo14336a();
            } else {
                return;
            }
        } while (a == this.f16081b);
        this.f16083d = a;
    }

    /* renamed from: p */
    public final int mo14399p() {
        m21400a(0);
        return this.f16080a.mo14356n();
    }

    /* renamed from: p */
    public final void mo14400p(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C4389fn) {
            C4389fn fnVar = (C4389fn) list;
            int i = this.f16081b & 7;
            if (i == 0) {
                do {
                    fnVar.mo14511c(this.f16080a.mo14359q());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else if (i == 2) {
                int u = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    fnVar.mo14511c(this.f16080a.mo14359q());
                } while (this.f16080a.mo14363u() < u);
                m21406d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14359q()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else if (i2 == 2) {
                int u2 = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    list.add(Integer.valueOf(this.f16080a.mo14359q()));
                } while (this.f16080a.mo14363u() < u2);
                m21406d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: q */
    public final int mo14401q() {
        m21400a(5);
        return this.f16080a.mo14357o();
    }

    /* renamed from: q */
    public final void mo14402q(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C4408gf) {
            C4408gf gfVar = (C4408gf) list;
            int i = this.f16081b & 7;
            if (i == 0) {
                do {
                    gfVar.mo14553a(this.f16080a.mo14360r());
                    if (!this.f16080a.mo14362t()) {
                        a2 = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a2 == this.f16081b);
                this.f16083d = a2;
            } else if (i == 2) {
                int u = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    gfVar.mo14553a(this.f16080a.mo14360r());
                } while (this.f16080a.mo14363u() < u);
                m21406d(u);
            } else {
                throw zzuv.zzwu();
            }
        } else {
            int i2 = this.f16081b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f16080a.mo14360r()));
                    if (!this.f16080a.mo14362t()) {
                        a = this.f16080a.mo14336a();
                    } else {
                        return;
                    }
                } while (a == this.f16081b);
                this.f16083d = a;
            } else if (i2 == 2) {
                int u2 = this.f16080a.mo14363u() + this.f16080a.mo14355m();
                do {
                    list.add(Long.valueOf(this.f16080a.mo14360r()));
                } while (this.f16080a.mo14363u() < u2);
                m21406d(u2);
            } else {
                throw zzuv.zzwu();
            }
        }
    }

    /* renamed from: r */
    public final long mo14403r() {
        m21400a(1);
        return this.f16080a.mo14358p();
    }

    /* renamed from: s */
    public final int mo14404s() {
        m21400a(0);
        return this.f16080a.mo14359q();
    }

    /* renamed from: t */
    public final long mo14405t() {
        m21400a(0);
        return this.f16080a.mo14360r();
    }
}
