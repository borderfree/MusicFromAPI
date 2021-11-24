package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;

/* renamed from: com.google.android.exoplayer2.extractor.e.r */
public final class C2627r implements C2634v {

    /* renamed from: a */
    private final C2626q f8919a;

    /* renamed from: b */
    private final C2500k f8920b = new C2500k(32);

    /* renamed from: c */
    private int f8921c;

    /* renamed from: d */
    private int f8922d;

    /* renamed from: e */
    private boolean f8923e;

    /* renamed from: f */
    private boolean f8924f;

    public C2627r(C2626q qVar) {
        this.f8919a = qVar;
    }

    /* renamed from: a */
    public void mo9090a() {
        this.f8924f = true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fa A[SYNTHETIC] */
    /* renamed from: a */
    public void mo9091a(com.google.android.exoplayer2.p102c.C2500k r8, boolean r9) {
        /*
            r7 = this;
            r0 = -1
            if (r9 == 0) goto L_0x000d
            int r1 = r8.mo8834g()
            int r2 = r8.mo8828d()
            int r1 = r1 + r2
            goto L_0x000e
        L_0x000d:
            r1 = -1
        L_0x000e:
            boolean r2 = r7.f8924f
            r3 = 0
            if (r2 == 0) goto L_0x001d
            if (r9 != 0) goto L_0x0016
            return
        L_0x0016:
            r7.f8924f = r3
            r8.mo8827c(r1)
        L_0x001b:
            r7.f8922d = r3
        L_0x001d:
            int r9 = r8.mo8824b()
            if (r9 <= 0) goto L_0x00fa
            int r9 = r7.f8922d
            r1 = 1
            r2 = 3
            if (r9 >= r2) goto L_0x00af
            int r9 = r7.f8922d
            if (r9 != 0) goto L_0x0040
            int r9 = r8.mo8834g()
            int r4 = r8.mo8828d()
            int r4 = r4 - r1
            r8.mo8827c(r4)
            r4 = 255(0xff, float:3.57E-43)
            if (r9 != r4) goto L_0x0040
            r7.f8924f = r1
            return
        L_0x0040:
            int r9 = r8.mo8824b()
            int r4 = r7.f8922d
            int r4 = 3 - r4
            int r9 = java.lang.Math.min(r9, r4)
            com.google.android.exoplayer2.c.k r4 = r7.f8920b
            byte[] r4 = r4.f8094a
            int r5 = r7.f8922d
            r8.mo8823a(r4, r5, r9)
            int r4 = r7.f8922d
            int r4 = r4 + r9
            r7.f8922d = r4
            int r9 = r7.f8922d
            if (r9 != r2) goto L_0x001d
            com.google.android.exoplayer2.c.k r9 = r7.f8920b
            r9.mo8820a(r2)
            com.google.android.exoplayer2.c.k r9 = r7.f8920b
            r9.mo8829d(r1)
            com.google.android.exoplayer2.c.k r9 = r7.f8920b
            int r9 = r9.mo8834g()
            com.google.android.exoplayer2.c.k r4 = r7.f8920b
            int r4 = r4.mo8834g()
            r5 = r9 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            r7.f8923e = r1
            r9 = r9 & 15
            int r9 = r9 << 8
            r9 = r9 | r4
            int r9 = r9 + r2
            r7.f8921c = r9
            com.google.android.exoplayer2.c.k r9 = r7.f8920b
            int r9 = r9.mo8830e()
            int r1 = r7.f8921c
            if (r9 >= r1) goto L_0x001d
            com.google.android.exoplayer2.c.k r9 = r7.f8920b
            byte[] r9 = r9.f8094a
            com.google.android.exoplayer2.c.k r1 = r7.f8920b
            r4 = 4098(0x1002, float:5.743E-42)
            int r5 = r7.f8921c
            int r6 = r9.length
            int r6 = r6 * 2
            int r5 = java.lang.Math.max(r5, r6)
            int r4 = java.lang.Math.min(r4, r5)
            r1.mo8820a(r4)
            com.google.android.exoplayer2.c.k r1 = r7.f8920b
            byte[] r1 = r1.f8094a
            java.lang.System.arraycopy(r9, r3, r1, r3, r2)
            goto L_0x001d
        L_0x00af:
            int r9 = r8.mo8824b()
            int r2 = r7.f8921c
            int r4 = r7.f8922d
            int r2 = r2 - r4
            int r9 = java.lang.Math.min(r9, r2)
            com.google.android.exoplayer2.c.k r2 = r7.f8920b
            byte[] r2 = r2.f8094a
            int r4 = r7.f8922d
            r8.mo8823a(r2, r4, r9)
            int r2 = r7.f8922d
            int r2 = r2 + r9
            r7.f8922d = r2
            int r9 = r7.f8922d
            int r2 = r7.f8921c
            if (r9 != r2) goto L_0x001d
            boolean r9 = r7.f8923e
            if (r9 == 0) goto L_0x00ea
            com.google.android.exoplayer2.c.k r9 = r7.f8920b
            byte[] r9 = r9.f8094a
            int r2 = r7.f8921c
            int r9 = com.google.android.exoplayer2.p102c.C2511s.m11799a(r9, r3, r2, r0)
            if (r9 == 0) goto L_0x00e3
            r7.f8924f = r1
            return
        L_0x00e3:
            com.google.android.exoplayer2.c.k r9 = r7.f8920b
            int r1 = r7.f8921c
            int r1 = r1 + -4
            goto L_0x00ee
        L_0x00ea:
            com.google.android.exoplayer2.c.k r9 = r7.f8920b
            int r1 = r7.f8921c
        L_0x00ee:
            r9.mo8820a(r1)
            com.google.android.exoplayer2.extractor.e.q r9 = r7.f8919a
            com.google.android.exoplayer2.c.k r1 = r7.f8920b
            r9.mo9095a(r1)
            goto L_0x001b
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p107e.C2627r.mo9091a(com.google.android.exoplayer2.c.k, boolean):void");
    }

    /* renamed from: a */
    public void mo9092a(C2509q qVar, C2651h hVar, C2638d dVar) {
        this.f8919a.mo9096a(qVar, hVar, dVar);
        this.f8924f = true;
    }
}
