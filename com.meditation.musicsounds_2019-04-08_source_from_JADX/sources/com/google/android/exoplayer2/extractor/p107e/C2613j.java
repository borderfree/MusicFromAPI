package com.google.android.exoplayer2.extractor.p107e;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2496i.C2497a;
import com.google.android.exoplayer2.p102c.C2496i.C2498b;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2501l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.j */
public final class C2613j implements C2610h {

    /* renamed from: a */
    private final C2628s f8793a;

    /* renamed from: b */
    private final boolean f8794b;

    /* renamed from: c */
    private final boolean f8795c;

    /* renamed from: d */
    private final C2621n f8796d = new C2621n(7, 128);

    /* renamed from: e */
    private final C2621n f8797e = new C2621n(8, 128);

    /* renamed from: f */
    private final C2621n f8798f = new C2621n(6, 128);

    /* renamed from: g */
    private long f8799g;

    /* renamed from: h */
    private final boolean[] f8800h = new boolean[3];

    /* renamed from: i */
    private String f8801i;

    /* renamed from: j */
    private C2659n f8802j;

    /* renamed from: k */
    private C2615a f8803k;

    /* renamed from: l */
    private boolean f8804l;

    /* renamed from: m */
    private long f8805m;

    /* renamed from: n */
    private final C2500k f8806n = new C2500k();

    /* renamed from: com.google.android.exoplayer2.extractor.e.j$a */
    private static final class C2615a {

        /* renamed from: a */
        private final C2659n f8807a;

        /* renamed from: b */
        private final boolean f8808b;

        /* renamed from: c */
        private final boolean f8809c;

        /* renamed from: d */
        private final SparseArray<C2498b> f8810d = new SparseArray<>();

        /* renamed from: e */
        private final SparseArray<C2497a> f8811e = new SparseArray<>();

        /* renamed from: f */
        private final C2501l f8812f = new C2501l(this.f8813g, 0, 0);

        /* renamed from: g */
        private byte[] f8813g = new byte[128];

        /* renamed from: h */
        private int f8814h;

        /* renamed from: i */
        private int f8815i;

        /* renamed from: j */
        private long f8816j;

        /* renamed from: k */
        private boolean f8817k;

        /* renamed from: l */
        private long f8818l;

        /* renamed from: m */
        private C2616a f8819m = new C2616a();

        /* renamed from: n */
        private C2616a f8820n = new C2616a();

        /* renamed from: o */
        private boolean f8821o;

        /* renamed from: p */
        private long f8822p;

        /* renamed from: q */
        private long f8823q;

        /* renamed from: r */
        private boolean f8824r;

        /* renamed from: com.google.android.exoplayer2.extractor.e.j$a$a */
        private static final class C2616a {

            /* renamed from: a */
            private boolean f8825a;

            /* renamed from: b */
            private boolean f8826b;

            /* renamed from: c */
            private C2498b f8827c;

            /* renamed from: d */
            private int f8828d;

            /* renamed from: e */
            private int f8829e;

            /* renamed from: f */
            private int f8830f;

            /* renamed from: g */
            private int f8831g;

            /* renamed from: h */
            private boolean f8832h;

            /* renamed from: i */
            private boolean f8833i;

            /* renamed from: j */
            private boolean f8834j;

            /* renamed from: k */
            private boolean f8835k;

            /* renamed from: l */
            private int f8836l;

            /* renamed from: m */
            private int f8837m;

            /* renamed from: n */
            private int f8838n;

            /* renamed from: o */
            private int f8839o;

            /* renamed from: p */
            private int f8840p;

