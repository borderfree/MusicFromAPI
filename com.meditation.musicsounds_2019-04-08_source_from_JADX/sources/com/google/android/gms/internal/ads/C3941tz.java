package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.tz */
public final class C3941tz implements C3914sz {

    /* renamed from: a */
    private static final byte[] f14960a = new byte[0];

    /* renamed from: b */
    private final C4029wm f14961b;

    /* renamed from: c */
    private final C3914sz f14962c;

    public C3941tz(C4029wm wmVar, C3914sz szVar) {
        this.f14961b = wmVar;
        this.f14962c = szVar;
    }

    /* renamed from: a */
    public final byte[] mo13681a(byte[] bArr, byte[] bArr2) {
        byte[] i = C3931tp.m19903b(this.f14961b).mo11553i();
        byte[] a = this.f14962c.mo13681a(i, f14960a);
        byte[] a2 = ((C3914sz) C3931tp.m19899a(this.f14961b.mo13775a(), i)).mo13681a(bArr, bArr2);
        return ByteBuffer.allocate(a.length + 4 + a2.length).putInt(a.length).put(a).put(a2).array();
    }
}
