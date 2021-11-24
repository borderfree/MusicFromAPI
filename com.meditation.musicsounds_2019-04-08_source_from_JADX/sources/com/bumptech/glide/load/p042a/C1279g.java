package com.bumptech.glide.load.p042a;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.a.g */
public final class C1279g extends FilterInputStream {

    /* renamed from: a */
    private static final byte[] f4507a = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: b */
    private static final int f4508b = f4507a.length;

    /* renamed from: c */
    private static final int f4509c = (f4508b + 2);

    /* renamed from: d */
    private final byte f4510d;

    /* renamed from: e */
    private int f4511e;

    public C1279g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot add invalid orientation: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f4510d = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int i = (this.f4511e < 2 || this.f4511e > f4509c) ? super.read() : this.f4511e == f4509c ? this.f4510d : f4507a[this.f4511e - 2] & 255;
        if (i != -1) {
            this.f4511e++;
        }
        return i;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f4511e > f4509c) {
            i3 = super.read(bArr, i, i2);
        } else if (this.f4511e == f4509c) {
            bArr[i] = this.f4510d;
            i3 = 1;
        } else if (this.f4511e < 2) {
            i3 = super.read(bArr, i, 2 - this.f4511e);
        } else {
            int min = Math.min(f4509c - this.f4511e, i2);
            System.arraycopy(f4507a, this.f4511e - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f4511e += i3;
        }
        return i3;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f4511e = (int) (((long) this.f4511e) + skip);
        }
        return skip;
    }
}
