package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.C2461e;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.extractor.e.f */
public final class C2608f implements C2610h {

    /* renamed from: a */
    private final C2500k f8758a = new C2500k(new byte[15]);

    /* renamed from: b */
    private final String f8759b;

    /* renamed from: c */
    private String f8760c;

    /* renamed from: d */
    private C2659n f8761d;

    /* renamed from: e */
    private int f8762e;

    /* renamed from: f */
    private int f8763f;

    /* renamed from: g */
    private int f8764g;

    /* renamed from: h */
    private long f8765h;

    /* renamed from: i */
    private Format f8766i;

    /* renamed from: j */
    private int f8767j;

    /* renamed from: k */
    private long f8768k;

    public C2608f(String str) {
        this.f8758a.f8094a[0] = Byte.MAX_VALUE;
        this.f8758a.f8094a[1] = -2;
        this.f8758a.f8094a[2] = Byte.MIN_VALUE;
        this.f8758a.f8094a[3] = 1;
        this.f8762e = 0;
        this.f8759b = str;
    }

    /* renamed from: a */
    private boolean m12293a(C2500k kVar, byte[] bArr, int i) {
        int min = Math.min(kVar.mo8824b(), i - this.f8763f);
        kVar.mo8823a(bArr, this.f8763f, min);
        this.f8763f += min;
        return this.f8763f == i;
    }

    /* renamed from: b */
    private boolean m12294b(C2500k kVar) {
        while (kVar.mo8824b() > 0) {
            this.f8764g <<= 8;
            this.f8764g |= kVar.mo8834g();
            if (this.f8764g == 2147385345) {
                this.f8764g = 0;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m12295c() {
        byte[] bArr = this.f8758a.f8094a;
        if (this.f8766i == null) {
            this.f8766i = C2461e.m11522a(bArr, this.f8760c, this.f8759b, null);
            this.f8761d.mo9002a(this.f8766i);
        }
        this.f8767j = C2461e.m11523b(bArr);
        this.f8765h = (long) ((int) ((((long) C2461e.m11521a(bArr)) * 1000000) / ((long) this.f8766i.f7751s)));
    }

    /* renamed from: a */
    public void mo9060a() {
        this.f8762e = 0;
        this.f8763f = 0;
        this.f8764g = 0;
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        this.f8768k = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        r10.f8762e = r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9062a(com.google.android.exoplayer2.p102c.C2500k r11) {
        /*
            r10 = this;
        L_0x0000:
            int r0 = r11.mo8824b()
            if (r0 <= 0) goto L_0x006a
            int r0 = r10.f8762e
            r1 = 0
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0040;
                case 2: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0000
        L_0x000d:
            int r0 = r11.mo8824b()
            int r2 = r10.f8767j
            int r3 = r10.f8763f
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            com.google.android.exoplayer2.extractor.n r2 = r10.f8761d
            r2.mo9003a(r11, r0)
            int r2 = r10.f8763f
            int r2 = r2 + r0
            r10.f8763f = r2
            int r0 = r10.f8763f
            int r2 = r10.f8767j
            if (r0 != r2) goto L_0x0000
            com.google.android.exoplayer2.extractor.n r3 = r10.f8761d
            long r4 = r10.f8768k
            r6 = 1
            int r7 = r10.f8767j
            r8 = 0
            r9 = 0
            r3.mo9001a(r4, r6, r7, r8, r9)
            long r2 = r10.f8768k
            long r4 = r10.f8765h
            long r2 = r2 + r4
            r10.f8768k = r2
            r10.f8762e = r1
            goto L_0x0000
        L_0x0040:
            com.google.android.exoplayer2.c.k r0 = r10.f8758a
            byte[] r0 = r0.f8094a
            r2 = 15
            boolean r0 = r10.m12293a(r11, r0, r2)
            if (r0 == 0) goto L_0x0000
            r10.m12295c()
            com.google.android.exoplayer2.c.k r0 = r10.f8758a
            r0.mo8827c(r1)
            com.google.android.exoplayer2.extractor.n r0 = r10.f8761d
            com.google.android.exoplayer2.c.k r1 = r10.f8758a
            r0.mo9003a(r1, r2)
            r0 = 2
            goto L_0x0067
        L_0x005d:
            boolean r0 = r10.m12294b(r11)
            if (r0 == 0) goto L_0x0000
            r0 = 4
            r10.f8763f = r0
            r0 = 1
        L_0x0067:
            r10.f8762e = r0
            goto L_0x0000
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p107e.C2608f.mo9062a(com.google.android.exoplayer2.c.k):void");
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        dVar.mo9099a();
        this.f8760c = dVar.mo9101c();
        this.f8761d = hVar.mo9116a(dVar.mo9100b(), 1);
    }

    /* renamed from: b */
    public void mo9064b() {
    }
}
