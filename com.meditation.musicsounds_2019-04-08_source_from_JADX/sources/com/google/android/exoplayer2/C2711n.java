package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.n */
public final class C2711n {

    /* renamed from: a */
    public static final C2711n f9267a = new C2711n(0);

    /* renamed from: b */
    public final int f9268b;

    public C2711n(int i) {
        this.f9268b = i;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.f9268b != ((C2711n) obj).f9268b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f9268b;
    }
}
