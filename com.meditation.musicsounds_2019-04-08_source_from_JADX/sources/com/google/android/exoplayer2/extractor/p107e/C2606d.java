package com.google.android.exoplayer2.extractor.p107e;

import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2600e;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2489b;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.e.d */
public final class C2606d implements C2610h {

    /* renamed from: a */
    private static final byte[] f8738a = {73, 68, 51};

    /* renamed from: b */
    private final boolean f8739b;

    /* renamed from: c */
    private final C2499j f8740c;

    /* renamed from: d */
    private final C2500k f8741d;

    /* renamed from: e */
    private final String f8742e;

    /* renamed from: f */
    private String f8743f;

    /* renamed from: g */
    private C2659n f8744g;

    /* renamed from: h */
    private C2659n f8745h;

    /* renamed from: i */
    private int f8746i;

    /* renamed from: j */
    private int f8747j;

    /* renamed from: k */
    private int f8748k;

    /* renamed from: l */
    private boolean f8749l;

    /* renamed from: m */
    private boolean f8750m;

    /* renamed from: n */
    private long f8751n;

    /* renamed from: o */
    private int f8752o;

    /* renamed from: p */
    private long f8753p;

    /* renamed from: q */
    private C2659n f8754q;

    /* renamed from: r */
    private long f8755r;

    public C2606d(boolean z) {
        this(z, null);
    }

    public C2606d(boolean z, String str) {
        this.f8740c = new C2499j(new byte[7]);
        this.f8741d = new C2500k(Arrays.copyOf(f8738a, 10));
        m12278c();
        this.f8739b = z;
        this.f8742e = str;
    }

    /* renamed from: a */
    private void m12275a(C2659n nVar, long j, int i, int i2) {
        this.f8746i = 3;
        this.f8747j = i;
        this.f8754q = nVar;
        this.f8755r = j;
        this.f8752o = i2;
    }

    /* renamed from: a */
    private boolean m12276a(C2500k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo8824b(), i - this.f8747j);
        kVar.mo8823a(bArr, this.f8747j, min);
        this.f8747j += min;
        return this.f8747j == i;
    }

    /* renamed from: b */
    private void m12277b(C2500k kVar) {
        int i;
        byte[] bArr = kVar.f8094a;
        int d = kVar.mo8828d();
        int c = kVar.mo8826c();
        while (d < c) {
            int i2 = d + 1;
            byte b = bArr[d] & 255;
            if (this.f8748k != 512 || b < 240 || b == 255) {
                byte b2 = b | this.f8748k;
                if (b2 != 329) {
                    if (b2 == 511) {
                        this.f8748k = AdRequest.MAX_CONTENT_URL_LENGTH;
                    } else if (b2 == 836) {
                        i = 1024;
                    } else if (b2 == 1075) {
                        m12280d();
                    } else if (this.f8748k != 256) {
                        this.f8748k = 256;
                        i2--;
                    }
                    d = i2;
                } else {
                    i = 768;
                }
                this.f8748k = i;
                d = i2;
            } else {
                boolean z = true;
                if ((b & 1) != 0) {
                    z = false;
                }
                this.f8749l = z;
                m12281e();
            }
            kVar.mo8827c(i2);
            return;
        }
        kVar.mo8827c(d);
    }

    /* renamed from: c */
    private void m12278c() {
        this.f8746i = 0;
        this.f8747j = 0;
        this.f8748k = 256;
    }

    /* renamed from: c */
    private void m12279c(C2500k kVar) {
        int min = Math.min(kVar.mo8824b(), this.f8752o - this.f8747j);
        this.f8754q.mo9003a(kVar, min);
        this.f8747j += min;
        if (this.f8747j == this.f8752o) {
            this.f8754q.mo9001a(this.f8753p, 1, this.f8752o, 0, null);
            this.f8753p += this.f8755r;
            m12278c();
        }
    }

    /* renamed from: d */
    private void m12280d() {
        this.f8746i = 1;
        this.f8747j = f8738a.length;
        this.f8752o = 0;
        this.f8741d.mo8827c(0);
    }

    /* renamed from: e */
    private void m12281e() {
        this.f8746i = 2;
        this.f8747j = 0;
    }

    /* renamed from: f */
    private void m12282f() {
        this.f8745h.mo9003a(this.f8741d, 10);
        this.f8741d.mo8827c(6);
        m12275a(this.f8745h, 0, 10, this.f8741d.mo8846s() + 10);
    }

    /* renamed from: g */
    private void m12283g() {
        this.f8740c.mo8808a(0);
        if (!this.f8750m) {
            int c = this.f8740c.mo8814c(2) + 1;
            if (c != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Detected audio object type: ");
                sb.append(c);
                sb.append(", but assuming AAC LC.");
                Log.w("AdtsReader", sb.toString());
                c = 2;
            }
            int c2 = this.f8740c.mo8814c(4);
            this.f8740c.mo8812b(1);
            byte[] a = C2489b.m11672a(c, c2, this.f8740c.mo8814c(3));
            Pair a2 = C2489b.m11671a(a);
            Format a3 = Format.m11316a(this.f8743f, "audio/mp4a-latm", null, -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(a), null, 0, this.f8742e);
            this.f8751n = 1024000000 / ((long) a3.f7751s);
            this.f8744g.mo9002a(a3);
            this.f8750m = true;
        } else {
            this.f8740c.mo8812b(10);
        }
        this.f8740c.mo8812b(4);
        int c3 = (this.f8740c.mo8814c(13) - 2) - 5;
        if (this.f8749l) {
            c3 -= 2;
        }
        int i = c3;
        m12275a(this.f8744g, this.f8751n, 0, i);
    }

    /* renamed from: a */
    public void mo9060a() {
        m12278c();
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        this.f8753p = j;
    }

    /* renamed from: a */
    public void mo9062a(C2500k kVar) {
        while (kVar.mo8824b() > 0) {
            switch (this.f8746i) {
                case 0:
                    m12277b(kVar);
                    break;
                case 1:
                    if (!m12276a(kVar, this.f8741d.f8094a, 10)) {
                        break;
                    } else {
                        m12282f();
                        break;
                    }
                case 2:
                    if (!m12276a(kVar, this.f8740c.f8090a, this.f8749l ? 7 : 5)) {
                        break;
                    } else {
                        m12283g();
                        break;
                    }
                case 3:
                    m12279c(kVar);
                    break;
            }
        }
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        dVar.mo9099a();
        this.f8743f = dVar.mo9101c();
        this.f8744g = hVar.mo9116a(dVar.mo9100b(), 1);
        if (this.f8739b) {
            dVar.mo9099a();
            this.f8745h = hVar.mo9116a(dVar.mo9100b(), 4);
            this.f8745h.mo9002a(Format.m11320a(dVar.mo9101c(), "application/id3", null, -1, null));
            return;
        }
        this.f8745h = new C2600e();
    }

    /* renamed from: b */
    public void mo9064b() {
    }
}
