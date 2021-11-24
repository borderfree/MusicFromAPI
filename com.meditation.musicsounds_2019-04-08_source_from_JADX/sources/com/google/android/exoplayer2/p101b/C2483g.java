package com.google.android.exoplayer2.p101b;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.b.g */
public final class C2483g {

    /* renamed from: a */
    public final int f8039a;

    /* renamed from: b */
    private final C2481f[] f8040b;

    /* renamed from: c */
    private int f8041c;

    public C2483g(C2481f... fVarArr) {
        this.f8040b = fVarArr;
        this.f8039a = fVarArr.length;
    }

    /* renamed from: a */
    public C2481f mo8784a(int i) {
        return this.f8040b[i];
    }

    /* renamed from: a */
    public C2481f[] mo8785a() {
        return (C2481f[]) this.f8040b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8040b, ((C2483g) obj).f8040b);
    }

    public int hashCode() {
        if (this.f8041c == 0) {
            this.f8041c = 527 + Arrays.hashCode(this.f8040b);
        }
        return this.f8041c;
    }
}
