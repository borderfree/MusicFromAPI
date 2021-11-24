package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.ads.yl */
abstract class C4095yl implements C4090yg {

    /* renamed from: a */
    static final int[] f15074a = m20368a(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));

    /* renamed from: b */
    final C4089yf f15075b;

    /* renamed from: c */
    private final int f15076c;

    C4095yl(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f15075b = C4089yf.m20356a(bArr);
            this.f15076c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    static int m20367a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: a */
    static int[] m20368a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int mo13816a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract ByteBuffer mo13817a(byte[] bArr, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo13826a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo13816a() >= bArr.length) {
            byte[] a = C4093yj.m20365a(mo13816a());
            byteBuffer.put(a);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a2 = mo13817a(a, this.f15076c + i2);
                if (i2 == i - 1) {
                    C4066xj.m20320a(byteBuffer, wrap, a2, remaining % 64);
                } else {
                    C4066xj.m20320a(byteBuffer, wrap, a2, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: a */
    public final byte[] mo13815a(byte[] bArr) {
        int length = bArr.length;
        mo13816a();
        if (length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(mo13816a() + bArr.length);
            mo13826a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
