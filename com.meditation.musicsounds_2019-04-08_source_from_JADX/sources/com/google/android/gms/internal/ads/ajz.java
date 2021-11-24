package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

@C3464ci
public final class ajz extends aju {

    /* renamed from: b */
    private MessageDigest f12245b;

    /* renamed from: a */
    public final byte[] mo12058a(String str) {
        byte[] bArr;
        String[] split = str.split(" ");
        int i = 4;
        if (split.length == 1) {
            int a = ajy.m16416a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr = allocate.array();
        } else if (split.length < 5) {
            bArr = new byte[(split.length << 1)];
            for (int i2 = 0; i2 < split.length; i2++) {
                int a2 = ajy.m16416a(split[i2]);
                int i3 = (a2 >> 16) ^ (65535 & a2);
                byte[] bArr2 = {(byte) i3, (byte) (i3 >> 8)};
                int i4 = i2 << 1;
                bArr[i4] = bArr2[0];
                bArr[i4 + 1] = bArr2[1];
            }
        } else {
            bArr = new byte[split.length];
            for (int i5 = 0; i5 < split.length; i5++) {
                int a3 = ajy.m16416a(split[i5]);
                bArr[i5] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
            }
        }
        this.f12245b = mo12057a();
        synchronized (this.f12238a) {
            if (this.f12245b == null) {
                byte[] bArr3 = new byte[0];
                return bArr3;
            }
            this.f12245b.reset();
            this.f12245b.update(bArr);
            byte[] digest = this.f12245b.digest();
            if (digest.length <= 4) {
                i = digest.length;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, bArr4.length);
            return bArr4;
        }
    }
}
