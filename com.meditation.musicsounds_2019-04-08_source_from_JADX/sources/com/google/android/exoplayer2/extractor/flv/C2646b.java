package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.flv.b */
public final class C2646b implements C2639f, C2657m {

    /* renamed from: a */
    public static final C2652i f8986a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2646b()};
        }
    };

    /* renamed from: e */
    private static final int f8987e = C2511s.m11819e("FLV");

    /* renamed from: b */
    public int f8988b;

    /* renamed from: c */
    public int f8989c;

    /* renamed from: d */
    public long f8990d;

    /* renamed from: f */
    private final C2500k f8991f = new C2500k(4);

    /* renamed from: g */
    private final C2500k f8992g = new C2500k(9);

    /* renamed from: h */
    private final C2500k f8993h = new C2500k(11);

    /* renamed from: i */
    private final C2500k f8994i = new C2500k();

    /* renamed from: j */
    private C2651h f8995j;

    /* renamed from: k */
    private int f8996k = 1;

    /* renamed from: l */
    private int f8997l;

    /* renamed from: m */
    private C2645a f8998m;

    /* renamed from: n */
    private C2649d f8999n;

    /* renamed from: o */
    private C2648c f9000o;

    /* renamed from: b */
    private boolean m12472b(C2650g gVar) {
        boolean z = false;
        if (!gVar.mo8967a(this.f8992g.f8094a, 0, 9, true)) {
            return false;
        }
        this.f8992g.mo8827c(0);
        this.f8992g.mo8829d(4);
        int g = this.f8992g.mo8834g();
        boolean z2 = (g & 4) != 0;
        if ((g & 1) != 0) {
            z = true;
        }
        if (z2 && this.f8998m == null) {
            this.f8998m = new C2645a(this.f8995j.mo9116a(8, 1));
        }
        if (z && this.f8999n == null) {
            this.f8999n = new C2649d(this.f8995j.mo9116a(9, 2));
        }
        if (this.f9000o == null) {
            this.f9000o = new C2648c(null);
        }
        this.f8995j.mo9117a();
        this.f8995j.mo9118a(this);
        this.f8997l = (this.f8992g.mo8841n() - 9) + 4;
        this.f8996k = 2;
        return true;
    }

    /* renamed from: c */
    private void m12473c(C2650g gVar) {
        gVar.mo8969b(this.f8997l);
        this.f8997l = 0;
        this.f8996k = 3;
    }

    /* renamed from: d */
    private boolean m12474d(C2650g gVar) {
        if (!gVar.mo8967a(this.f8993h.f8094a, 0, 11, true)) {
            return false;
        }
        this.f8993h.mo8827c(0);
        this.f8988b = this.f8993h.mo8834g();
        this.f8989c = this.f8993h.mo8838k();
        this.f8990d = (long) this.f8993h.mo8838k();
        this.f8990d = (((long) (this.f8993h.mo8834g() << 24)) | this.f8990d) * 1000;
        this.f8993h.mo8829d(3);
        this.f8996k = 4;
        return true;
    }

    /* renamed from: e */
    private boolean m12475e(C2650g gVar) {
        boolean z;
        if (this.f8988b == 8 && this.f8998m != null) {
            this.f8998m.mo9114b(m12476f(gVar), this.f8990d);
        } else if (this.f8988b == 9 && this.f8999n != null) {
            this.f8999n.mo9114b(m12476f(gVar), this.f8990d);
        } else if (this.f8988b != 18 || this.f9000o == null) {
            gVar.mo8969b(this.f8989c);
            z = false;
            this.f8997l = 4;
            this.f8996k = 2;
            return z;
        } else {
            this.f9000o.mo9114b(m12476f(gVar), this.f8990d);
        }
        z = true;
        this.f8997l = 4;
        this.f8996k = 2;
        return z;
    }

    /* renamed from: f */
    private C2500k m12476f(C2650g gVar) {
        if (this.f8989c > this.f8994i.mo8830e()) {
            this.f8994i.mo8822a(new byte[Math.max(this.f8994i.mo8830e() * 2, this.f8989c)], 0);
        } else {
            this.f8994i.mo8827c(0);
        }
        this.f8994i.mo8825b(this.f8989c);
        gVar.mo8970b(this.f8994i.f8094a, 0, this.f8989c);
        return this.f8994i;
    }

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        while (true) {
            switch (this.f8996k) {
                case 1:
                    if (m12472b(gVar)) {
                        break;
                    } else {
                        return -1;
                    }
                case 2:
                    m12473c(gVar);
                    break;
                case 3:
                    if (m12474d(gVar)) {
                        break;
                    } else {
                        return -1;
                    }
                case 4:
                    if (!m12475e(gVar)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8996k = 1;
        this.f8997l = 0;
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        this.f8995j = hVar;
    }

    /* renamed from: a */
    public boolean mo8930a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        boolean z = false;
        gVar.mo8975c(this.f8991f.f8094a, 0, 3);
        this.f8991f.mo8827c(0);
        if (this.f8991f.mo8838k() != f8987e) {
            return false;
        }
        gVar.mo8975c(this.f8991f.f8094a, 0, 2);
        this.f8991f.mo8827c(0);
        if ((this.f8991f.mo8835h() & 250) != 0) {
            return false;
        }
        gVar.mo8975c(this.f8991f.f8094a, 0, 4);
        this.f8991f.mo8827c(0);
        int n = this.f8991f.mo8841n();
        gVar.mo8965a();
        gVar.mo8974c(n);
        gVar.mo8975c(this.f8991f.f8094a, 0, 4);
        this.f8991f.mo8827c(0);
        if (this.f8991f.mo8841n() == 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public long mo8931b() {
        return this.f9000o.mo9115a();
    }

    /* renamed from: b */
    public long mo8932b(long j) {
        return 0;
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
