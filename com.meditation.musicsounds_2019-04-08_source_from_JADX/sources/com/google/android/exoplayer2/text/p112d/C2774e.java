package com.google.android.exoplayer2.text.p112d;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.p102c.C2488a;

/* renamed from: com.google.android.exoplayer2.text.d.e */
final class C2774e {

    /* renamed from: a */
    private String f9576a;

    /* renamed from: b */
    private int f9577b;

    /* renamed from: c */
    private boolean f9578c;

    /* renamed from: d */
    private int f9579d;

    /* renamed from: e */
    private boolean f9580e;

    /* renamed from: f */
    private int f9581f = -1;

    /* renamed from: g */
    private int f9582g = -1;

    /* renamed from: h */
    private int f9583h = -1;

    /* renamed from: i */
    private int f9584i = -1;

    /* renamed from: j */
    private int f9585j = -1;

    /* renamed from: k */
    private float f9586k;

    /* renamed from: l */
    private String f9587l;

    /* renamed from: m */
    private C2774e f9588m;

    /* renamed from: n */
    private Alignment f9589n;

    /* renamed from: a */
    private C2774e m13174a(C2774e eVar, boolean z) {
        if (eVar != null) {
            if (!this.f9578c && eVar.f9578c) {
                mo9448a(eVar.f9577b);
            }
            if (this.f9583h == -1) {
                this.f9583h = eVar.f9583h;
            }
            if (this.f9584i == -1) {
                this.f9584i = eVar.f9584i;
            }
            if (this.f9576a == null) {
                this.f9576a = eVar.f9576a;
            }
            if (this.f9581f == -1) {
                this.f9581f = eVar.f9581f;
            }
            if (this.f9582g == -1) {
                this.f9582g = eVar.f9582g;
            }
            if (this.f9589n == null) {
                this.f9589n = eVar.f9589n;
            }
            if (this.f9585j == -1) {
                this.f9585j = eVar.f9585j;
                this.f9586k = eVar.f9586k;
            }
            if (z && !this.f9580e && eVar.f9580e) {
                mo9453b(eVar.f9579d);
            }
        }
        return this;
    }

    /* renamed from: a */
    public int mo9446a() {
        if (this.f9583h == -1 && this.f9584i == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f9583h == 1 ? 1 : 0;
        if (this.f9584i == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: a */
    public C2774e mo9447a(float f) {
        this.f9586k = f;
        return this;
    }

    /* renamed from: a */
    public C2774e mo9448a(int i) {
        C2488a.m11668b(this.f9588m == null);
        this.f9577b = i;
        this.f9578c = true;
        return this;
    }

    /* renamed from: a */
    public C2774e mo9449a(Alignment alignment) {
        this.f9589n = alignment;
        return this;
    }

    /* renamed from: a */
    public C2774e mo9450a(C2774e eVar) {
        return m13174a(eVar, true);
    }

    /* renamed from: a */
    public C2774e mo9451a(String str) {
        C2488a.m11668b(this.f9588m == null);
        this.f9576a = str;
        return this;
    }

    /* renamed from: a */
    public C2774e mo9452a(boolean z) {
        C2488a.m11668b(this.f9588m == null);
        this.f9581f = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public C2774e mo9453b(int i) {
        this.f9579d = i;
        this.f9580e = true;
        return this;
    }

    /* renamed from: b */
    public C2774e mo9454b(String str) {
        this.f9587l = str;
        return this;
    }

    /* renamed from: b */
    public C2774e mo9455b(boolean z) {
        C2488a.m11668b(this.f9588m == null);
        this.f9582g = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public boolean mo9456b() {
        return this.f9581f == 1;
    }

    /* renamed from: c */
    public C2774e mo9457c(int i) {
        this.f9585j = i;
        return this;
    }

    /* renamed from: c */
    public C2774e mo9458c(boolean z) {
        C2488a.m11668b(this.f9588m == null);
        this.f9583h = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public boolean mo9459c() {
        return this.f9582g == 1;
    }

    /* renamed from: d */
    public C2774e mo9460d(boolean z) {
        C2488a.m11668b(this.f9588m == null);
        this.f9584i = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public String mo9461d() {
        return this.f9576a;
    }

    /* renamed from: e */
    public int mo9462e() {
        if (this.f9578c) {
            return this.f9577b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: f */
    public boolean mo9463f() {
        return this.f9578c;
    }

    /* renamed from: g */
    public int mo9464g() {
        if (this.f9580e) {
            return this.f9579d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: h */
    public boolean mo9465h() {
        return this.f9580e;
    }

    /* renamed from: i */
    public String mo9466i() {
        return this.f9587l;
    }

    /* renamed from: j */
    public Alignment mo9467j() {
        return this.f9589n;
    }

    /* renamed from: k */
    public int mo9468k() {
        return this.f9585j;
    }

    /* renamed from: l */
    public float mo9469l() {
        return this.f9586k;
    }
}
