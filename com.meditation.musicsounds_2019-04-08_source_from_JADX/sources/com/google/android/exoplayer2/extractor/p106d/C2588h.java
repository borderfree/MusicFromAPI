package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2657m;
import com.google.android.exoplayer2.extractor.C2657m.C2658a;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.extractor.d.h */
abstract class C2588h {

    /* renamed from: a */
    private C2584d f8663a;

    /* renamed from: b */
    private C2659n f8664b;

    /* renamed from: c */
    private C2651h f8665c;

    /* renamed from: d */
    private C2586f f8666d;

    /* renamed from: e */
    private long f8667e;

    /* renamed from: f */
    private long f8668f;

    /* renamed from: g */
    private long f8669g;

    /* renamed from: h */
    private int f8670h;

    /* renamed from: i */
    private int f8671i;

    /* renamed from: j */
    private C2590a f8672j;

    /* renamed from: k */
    private long f8673k;

    /* renamed from: l */
    private boolean f8674l;

    /* renamed from: m */
    private boolean f8675m;

    /* renamed from: com.google.android.exoplayer2.extractor.d.h$a */
    static class C2590a {

        /* renamed from: a */
        Format f8676a;

        /* renamed from: b */
        C2586f f8677b;

        C2590a() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.d.h$b */
    private static final class C2591b implements C2586f {
        private C2591b() {
        }

        /* renamed from: a */
        public long mo9027a(long j) {
            return 0;
        }

        /* renamed from: a */
        public long mo9029a(C2650g gVar) {
            return -1;
        }

        /* renamed from: c */
        public C2657m mo9036c() {
            return new C2658a(-9223372036854775807L);
        }
    }

    C2588h() {
    }

    /* renamed from: a */
    private int m12213a(C2650g gVar) {
        C2586f bVar;
        boolean z = true;
        while (z) {
            if (!this.f8663a.mo9043a(gVar)) {
                this.f8670h = 3;
                return -1;
            }
            this.f8673k = gVar.mo8973c() - this.f8668f;
            z = mo9038a(this.f8663a.mo9045c(), this.f8668f, this.f8672j);
            if (z) {
                this.f8668f = gVar.mo8973c();
            }
        }
        this.f8671i = this.f8672j.f8676a.f7751s;
        if (!this.f8675m) {
            this.f8664b.mo9002a(this.f8672j.f8676a);
            this.f8675m = true;
        }
        if (this.f8672j.f8677b != null) {
            bVar = this.f8672j.f8677b;
        } else if (gVar.mo8976d() == -1) {
            bVar = new C2591b();
        } else {
            C2585e b = this.f8663a.mo9044b();
            C2577a aVar = new C2577a(this.f8668f, gVar.mo8976d(), this, b.f8656h + b.f8657i, b.f8651c);
            this.f8666d = aVar;
            this.f8672j = null;
            this.f8670h = 2;
            this.f8663a.mo9046d();
            return 0;
        }
        this.f8666d = bVar;
        this.f8672j = null;
        this.f8670h = 2;
        this.f8663a.mo9046d();
        return 0;
    }

    /* renamed from: b */
    private int m12214b(C2650g gVar, C2656l lVar) {
        C2650g gVar2 = gVar;
        long a = this.f8666d.mo9029a(gVar2);
        if (a >= 0) {
            lVar.f9025a = a;
            return 1;
        }
        if (a < -1) {
            mo9054c(-(a + 2));
        }
        if (!this.f8674l) {
            this.f8665c.mo9118a(this.f8666d.mo9036c());
            this.f8674l = true;
        }
        if (this.f8673k > 0 || this.f8663a.mo9043a(gVar2)) {
            this.f8673k = 0;
            C2500k c = this.f8663a.mo9045c();
            long b = mo9039b(c);
            if (b >= 0 && this.f8669g + b >= this.f8667e) {
                long a2 = mo9050a(this.f8669g);
                this.f8664b.mo9003a(c, c.mo8826c());
                this.f8664b.mo9001a(a2, 1, c.mo8826c(), 0, null);
                this.f8667e = -1;
            }
            this.f8669g += b;
            return 0;
        }
        this.f8670h = 3;
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo9049a(C2650g gVar, C2656l lVar) {
        switch (this.f8670h) {
            case 0:
                return m12213a(gVar);
            case 1:
                gVar.mo8969b((int) this.f8668f);
                this.f8670h = 2;
                return 0;
            case 2:
                return m12214b(gVar, lVar);
            default:
                throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo9050a(long j) {
        return (j * 1000000) / ((long) this.f8671i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9051a(long j, long j2) {
        this.f8663a.mo9042a();
        if (j == 0) {
            mo9037a(!this.f8674l);
        } else if (this.f8670h != 0) {
            this.f8667e = this.f8666d.mo9027a(j2);
            this.f8670h = 2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9052a(C2651h hVar, C2659n nVar) {
        this.f8665c = hVar;
        this.f8664b = nVar;
        this.f8663a = new C2584d();
        mo9037a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9037a(boolean z) {
        int i;
        if (z) {
            this.f8672j = new C2590a();
            this.f8668f = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.f8670h = i;
        this.f8667e = -1;
        this.f8669g = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo9038a(C2500k kVar, long j, C2590a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo9053b(long j) {
        return (((long) this.f8671i) * j) / 1000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract long mo9039b(C2500k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9054c(long j) {
        this.f8669g = j;
    }
}
