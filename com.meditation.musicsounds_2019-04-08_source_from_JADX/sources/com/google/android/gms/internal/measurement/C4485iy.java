package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.iy */
final class C4485iy {

    /* renamed from: a */
    final int f16327a;

    /* renamed from: b */
    final byte[] f16328b;

    C4485iy(int i, byte[] bArr) {
        this.f16327a = i;
        this.f16328b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4485iy)) {
            return false;
        }
        C4485iy iyVar = (C4485iy) obj;
        return this.f16327a == iyVar.f16327a && Arrays.equals(this.f16328b, iyVar.f16328b);
    }

    public final int hashCode() {
        return ((this.f16327a + 527) * 31) + Arrays.hashCode(this.f16328b);
    }
}
