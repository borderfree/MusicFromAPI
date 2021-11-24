package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;

@C3464ci
final class axa {

    /* renamed from: a */
    private final Object[] f13249a;

    axa(zzjj zzjj, String str, int i) {
        this.f13249a = zzp.zza((String) ane.m16650f().mo12297a(aqm.f12656aV), zzjj, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axa)) {
            return false;
        }
        return Arrays.equals(this.f13249a, ((axa) obj).f13249a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13249a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f13249a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
