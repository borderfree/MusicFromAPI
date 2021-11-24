package com.google.android.exoplayer2.extractor.p105c;

import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.c.m */
final class C2571m {

    /* renamed from: a */
    public final int f8576a;

    /* renamed from: b */
    public final long[] f8577b;

    /* renamed from: c */
    public final int[] f8578c;

    /* renamed from: d */
    public final int f8579d;

    /* renamed from: e */
    public final long[] f8580e;

    /* renamed from: f */
    public final int[] f8581f;

    public C2571m(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = false;
        C2488a.m11666a(iArr.length == jArr2.length);
        C2488a.m11666a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        C2488a.m11666a(z);
        this.f8577b = jArr;
        this.f8578c = iArr;
        this.f8579d = i;
        this.f8580e = jArr2;
        this.f8581f = iArr2;
        this.f8576a = jArr.length;
    }

    /* renamed from: a */
    public int mo8996a(long j) {
        for (int a = C2511s.m11800a(this.f8580e, j, true, false); a >= 0; a--) {
            if ((this.f8581f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo8997b(long j) {
        for (int b = C2511s.m11813b(this.f8580e, j, true, false); b < this.f8580e.length; b++) {
            if ((this.f8581f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
