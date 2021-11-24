package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ym */
abstract class C4096ym implements C3914sz {

    /* renamed from: a */
    private final byte[] f15077a;

    /* renamed from: b */
    private final C4095yl f15078b;

    /* renamed from: c */
    private final C4095yl f15079c;

    C4096ym(byte[] bArr) {
        this.f15077a = (byte[]) bArr.clone();
        this.f15078b = mo13818a(bArr, 1);
        this.f15079c = mo13818a(bArr, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C4095yl mo13818a(byte[] bArr, int i);

    /* renamed from: a */
    public byte[] mo13681a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        this.f15078b.mo13816a();
        if (length <= 2147483619) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f15078b.mo13816a() + 16);
            if (allocate.remaining() >= bArr.length + this.f15078b.mo13816a() + 16) {
                int position = allocate.position();
                this.f15078b.mo13826a(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[this.f15078b.mo13816a()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f15079c.mo13817a(bArr3, 0).get(bArr4);
                int length2 = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
                int remaining = allocate.remaining();
                int i = remaining % 16;
                int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length2;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(length2);
                order.put(allocate);
                order.position(i2);
                order.putLong((long) bArr2.length);
                order.putLong((long) remaining);
                byte[] a = C4092yi.m20363a(bArr4, order.array());
                allocate.limit(allocate.limit() + 16);
                allocate.put(a);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
