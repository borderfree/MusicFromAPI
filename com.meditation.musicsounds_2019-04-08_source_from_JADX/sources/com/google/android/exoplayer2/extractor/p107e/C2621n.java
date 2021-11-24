package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.p102c.C2488a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.e.n */
final class C2621n {

    /* renamed from: a */
    public byte[] f8886a;

    /* renamed from: b */
    public int f8887b;

    /* renamed from: c */
    private final int f8888c;

    /* renamed from: d */
    private boolean f8889d;

    /* renamed from: e */
    private boolean f8890e;

    public C2621n(int i, int i2) {
        this.f8888c = i;
        this.f8886a = new byte[(i2 + 3)];
        this.f8886a[2] = 1;
    }

    /* renamed from: a */
    public void mo9085a() {
        this.f8889d = false;
        this.f8890e = false;
    }

    /* renamed from: a */
    public void mo9086a(int i) {
        boolean z = true;
        C2488a.m11668b(!this.f8889d);
        if (i != this.f8888c) {
            z = false;
        }
        this.f8889d = z;
        if (this.f8889d) {
            this.f8887b = 3;
            this.f8890e = false;
        }
    }

    /* renamed from: a */
    public void mo9087a(byte[] bArr, int i, int i2) {
        if (this.f8889d) {
            int i3 = i2 - i;
            if (this.f8886a.length < this.f8887b + i3) {
                this.f8886a = Arrays.copyOf(this.f8886a, (this.f8887b + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f8886a, this.f8887b, i3);
            this.f8887b += i3;
        }
    }

    /* renamed from: b */
    public boolean mo9088b() {
        return this.f8890e;
    }

    /* renamed from: b */
    public boolean mo9089b(int i) {
        if (!this.f8889d) {
            return false;
        }
        this.f8887b -= i;
        this.f8889d = false;
        this.f8890e = true;
        return true;
    }
}
