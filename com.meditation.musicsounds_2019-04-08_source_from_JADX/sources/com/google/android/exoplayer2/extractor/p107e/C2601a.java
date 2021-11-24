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

/* renamed from: com.google.android.exoplayer2.extractor.e.a */
public final class C2601a implements C2639f {

    /* renamed from: a */
    public static final C2652i f8714a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2601a()};
        }
    };

    /* renamed from: b */
    private static final int f8715b = C2511s.m11819e("ID3");

    /* renamed from: c */
    private final long f8716c;

    /* renamed from: d */
    private final C2500k f8717d;

    /* renamed from: e */
    private C2603b f8718e;

    /* renamed from: f */
    private boolean f8719f;

    public C2601a() {
        this(0);
    }

    public C2601a(long j) {
        this.f8716c = j;
        this.f8717d = new C2500k(2786);
    }

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        int a = gVar.mo8964a(this.f8717d.f8094a, 0, 2786);
        if (a == -1) {
            return -1;
        }
        this.f8717d.mo8827c(0);
        this.f8717d.mo8825b(a);
        if (!this.f8719f) {
            this.f8718e.mo9061a(this.f8716c, true);
            this.f8719f = true;
        }
        this.f8718e.mo9062a(this.f8717d);
        return 0;
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8719f = false;
        this.f8718e.mo9060a();
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8718e = new C2603b();
        this.f8718e.mo9063a(hVar, new C2638d(0, 1));
        hVar.mo9117a();
        hVar.mo9118a(new C2658a(-9223372036854775807L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r8.mo8965a();
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if ((r1 - r3) < 8192) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8953a(com.google.android.exoplayer2.extractor.C2650g r8) {
        /*
            r7 = this;
            com.google.android.exoplayer2.c.k r0 = new com.google.android.exoplayer2.c.k
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L_0x0009:
            byte[] r4 = r0.f8094a
            r8.mo8975c(r4, r2, r1)
            r0.mo8827c(r2)
            int r4 = r0.mo8838k()
            int r5 = f8715b
            if (r4 == r5) goto L_0x0058
            r8.mo8965a()
            r8.mo8974c(r3)
            r1 = r3
        L_0x0020:
            r4 = 0
        L_0x0021:
            byte[] r5 = r0.f8094a
            r6 = 5
            r8.mo8975c(r5, r2, r6)
            r0.mo8827c(r2)
            int r5 = r0.mo8835h()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L_0x0042
            r8.mo8965a()
            int r1 = r1 + 1
            int r4 = r1 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r4 < r5) goto L_0x003e
            return r2
        L_0x003e:
            r8.mo8974c(r1)
            goto L_0x0020
        L_0x0042:
            r5 = 1
            int r4 = r4 + r5
            r6 = 4
            if (r4 < r6) goto L_0x0048
            return r5
        L_0x0048:
            byte[] r5 = r0.f8094a
            int r5 = com.google.android.exoplayer2.audio.C2448a.m11489a(r5)
            r6 = -1
            if (r5 != r6) goto L_0x0052
            return r2
        L_0x0052:
            int r5 = r5 + -5
            r8.mo8974c(r5)
            goto L_0x0021
        L_0x0058:
            r4 = 3
            r0.mo8829d(r4)
            int r4 = r0.mo8846s()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.mo8974c(r4)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p107e.C2601a.mo8953a(com.google.android.exoplayer2.extractor.g):boolean");
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
