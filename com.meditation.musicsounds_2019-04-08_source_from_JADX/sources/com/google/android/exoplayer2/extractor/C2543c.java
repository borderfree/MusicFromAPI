package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.flv.C2646b;
import com.google.android.exoplayer2.extractor.p103a.C2530d;
import com.google.android.exoplayer2.extractor.p104b.C2538b;
import com.google.android.exoplayer2.extractor.p105c.C2558e;
import com.google.android.exoplayer2.extractor.p105c.C2563g;
import com.google.android.exoplayer2.extractor.p106d.C2582c;
import com.google.android.exoplayer2.extractor.p107e.C2601a;
import com.google.android.exoplayer2.extractor.p107e.C2604c;
import com.google.android.exoplayer2.extractor.p107e.C2623p;
import com.google.android.exoplayer2.extractor.p107e.C2630u;
import com.google.android.exoplayer2.extractor.p108f.C2640a;
import java.lang.reflect.Constructor;

/* renamed from: com.google.android.exoplayer2.extractor.c */
public final class C2543c implements C2652i {

    /* renamed from: a */
    private static final Constructor<? extends C2639f> f8304a;

    /* renamed from: b */
    private int f8305b;

    /* renamed from: c */
    private int f8306c;

    /* renamed from: d */
    private int f8307d;

    /* renamed from: e */
    private int f8308e = 1;

    /* renamed from: f */
    private int f8309f;

    static {
        Constructor<? extends C2639f> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C2639f.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
        }
        f8304a = constructor;
    }

    /* renamed from: a */
    public synchronized C2639f[] mo8957a() {
        C2639f[] fVarArr;
        fVarArr = new C2639f[(f8304a == null ? 11 : 12)];
        fVarArr[0] = new C2530d(this.f8305b);
        fVarArr[1] = new C2558e(this.f8306c);
        fVarArr[2] = new C2563g();
        fVarArr[3] = new C2538b(this.f8307d);
        fVarArr[4] = new C2604c();
        fVarArr[5] = new C2601a();
        fVarArr[6] = new C2630u(this.f8308e, this.f8309f);
        fVarArr[7] = new C2646b();
        fVarArr[8] = new C2582c();
        fVarArr[9] = new C2623p();
        fVarArr[10] = new C2640a();
        if (f8304a != null) {
            try {
                fVarArr[11] = (C2639f) f8304a.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return fVarArr;
    }
}
