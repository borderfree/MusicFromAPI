package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.ads.xo */
public final class C4071xo implements C3922tg {

    /* renamed from: a */
    private static final byte[] f15041a = new byte[0];

    /* renamed from: b */
    private final C4073xq f15042b;

    /* renamed from: c */
    private final String f15043c;

    /* renamed from: d */
    private final byte[] f15044d;

    /* renamed from: e */
    private final zzayw f15045e;

    /* renamed from: f */
    private final C4069xm f15046f;

    public C4071xo(ECPublicKey eCPublicKey, byte[] bArr, String str, zzayw zzayw, C4069xm xmVar) {
        C4075xs.m20338a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f15042b = new C4073xq(eCPublicKey);
        this.f15044d = bArr;
        this.f15043c = str;
        this.f15045e = zzayw;
        this.f15046f = xmVar;
    }

    /* renamed from: a */
    public final byte[] mo13688a(byte[] bArr, byte[] bArr2) {
        C4074xr a = this.f15042b.mo13819a(this.f15043c, this.f15044d, bArr2, this.f15046f.mo13705a(), this.f15045e);
        byte[] a2 = this.f15046f.mo13706a(a.mo13821b()).mo13681a(bArr, f15041a);
        byte[] a3 = a.mo13820a();
        return ByteBuffer.allocate(a3.length + a2.length).put(a3).put(a2).array();
    }
}
