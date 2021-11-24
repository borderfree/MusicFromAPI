package com.google.android.exoplayer2.p101b;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.source.C2739h;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.b.b */
public abstract class C2471b implements C2481f {

    /* renamed from: a */
    protected final C2739h f8000a;

    /* renamed from: b */
    protected final int f8001b;

    /* renamed from: c */
    protected final int[] f8002c;

    /* renamed from: d */
    private final Format[] f8003d;

    /* renamed from: e */
    private final long[] f8004e;

    /* renamed from: f */
    private int f8005f;

    /* renamed from: com.google.android.exoplayer2.b.b$a */
    private static final class C2473a implements Comparator<Format> {
        private C2473a() {
        }

        /* renamed from: a */
        public int compare(Format format, Format format2) {
            return format2.f7734b - format.f7734b;
        }
    }

    public C2471b(C2739h hVar, int... iArr) {
        C2488a.m11668b(iArr.length > 0);
        this.f8000a = (C2739h) C2488a.m11664a(hVar);
        this.f8001b = iArr.length;
        this.f8003d = new Format[this.f8001b];
        for (int i = 0; i < iArr.length; i++) {
            this.f8003d[i] = hVar.mo9376a(iArr[i]);
        }
        Arrays.sort(this.f8003d, new C2473a());
        this.f8002c = new int[this.f8001b];
        for (int i2 = 0; i2 < this.f8001b; i2++) {
            this.f8002c[i2] = hVar.mo9375a(this.f8003d[i2]);
        }
        this.f8004e = new long[this.f8001b];
    }

    /* renamed from: a */
    public final Format mo8763a(int i) {
        return this.f8003d[i];
    }

    /* renamed from: a */
    public final C2739h mo8764a() {
        return this.f8000a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo8765a(int i, long j) {
        return this.f8004e[i] > j;
    }

    /* renamed from: b */
    public final int mo8766b() {
        return this.f8002c.length;
    }

    /* renamed from: b */
    public final int mo8767b(int i) {
        return this.f8002c[i];
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2471b bVar = (C2471b) obj;
        if (this.f8000a != bVar.f8000a || !Arrays.equals(this.f8002c, bVar.f8002c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        if (this.f8005f == 0) {
            this.f8005f = (System.identityHashCode(this.f8000a) * 31) + Arrays.hashCode(this.f8002c);
        }
        return this.f8005f;
    }
}
