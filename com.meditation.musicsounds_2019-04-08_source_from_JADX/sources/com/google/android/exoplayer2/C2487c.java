package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p101b.C2483g;
import com.google.android.exoplayer2.p102c.C2503n;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.source.C2740i;
import com.google.android.exoplayer2.upstream.C2806b;
import com.google.android.exoplayer2.upstream.C2812f;

/* renamed from: com.google.android.exoplayer2.c */
public final class C2487c implements C2669j {

    /* renamed from: a */
    private final C2812f f8047a;

    /* renamed from: b */
    private final long f8048b;

    /* renamed from: c */
    private final long f8049c;

    /* renamed from: d */
    private final long f8050d;

    /* renamed from: e */
    private final long f8051e;

    /* renamed from: f */
    private final C2503n f8052f;

    /* renamed from: g */
    private int f8053g;

    /* renamed from: h */
    private boolean f8054h;

    public C2487c() {
        this(new C2812f(true, 65536));
    }

    public C2487c(C2812f fVar) {
        this(fVar, 15000, 30000, 2500, 5000);
    }

    public C2487c(C2812f fVar, int i, int i2, long j, long j2) {
        this(fVar, i, i2, j, j2, null);
    }

    public C2487c(C2812f fVar, int i, int i2, long j, long j2, C2503n nVar) {
        this.f8047a = fVar;
        this.f8048b = ((long) i) * 1000;
        this.f8049c = ((long) i2) * 1000;
        this.f8050d = j * 1000;
        this.f8051e = j2 * 1000;
        this.f8052f = nVar;
    }

    /* renamed from: a */
    private void m11654a(boolean z) {
        this.f8053g = 0;
        if (this.f8052f != null && this.f8054h) {
            this.f8052f.mo8864b(0);
        }
        this.f8054h = false;
        if (z) {
            this.f8047a.mo9549d();
        }
    }

    /* renamed from: b */
    private int m11655b(long j) {
        if (j > this.f8049c) {
            return 0;
        }
        return j < this.f8048b ? 2 : 1;
    }

    /* renamed from: a */
    public void mo8791a() {
        m11654a(false);
    }

    /* renamed from: a */
    public void mo8792a(C2671l[] lVarArr, C2740i iVar, C2483g gVar) {
        this.f8053g = 0;
        for (int i = 0; i < lVarArr.length; i++) {
            if (gVar.mo8784a(i) != null) {
                this.f8053g += C2511s.m11816c(lVarArr[i].mo8612a());
            }
        }
        this.f8047a.mo9548a(this.f8053g);
    }

    /* renamed from: a */
    public boolean mo8793a(long j) {
        int b = m11655b(j);
        boolean z = true;
        boolean z2 = this.f8047a.mo9550e() >= this.f8053g;
        boolean z3 = this.f8054h;
        if (b != 2 && (b != 1 || !this.f8054h || z2)) {
            z = false;
        }
        this.f8054h = z;
        if (!(this.f8052f == null || this.f8054h == z3)) {
            if (this.f8054h) {
                this.f8052f.mo8863a(0);
            } else {
                this.f8052f.mo8864b(0);
            }
        }
        return this.f8054h;
    }

    /* renamed from: a */
    public boolean mo8794a(long j, boolean z) {
        long j2 = z ? this.f8051e : this.f8050d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: b */
    public void mo8795b() {
        m11654a(true);
    }

    /* renamed from: c */
    public void mo8796c() {
        m11654a(true);
    }

    /* renamed from: d */
    public C2806b mo8797d() {
        return this.f8047a;
    }
}
