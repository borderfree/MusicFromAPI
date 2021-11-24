package com.google.android.exoplayer2.extractor.p107e;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2501l;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.e.k */
public final class C2617k implements C2610h {

    /* renamed from: a */
    private final C2628s f8841a;

    /* renamed from: b */
    private String f8842b;

    /* renamed from: c */
    private C2659n f8843c;

    /* renamed from: d */
    private C2618a f8844d;

    /* renamed from: e */
    private boolean f8845e;

    /* renamed from: f */
    private final boolean[] f8846f = new boolean[3];

    /* renamed from: g */
    private final C2621n f8847g = new C2621n(32, 128);

    /* renamed from: h */
    private final C2621n f8848h = new C2621n(33, 128);

    /* renamed from: i */
    private final C2621n f8849i = new C2621n(34, 128);

    /* renamed from: j */
    private final C2621n f8850j = new C2621n(39, 128);

    /* renamed from: k */
    private final C2621n f8851k = new C2621n(40, 128);

    /* renamed from: l */
    private long f8852l;

    /* renamed from: m */
    private long f8853m;

    /* renamed from: n */
    private final C2500k f8854n = new C2500k();

    /* renamed from: com.google.android.exoplayer2.extractor.e.k$a */
    private static final class C2618a {

        /* renamed from: a */
        private final C2659n f8855a;

        /* renamed from: b */
        private long f8856b;

        /* renamed from: c */
        private boolean f8857c;

        /* renamed from: d */
        private int f8858d;

        /* renamed from: e */
        private long f8859e;

        /* renamed from: f */
        private boolean f8860f;

        /* renamed from: g */
        private boolean f8861g;

        /* renamed from: h */
        private boolean f8862h;

        /* renamed from: i */
        private boolean f8863i;

        /* renamed from: j */
        private boolean f8864j;

        /* renamed from: k */
        private long f8865k;

        /* renamed from: l */
        private long f8866l;

        /* renamed from: m */
        private boolean f8867m;

        public C2618a(C2659n nVar) {
            this.f8855a = nVar;
        }

        /* renamed from: a */
        private void m12354a(int i) {
            int i2 = (int) (this.f8856b - this.f8865k);
            int i3 = i;
            this.f8855a.mo9001a(this.f8866l, this.f8867m ? 1 : 0, i2, i3, null);
        }

        /* renamed from: a */
        public void mo9081a() {
            this.f8860f = false;
            this.f8861g = false;
            this.f8862h = false;
            this.f8863i = false;
            this.f8864j = false;
        }

        /* renamed from: a */
        public void mo9082a(long j, int i) {
            if (this.f8864j && this.f8861g) {
                this.f8867m = this.f8857c;
                this.f8864j = false;
            } else if (this.f8862h || this.f8861g) {
                if (this.f8863i) {
                    m12354a(i + ((int) (j - this.f8856b)));
                }
                this.f8865k = this.f8856b;
                this.f8866l = this.f8859e;
                this.f8863i = true;
                this.f8867m = this.f8857c;
            }
        }

        /* renamed from: a */
        public void mo9083a(long j, int i, int i2, long j2) {
            this.f8861g = false;
            this.f8862h = false;
            this.f8859e = j2;
            this.f8858d = 0;
            this.f8856b = j;
            boolean z = true;
            if (i2 >= 32) {
                if (!this.f8864j && this.f8863i) {
                    m12354a(i);
                    this.f8863i = false;
                }
                if (i2 <= 34) {
                    this.f8862h = !this.f8864j;
                    this.f8864j = true;
                }
            }
            this.f8857c = i2 >= 16 && i2 <= 21;
            if (!this.f8857c && i2 > 9) {
                z = false;
            }
            this.f8860f = z;
        }

        /* renamed from: a */
        public void mo9084a(byte[] bArr, int i, int i2) {
            if (this.f8860f) {
                int i3 = (i + 2) - this.f8858d;
                if (i3 < i2) {
                    this.f8861g = (bArr[i3] & 128) != 0;
                    this.f8860f = false;
                    return;
                }
                this.f8858d += i2 - i;
            }
        }
    }

    public C2617k(C2628s sVar) {
        this.f8841a = sVar;
    }

