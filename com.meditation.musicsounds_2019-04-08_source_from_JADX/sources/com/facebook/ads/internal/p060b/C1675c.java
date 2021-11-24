package com.facebook.ads.internal.p060b;

import java.io.Serializable;

/* renamed from: com.facebook.ads.internal.b.c */
public class C1675c implements Serializable {

    /* renamed from: a */
    private C1676a f5489a;

    /* renamed from: b */
    private C1676a f5490b;

    /* renamed from: com.facebook.ads.internal.b.c$a */
    public static class C1676a implements Serializable {

        /* renamed from: a */
        private double f5491a;

        /* renamed from: b */
        private double f5492b;

        /* renamed from: c */
        private double f5493c;

        /* renamed from: d */
        private double f5494d;

        /* renamed from: e */
        private double f5495e;

        /* renamed from: f */
        private double f5496f;

        /* renamed from: g */
        private double f5497g;

        /* renamed from: h */
        private int f5498h;

        /* renamed from: i */
        private double f5499i;

        /* renamed from: j */
        private double f5500j;

        /* renamed from: k */
        private double f5501k;

        public C1676a(double d) {
            this.f5495e = d;
        }

        /* renamed from: a */
        public void mo6801a() {
            this.f5491a = 0.0d;
            this.f5493c = 0.0d;
            this.f5494d = 0.0d;
            this.f5496f = 0.0d;
            this.f5498h = 0;
            this.f5499i = 0.0d;
            this.f5500j = 1.0d;
            this.f5501k = 0.0d;
        }

        /* renamed from: a */
        public void mo6802a(double d, double d2) {
            this.f5498h++;
            this.f5499i += d;
            this.f5493c = d2;
            this.f5501k += d2 * d;
            this.f5491a = this.f5501k / this.f5499i;
            this.f5500j = Math.min(this.f5500j, d2);
            this.f5496f = Math.max(this.f5496f, d2);
            if (d2 >= this.f5495e) {
                this.f5494d += d;
                this.f5492b += d;
                this.f5497g = Math.max(this.f5497g, this.f5492b);
                return;
            }
            this.f5492b = 0.0d;
        }

        /* renamed from: b */
        public void mo6803b() {
            this.f5492b = 0.0d;
        }

        /* renamed from: c */
        public double mo6804c() {
            if (this.f5498h == 0) {
                return 0.0d;
            }
            return this.f5500j;
        }

        /* renamed from: d */
        public double mo6805d() {
            return this.f5491a;
        }

        /* renamed from: e */
        public double mo6806e() {
            return this.f5496f;
        }

        /* renamed from: f */
        public double mo6807f() {
            return this.f5499i;
        }

        /* renamed from: g */
        public double mo6808g() {
            return this.f5494d;
        }

        /* renamed from: h */
        public double mo6809h() {
            return this.f5497g;
        }
    }

    public C1675c() {
        this(0.5d, 0.5d);
    }

    public C1675c(double d) {
        this(d, 0.5d);
    }

    public C1675c(double d, double d2) {
        this.f5489a = new C1676a(d);
        this.f5490b = new C1676a(d2);
        mo6795a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6795a() {
        this.f5489a.mo6801a();
        this.f5490b.mo6801a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6796a(double d, double d2) {
        this.f5489a.mo6802a(d, d2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6797b() {
        this.f5489a.mo6803b();
        this.f5490b.mo6803b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6798b(double d, double d2) {
        this.f5490b.mo6802a(d, d2);
    }

    /* renamed from: c */
    public C1676a mo6799c() {
        return this.f5489a;
    }

    /* renamed from: d */
    public C1676a mo6800d() {
        return this.f5490b;
    }
}
