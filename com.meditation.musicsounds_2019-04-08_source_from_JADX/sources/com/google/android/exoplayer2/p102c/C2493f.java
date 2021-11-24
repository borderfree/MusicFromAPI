package com.google.android.exoplayer2.p102c;

import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.c.f */
public final class C2493f {

    /* renamed from: a */
    private int f8071a;

    /* renamed from: b */
    private long[] f8072b;

    public C2493f() {
        this(32);
    }

    public C2493f(int i) {
        this.f8072b = new long[i];
    }

    /* renamed from: a */
    public int mo8803a() {
        return this.f8071a;
    }

    /* renamed from: a */
    public long mo8804a(int i) {
        if (i >= 0 && i < this.f8071a) {
            return this.f8072b[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid index ");
        sb.append(i);
        sb.append(", size is ");
        sb.append(this.f8071a);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    public void mo8805a(long j) {
        if (this.f8071a == this.f8072b.length) {
            this.f8072b = Arrays.copyOf(this.f8072b, this.f8071a * 2);
        }
        long[] jArr = this.f8072b;
        int i = this.f8071a;
        this.f8071a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: b */
    public long[] mo8806b() {
        return Arrays.copyOf(this.f8072b, this.f8071a);
    }
}
