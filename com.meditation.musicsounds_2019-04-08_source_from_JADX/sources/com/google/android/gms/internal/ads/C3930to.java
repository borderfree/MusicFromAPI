package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.to */
public final class C3930to<P> {

    /* renamed from: a */
    private final P f14948a;

    /* renamed from: b */
    private final byte[] f14949b;

    /* renamed from: c */
    private final zzaxl f14950c;

    /* renamed from: d */
    private final zzayd f14951d;

    public C3930to(P p, byte[] bArr, zzaxl zzaxl, zzayd zzayd) {
        this.f14948a = p;
        this.f14949b = Arrays.copyOf(bArr, bArr.length);
        this.f14950c = zzaxl;
        this.f14951d = zzayd;
    }

    /* renamed from: a */
    public final P mo13703a() {
        return this.f14948a;
    }

    /* renamed from: b */
    public final byte[] mo13704b() {
        if (this.f14949b == null) {
            return null;
        }
        return Arrays.copyOf(this.f14949b, this.f14949b.length);
    }
}
