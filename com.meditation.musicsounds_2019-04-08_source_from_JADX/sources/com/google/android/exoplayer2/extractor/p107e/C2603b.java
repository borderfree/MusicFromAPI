package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C2448a;
import com.google.android.exoplayer2.audio.C2448a.C2450a;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.extractor.e.b */
public final class C2603b implements C2610h {

    /* renamed from: a */
    private final C2499j f8720a;

    /* renamed from: b */
    private final C2500k f8721b;

    /* renamed from: c */
    private final String f8722c;

    /* renamed from: d */
    private String f8723d;

    /* renamed from: e */
    private C2659n f8724e;

    /* renamed from: f */
    private int f8725f;

    /* renamed from: g */
    private int f8726g;

    /* renamed from: h */
    private boolean f8727h;

    /* renamed from: i */
    private long f8728i;

    /* renamed from: j */
    private Format f8729j;

    /* renamed from: k */
    private int f8730k;

    /* renamed from: l */
    private long f8731l;

    public C2603b() {
        this(null);
    }

    public C2603b(String str) {
        this.f8720a = new C2499j(new byte[8]);
        this.f8721b = new C2500k(this.f8720a.f8090a);
        this.f8725f = 0;
        this.f8722c = str;
    }

    /* renamed from: a */
    private boolean m12261a(C2500k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo8824b(), i - this.f8726g);
        kVar.mo8823a(bArr, this.f8726g, min);
        this.f8726g += min;
        return this.f8726g == i;
    }

    /* renamed from: b */
    private boolean m12262b(C2500k kVar) {
        while (true) {
            boolean z = false;
            if (kVar.mo8824b() <= 0) {
                return false;
            }
            if (this.f8727h) {
                int g = kVar.mo8834g();
                if (g == 119) {
                    this.f8727h = false;
                    return true;
                } else if (g != 11) {
                    this.f8727h = z;
                }
            } else if (kVar.mo8834g() != 11) {
                this.f8727h = z;
            }
            z = true;
            this.f8727h = z;
        }
    }

    /* renamed from: c */
    private void m12263c() {
        this.f8720a.mo8808a(0);
        C2450a a = C2448a.m11491a(this.f8720a);
        if (!(this.f8729j != null && a.f7895c == this.f8729j.f7750r && a.f7894b == this.f8729j.f7751s && a.f7893a == this.f8729j.f7738f)) {
            this.f8729j = Format.m11316a(this.f8723d, a.f7893a, null, -1, -1, a.f7895c, a.f7894b, null, null, 0, this.f8722c);
            this.f8724e.mo9002a(this.f8729j);
        }
        this.f8730k = a.f7896d;
        this.f8728i = (((long) a.f7897e) * 1000000) / ((long) this.f8729j.f7751s);
    }

    /* renamed from: a */
    public void mo9060a() {
        this.f8725f = 0;
        this.f8726g = 0;
        this.f8727h = false;
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        this.f8731l = j;
    }

    /* renamed from: a */
    public void mo9062a(C2500k kVar) {
        while (kVar.mo8824b() > 0) {
            switch (this.f8725f) {
                case 0:
                    if (!m12262b(kVar)) {
                        break;
                    } else {
                        this.f8725f = 1;
                        this.f8721b.f8094a[0] = 11;
                        this.f8721b.f8094a[1] = 119;
                        this.f8726g = 2;
                        break;
                    }
                case 1:
                    if (!m12261a(kVar, this.f8721b.f8094a, 8)) {
                        break;
                    } else {
                        m12263c();
                        this.f8721b.mo8827c(0);
                        this.f8724e.mo9003a(this.f8721b, 8);
                        this.f8725f = 2;
                        break;
                    }
                case 2:
                    int min = Math.min(kVar.mo8824b(), this.f8730k - this.f8726g);
                    this.f8724e.mo9003a(kVar, min);
                    this.f8726g += min;
                    if (this.f8726g != this.f8730k) {
                        break;
                    } else {
                        this.f8724e.mo9001a(this.f8731l, 1, this.f8730k, 0, null);
                        this.f8731l += this.f8728i;
                        this.f8725f = 0;
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        dVar.mo9099a();
        this.f8723d = dVar.mo9101c();
        this.f8724e = hVar.mo9116a(dVar.mo9100b(), 1);
    }

    /* renamed from: b */
    public void mo9064b() {
    }
}
