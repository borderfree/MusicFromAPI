package com.google.android.gms.internal.ads;

public final class akc {

    /* renamed from: a */
    final long f12247a;

    /* renamed from: b */
    final String f12248b;

    /* renamed from: c */
    final int f12249c;

    akc(long j, String str, int i) {
        this.f12247a = j;
        this.f12248b = str;
        this.f12249c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof akc)) {
            akc akc = (akc) obj;
            if (akc.f12247a == this.f12247a && akc.f12249c == this.f12249c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f12247a;
    }
}
