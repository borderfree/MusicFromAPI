package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p102c.C2488a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.source.h */
public final class C2739h {

    /* renamed from: a */
    public final int f9381a;

    /* renamed from: b */
    private final Format[] f9382b;

    /* renamed from: c */
    private int f9383c;

    public C2739h(Format... formatArr) {
        C2488a.m11668b(formatArr.length > 0);
        this.f9382b = formatArr;
        this.f9381a = formatArr.length;
    }

    /* renamed from: a */
    public int mo9375a(Format format) {
        for (int i = 0; i < this.f9382b.length; i++) {
            if (format == this.f9382b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public Format mo9376a(int i) {
        return this.f9382b[i];
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2739h hVar = (C2739h) obj;
        if (this.f9381a != hVar.f9381a || !Arrays.equals(this.f9382b, hVar.f9382b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f9383c == 0) {
            this.f9383c = 527 + Arrays.hashCode(this.f9382b);
        }
        return this.f9383c;
    }
}
