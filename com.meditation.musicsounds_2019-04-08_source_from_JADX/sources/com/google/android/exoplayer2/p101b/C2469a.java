package com.google.android.exoplayer2.p101b;

import com.google.android.exoplayer2.p101b.C2481f.C2482a;
import com.google.android.exoplayer2.source.C2739h;
import com.google.android.exoplayer2.upstream.C2807c;

/* renamed from: com.google.android.exoplayer2.b.a */
public class C2469a extends C2471b {

    /* renamed from: d */
    private final C2807c f7986d;

    /* renamed from: e */
    private final int f7987e;

    /* renamed from: f */
    private final long f7988f;

    /* renamed from: g */
    private final long f7989g;

    /* renamed from: h */
    private final long f7990h;

    /* renamed from: i */
    private final float f7991i;

    /* renamed from: j */
    private int f7992j = m11604a(Long.MIN_VALUE);

    /* renamed from: k */
    private int f7993k = 1;

    /* renamed from: com.google.android.exoplayer2.b.a$a */
    public static final class C2470a implements C2482a {

        /* renamed from: a */
        private final C2807c f7994a;

        /* renamed from: b */
        private final int f7995b;

        /* renamed from: c */
        private final int f7996c;

        /* renamed from: d */
        private final int f7997d;

        /* renamed from: e */
        private final int f7998e;

        /* renamed from: f */
        private final float f7999f;

        public C2470a(C2807c cVar) {
            this(cVar, 800000, 10000, 25000, 25000, 0.75f);
        }

        public C2470a(C2807c cVar, int i, int i2, int i3, int i4, float f) {
            this.f7994a = cVar;
            this.f7995b = i;
            this.f7996c = i2;
            this.f7997d = i3;
            this.f7998e = i4;
            this.f7999f = f;
        }

        /* renamed from: a */
        public C2469a mo8762b(C2739h hVar, int... iArr) {
            C2469a aVar = new C2469a(hVar, iArr, this.f7994a, this.f7995b, (long) this.f7996c, (long) this.f7997d, (long) this.f7998e, this.f7999f);
            return aVar;
        }
    }

    public C2469a(C2739h hVar, int[] iArr, C2807c cVar, int i, long j, long j2, long j3, float f) {
        super(hVar, iArr);
        this.f7986d = cVar;
        this.f7987e = i;
        this.f7988f = j * 1000;
        this.f7989g = j2 * 1000;
        this.f7990h = j3 * 1000;
        this.f7991i = f;
    }

    /* renamed from: a */
    private int m11604a(long j) {
        long a = this.f7986d.mo9544a();
        long j2 = a == -1 ? (long) this.f7987e : (long) (((float) a) * this.f7991i);
        int i = 0;
        for (int i2 = 0; i2 < this.f8001b; i2++) {
            if (j == Long.MIN_VALUE || !mo8765a(i2, j)) {
                if (((long) mo8763a(i2).f7734b) <= j2) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }
}
