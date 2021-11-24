package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;

/* renamed from: com.google.android.gms.internal.ads.ta */
public final class C3916ta extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C3641iw f14940a;

    public C3916ta(C3641iw iwVar, int i) {
        this.f14940a = iwVar;
        this.buf = this.f14940a.mo13089a(Math.max(i, 256));
    }

    /* renamed from: a */
    private final void m19872a(int i) {
        if (this.count + i > this.buf.length) {
            byte[] a = this.f14940a.mo13089a((this.count + i) << 1);
            System.arraycopy(this.buf, 0, a, 0, this.count);
            this.f14940a.mo13088a(this.buf);
            this.buf = a;
        }
    }

    public final void close() {
        this.f14940a.mo13088a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f14940a.mo13088a(this.buf);
    }

    public final synchronized void write(int i) {
        m19872a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m19872a(i2);
        super.write(bArr, i, i2);
    }
}