            private C2616a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean m12337a(C2616a aVar) {
                if (this.f8825a) {
                    if (!aVar.f8825a || this.f8830f != aVar.f8830f || this.f8831g != aVar.f8831g || this.f8832h != aVar.f8832h) {
                        return true;
                    }
                    if (this.f8833i && aVar.f8833i && this.f8834j != aVar.f8834j) {
                        return true;
                    }
                    if (this.f8828d != aVar.f8828d && (this.f8828d == 0 || aVar.f8828d == 0)) {
                        return true;
                    }
                    if (this.f8827c.f8087h == 0 && aVar.f8827c.f8087h == 0 && (this.f8837m != aVar.f8837m || this.f8838n != aVar.f8838n)) {
                        return true;
                    }
                    if ((this.f8827c.f8087h == 1 && aVar.f8827c.f8087h == 1 && (this.f8839o != aVar.f8839o || this.f8840p != aVar.f8840p)) || this.f8835k != aVar.f8835k) {
                        return true;
                    }
                    if (this.f8835k && aVar.f8835k && this.f8836l != aVar.f8836l) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: a */
            public void mo9077a() {
                this.f8826b = false;
                this.f8825a = false;
            }

            /* renamed from: a */
            public void mo9078a(int i) {
                this.f8829e = i;
                this.f8826b = true;
            }

            /* renamed from: a */
            public void mo9079a(C2498b bVar, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, int i5, int i6, int i7, int i8, int i9) {
                this.f8827c = bVar;
                this.f8828d = i;
                this.f8829e = i2;
                this.f8830f = i3;
                this.f8831g = i4;
                this.f8832h = z;
                this.f8833i = z2;
                this.f8834j = z3;
                this.f8835k = z4;
                this.f8836l = i5;
                this.f8837m = i6;
                this.f8838n = i7;
                this.f8839o = i8;
                this.f8840p = i9;
                this.f8825a = true;
                this.f8826b = true;
            }

            /* renamed from: b */
            public boolean mo9080b() {
                return this.f8826b && (this.f8829e == 7 || this.f8829e == 2);
            }
        }

        public C2615a(C2659n nVar, boolean z, boolean z2) {
            this.f8807a = nVar;
            this.f8808b = z;
            this.f8809c = z2;
            mo9076b();
        }

        /* renamed from: a */
        private void m12329a(int i) {
            int i2 = (int) (this.f8816j - this.f8822p);
            int i3 = i;
            this.f8807a.mo9001a(this.f8823q, this.f8824r ? 1 : 0, i2, i3, null);
        }

        /* renamed from: a */
        public void mo9070a(long j, int i) {
            boolean z = false;
            if (this.f8815i == 9 || (this.f8809c && this.f8820n.m12337a(this.f8819m))) {
                if (this.f8821o) {
                    m12329a(i + ((int) (j - this.f8816j)));
                }
                this.f8822p = this.f8816j;
                this.f8823q = this.f8818l;
                this.f8824r = false;
                this.f8821o = true;
            }
            boolean z2 = this.f8824r;
            if (this.f8815i == 5 || (this.f8808b && this.f8815i == 1 && this.f8820n.mo9080b())) {
                z = true;
            }
            this.f8824r = z2 | z;
        }

        /* renamed from: a */
        public void mo9071a(long j, int i, long j2) {
            this.f8815i = i;
            this.f8818l = j2;
            this.f8816j = j;
            if (!this.f8808b || this.f8815i != 1) {
                if (!this.f8809c) {
                    return;
                }
                if (!(this.f8815i == 5 || this.f8815i == 1 || this.f8815i == 2)) {
                    return;
                }
            }
            C2616a aVar = this.f8819m;
            this.f8819m = this.f8820n;
            this.f8820n = aVar;
            this.f8820n.mo9077a();
            this.f8814h = 0;
            this.f8817k = true;
        }

        /* renamed from: a */
        public void mo9072a(C2497a aVar) {
            this.f8811e.append(aVar.f8077a, aVar);
        }

        /* renamed from: a */
        public void mo9073a(C2498b bVar) {
            this.f8810d.append(bVar.f8080a, bVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0104  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x014f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9074a(byte[] r22, int r23, int r24) {
            /*
                r21 = this;
                r0 = r21
                r1 = r23
                boolean r2 = r0.f8817k
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                int r2 = r24 - r1
                byte[] r3 = r0.f8813g
                int r3 = r3.length
                int r4 = r0.f8814h
                int r4 = r4 + r2
                r5 = 2
                if (r3 >= r4) goto L_0x0021
                byte[] r3 = r0.f8813g
                int r4 = r0.f8814h
                int r4 = r4 + r2
                int r4 = r4 * 2
                byte[] r3 = java.util.Arrays.copyOf(r3, r4)
                r0.f8813g = r3
            L_0x0021:
                byte[] r3 = r0.f8813g
                int r4 = r0.f8814h
                r6 = r22
                java.lang.System.arraycopy(r6, r1, r3, r4, r2)
                int r1 = r0.f8814h
                int r1 = r1 + r2
                r0.f8814h = r1
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                byte[] r2 = r0.f8813g
                int r3 = r0.f8814h
                r4 = 0
                r1.mo8855a(r2, r4, r3)
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                r2 = 8
                boolean r1 = r1.mo8858b(r2)
                if (r1 != 0) goto L_0x0044
                return
            L_0x0044:
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                r2 = 1
                r1.mo8854a(r2)
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                int r8 = r1.mo8860c(r5)
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                r3 = 5
                r1.mo8854a(r3)
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                boolean r1 = r1.mo8857b()
                if (r1 != 0) goto L_0x005f
                return
            L_0x005f:
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                r1.mo8859c()
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                boolean r1 = r1.mo8857b()
                if (r1 != 0) goto L_0x006d
                return
            L_0x006d:
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                int r9 = r1.mo8859c()
                boolean r1 = r0.f8809c
                if (r1 != 0) goto L_0x007f
                r0.f8817k = r4
                com.google.android.exoplayer2.extractor.e.j$a$a r1 = r0.f8820n
                r1.mo9078a(r9)
                return
            L_0x007f:
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                boolean r1 = r1.mo8857b()
                if (r1 != 0) goto L_0x0088
                return
            L_0x0088:
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                int r11 = r1.mo8859c()
                android.util.SparseArray<com.google.android.exoplayer2.c.i$a> r1 = r0.f8811e
                int r1 = r1.indexOfKey(r11)
                if (r1 >= 0) goto L_0x0099
                r0.f8817k = r4
                return
            L_0x0099:
                android.util.SparseArray<com.google.android.exoplayer2.c.i$a> r1 = r0.f8811e
                java.lang.Object r1 = r1.get(r11)
                com.google.android.exoplayer2.c.i$a r1 = (com.google.android.exoplayer2.p102c.C2496i.C2497a) r1
                android.util.SparseArray<com.google.android.exoplayer2.c.i$b> r6 = r0.f8810d
                int r7 = r1.f8078b
                java.lang.Object r6 = r6.get(r7)
                r7 = r6
                com.google.android.exoplayer2.c.i$b r7 = (com.google.android.exoplayer2.p102c.C2496i.C2498b) r7
                boolean r6 = r7.f8084e
                if (r6 == 0) goto L_0x00be
                com.google.android.exoplayer2.c.l r6 = r0.f8812f
                boolean r6 = r6.mo8858b(r5)
                if (r6 != 0) goto L_0x00b9
                return
            L_0x00b9:
                com.google.android.exoplayer2.c.l r6 = r0.f8812f
                r6.mo8854a(r5)
            L_0x00be:
                com.google.android.exoplayer2.c.l r5 = r0.f8812f
                int r6 = r7.f8086g
                boolean r5 = r5.mo8858b(r6)
                if (r5 != 0) goto L_0x00c9
                return
            L_0x00c9:
                com.google.android.exoplayer2.c.l r5 = r0.f8812f
                int r6 = r7.f8086g
                int r10 = r5.mo8860c(r6)
                boolean r5 = r7.f8085f
                if (r5 != 0) goto L_0x00fb
                com.google.android.exoplayer2.c.l r5 = r0.f8812f
                boolean r5 = r5.mo8858b(r2)
                if (r5 != 0) goto L_0x00de
                return
            L_0x00de:
                com.google.android.exoplayer2.c.l r5 = r0.f8812f
                boolean r5 = r5.mo8856a()
                if (r5 == 0) goto L_0x00f9
                com.google.android.exoplayer2.c.l r6 = r0.f8812f
                boolean r6 = r6.mo8858b(r2)
                if (r6 != 0) goto L_0x00ef
                return
            L_0x00ef:
                com.google.android.exoplayer2.c.l r6 = r0.f8812f
                boolean r6 = r6.mo8856a()
                r12 = r5
                r14 = r6
                r13 = 1
                goto L_0x00fe
            L_0x00f9:
                r12 = r5
                goto L_0x00fc
            L_0x00fb:
                r12 = 0
            L_0x00fc:
                r13 = 0
                r14 = 0
            L_0x00fe:
                int r5 = r0.f8815i
                if (r5 != r3) goto L_0x0104
                r15 = 1
                goto L_0x0105
            L_0x0104:
                r15 = 0
            L_0x0105:
                if (r15 == 0) goto L_0x0119
                com.google.android.exoplayer2.c.l r3 = r0.f8812f
                boolean r3 = r3.mo8857b()
                if (r3 != 0) goto L_0x0110
                return
            L_0x0110:
                com.google.android.exoplayer2.c.l r3 = r0.f8812f
                int r3 = r3.mo8859c()
                r16 = r3
                goto L_0x011b
            L_0x0119:
                r16 = 0
            L_0x011b:
                int r3 = r7.f8087h
                if (r3 != 0) goto L_0x014f
                com.google.android.exoplayer2.c.l r2 = r0.f8812f
                int r3 = r7.f8088i
                boolean r2 = r2.mo8858b(r3)
                if (r2 != 0) goto L_0x012a
                return
            L_0x012a:
                com.google.android.exoplayer2.c.l r2 = r0.f8812f
                int r3 = r7.f8088i
                int r2 = r2.mo8860c(r3)
                boolean r1 = r1.f8079c
                if (r1 == 0) goto L_0x014c
                if (r12 != 0) goto L_0x014c
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                boolean r1 = r1.mo8857b()
                if (r1 != 0) goto L_0x0141
                return
            L_0x0141:
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                int r1 = r1.mo8861d()
                r18 = r1
                r17 = r2
                goto L_0x018f
            L_0x014c:
                r17 = r2
                goto L_0x018d
            L_0x014f:
                int r3 = r7.f8087h
                if (r3 != r2) goto L_0x018b
                boolean r2 = r7.f8089j
                if (r2 != 0) goto L_0x018b
                com.google.android.exoplayer2.c.l r2 = r0.f8812f
                boolean r2 = r2.mo8857b()
                if (r2 != 0) goto L_0x0160
                return
            L_0x0160:
                com.google.android.exoplayer2.c.l r2 = r0.f8812f
                int r2 = r2.mo8861d()
                boolean r1 = r1.f8079c
                if (r1 == 0) goto L_0x0184
                if (r12 != 0) goto L_0x0184
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                boolean r1 = r1.mo8857b()
                if (r1 != 0) goto L_0x0175
                return
            L_0x0175:
                com.google.android.exoplayer2.c.l r1 = r0.f8812f
                int r1 = r1.mo8861d()
                r20 = r1
                r19 = r2
                r17 = 0
                r18 = 0
                goto L_0x0193
            L_0x0184:
                r19 = r2
                r17 = 0
                r18 = 0
                goto L_0x0191
            L_0x018b:
                r17 = 0
            L_0x018d:
                r18 = 0
            L_0x018f:
                r19 = 0
            L_0x0191:
                r20 = 0
            L_0x0193:
                com.google.android.exoplayer2.extractor.e.j$a$a r6 = r0.f8820n
                r6.mo9079a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r0.f8817k = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p107e.C2613j.C2615a.mo9074a(byte[], int, int):void");
        }

        /* renamed from: a */
        public boolean mo9075a() {
            return this.f8809c;
        }

        /* renamed from: b */
        public void mo9076b() {
            this.f8817k = false;
            this.f8821o = false;
            this.f8820n.mo9077a();
        }
    }

    public C2613j(C2628s sVar, boolean z, boolean z2) {
        this.f8793a = sVar;
        this.f8794b = z;
        this.f8795c = z2;
    }

    /* renamed from: a */
    private void m12321a(long j, int i, int i2, long j2) {
        C2621n nVar;
        int i3 = i2;
        if (!this.f8804l || this.f8803k.mo9075a()) {
            this.f8796d.mo9089b(i3);
            this.f8797e.mo9089b(i3);
            if (!this.f8804l) {
                if (this.f8796d.mo9088b() && this.f8797e.mo9088b()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(this.f8796d.f8886a, this.f8796d.f8887b));
                    arrayList.add(Arrays.copyOf(this.f8797e.f8886a, this.f8797e.f8887b));
                    C2498b a = C2496i.m11699a(this.f8796d.f8886a, 3, this.f8796d.f8887b);
                    C2497a b = C2496i.m11705b(this.f8797e.f8886a, 3, this.f8797e.f8887b);
                    this.f8802j.mo9002a(Format.m11312a(this.f8801i, "video/avc", (String) null, -1, -1, a.f8081b, a.f8082c, -1.0f, (List<byte[]>) arrayList, -1, a.f8083d, (DrmInitData) null));
                    this.f8804l = true;
                    this.f8803k.mo9073a(a);
                    this.f8803k.mo9072a(b);
                    this.f8796d.mo9085a();
                }
            } else if (this.f8796d.mo9088b()) {
                this.f8803k.mo9073a(C2496i.m11699a(this.f8796d.f8886a, 3, this.f8796d.f8887b));
                nVar = this.f8796d;
                nVar.mo9085a();
            } else if (this.f8797e.mo9088b()) {
                this.f8803k.mo9072a(C2496i.m11705b(this.f8797e.f8886a, 3, this.f8797e.f8887b));
            }
            nVar = this.f8797e;
            nVar.mo9085a();
        }
        if (this.f8798f.mo9089b(i2)) {
            this.f8806n.mo8822a(this.f8798f.f8886a, C2496i.m11697a(this.f8798f.f8886a, this.f8798f.f8887b));
            this.f8806n.mo8827c(4);
            this.f8793a.mo9097a(j2, this.f8806n);
        }
        this.f8803k.mo9070a(j, i);
    }

    /* renamed from: a */
    private void m12322a(long j, int i, long j2) {
        if (!this.f8804l || this.f8803k.mo9075a()) {
            this.f8796d.mo9086a(i);
            this.f8797e.mo9086a(i);
        }
        this.f8798f.mo9086a(i);
        this.f8803k.mo9071a(j, i, j2);
    }

    /* renamed from: a */
    private void m12323a(byte[] bArr, int i, int i2) {
        if (!this.f8804l || this.f8803k.mo9075a()) {
            this.f8796d.mo9087a(bArr, i, i2);
            this.f8797e.mo9087a(bArr, i, i2);
        }
        this.f8798f.mo9087a(bArr, i, i2);
        this.f8803k.mo9074a(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo9060a() {
        C2496i.m11702a(this.f8800h);
        this.f8796d.mo9085a();
        this.f8797e.mo9085a();
        this.f8798f.mo9085a();
        this.f8803k.mo9076b();
        this.f8799g = 0;
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        this.f8805m = j;
    }

    /* renamed from: a */
    public void mo9062a(C2500k kVar) {
        int d = kVar.mo8828d();
        int c = kVar.mo8826c();
        byte[] bArr = kVar.f8094a;
        this.f8799g += (long) kVar.mo8824b();
        this.f8802j.mo9003a(kVar, kVar.mo8824b());
        while (true) {
            int a = C2496i.m11698a(bArr, d, c, this.f8800h);
            if (a == c) {
                m12323a(bArr, d, c);
                return;
            }
            int b = C2496i.m11704b(bArr, a);
            int i = a - d;
            if (i > 0) {
                m12323a(bArr, d, a);
            }
            int i2 = c - a;
            long j = this.f8799g - ((long) i2);
            m12321a(j, i2, i < 0 ? -i : 0, this.f8805m);
            m12322a(j, b, this.f8805m);
            d = a + 3;
        }
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        dVar.mo9099a();
        this.f8801i = dVar.mo9101c();
        this.f8802j = hVar.mo9116a(dVar.mo9100b(), 2);
        this.f8803k = new C2615a(this.f8802j, this.f8794b, this.f8795c);
        this.f8793a.mo9098a(hVar, dVar);
    }

    /* renamed from: b */
    public void mo9064b() {
    }
}
