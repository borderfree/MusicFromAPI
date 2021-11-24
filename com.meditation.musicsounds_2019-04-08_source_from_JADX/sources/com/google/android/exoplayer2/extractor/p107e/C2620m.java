package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2655k;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.extractor.e.m */
public final class C2620m implements C2610h {

    /* renamed from: a */
    private final C2500k f8874a;

    /* renamed from: b */
    private final C2655k f8875b;

    /* renamed from: c */
    private final String f8876c;

    /* renamed from: d */
    private String f8877d;

    /* renamed from: e */
    private C2659n f8878e;

    /* renamed from: f */
    private int f8879f;

    /* renamed from: g */
    private int f8880g;

    /* renamed from: h */
    private boolean f8881h;

    /* renamed from: i */
    private boolean f8882i;

    /* renamed from: j */
    private long f8883j;

    /* renamed from: k */
    private int f8884k;

    /* renamed from: l */
    private long f8885l;

    public C2620m() {
        this(null);
    }

    public C2620m(String str) {
        this.f8879f = 0;
        this.f8874a = new C2500k(4);
        this.f8874a.f8094a[0] = -1;
        this.f8875b = new C2655k();
        this.f8876c = str;
    }

    /* renamed from: b */
    private void m12364b(C2500k kVar) {
        byte[] bArr = kVar.f8094a;
        int c = kVar.mo8826c();
        for (int d = kVar.mo8828d(); d < c; d++) {
            boolean z = (bArr[d] & 255) == 255;
            boolean z2 = this.f8882i && (bArr[d] & 224) == 224;
            this.f8882i = z;
            if (z2) {
                kVar.mo8827c(d + 1);
                this.f8882i = false;
                this.f8874a.f8094a[1] = bArr[d];
                this.f8880g = 2;
                this.f8879f = 1;
                return;
            }
        }
        kVar.mo8827c(c);
    }

    /* renamed from: c */
    private void m12365c(C2500k kVar) {
        int min = Math.min(kVar.mo8824b(), 4 - this.f8880g);
        kVar.mo8823a(this.f8874a.f8094a, this.f8880g, min);
        this.f8880g += min;
        if (this.f8880g >= 4) {
            this.f8874a.mo8827c(0);
            if (!C2655k.m12523a(this.f8874a.mo8841n(), this.f8875b)) {
                this.f8880g = 0;
                this.f8879f = 1;
                return;
            }
            this.f8884k = this.f8875b.f9020c;
            if (!this.f8881h) {
                this.f8883j = (((long) this.f8875b.f9024g) * 1000000) / ((long) this.f8875b.f9021d);
                this.f8878e.mo9002a(Format.m11316a(this.f8877d, this.f8875b.f9019b, null, -1, 4096, this.f8875b.f9022e, this.f8875b.f9021d, null, null, 0, this.f8876c));
                this.f8881h = true;
            }
            this.f8874a.mo8827c(0);
            this.f8878e.mo9003a(this.f8874a, 4);
            this.f8879f = 2;
        }
    }

    /* renamed from: d */
    private void m12366d(C2500k kVar) {
        int min = Math.min(kVar.mo8824b(), this.f8884k - this.f8880g);
        this.f8878e.mo9003a(kVar, min);
        this.f8880g += min;
        if (this.f8880g >= this.f8884k) {
            this.f8878e.mo9001a(this.f8885l, 1, this.f8884k, 0, null);
            this.f8885l += this.f8883j;
            this.f8880g = 0;
            this.f8879f = 0;
        }
    }

    /* renamed from: a */
    public void mo9060a() {
        this.f8879f = 0;
        this.f8880g = 0;
        this.f8882i = false;
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        this.f8885l = j;
    }

    /* renamed from: a */
    public void mo9062a(C2500k kVar) {
        while (kVar.mo8824b() > 0) {
            switch (this.f8879f) {
                case 0:
                    m12364b(kVar);
                    break;
                case 1:
                    m12365c(kVar);
                    break;
                case 2:
                    m12366d(kVar);
                    break;
            }
        }
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        dVar.mo9099a();
        this.f8877d = dVar.mo9101c();
        this.f8878e = hVar.mo9116a(dVar.mo9100b(), 1);
    }

    /* renamed from: b */
    public void mo9064b() {
    }
}
