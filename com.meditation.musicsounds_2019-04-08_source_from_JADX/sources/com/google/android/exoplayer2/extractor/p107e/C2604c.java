package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m.C2658a;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.e.c */
public final class C2604c implements C2639f {

    /* renamed from: a */
    public static final C2652i f8732a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2604c()};
        }
    };

    /* renamed from: b */
    private static final int f8733b = C2511s.m11819e("ID3");

    /* renamed from: c */
    private final long f8734c;

    /* renamed from: d */
    private final C2500k f8735d;

    /* renamed from: e */
    private C2606d f8736e;

    /* renamed from: f */
    private boolean f8737f;

    public C2604c() {
        this(0);
    }

    public C2604c(long j) {
        this.f8734c = j;
        this.f8735d = new C2500k(200);
    }

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        int a = gVar.mo8964a(this.f8735d.f8094a, 0, 200);
        if (a == -1) {
            return -1;
        }
        this.f8735d.mo8827c(0);
        this.f8735d.mo8825b(a);
        if (!this.f8737f) {
            this.f8736e.mo9061a(this.f8734c, true);
            this.f8737f = true;
        }
        this.f8736e.mo9062a(this.f8735d);
        return 0;
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8737f = false;
        this.f8736e.mo9060a();
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8736e = new C2606d(true);
        this.f8736e.mo9063a(hVar, new C2638d(0, 1));
        hVar.mo9117a();
        hVar.mo9118a(new C2658a(-9223372036854775807L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        r11.mo8965a();
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if ((r1 - r4) < 8192) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004a, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8953a(com.google.android.exoplayer2.extractor.C2650g r11) {
        /*
            r10 = this;
            com.google.android.exoplayer2.c.k r0 = new com.google.android.exoplayer2.c.k
            r1 = 10
            r0.<init>(r1)
            com.google.android.exoplayer2.c.j r2 = new com.google.android.exoplayer2.c.j
            byte[] r3 = r0.f8094a
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L_0x0010:
            byte[] r5 = r0.f8094a
            r11.mo8975c(r5, r3, r1)
            r0.mo8827c(r3)
            int r5 = r0.mo8838k()
            int r6 = f8733b
            if (r5 == r6) goto L_0x0074
            r11.mo8965a()
            r11.mo8974c(r4)
            r1 = r4
        L_0x0027:
            r5 = 0
            r6 = 0
        L_0x0029:
            byte[] r7 = r0.f8094a
            r8 = 2
            r11.mo8975c(r7, r3, r8)
            r0.mo8827c(r3)
            int r7 = r0.mo8835h()
            r8 = 65526(0xfff6, float:9.1821E-41)
            r7 = r7 & r8
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r7 == r8) goto L_0x004f
            r11.mo8965a()
            int r1 = r1 + 1
            int r5 = r1 - r4
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r5 < r6) goto L_0x004b
            return r3
        L_0x004b:
            r11.mo8974c(r1)
            goto L_0x0027
        L_0x004f:
            r7 = 1
            int r5 = r5 + r7
            r8 = 4
            if (r5 < r8) goto L_0x0059
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 <= r9) goto L_0x0059
            return r7
        L_0x0059:
            byte[] r7 = r0.f8094a
            r11.mo8975c(r7, r3, r8)
            r7 = 14
            r2.mo8808a(r7)
            r7 = 13
            int r7 = r2.mo8814c(r7)
            r8 = 6
            if (r7 > r8) goto L_0x006d
            return r3
        L_0x006d:
            int r8 = r7 + -6
            r11.mo8974c(r8)
            int r6 = r6 + r7
            goto L_0x0029
        L_0x0074:
            r5 = 3
            r0.mo8829d(r5)
            int r5 = r0.mo8846s()
            int r6 = r5 + 10
            int r4 = r4 + r6
            r11.mo8974c(r5)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p107e.C2604c.mo8953a(com.google.android.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
