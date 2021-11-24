package com.google.android.exoplayer2.extractor.p107e;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2657m.C2658a;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2635a;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2636b;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2637c;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;
import com.google.android.exoplayer2.p102c.C2511s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.u */
public final class C2630u implements C2639f {

    /* renamed from: a */
    public static final C2652i f8930a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2630u()};
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final long f8931b = ((long) C2511s.m11819e("AC-3"));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final long f8932c = ((long) C2511s.m11819e("EAC3"));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final long f8933d = ((long) C2511s.m11819e("HEVC"));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f8934e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List<C2509q> f8935f;

    /* renamed from: g */
    private final C2500k f8936g;

    /* renamed from: h */
    private final C2499j f8937h;

    /* renamed from: i */
    private final SparseIntArray f8938i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C2637c f8939j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final SparseArray<C2634v> f8940k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final SparseBooleanArray f8941l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C2651h f8942m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f8943n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f8944o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C2634v f8945p;

    /* renamed from: com.google.android.exoplayer2.extractor.e.u$a */
    private class C2632a implements C2626q {

        /* renamed from: b */
        private final C2499j f8947b = new C2499j(new byte[4]);

        public C2632a() {
        }

        /* renamed from: a */
        public void mo9095a(C2500k kVar) {
            if (kVar.mo8834g() == 0) {
                kVar.mo8829d(7);
                int b = kVar.mo8824b() / 4;
                for (int i = 0; i < b; i++) {
                    kVar.mo8821a(this.f8947b, 4);
                    int c = this.f8947b.mo8814c(16);
                    this.f8947b.mo8812b(3);
                    if (c == 0) {
                        this.f8947b.mo8812b(13);
                    } else {
                        int c2 = this.f8947b.mo8814c(13);
                        C2630u.this.f8940k.put(c2, new C2627r(new C2633b(c2)));
                        C2630u.this.f8943n = C2630u.this.f8943n + 1;
                    }
                }
                if (C2630u.this.f8934e != 2) {
                    C2630u.this.f8940k.remove(0);
                }
            }
        }

        /* renamed from: a */
        public void mo9096a(C2509q qVar, C2651h hVar, C2638d dVar) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.u$b */
    private class C2633b implements C2626q {

        /* renamed from: b */
        private final C2499j f8949b = new C2499j(new byte[5]);

        /* renamed from: c */
        private final SparseArray<C2634v> f8950c = new SparseArray<>();

        /* renamed from: d */
        private final SparseIntArray f8951d = new SparseIntArray();

        /* renamed from: e */
        private final int f8952e;

        public C2633b(int i) {
            this.f8952e = i;
        }

        /* renamed from: a */
        private C2636b m12428a(C2500k kVar, int i) {
            int d = kVar.mo8828d();
            int i2 = i + d;
            String str = null;
            int i3 = -1;
            List list = null;
            while (kVar.mo8828d() < i2) {
                int g = kVar.mo8834g();
                int d2 = kVar.mo8828d() + kVar.mo8834g();
                if (g == 5) {
                    long l = kVar.mo8839l();
                    if (l != C2630u.f8931b) {
                        if (l != C2630u.f8932c) {
                            if (l == C2630u.f8933d) {
                                i3 = 36;
                            }
                            kVar.mo8829d(d2 - kVar.mo8828d());
                        }
                        i3 = 135;
                        kVar.mo8829d(d2 - kVar.mo8828d());
                    }
                } else if (g != 106) {
                    if (g != 122) {
                        if (g == 123) {
                            i3 = 138;
                        } else if (g == 10) {
                            str = kVar.mo8831e(3).trim();
                        } else if (g == 89) {
                            ArrayList arrayList = new ArrayList();
                            while (kVar.mo8828d() < d2) {
                                String trim = kVar.mo8831e(3).trim();
                                int g2 = kVar.mo8834g();
                                byte[] bArr = new byte[4];
                                kVar.mo8823a(bArr, 0, 4);
                                arrayList.add(new C2635a(trim, g2, bArr));
                            }
                            list = arrayList;
                            i3 = 89;
                        }
                        kVar.mo8829d(d2 - kVar.mo8828d());
                    }
                    i3 = 135;
                    kVar.mo8829d(d2 - kVar.mo8828d());
                }
                i3 = 129;
                kVar.mo8829d(d2 - kVar.mo8828d());
            }
            kVar.mo8827c(i2);
            return new C2636b(i3, str, list, Arrays.copyOfRange(kVar.f8094a, d, i2));
        }

        /* renamed from: a */
        public void mo9095a(C2500k kVar) {
            C2509q qVar;
            C2500k kVar2 = kVar;
            if (kVar.mo8834g() == 2) {
                int i = 0;
                if (C2630u.this.f8934e == 1 || C2630u.this.f8934e == 2 || C2630u.this.f8943n == 1) {
                    qVar = (C2509q) C2630u.this.f8935f.get(0);
                } else {
                    qVar = new C2509q(((C2509q) C2630u.this.f8935f.get(0)).mo8875a());
                    C2630u.this.f8935f.add(qVar);
                }
                kVar2.mo8829d(2);
                int h = kVar.mo8835h();
                int i2 = 5;
                kVar2.mo8829d(5);
                kVar2.mo8821a(this.f8949b, 2);
                int i3 = 4;
                this.f8949b.mo8812b(4);
                kVar2.mo8829d(this.f8949b.mo8814c(12));
                if (C2630u.this.f8934e == 2 && C2630u.this.f8945p == null) {
                    C2630u.this.f8945p = C2630u.this.f8939j.mo9066a(21, new C2636b(21, null, null, new byte[0]));
                    C2630u.this.f8945p.mo9092a(qVar, C2630u.this.f8942m, new C2638d(h, 21, 8192));
                }
                this.f8950c.clear();
                this.f8951d.clear();
                int b = kVar.mo8824b();
                while (b > 0) {
                    kVar2.mo8821a(this.f8949b, i2);
                    int c = this.f8949b.mo8814c(8);
                    this.f8949b.mo8812b(3);
                    int c2 = this.f8949b.mo8814c(13);
                    this.f8949b.mo8812b(i3);
                    int c3 = this.f8949b.mo8814c(12);
                    C2636b a = m12428a(kVar2, c3);
                    if (c == 6) {
                        c = a.f8956a;
                    }
                    b -= c3 + 5;
                    int i4 = C2630u.this.f8934e == 2 ? c : c2;
                    if (!C2630u.this.f8941l.get(i4)) {
                        C2634v f = (C2630u.this.f8934e == 2 && c == 21) ? C2630u.this.f8945p : C2630u.this.f8939j.mo9066a(c, a);
                        if (C2630u.this.f8934e != 2 || c2 < this.f8951d.get(i4, 8192)) {
                            this.f8951d.put(i4, c2);
                            this.f8950c.put(i4, f);
                        }
                    }
                    i2 = 5;
                    i3 = 4;
                }
                int size = this.f8951d.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = this.f8951d.keyAt(i5);
                    C2630u.this.f8941l.put(keyAt, true);
                    C2634v vVar = (C2634v) this.f8950c.valueAt(i5);
                    if (vVar != null) {
                        if (vVar != C2630u.this.f8945p) {
                            vVar.mo9092a(qVar, C2630u.this.f8942m, new C2638d(h, keyAt, 8192));
                        }
                        C2630u.this.f8940k.put(this.f8951d.valueAt(i5), vVar);
                    }
                }
                if (C2630u.this.f8934e == 2) {
                    if (!C2630u.this.f8944o) {
                        C2630u.this.f8942m.mo9117a();
                        C2630u.this.f8943n = 0;
                    }
                }
                C2630u.this.f8940k.remove(this.f8952e);
                C2630u uVar = C2630u.this;
                if (C2630u.this.f8934e != 1) {
                    i = C2630u.this.f8943n - 1;
                }
                uVar.f8943n = i;
                if (C2630u.this.f8943n == 0) {
                    C2630u.this.f8942m.mo9117a();
                }
                C2630u.this.f8944o = true;
            }
        }

        /* renamed from: a */
        public void mo9096a(C2509q qVar, C2651h hVar, C2638d dVar) {
        }
    }

    public C2630u() {
        this(0);
    }

    public C2630u(int i) {
        this(1, i);
    }

    public C2630u(int i, int i2) {
        this(i, new C2509q(0), new C2607e(i2));
    }

    public C2630u(int i, C2509q qVar, C2637c cVar) {
        this.f8939j = (C2637c) C2488a.m11664a(cVar);
        this.f8934e = i;
        if (i == 1 || i == 2) {
            this.f8935f = Collections.singletonList(qVar);
        } else {
            this.f8935f = new ArrayList();
            this.f8935f.add(qVar);
        }
        this.f8936g = new C2500k(940);
        this.f8937h = new C2499j(new byte[3]);
        this.f8941l = new SparseBooleanArray();
        this.f8940k = new SparseArray<>();
        this.f8938i = new SparseIntArray();
        m12414e();
    }

    /* renamed from: e */
    private void m12414e() {
        this.f8941l.clear();
        this.f8940k.clear();
        SparseArray a = this.f8939j.mo9065a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f8940k.put(a.keyAt(i), a.valueAt(i));
        }
        this.f8940k.put(0, new C2627r(new C2632a()));
        this.f8945p = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c1, code lost:
        if (r6 != false) goto L_0x007c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo8945a(com.google.android.exoplayer2.extractor.C2650g r10, com.google.android.exoplayer2.extractor.C2656l r11) {
        /*
            r9 = this;
            com.google.android.exoplayer2.c.k r11 = r9.f8936g
            byte[] r11 = r11.f8094a
            com.google.android.exoplayer2.c.k r0 = r9.f8936g
            int r0 = r0.mo8828d()
            int r0 = 940 - r0
            r1 = 188(0xbc, float:2.63E-43)
            r2 = 0
            if (r0 >= r1) goto L_0x0027
            com.google.android.exoplayer2.c.k r0 = r9.f8936g
            int r0 = r0.mo8824b()
            if (r0 <= 0) goto L_0x0022
            com.google.android.exoplayer2.c.k r3 = r9.f8936g
            int r3 = r3.mo8828d()
            java.lang.System.arraycopy(r11, r3, r11, r2, r0)
        L_0x0022:
            com.google.android.exoplayer2.c.k r3 = r9.f8936g
            r3.mo8822a(r11, r0)
        L_0x0027:
            com.google.android.exoplayer2.c.k r0 = r9.f8936g
            int r0 = r0.mo8824b()
            if (r0 >= r1) goto L_0x0046
            com.google.android.exoplayer2.c.k r0 = r9.f8936g
            int r0 = r0.mo8826c()
            int r3 = 940 - r0
            int r3 = r10.mo8964a(r11, r0, r3)
            r4 = -1
            if (r3 != r4) goto L_0x003f
            return r4
        L_0x003f:
            com.google.android.exoplayer2.c.k r4 = r9.f8936g
            int r0 = r0 + r3
            r4.mo8825b(r0)
            goto L_0x0027
        L_0x0046:
            com.google.android.exoplayer2.c.k r10 = r9.f8936g
            int r10 = r10.mo8826c()
            com.google.android.exoplayer2.c.k r0 = r9.f8936g
            int r0 = r0.mo8828d()
        L_0x0052:
            if (r0 >= r10) goto L_0x005d
            byte r3 = r11[r0]
            r4 = 71
            if (r3 == r4) goto L_0x005d
            int r0 = r0 + 1
            goto L_0x0052
        L_0x005d:
            com.google.android.exoplayer2.c.k r11 = r9.f8936g
            r11.mo8827c(r0)
            int r0 = r0 + r1
            if (r0 <= r10) goto L_0x0066
            return r2
        L_0x0066:
            com.google.android.exoplayer2.c.k r11 = r9.f8936g
            r1 = 1
            r11.mo8829d(r1)
            com.google.android.exoplayer2.c.k r11 = r9.f8936g
            com.google.android.exoplayer2.c.j r3 = r9.f8937h
            r4 = 3
            r11.mo8821a(r3, r4)
            com.google.android.exoplayer2.c.j r11 = r9.f8937h
            boolean r11 = r11.mo8816d()
            if (r11 == 0) goto L_0x0082
        L_0x007c:
            com.google.android.exoplayer2.c.k r10 = r9.f8936g
            r10.mo8827c(r0)
            return r2
        L_0x0082:
            com.google.android.exoplayer2.c.j r11 = r9.f8937h
            boolean r11 = r11.mo8816d()
            com.google.android.exoplayer2.c.j r3 = r9.f8937h
            r3.mo8812b(r1)
            com.google.android.exoplayer2.c.j r3 = r9.f8937h
            r4 = 13
            int r3 = r3.mo8814c(r4)
            com.google.android.exoplayer2.c.j r4 = r9.f8937h
            r5 = 2
            r4.mo8812b(r5)
            com.google.android.exoplayer2.c.j r4 = r9.f8937h
            boolean r4 = r4.mo8816d()
            com.google.android.exoplayer2.c.j r6 = r9.f8937h
            boolean r6 = r6.mo8816d()
            com.google.android.exoplayer2.c.j r7 = r9.f8937h
            r8 = 4
            int r7 = r7.mo8814c(r8)
            int r8 = r9.f8934e
            if (r8 == r5) goto L_0x00cb
            android.util.SparseIntArray r5 = r9.f8938i
            int r8 = r7 + -1
            int r5 = r5.get(r3, r8)
            android.util.SparseIntArray r8 = r9.f8938i
            r8.put(r3, r7)
            if (r5 != r7) goto L_0x00c4
            if (r6 == 0) goto L_0x00cb
            goto L_0x007c
        L_0x00c4:
            int r5 = r5 + r1
            int r5 = r5 % 16
            if (r7 == r5) goto L_0x00cb
            r5 = 1
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            if (r4 == 0) goto L_0x00d9
            com.google.android.exoplayer2.c.k r4 = r9.f8936g
            int r4 = r4.mo8834g()
            com.google.android.exoplayer2.c.k r7 = r9.f8936g
            r7.mo8829d(r4)
        L_0x00d9:
            if (r6 == 0) goto L_0x007c
            android.util.SparseArray<com.google.android.exoplayer2.extractor.e.v> r4 = r9.f8940k
            java.lang.Object r3 = r4.get(r3)
            com.google.android.exoplayer2.extractor.e.v r3 = (com.google.android.exoplayer2.extractor.p107e.C2634v) r3
            if (r3 == 0) goto L_0x007c
            if (r5 == 0) goto L_0x00ea
            r3.mo9090a()
        L_0x00ea:
            com.google.android.exoplayer2.c.k r4 = r9.f8936g
            r4.mo8825b(r0)
            com.google.android.exoplayer2.c.k r4 = r9.f8936g
            r3.mo9091a(r4, r11)
            com.google.android.exoplayer2.c.k r11 = r9.f8936g
            int r11 = r11.mo8828d()
            if (r11 > r0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            r1 = 0
        L_0x00fe:
            com.google.android.exoplayer2.p102c.C2488a.m11668b(r1)
            com.google.android.exoplayer2.c.k r11 = r9.f8936g
            r11.mo8825b(r10)
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p107e.C2630u.mo8945a(com.google.android.exoplayer2.extractor.g, com.google.android.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        int size = this.f8935f.size();
        for (int i = 0; i < size; i++) {
            ((C2509q) this.f8935f.get(i)).mo8881d();
        }
        this.f8936g.mo8819a();
        this.f8938i.clear();
        m12414e();
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8942m = hVar;
        hVar.mo9118a(new C2658a(-9223372036854775807L));
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        byte[] bArr = this.f8936g.f8094a;
        gVar.mo8975c(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            gVar.mo8969b(i);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
