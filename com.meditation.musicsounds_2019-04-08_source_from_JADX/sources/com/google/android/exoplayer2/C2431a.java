package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p100a.C2438e;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2494g;
import com.google.android.exoplayer2.source.C2735e;

/* renamed from: com.google.android.exoplayer2.a */
public abstract class C2431a implements C2671l, C2672m {

    /* renamed from: a */
    private final int f7759a;

    /* renamed from: b */
    private C2711n f7760b;

    /* renamed from: c */
    private int f7761c;

    /* renamed from: d */
    private int f7762d;

    /* renamed from: e */
    private C2735e f7763e;

    /* renamed from: f */
    private long f7764f;

    /* renamed from: g */
    private boolean f7765g = true;

    /* renamed from: h */
    private boolean f7766h;

    public C2431a(int i) {
        this.f7759a = i;
    }

    /* renamed from: a */
    public final int mo8612a() {
        return this.f7759a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo8613a(C2668i iVar, C2438e eVar, boolean z) {
        int a = this.f7763e.mo9365a(iVar, eVar, z);
        int i = -4;
        if (a == -4) {
            if (eVar.mo8645c()) {
                this.f7765g = true;
                if (!this.f7766h) {
                    i = -3;
                }
                return i;
            }
            eVar.f7789c += this.f7764f;
        } else if (a == -5) {
            Format format = iVar.f9113a;
            if (format.f7755w != Long.MAX_VALUE) {
                iVar.f9113a = format.mo8599a(format.f7755w + this.f7764f);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo8614a(int i) {
        this.f7761c = i;
    }

    /* renamed from: a */
    public void mo8615a(int i, Object obj) {
    }

    /* renamed from: a */
    public final void mo8616a(long j) {
        this.f7766h = false;
        this.f7765g = false;
        mo8617a(j, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8617a(long j, boolean z) {
    }

    /* renamed from: a */
    public final void mo8618a(C2711n nVar, Format[] formatArr, C2735e eVar, long j, boolean z, long j2) {
        C2488a.m11668b(this.f7762d == 0);
        this.f7760b = nVar;
        this.f7762d = 1;
        mo8619a(z);
        mo8621a(formatArr, eVar, j2);
        mo8617a(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8619a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8620a(Format[] formatArr) {
    }

    /* renamed from: a */
    public final void mo8621a(Format[] formatArr, C2735e eVar, long j) {
        C2488a.m11668b(!this.f7766h);
        this.f7763e = eVar;
        this.f7765g = false;
        this.f7764f = j;
        mo8620a(formatArr);
    }

    /* renamed from: b */
    public final C2672m mo8622b() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8623b(long j) {
        this.f7763e.mo9366a(j - this.f7764f);
    }

    /* renamed from: c */
    public C2494g mo8624c() {
        return null;
    }

    /* renamed from: d */
    public final int mo8625d() {
        return this.f7762d;
    }

    /* renamed from: e */
    public final void mo8626e() {
        boolean z = true;
        if (this.f7762d != 1) {
            z = false;
        }
        C2488a.m11668b(z);
        this.f7762d = 2;
        mo8635n();
    }

    /* renamed from: f */
    public final C2735e mo8627f() {
        return this.f7763e;
    }

    /* renamed from: g */
    public final boolean mo8628g() {
        return this.f7765g;
    }

    /* renamed from: h */
    public final void mo8629h() {
        this.f7766h = true;
    }

    /* renamed from: i */
    public final boolean mo8630i() {
        return this.f7766h;
    }

    /* renamed from: j */
    public final void mo8631j() {
        this.f7763e.mo9368b();
    }

    /* renamed from: k */
    public final void mo8632k() {
        C2488a.m11668b(this.f7762d == 2);
        this.f7762d = 1;
        mo8636o();
    }

    /* renamed from: l */
    public final void mo8633l() {
        boolean z = true;
        if (this.f7762d != 1) {
            z = false;
        }
        C2488a.m11668b(z);
        this.f7762d = 0;
        this.f7763e = null;
        this.f7766h = false;
        mo8637p();
    }

    /* renamed from: m */
    public int mo8634m() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo8635n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo8636o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo8637p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C2711n mo8638q() {
        return this.f7760b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final int mo8639r() {
        return this.f7761c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo8640s() {
        return this.f7765g ? this.f7766h : this.f7763e.mo9367a();
    }
}
