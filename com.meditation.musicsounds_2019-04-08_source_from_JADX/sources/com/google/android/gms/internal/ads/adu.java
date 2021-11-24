package com.google.android.gms.internal.ads;

import java.util.Arrays;

final class adu {

    /* renamed from: a */
    final int f11567a;

    /* renamed from: b */
    final byte[] f11568b;

    adu(int i, byte[] bArr) {
        this.f11567a = i;
        this.f11568b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof adu)) {
            return false;
        }
        adu adu = (adu) obj;
        return this.f11567a == adu.f11567a && Arrays.equals(this.f11568b, adu.f11568b);
    }

    public final int hashCode() {
        return ((this.f11567a + 527) * 31) + Arrays.hashCode(this.f11568b);
    }
}
