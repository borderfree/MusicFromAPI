package com.bumptech.glide.p040g;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.g.g */
public class C1255g extends FilterInputStream {

    /* renamed from: a */
    private int f4472a = Integer.MIN_VALUE;

    public C1255g(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private long m6687a(long j) {
        if (this.f4472a == 0) {
            return -1;
        }
        if (this.f4472a != Integer.MIN_VALUE && j > ((long) this.f4472a)) {
            j = (long) this.f4472a;
        }
        return j;
    }

    /* renamed from: b */
    private void m6688b(long j) {
        if (this.f4472a != Integer.MIN_VALUE && j != -1) {
            this.f4472a = (int) (((long) this.f4472a) - j);
        }
    }

    public int available() {
        return this.f4472a == Integer.MIN_VALUE ? super.available() : Math.min(this.f4472a, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f4472a = i;
    }

    public int read() {
        if (m6687a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m6688b(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int a = (int) m6687a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m6688b((long) read);
        return read;
    }

    public synchronized void reset() {
        super.reset();
        this.f4472a = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        long a = m6687a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m6688b(skip);
        return skip;
    }
}
