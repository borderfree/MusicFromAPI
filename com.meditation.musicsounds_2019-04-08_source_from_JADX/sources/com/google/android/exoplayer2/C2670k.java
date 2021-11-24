package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.k */
public final class C2670k {

    /* renamed from: a */
    public static final C2670k f9114a = new C2670k(1.0f, 1.0f);

    /* renamed from: b */
    public final float f9115b;

    /* renamed from: c */
    public final float f9116c;

    /* renamed from: d */
    private final int f9117d;

    public C2670k(float f, float f2) {
        this.f9115b = f;
        this.f9116c = f2;
        this.f9117d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public long mo9153a(long j) {
        return j * ((long) this.f9117d);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2670k kVar = (C2670k) obj;
        if (!(this.f9115b == kVar.f9115b && this.f9116c == kVar.f9116c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f9115b)) * 31) + Float.floatToRawIntBits(this.f9116c);
    }
}
