package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.mz */
final class C3752mz extends FilterInputStream {

    /* renamed from: a */
    private final long f14473a;

    /* renamed from: b */
    private long f14474b;

    C3752mz(InputStream inputStream, long j) {
        super(inputStream);
        this.f14473a = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo13279a() {
        return this.f14473a - this.f14474b;
    }

    public final int read() {
        int read = super.read();
        if (read != -1) {
            this.f14474b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f14474b += (long) read;
        }
        return read;
    }
}
