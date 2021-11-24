package com.facebook.ads.internal.p077s.p079b;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* renamed from: com.facebook.ads.internal.s.b.e */
public class C1821e extends BufferedInputStream {

    /* renamed from: a */
    private int f5952a;

    /* renamed from: b */
    private boolean f5953b;

    /* renamed from: c */
    private int f5954c = Integer.MAX_VALUE;

    public C1821e(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    public boolean mo7082a() {
        return this.f5953b;
    }

    public synchronized void mark(int i) {
        this.f5954c = i;
        super.mark(i);
    }

    public int read() {
        if (this.f5952a + 1 > this.f5954c) {
            this.f5953b = true;
            return -1;
        }
        this.f5952a++;
        return super.read();
    }

    public int read(byte[] bArr) {
        if (this.f5952a + bArr.length <= this.f5954c) {
            return super.read(bArr);
        }
        this.f5953b = true;
        return -1;
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        if (this.f5952a + i2 > this.f5954c) {
            this.f5953b = true;
            return -1;
        }
        int read = super.read(bArr, i, i2);
        this.f5952a += read;
        return read;
    }

    public synchronized void reset() {
        this.f5954c = Integer.MAX_VALUE;
        super.reset();
    }

    public synchronized long skip(long j) {
        if (((long) this.f5952a) + j > ((long) this.f5954c)) {
            this.f5953b = true;
            return 0;
        }
        this.f5952a = (int) (((long) this.f5952a) + j);
        return super.skip(j);
    }
}
