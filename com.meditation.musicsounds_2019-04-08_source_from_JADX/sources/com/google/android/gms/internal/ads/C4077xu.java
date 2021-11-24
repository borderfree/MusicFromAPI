package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.xu */
public final class C4077xu implements C3914sz {

    /* renamed from: a */
    private final C4090yg f15053a;

    /* renamed from: b */
    private final C3927tl f15054b;

    /* renamed from: c */
    private final int f15055c;

    public C4077xu(C4090yg ygVar, C3927tl tlVar, int i) {
        this.f15053a = ygVar;
        this.f15054b = tlVar;
        this.f15055c = i;
    }

    /* renamed from: a */
    public final byte[] mo13681a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.f15053a.mo13815a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return C4066xj.m20321a(a, this.f15054b.mo13699a(C4066xj.m20321a(bArr2, a, copyOf)));
    }
}
