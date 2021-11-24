package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.upstream.C2809d;
import java.io.EOFException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.b */
public final class C2536b implements C2650g {

    /* renamed from: a */
    private static final byte[] f8268a = new byte[4096];

    /* renamed from: b */
    private final C2809d f8269b;

    /* renamed from: c */
    private final long f8270c;

    /* renamed from: d */
    private long f8271d;

    /* renamed from: e */
    private byte[] f8272e = new byte[65536];

    /* renamed from: f */
    private int f8273f;

    /* renamed from: g */
    private int f8274g;

    public C2536b(C2809d dVar, long j, long j2) {
        this.f8269b = dVar;
        this.f8271d = j;
        this.f8270c = j2;
    }

    /* renamed from: a */
    private int m11941a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a = this.f8269b.mo9518a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: d */
    private int m11942d(byte[] bArr, int i, int i2) {
        if (this.f8274g == 0) {
            return 0;
        }
        int min = Math.min(this.f8274g, i2);
        System.arraycopy(this.f8272e, 0, bArr, i, min);
        m11945f(min);
        return min;
    }

    /* renamed from: d */
    private void m11943d(int i) {
        int i2 = this.f8273f + i;
        if (i2 > this.f8272e.length) {
            this.f8272e = Arrays.copyOf(this.f8272e, C2511s.m11798a(this.f8272e.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: e */
    private int m11944e(int i) {
        int min = Math.min(this.f8274g, i);
        m11945f(min);
        return min;
    }

    /* renamed from: f */
    private void m11945f(int i) {
        this.f8274g -= i;
        this.f8273f = 0;
        byte[] bArr = this.f8272e;
        if (this.f8274g < this.f8272e.length - 524288) {
            bArr = new byte[(this.f8274g + 65536)];
        }
        System.arraycopy(this.f8272e, i, bArr, 0, this.f8274g);
        this.f8272e = bArr;
    }

    /* renamed from: g */
    private void m11946g(int i) {
        if (i != -1) {
            this.f8271d += (long) i;
        }
    }

    /* renamed from: a */
    public int mo8963a(int i) {
        int e = m11944e(i);
        if (e == 0) {
            e = m11941a(f8268a, 0, Math.min(i, f8268a.length), 0, true);
        }
        m11946g(e);
        return e;
    }

    /* renamed from: a */
    public int mo8964a(byte[] bArr, int i, int i2) {
        int d = m11942d(bArr, i, i2);
        if (d == 0) {
            d = m11941a(bArr, i, i2, 0, true);
        }
        m11946g(d);
        return d;
    }

    /* renamed from: a */
    public void mo8965a() {
        this.f8273f = 0;
    }

    /* renamed from: a */
    public boolean mo8966a(int i, boolean z) {
        int e = m11944e(i);
        while (e < i && e != -1) {
            e = m11941a(f8268a, -e, Math.min(i, f8268a.length + e), e, z);
        }
        m11946g(e);
        return e != -1;
    }

    /* renamed from: a */
    public boolean mo8967a(byte[] bArr, int i, int i2, boolean z) {
        int d = m11942d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = m11941a(bArr, i, i2, d, z);
        }
        m11946g(d);
        return d != -1;
    }

    /* renamed from: b */
    public long mo8968b() {
        return this.f8271d + ((long) this.f8273f);
    }

    /* renamed from: b */
    public void mo8969b(int i) {
        mo8966a(i, false);
    }

    /* renamed from: b */
    public void mo8970b(byte[] bArr, int i, int i2) {
        mo8967a(bArr, i, i2, false);
    }

    /* renamed from: b */
    public boolean mo8971b(int i, boolean z) {
        m11943d(i);
        int min = Math.min(this.f8274g - this.f8273f, i);
        while (min < i) {
            min = m11941a(this.f8272e, this.f8273f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        this.f8273f += i;
        this.f8274g = Math.max(this.f8274g, this.f8273f);
        return true;
    }

    /* renamed from: b */
    public boolean mo8972b(byte[] bArr, int i, int i2, boolean z) {
        if (!mo8971b(i2, z)) {
            return false;
        }
        System.arraycopy(this.f8272e, this.f8273f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: c */
    public long mo8973c() {
        return this.f8271d;
    }

    /* renamed from: c */
    public void mo8974c(int i) {
        mo8971b(i, false);
    }

    /* renamed from: c */
    public void mo8975c(byte[] bArr, int i, int i2) {
        mo8972b(bArr, i, i2, false);
    }

    /* renamed from: d */
    public long mo8976d() {
        return this.f8270c;
    }
}
