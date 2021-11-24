package com.bumptech.glide.p040g;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.g.d */
public class C1252d extends InputStream {

    /* renamed from: a */
    private static final Queue<C1252d> f4464a = C1258j.m6706a(0);

    /* renamed from: b */
    private InputStream f4465b;

    /* renamed from: c */
    private IOException f4466c;

    C1252d() {
    }

    /* renamed from: a */
    public static C1252d m6672a(InputStream inputStream) {
        C1252d dVar;
        synchronized (f4464a) {
            dVar = (C1252d) f4464a.poll();
        }
        if (dVar == null) {
            dVar = new C1252d();
        }
        dVar.mo5886b(inputStream);
        return dVar;
    }

    /* renamed from: a */
    public IOException mo5883a() {
        return this.f4466c;
    }

    public int available() {
        return this.f4465b.available();
    }

    /* renamed from: b */
    public void mo5885b() {
        this.f4466c = null;
        this.f4465b = null;
        synchronized (f4464a) {
            f4464a.offer(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5886b(InputStream inputStream) {
        this.f4465b = inputStream;
    }

    public void close() {
        this.f4465b.close();
    }

    public void mark(int i) {
        this.f4465b.mark(i);
    }

    public boolean markSupported() {
        return this.f4465b.markSupported();
    }

    public int read() {
        try {
            return this.f4465b.read();
        } catch (IOException e) {
            this.f4466c = e;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f4465b.read(bArr);
        } catch (IOException e) {
            this.f4466c = e;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f4465b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f4466c = e;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f4465b.reset();
    }

    public long skip(long j) {
        try {
            return this.f4465b.skip(j);
        } catch (IOException e) {
            this.f4466c = e;
            return 0;
        }
    }
}
