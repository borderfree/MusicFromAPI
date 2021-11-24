package com.bumptech.glide.load.p042a;

import com.bumptech.glide.load.engine.p046a.C1393b;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.load.a.c */
public final class C1271c extends OutputStream {

    /* renamed from: a */
    private final OutputStream f4500a;

    /* renamed from: b */
    private byte[] f4501b;

    /* renamed from: c */
    private C1393b f4502c;

    /* renamed from: d */
    private int f4503d;

    public C1271c(OutputStream outputStream, C1393b bVar) {
        this(outputStream, bVar, 65536);
    }

    C1271c(OutputStream outputStream, C1393b bVar, int i) {
        this.f4500a = outputStream;
        this.f4502c = bVar;
        this.f4501b = (byte[]) bVar.mo6116a(i, byte[].class);
    }

    /* renamed from: a */
    private void m6757a() {
        if (this.f4503d > 0) {
            this.f4500a.write(this.f4501b, 0, this.f4503d);
            this.f4503d = 0;
        }
    }

    /* renamed from: b */
    private void m6758b() {
        if (this.f4503d == this.f4501b.length) {
            m6757a();
        }
    }

    /* renamed from: c */
    private void m6759c() {
        if (this.f4501b != null) {
            this.f4502c.mo6119a(this.f4501b);
            this.f4501b = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f4500a.close();
            m6759c();
        } catch (Throwable th) {
            this.f4500a.close();
            throw th;
        }
    }

    public void flush() {
        m6757a();
        this.f4500a.flush();
    }

    public void write(int i) {
        byte[] bArr = this.f4501b;
        int i2 = this.f4503d;
        this.f4503d = i2 + 1;
        bArr[i2] = (byte) i;
        m6758b();
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.f4503d != 0 || i4 < this.f4501b.length) {
                int min = Math.min(i4, this.f4501b.length - this.f4503d);
                System.arraycopy(bArr, i5, this.f4501b, this.f4503d, min);
                this.f4503d += min;
                i3 += min;
                m6758b();
            } else {
                this.f4500a.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