    /* renamed from: a */
    private static Format m12343a(String str, C2621n nVar, C2621n nVar2, C2621n nVar3) {
        float f;
        C2621n nVar4 = nVar;
        C2621n nVar5 = nVar2;
        C2621n nVar6 = nVar3;
        byte[] bArr = new byte[(nVar4.f8887b + nVar5.f8887b + nVar6.f8887b)];
        System.arraycopy(nVar4.f8886a, 0, bArr, 0, nVar4.f8887b);
        System.arraycopy(nVar5.f8886a, 0, bArr, nVar4.f8887b, nVar5.f8887b);
        System.arraycopy(nVar6.f8886a, 0, bArr, nVar4.f8887b + nVar5.f8887b, nVar6.f8887b);
        C2501l lVar = new C2501l(nVar5.f8886a, 0, nVar5.f8887b);
        lVar.mo8854a(44);
        int c = lVar.mo8860c(3);
        lVar.mo8854a(1);
        lVar.mo8854a(88);
        lVar.mo8854a(8);
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            if (lVar.mo8856a()) {
                i += 89;
            }
            if (lVar.mo8856a()) {
                i += 8;
            }
        }
        lVar.mo8854a(i);
        if (c > 0) {
            lVar.mo8854a((8 - c) * 2);
        }
        lVar.mo8859c();
        int c2 = lVar.mo8859c();
        if (c2 == 3) {
            lVar.mo8854a(1);
        }
        int c3 = lVar.mo8859c();
        int c4 = lVar.mo8859c();
        if (lVar.mo8856a()) {
            c3 -= ((c2 == 1 || c2 == 2) ? 2 : 1) * (lVar.mo8859c() + lVar.mo8859c());
            c4 -= (c2 == 1 ? 2 : 1) * (lVar.mo8859c() + lVar.mo8859c());
        }
        int i3 = c3;
        int i4 = c4;
        lVar.mo8859c();
        lVar.mo8859c();
        int c5 = lVar.mo8859c();
        for (int i5 = lVar.mo8856a() ? 0 : c; i5 <= c; i5++) {
            lVar.mo8859c();
            lVar.mo8859c();
            lVar.mo8859c();
        }
        lVar.mo8859c();
        lVar.mo8859c();
        lVar.mo8859c();
        lVar.mo8859c();
        lVar.mo8859c();
        lVar.mo8859c();
        if (lVar.mo8856a() && lVar.mo8856a()) {
            m12345a(lVar);
        }
        lVar.mo8854a(2);
        if (lVar.mo8856a()) {
            lVar.mo8854a(8);
            lVar.mo8859c();
            lVar.mo8859c();
            lVar.mo8854a(1);
        }
        m12348b(lVar);
        if (lVar.mo8856a()) {
            for (int i6 = 0; i6 < lVar.mo8859c(); i6++) {
                lVar.mo8854a(c5 + 4 + 1);
            }
        }
        lVar.mo8854a(2);
        float f2 = 1.0f;
        if (lVar.mo8856a() && lVar.mo8856a()) {
            int c6 = lVar.mo8860c(8);
            if (c6 == 255) {
                int c7 = lVar.mo8860c(16);
                int c8 = lVar.mo8860c(16);
                if (!(c7 == 0 || c8 == 0)) {
                    f2 = ((float) c7) / ((float) c8);
                }
                f = f2;
            } else if (c6 < C2496i.f8074b.length) {
                f = C2496i.f8074b[c6];
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected aspect_ratio_idc value: ");
                sb.append(c6);
                Log.w("H265Reader", sb.toString());
            }
            return Format.m11312a(str, "video/hevc", (String) null, -1, -1, i3, i4, -1.0f, Collections.singletonList(bArr), -1, f, (DrmInitData) null);
        }
        f = 1.0f;
        return Format.m11312a(str, "video/hevc", (String) null, -1, -1, i3, i4, -1.0f, Collections.singletonList(bArr), -1, f, (DrmInitData) null);
    }

    /* renamed from: a */
    private void m12344a(long j, int i, int i2, long j2) {
        if (this.f8845e) {
            this.f8844d.mo9083a(j, i, i2, j2);
        } else {
            this.f8847g.mo9086a(i2);
            this.f8848h.mo9086a(i2);
            this.f8849i.mo9086a(i2);
        }
        this.f8850j.mo9086a(i2);
        this.f8851k.mo9086a(i2);
    }

    /* renamed from: a */
    private static void m12345a(C2501l lVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                if (!lVar.mo8856a()) {
                    lVar.mo8859c();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        lVar.mo8861d();
                    }
                    for (int i3 = 0; i3 < min; i3++) {
                        lVar.mo8861d();
                    }
                }
                int i4 = 3;
                if (i != 3) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
    }

    /* renamed from: a */
    private void m12346a(byte[] bArr, int i, int i2) {
        if (this.f8845e) {
            this.f8844d.mo9084a(bArr, i, i2);
        } else {
            this.f8847g.mo9087a(bArr, i, i2);
            this.f8848h.mo9087a(bArr, i, i2);
            this.f8849i.mo9087a(bArr, i, i2);
        }
        this.f8850j.mo9087a(bArr, i, i2);
        this.f8851k.mo9087a(bArr, i, i2);
    }

    /* renamed from: b */
    private void m12347b(long j, int i, int i2, long j2) {
        if (this.f8845e) {
            this.f8844d.mo9082a(j, i);
        } else {
            this.f8847g.mo9089b(i2);
            this.f8848h.mo9089b(i2);
            this.f8849i.mo9089b(i2);
            if (this.f8847g.mo9088b() && this.f8848h.mo9088b() && this.f8849i.mo9088b()) {
                this.f8843c.mo9002a(m12343a(this.f8842b, this.f8847g, this.f8848h, this.f8849i));
                this.f8845e = true;
            }
        }
        if (this.f8850j.mo9089b(i2)) {
            this.f8854n.mo8822a(this.f8850j.f8886a, C2496i.m11697a(this.f8850j.f8886a, this.f8850j.f8887b));
            this.f8854n.mo8829d(5);
            this.f8841a.mo9097a(j2, this.f8854n);
        }
        if (this.f8851k.mo9089b(i2)) {
            this.f8854n.mo8822a(this.f8851k.f8886a, C2496i.m11697a(this.f8851k.f8886a, this.f8851k.f8887b));
            this.f8854n.mo8829d(5);
            this.f8841a.mo9097a(j2, this.f8854n);
        }
    }

    /* renamed from: b */
    private static void m12348b(C2501l lVar) {
        int c = lVar.mo8859c();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            if (i2 != 0) {
                z = lVar.mo8856a();
            }
            if (z) {
                lVar.mo8854a(1);
                lVar.mo8859c();
                for (int i3 = 0; i3 <= i; i3++) {
                    if (lVar.mo8856a()) {
                        lVar.mo8854a(1);
                    }
                }
            } else {
                int c2 = lVar.mo8859c();
                int c3 = lVar.mo8859c();
                int i4 = c2 + c3;
                for (int i5 = 0; i5 < c2; i5++) {
                    lVar.mo8859c();
                    lVar.mo8854a(1);
                }
                for (int i6 = 0; i6 < c3; i6++) {
                    lVar.mo8859c();
                    lVar.mo8854a(1);
                }
                i = i4;
            }
        }
    }

    /* renamed from: a */
    public void mo9060a() {
        C2496i.m11702a(this.f8846f);
        this.f8847g.mo9085a();
        this.f8848h.mo9085a();
        this.f8849i.mo9085a();
        this.f8850j.mo9085a();
        this.f8851k.mo9085a();
        this.f8844d.mo9081a();
        this.f8852l = 0;
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        this.f8853m = j;
    }

    /* renamed from: a */
    public void mo9062a(C2500k kVar) {
        C2500k kVar2 = kVar;
        while (kVar.mo8824b() > 0) {
            int d = kVar.mo8828d();
            int c = kVar.mo8826c();
            byte[] bArr = kVar2.f8094a;
            this.f8852l += (long) kVar.mo8824b();
            this.f8843c.mo9003a(kVar2, kVar.mo8824b());
            while (true) {
                if (d < c) {
                    int a = C2496i.m11698a(bArr, d, c, this.f8846f);
                    if (a == c) {
                        m12346a(bArr, d, c);
                        return;
                    }
                    int c2 = C2496i.m11706c(bArr, a);
                    int i = a - d;
                    if (i > 0) {
                        m12346a(bArr, d, a);
                    }
                    int i2 = c - a;
                    long j = this.f8852l - ((long) i2);
                    int i3 = i < 0 ? -i : 0;
                    long j2 = j;
                    int i4 = i2;
                    m12347b(j2, i4, i3, this.f8853m);
                    m12344a(j2, i4, c2, this.f8853m);
                    d = a + 3;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        dVar.mo9099a();
        this.f8842b = dVar.mo9101c();
        this.f8843c = hVar.mo9116a(dVar.mo9100b(), 2);
        this.f8844d = new C2618a(this.f8843c);
        this.f8841a.mo9098a(hVar, dVar);
    }

    /* renamed from: b */
    public void mo9064b() {
    }
}
