package com.google.android.exoplayer2.extractor.p107e;

import android.util.Log;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;

/* renamed from: com.google.android.exoplayer2.extractor.e.o */
public final class C2622o implements C2634v {

    /* renamed from: a */
    private final C2610h f8891a;

    /* renamed from: b */
    private final C2499j f8892b = new C2499j(new byte[10]);

    /* renamed from: c */
    private int f8893c = 0;

    /* renamed from: d */
    private int f8894d;

    /* renamed from: e */
    private C2509q f8895e;

    /* renamed from: f */
    private boolean f8896f;

    /* renamed from: g */
    private boolean f8897g;

    /* renamed from: h */
    private boolean f8898h;

    /* renamed from: i */
    private int f8899i;

    /* renamed from: j */
    private int f8900j;

    /* renamed from: k */
    private boolean f8901k;

    /* renamed from: l */
    private long f8902l;

    public C2622o(C2610h hVar) {
        this.f8891a = hVar;
    }

    /* renamed from: a */
    private void m12377a(int i) {
        this.f8893c = i;
        this.f8894d = 0;
    }

    /* renamed from: a */
    private boolean m12378a(C2500k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo8824b(), i - this.f8894d);
        boolean z = true;
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            kVar.mo8829d(min);
        } else {
            kVar.mo8823a(bArr, this.f8894d, min);
        }
        this.f8894d += min;
        if (this.f8894d != i) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    private boolean m12379b() {
        this.f8892b.mo8808a(0);
        int c = this.f8892b.mo8814c(24);
        if (c != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected start code prefix: ");
            sb.append(c);
            Log.w("PesReader", sb.toString());
            this.f8900j = -1;
            return false;
        }
        this.f8892b.mo8812b(8);
        int c2 = this.f8892b.mo8814c(16);
        this.f8892b.mo8812b(5);
        this.f8901k = this.f8892b.mo8816d();
        this.f8892b.mo8812b(2);
        this.f8896f = this.f8892b.mo8816d();
        this.f8897g = this.f8892b.mo8816d();
        this.f8892b.mo8812b(6);
        this.f8899i = this.f8892b.mo8814c(8);
        if (c2 == 0) {
            this.f8900j = -1;
        } else {
            this.f8900j = ((c2 + 6) - 9) - this.f8899i;
        }
        return true;
    }

    /* renamed from: c */
    private void m12380c() {
        this.f8892b.mo8808a(0);
        this.f8902l = -9223372036854775807L;
        if (this.f8896f) {
            this.f8892b.mo8812b(4);
            long c = ((long) this.f8892b.mo8814c(3)) << 30;
            this.f8892b.mo8812b(1);
            long c2 = c | ((long) (this.f8892b.mo8814c(15) << 15));
            this.f8892b.mo8812b(1);
            long c3 = c2 | ((long) this.f8892b.mo8814c(15));
            this.f8892b.mo8812b(1);
            if (!this.f8898h && this.f8897g) {
                this.f8892b.mo8812b(4);
                long c4 = ((long) this.f8892b.mo8814c(3)) << 30;
                this.f8892b.mo8812b(1);
                long c5 = c4 | ((long) (this.f8892b.mo8814c(15) << 15));
                this.f8892b.mo8812b(1);
                long c6 = c5 | ((long) this.f8892b.mo8814c(15));
                this.f8892b.mo8812b(1);
                this.f8895e.mo8878b(c6);
                this.f8898h = true;
            }
            this.f8902l = this.f8895e.mo8878b(c3);
        }
    }

    /* renamed from: a */
    public final void mo9090a() {
        this.f8893c = 0;
        this.f8894d = 0;
        this.f8898h = false;
        this.f8891a.mo9060a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
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
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf A[SYNTHETIC] */
    /* renamed from: a */
    public final void mo9091a(com.google.android.exoplayer2.p102c.C2500k r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = -1
            if (r7 == 0) goto L_0x0036
            int r7 = r5.f8893c
            switch(r7) {
                case 0: goto L_0x0033;
                case 1: goto L_0x0033;
                case 2: goto L_0x002c;
                case 3: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0033
        L_0x000a:
            int r7 = r5.f8900j
            if (r7 == r1) goto L_0x006d
            java.lang.String r7 = "PesReader"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected start indicator: expected "
            r2.append(r3)
            int r3 = r5.f8900j
            r2.append(r3)
            java.lang.String r3 = " more bytes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r7, r2)
            goto L_0x006d
        L_0x002c:
            java.lang.String r7 = "PesReader"
            java.lang.String r2 = "Unexpected start indicator reading extended header"
            android.util.Log.w(r7, r2)
        L_0x0033:
            r5.m12377a(r0)
        L_0x0036:
            int r7 = r6.mo8824b()
            if (r7 <= 0) goto L_0x00bf
            int r7 = r5.f8893c
            r2 = 0
            switch(r7) {
                case 0: goto L_0x00b6;
                case 1: goto L_0x009f;
                case 2: goto L_0x0073;
                case 3: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x0036
        L_0x0043:
            int r7 = r6.mo8824b()
            int r3 = r5.f8900j
            if (r3 != r1) goto L_0x004c
            goto L_0x0050
        L_0x004c:
            int r2 = r5.f8900j
            int r2 = r7 - r2
        L_0x0050:
            if (r2 <= 0) goto L_0x005b
            int r7 = r7 - r2
            int r2 = r6.mo8828d()
            int r2 = r2 + r7
            r6.mo8825b(r2)
        L_0x005b:
            com.google.android.exoplayer2.extractor.e.h r2 = r5.f8891a
            r2.mo9062a(r6)
            int r2 = r5.f8900j
            if (r2 == r1) goto L_0x0036
            int r2 = r5.f8900j
            int r2 = r2 - r7
            r5.f8900j = r2
            int r7 = r5.f8900j
            if (r7 != 0) goto L_0x0036
        L_0x006d:
            com.google.android.exoplayer2.extractor.e.h r7 = r5.f8891a
            r7.mo9064b()
            goto L_0x0033
        L_0x0073:
            r7 = 10
            int r2 = r5.f8899i
            int r7 = java.lang.Math.min(r7, r2)
            com.google.android.exoplayer2.c.j r2 = r5.f8892b
            byte[] r2 = r2.f8090a
            boolean r7 = r5.m12378a(r6, r2, r7)
            if (r7 == 0) goto L_0x0036
            r7 = 0
            int r2 = r5.f8899i
            boolean r7 = r5.m12378a(r6, r7, r2)
            if (r7 == 0) goto L_0x0036
            r5.m12380c()
            com.google.android.exoplayer2.extractor.e.h r7 = r5.f8891a
            long r2 = r5.f8902l
            boolean r4 = r5.f8901k
            r7.mo9061a(r2, r4)
            r7 = 3
            r5.m12377a(r7)
            goto L_0x0036
        L_0x009f:
            com.google.android.exoplayer2.c.j r7 = r5.f8892b
            byte[] r7 = r7.f8090a
            r3 = 9
            boolean r7 = r5.m12378a(r6, r7, r3)
            if (r7 == 0) goto L_0x0036
            boolean r7 = r5.m12379b()
            if (r7 == 0) goto L_0x00b2
            r2 = 2
        L_0x00b2:
            r5.m12377a(r2)
            goto L_0x0036
        L_0x00b6:
            int r7 = r6.mo8824b()
            r6.mo8829d(r7)
            goto L_0x0036
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p107e.C2622o.mo9091a(com.google.android.exoplayer2.c.k, boolean):void");
    }

    /* renamed from: a */
    public void mo9092a(C2509q qVar, C2651h hVar, C2638d dVar) {
        this.f8895e = qVar;
        this.f8891a.mo9063a(hVar, dVar);
    }
}
