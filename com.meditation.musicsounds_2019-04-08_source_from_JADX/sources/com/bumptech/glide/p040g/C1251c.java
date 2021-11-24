package com.bumptech.glide.p040g;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.g.c */
public final class C1251c extends FilterInputStream {

    /* renamed from: a */
    private final long f4462a;

    /* renamed from: b */
    private int f4463b;

    private C1251c(InputStream inputStream, long j) {
        super(inputStream);
        this.f4462a = j;
    }

    /* renamed from: a */
    private int m6670a(int i) {
        if (i >= 0) {
            this.f4463b += i;
        } else if (this.f4462a - ((long) this.f4463b) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read all expected data, expected: ");
            sb.append(this.f4462a);
            sb.append(", but read: ");
            sb.append(this.f4463b);
            throw new IOException(sb.toString());
        }
        return i;
    }

    /* renamed from: a */
    public static InputStream m6671a(InputStream inputStream, long j) {
        return new C1251c(inputStream, j);
    }

    public synchronized int available() {
        return (int) Math.max(this.f4462a - ((long) this.f4463b), (long) this.in.available());
    }

    public synchronized int read() {
        int read;
        read = super.read();
        m6670a(read >= 0 ? 1 : -1);
        return read;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        return m6670a(super.read(bArr, i, i2));
    }
}
