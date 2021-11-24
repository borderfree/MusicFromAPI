package com.google.android.exoplayer2.extractor.p105c;

import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.extractor.c.l */
final class C2570l {

    /* renamed from: a */
    public C2554c f8557a;

    /* renamed from: b */
    public long f8558b;

    /* renamed from: c */
    public long f8559c;

    /* renamed from: d */
    public long f8560d;

    /* renamed from: e */
    public int f8561e;

    /* renamed from: f */
    public int f8562f;

    /* renamed from: g */
    public long[] f8563g;

    /* renamed from: h */
    public int[] f8564h;

    /* renamed from: i */
    public int[] f8565i;

    /* renamed from: j */
    public int[] f8566j;

    /* renamed from: k */
    public long[] f8567k;

    /* renamed from: l */
    public boolean[] f8568l;

    /* renamed from: m */
    public boolean f8569m;

    /* renamed from: n */
    public boolean[] f8570n;

    /* renamed from: o */
    public C2569k f8571o;

    /* renamed from: p */
    public int f8572p;

    /* renamed from: q */
    public C2500k f8573q;

    /* renamed from: r */
    public boolean f8574r;

    /* renamed from: s */
    public long f8575s;

    C2570l() {
    }

    /* renamed from: a */
    public void mo8990a() {
        this.f8561e = 0;
        this.f8575s = 0;
        this.f8569m = false;
        this.f8574r = false;
        this.f8571o = null;
    }

    /* renamed from: a */
    public void mo8991a(int i) {
        if (this.f8573q == null || this.f8573q.mo8826c() < i) {
            this.f8573q = new C2500k(i);
        }
        this.f8572p = i;
        this.f8569m = true;
        this.f8574r = true;
    }

    /* renamed from: a */
    public void mo8992a(int i, int i2) {
        this.f8561e = i;
        this.f8562f = i2;
        if (this.f8564h == null || this.f8564h.length < i) {
            this.f8563g = new long[i];
            this.f8564h = new int[i];
        }
        if (this.f8565i == null || this.f8565i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.f8565i = new int[i3];
            this.f8566j = new int[i3];
            this.f8567k = new long[i3];
            this.f8568l = new boolean[i3];
            this.f8570n = new boolean[i3];
        }
    }

    /* renamed from: a */
    public void mo8993a(C2500k kVar) {
        kVar.mo8823a(this.f8573q.f8094a, 0, this.f8572p);
        this.f8573q.mo8827c(0);
        this.f8574r = false;
    }

    /* renamed from: a */
    public void mo8994a(C2650g gVar) {
        gVar.mo8970b(this.f8573q.f8094a, 0, this.f8572p);
        this.f8573q.mo8827c(0);
        this.f8574r = false;
    }

    /* renamed from: b */
    public long mo8995b(int i) {
        return this.f8567k[i] + ((long) this.f8566j[i]);
    }
}
