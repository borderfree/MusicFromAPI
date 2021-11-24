package com.google.android.exoplayer2.extractor.p107e;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2657m.C2658a;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;

/* renamed from: com.google.android.exoplayer2.extractor.e.p */
public final class C2623p implements C2639f {

    /* renamed from: a */
    public static final C2652i f8903a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2623p()};
        }
    };

    /* renamed from: b */
    private final C2509q f8904b;

    /* renamed from: c */
    private final SparseArray<C2625a> f8905c;

    /* renamed from: d */
    private final C2500k f8906d;

    /* renamed from: e */
    private boolean f8907e;

    /* renamed from: f */
    private boolean f8908f;

    /* renamed from: g */
    private boolean f8909g;

    /* renamed from: h */
    private C2651h f8910h;

    /* renamed from: com.google.android.exoplayer2.extractor.e.p$a */
    private static final class C2625a {

        /* renamed from: a */
        private final C2610h f8911a;

        /* renamed from: b */
        private final C2509q f8912b;

        /* renamed from: c */
        private final C2499j f8913c = new C2499j(new byte[64]);

        /* renamed from: d */
        private boolean f8914d;

        /* renamed from: e */
        private boolean f8915e;

        /* renamed from: f */
        private boolean f8916f;

        /* renamed from: g */
        private int f8917g;

        /* renamed from: h */
        private long f8918h;

        public C2625a(C2610h hVar, C2509q qVar) {
            this.f8911a = hVar;
            this.f8912b = qVar;
        }

        /* renamed from: b */
        private void m12390b() {
            this.f8913c.mo8812b(8);
            this.f8914d = this.f8913c.mo8816d();
            this.f8915e = this.f8913c.mo8816d();
            this.f8913c.mo8812b(6);
            this.f8917g = this.f8913c.mo8814c(8);
        }

        /* renamed from: c */
        private void m12391c() {
            this.f8918h = 0;
            if (this.f8914d) {
                this.f8913c.mo8812b(4);
                long c = ((long) this.f8913c.mo8814c(3)) << 30;
                this.f8913c.mo8812b(1);
                long c2 = c | ((long) (this.f8913c.mo8814c(15) << 15));
                this.f8913c.mo8812b(1);
                long c3 = c2 | ((long) this.f8913c.mo8814c(15));
                this.f8913c.mo8812b(1);
                if (!this.f8916f && this.f8915e) {
                    this.f8913c.mo8812b(4);
                    long c4 = ((long) this.f8913c.mo8814c(3)) << 30;
                    this.f8913c.mo8812b(1);
                    long c5 = c4 | ((long) (this.f8913c.mo8814c(15) << 15));
                    this.f8913c.mo8812b(1);
                    long c6 = c5 | ((long) this.f8913c.mo8814c(15));
                    this.f8913c.mo8812b(1);
                    this.f8912b.mo8878b(c6);
                    this.f8916f = true;
                }
                this.f8918h = this.f8912b.mo8878b(c3);
            }
        }

        /* renamed from: a */
        public void mo9093a() {
            this.f8916f = false;
            this.f8911a.mo9060a();
        }

        /* renamed from: a */
        public void mo9094a(C2500k kVar) {
            kVar.mo8823a(this.f8913c.f8090a, 0, 3);
            this.f8913c.mo8808a(0);
            m12390b();
            kVar.mo8823a(this.f8913c.f8090a, 0, this.f8917g);
            this.f8913c.mo8808a(0);
            m12391c();
            this.f8911a.mo9061a(this.f8918h, true);
            this.f8911a.mo9062a(kVar);
            this.f8911a.mo9064b();
        }
    }

    public C2623p() {
        this(new C2509q(0));
    }

    public C2623p(C2509q qVar) {
        this.f8904b = qVar;
        this.f8906d = new C2500k(4096);
        this.f8905c = new SparseArray<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo8945a(com.google.android.exoplayer2.extractor.C2650g r10, com.google.android.exoplayer2.extractor.C2656l r11) {
        /*
            r9 = this;
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            byte[] r11 = r11.f8094a
            r0 = 1
            r1 = 0
            r2 = 4
            boolean r11 = r10.mo8972b(r11, r1, r2, r0)
            r2 = -1
            if (r11 != 0) goto L_0x000f
            return r2
        L_0x000f:
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            r11.mo8827c(r1)
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            int r11 = r11.mo8841n()
            r3 = 441(0x1b9, float:6.18E-43)
            if (r11 != r3) goto L_0x001f
            return r2
        L_0x001f:
            r2 = 442(0x1ba, float:6.2E-43)
            if (r11 != r2) goto L_0x0041
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            byte[] r11 = r11.f8094a
            r0 = 10
            r10.mo8975c(r11, r1, r0)
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            r0 = 9
            r11.mo8827c(r0)
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            int r11 = r11.mo8834g()
            r11 = r11 & 7
            int r11 = r11 + 14
        L_0x003d:
            r10.mo8969b(r11)
            return r1
        L_0x0041:
            r2 = 443(0x1bb, float:6.21E-43)
            r3 = 2
            r4 = 6
            if (r11 != r2) goto L_0x005b
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            byte[] r11 = r11.f8094a
            r10.mo8975c(r11, r1, r3)
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            r11.mo8827c(r1)
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            int r11 = r11.mo8835h()
            int r11 = r11 + r4
            goto L_0x003d
        L_0x005b:
            r2 = r11 & -256(0xffffffffffffff00, float:NaN)
            int r2 = r2 >> 8
            if (r2 == r0) goto L_0x0065
            r10.mo8969b(r0)
            return r1
        L_0x0065:
            r11 = r11 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.google.android.exoplayer2.extractor.e.p$a> r2 = r9.f8905c
            java.lang.Object r2 = r2.get(r11)
            com.google.android.exoplayer2.extractor.e.p$a r2 = (com.google.android.exoplayer2.extractor.p107e.C2623p.C2625a) r2
            boolean r5 = r9.f8907e
            if (r5 != 0) goto L_0x00db
            if (r2 != 0) goto L_0x00c1
            r5 = 0
            boolean r6 = r9.f8908f
            if (r6 != 0) goto L_0x0086
            r6 = 189(0xbd, float:2.65E-43)
            if (r11 != r6) goto L_0x0086
            com.google.android.exoplayer2.extractor.e.b r5 = new com.google.android.exoplayer2.extractor.e.b
            r5.<init>()
        L_0x0083:
            r9.f8908f = r0
            goto L_0x00a7
        L_0x0086:
            boolean r6 = r9.f8908f
            if (r6 != 0) goto L_0x0096
            r6 = r11 & 224(0xe0, float:3.14E-43)
            r7 = 192(0xc0, float:2.69E-43)
            if (r6 != r7) goto L_0x0096
            com.google.android.exoplayer2.extractor.e.m r5 = new com.google.android.exoplayer2.extractor.e.m
            r5.<init>()
            goto L_0x0083
        L_0x0096:
            boolean r6 = r9.f8909g
            if (r6 != 0) goto L_0x00a7
            r6 = r11 & 240(0xf0, float:3.36E-43)
            r7 = 224(0xe0, float:3.14E-43)
            if (r6 != r7) goto L_0x00a7
            com.google.android.exoplayer2.extractor.e.i r5 = new com.google.android.exoplayer2.extractor.e.i
            r5.<init>()
            r9.f8909g = r0
        L_0x00a7:
            if (r5 == 0) goto L_0x00c1
            com.google.android.exoplayer2.extractor.e.v$d r2 = new com.google.android.exoplayer2.extractor.e.v$d
            r6 = 256(0x100, float:3.59E-43)
            r2.<init>(r11, r6)
            com.google.android.exoplayer2.extractor.h r6 = r9.f8910h
            r5.mo9063a(r6, r2)
            com.google.android.exoplayer2.extractor.e.p$a r2 = new com.google.android.exoplayer2.extractor.e.p$a
            com.google.android.exoplayer2.c.q r6 = r9.f8904b
            r2.<init>(r5, r6)
            android.util.SparseArray<com.google.android.exoplayer2.extractor.e.p$a> r5 = r9.f8905c
            r5.put(r11, r2)
        L_0x00c1:
            boolean r11 = r9.f8908f
            if (r11 == 0) goto L_0x00c9
            boolean r11 = r9.f8909g
            if (r11 != 0) goto L_0x00d4
        L_0x00c9:
            long r5 = r10.mo8973c()
            r7 = 1048576(0x100000, double:5.180654E-318)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x00db
        L_0x00d4:
            r9.f8907e = r0
            com.google.android.exoplayer2.extractor.h r11 = r9.f8910h
            r11.mo9117a()
        L_0x00db:
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            byte[] r11 = r11.f8094a
            r10.mo8975c(r11, r1, r3)
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            r11.mo8827c(r1)
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            int r11 = r11.mo8835h()
            int r11 = r11 + r4
            if (r2 != 0) goto L_0x00f4
            r10.mo8969b(r11)
            goto L_0x0115
        L_0x00f4:
            com.google.android.exoplayer2.c.k r0 = r9.f8906d
            r0.mo8820a(r11)
            com.google.android.exoplayer2.c.k r0 = r9.f8906d
            byte[] r0 = r0.f8094a
            r10.mo8970b(r0, r1, r11)
            com.google.android.exoplayer2.c.k r10 = r9.f8906d
            r10.mo8827c(r4)
            com.google.android.exoplayer2.c.k r10 = r9.f8906d
            r2.mo9094a(r10)
            com.google.android.exoplayer2.c.k r10 = r9.f8906d
            com.google.android.exoplayer2.c.k r11 = r9.f8906d
            int r11 = r11.mo8830e()
            r10.mo8825b(r11)
        L_0x0115:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p107e.C2623p.mo8945a(com.google.android.exoplayer2.extractor.g, com.google.android.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8904b.mo8881d();
        for (int i = 0; i < this.f8905c.size(); i++) {
            ((C2625a) this.f8905c.valueAt(i)).mo9093a();
        }
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8910h = hVar;
        hVar.mo9118a(new C2658a(-9223372036854775807L));
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        byte[] bArr = new byte[14];
        boolean z = false;
        gVar.mo8975c(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        gVar.mo8974c(bArr[13] & 7);
        gVar.mo8975c(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
