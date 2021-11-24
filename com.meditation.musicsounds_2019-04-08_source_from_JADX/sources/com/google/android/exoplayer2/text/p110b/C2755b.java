package com.google.android.exoplayer2.text.p110b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region.Op;
import android.util.SparseArray;
import com.google.android.exoplayer2.p102c.C2499j;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.text.C2741a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.b.b */
final class C2755b {

    /* renamed from: a */
    private static final byte[] f9488a = {0, 7, 8, 15};

    /* renamed from: b */
    private static final byte[] f9489b = {0, 119, -120, -1};

    /* renamed from: c */
    private static final byte[] f9490c = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: d */
    private final Paint f9491d = new Paint();

    /* renamed from: e */
    private final Paint f9492e;

    /* renamed from: f */
    private final Canvas f9493f;

    /* renamed from: g */
    private final C2757b f9494g;

    /* renamed from: h */
    private final C2756a f9495h;

    /* renamed from: i */
    private final C2763h f9496i;

    /* renamed from: j */
    private Bitmap f9497j;

    /* renamed from: com.google.android.exoplayer2.text.b.b$a */
    private static final class C2756a {

        /* renamed from: a */
        public final int f9498a;

        /* renamed from: b */
        public final int[] f9499b;

        /* renamed from: c */
        public final int[] f9500c;

        /* renamed from: d */
        public final int[] f9501d;

        public C2756a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f9498a = i;
            this.f9499b = iArr;
            this.f9500c = iArr2;
            this.f9501d = iArr3;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$b */
    private static final class C2757b {

        /* renamed from: a */
        public final int f9502a;

        /* renamed from: b */
        public final int f9503b;

        /* renamed from: c */
        public final int f9504c;

        /* renamed from: d */
        public final int f9505d;

        /* renamed from: e */
        public final int f9506e;

        /* renamed from: f */
        public final int f9507f;

        public C2757b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f9502a = i;
            this.f9503b = i2;
            this.f9504c = i3;
            this.f9505d = i4;
            this.f9506e = i5;
            this.f9507f = i6;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$c */
    private static final class C2758c {

        /* renamed from: a */
        public final int f9508a;

        /* renamed from: b */
        public final boolean f9509b;

        /* renamed from: c */
        public final byte[] f9510c;

        /* renamed from: d */
        public final byte[] f9511d;

        public C2758c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f9508a = i;
            this.f9509b = z;
            this.f9510c = bArr;
            this.f9511d = bArr2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$d */
    private static final class C2759d {

        /* renamed from: a */
        public final int f9512a;

        /* renamed from: b */
        public final int f9513b;

        /* renamed from: c */
        public final int f9514c;

        /* renamed from: d */
        public final SparseArray<C2760e> f9515d;

        public C2759d(int i, int i2, int i3, SparseArray<C2760e> sparseArray) {
            this.f9512a = i;
            this.f9513b = i2;
            this.f9514c = i3;
            this.f9515d = sparseArray;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$e */
    private static final class C2760e {

        /* renamed from: a */
        public final int f9516a;

        /* renamed from: b */
        public final int f9517b;

        public C2760e(int i, int i2) {
            this.f9516a = i;
            this.f9517b = i2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$f */
    private static final class C2761f {

        /* renamed from: a */
        public final int f9518a;

        /* renamed from: b */
        public final boolean f9519b;

        /* renamed from: c */
        public final int f9520c;

        /* renamed from: d */
        public final int f9521d;

        /* renamed from: e */
        public final int f9522e;

        /* renamed from: f */
        public final int f9523f;

        /* renamed from: g */
        public final int f9524g;

        /* renamed from: h */
        public final int f9525h;

        /* renamed from: i */
        public final int f9526i;

        /* renamed from: j */
        public final int f9527j;

        /* renamed from: k */
        public final SparseArray<C2762g> f9528k;

        public C2761f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C2762g> sparseArray) {
            this.f9518a = i;
            this.f9519b = z;
            this.f9520c = i2;
            this.f9521d = i3;
            this.f9522e = i4;
            this.f9523f = i5;
            this.f9524g = i6;
            this.f9525h = i7;
            this.f9526i = i8;
            this.f9527j = i9;
            this.f9528k = sparseArray;
        }

        /* renamed from: a */
        public void mo9436a(C2761f fVar) {
            if (fVar != null) {
                SparseArray<C2762g> sparseArray = fVar.f9528k;
                for (int i = 0; i < sparseArray.size(); i++) {
                    this.f9528k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$g */
    private static final class C2762g {

        /* renamed from: a */
        public final int f9529a;

        /* renamed from: b */
        public final int f9530b;

        /* renamed from: c */
        public final int f9531c;

        /* renamed from: d */
        public final int f9532d;

        /* renamed from: e */
        public final int f9533e;

        /* renamed from: f */
        public final int f9534f;

        public C2762g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f9529a = i;
            this.f9530b = i2;
            this.f9531c = i3;
            this.f9532d = i4;
            this.f9533e = i5;
            this.f9534f = i6;
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.b.b$h */
    private static final class C2763h {

        /* renamed from: a */
        public final int f9535a;

        /* renamed from: b */
        public final int f9536b;

        /* renamed from: c */
        public final SparseArray<C2761f> f9537c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C2756a> f9538d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C2758c> f9539e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C2756a> f9540f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C2758c> f9541g = new SparseArray<>();

        /* renamed from: h */
        public C2757b f9542h;

        /* renamed from: i */
        public C2759d f9543i;

        public C2763h(int i, int i2) {
            this.f9535a = i;
            this.f9536b = i2;
        }

        /* renamed from: a */
        public void mo9437a() {
            this.f9537c.clear();
            this.f9538d.clear();
            this.f9539e.clear();
            this.f9540f.clear();
            this.f9541g.clear();
            this.f9542h = null;
            this.f9543i = null;
        }
    }

    public C2755b(int i, int i2) {
        this.f9491d.setStyle(Style.FILL_AND_STROKE);
        this.f9491d.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.f9491d.setPathEffect(null);
        this.f9492e = new Paint();
        this.f9492e.setStyle(Style.FILL);
        this.f9492e.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.f9492e.setPathEffect(null);
        this.f9493f = new Canvas();
        C2757b bVar = new C2757b(719, 575, 0, 719, 0, 575);
        this.f9494g = bVar;
        this.f9495h = new C2756a(0, m13119b(), m13122c(), m13123d());
        this.f9496i = new C2763h(i, i2);
    }

    /* renamed from: a */
    private static int m13108a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v4, types: [byte] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m13109a(com.google.android.exoplayer2.p102c.C2499j r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 2
            int r4 = r13.mo8814c(r3)
            boolean r5 = r13.mo8816d()
            r6 = 1
            if (r5 != 0) goto L_0x0019
            r12 = r2
            r3 = r4
            r11 = 1
            goto L_0x0056
        L_0x0019:
            boolean r4 = r13.mo8816d()
            if (r4 == 0) goto L_0x002c
            r4 = 3
            int r5 = r13.mo8814c(r4)
            int r4 = r4 + r5
        L_0x0025:
            int r3 = r13.mo8814c(r3)
            r12 = r2
            r11 = r4
            goto L_0x0056
        L_0x002c:
            boolean r4 = r13.mo8816d()
            if (r4 != 0) goto L_0x0053
            int r4 = r13.mo8814c(r3)
            switch(r4) {
                case 0: goto L_0x004f;
                case 1: goto L_0x004b;
                case 2: goto L_0x0043;
                case 3: goto L_0x003a;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x0053
        L_0x003a:
            r4 = 8
            int r4 = r13.mo8814c(r4)
            int r4 = r4 + 29
            goto L_0x0025
        L_0x0043:
            r4 = 4
            int r4 = r13.mo8814c(r4)
            int r4 = r4 + 12
            goto L_0x0025
        L_0x004b:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L_0x0056
        L_0x004f:
            r3 = 0
            r11 = 0
            r12 = 1
            goto L_0x0056
        L_0x0053:
            r12 = r2
            r3 = 0
            r11 = 0
        L_0x0056:
            if (r11 == 0) goto L_0x0072
            if (r8 == 0) goto L_0x0072
            if (r15 == 0) goto L_0x005e
            byte r3 = r15[r3]
        L_0x005e:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0072:
            int r10 = r10 + r11
            if (r12 == 0) goto L_0x0076
            return r10
        L_0x0076:
            r2 = r12
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p110b.C2755b.m13109a(com.google.android.exoplayer2.c.j, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: a */
    private static C2757b m13110a(C2499j jVar) {
        int i;
        int i2;
        int i3;
        int i4;
        jVar.mo8812b(4);
        boolean d = jVar.mo8816d();
        jVar.mo8812b(3);
        int c = jVar.mo8814c(16);
        int c2 = jVar.mo8814c(16);
        if (d) {
            int c3 = jVar.mo8814c(16);
            int c4 = jVar.mo8814c(16);
            int c5 = jVar.mo8814c(16);
            i = jVar.mo8814c(16);
            i3 = c4;
            i2 = c5;
            i4 = c3;
        } else {
            i3 = c;
            i = c2;
            i4 = 0;
            i2 = 0;
        }
        C2757b bVar = new C2757b(c, c2, i4, i3, i2, i);
        return bVar;
    }

    /* renamed from: a */
    private static C2759d m13111a(C2499j jVar, int i) {
        int c = jVar.mo8814c(8);
        int c2 = jVar.mo8814c(4);
        int c3 = jVar.mo8814c(2);
        jVar.mo8812b(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int c4 = jVar.mo8814c(8);
            jVar.mo8812b(8);
            i2 -= 6;
            sparseArray.put(c4, new C2760e(jVar.mo8814c(16), jVar.mo8814c(16)));
        }
        return new C2759d(c, c2, c3, sparseArray);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0061, code lost:
        r7.put(r1, r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13112a(com.google.android.exoplayer2.p102c.C2499j r6, com.google.android.exoplayer2.text.p110b.C2755b.C2763h r7) {
        /*
            r0 = 8
            int r0 = r6.mo8814c(r0)
            r1 = 16
            int r2 = r6.mo8814c(r1)
            int r1 = r6.mo8814c(r1)
            int r3 = r6.mo8813c()
            int r3 = r3 + r1
            int r4 = r1 * 8
            int r5 = r6.mo8807a()
            if (r4 <= r5) goto L_0x002c
            java.lang.String r7 = "DvbParser"
            java.lang.String r0 = "Data field length exceeds limit"
            android.util.Log.w(r7, r0)
            int r7 = r6.mo8807a()
            r6.mo8812b(r7)
            return
        L_0x002c:
            switch(r0) {
                case 16: goto L_0x0095;
                case 17: goto L_0x0070;
                case 18: goto L_0x0055;
                case 19: goto L_0x003d;
                case 20: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x00bf
        L_0x0031:
            int r0 = r7.f9535a
            if (r2 != r0) goto L_0x00bf
            com.google.android.exoplayer2.text.b.b$b r0 = m13110a(r6)
            r7.f9542h = r0
            goto L_0x00bf
        L_0x003d:
            int r0 = r7.f9535a
            if (r2 != r0) goto L_0x004a
            com.google.android.exoplayer2.text.b.b$c r0 = m13117b(r6)
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$c> r7 = r7.f9539e
        L_0x0047:
            int r1 = r0.f9508a
            goto L_0x0061
        L_0x004a:
            int r0 = r7.f9536b
            if (r2 != r0) goto L_0x00bf
            com.google.android.exoplayer2.text.b.b$c r0 = m13117b(r6)
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$c> r7 = r7.f9541g
            goto L_0x0047
        L_0x0055:
            int r0 = r7.f9535a
            if (r2 != r0) goto L_0x0065
            com.google.android.exoplayer2.text.b.b$a r0 = m13121c(r6, r1)
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$a> r7 = r7.f9538d
        L_0x005f:
            int r1 = r0.f9498a
        L_0x0061:
            r7.put(r1, r0)
            goto L_0x00bf
        L_0x0065:
            int r0 = r7.f9536b
            if (r2 != r0) goto L_0x00bf
            com.google.android.exoplayer2.text.b.b$a r0 = m13121c(r6, r1)
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$a> r7 = r7.f9540f
            goto L_0x005f
        L_0x0070:
            com.google.android.exoplayer2.text.b.b$d r0 = r7.f9543i
            int r4 = r7.f9535a
            if (r2 != r4) goto L_0x00bf
            if (r0 == 0) goto L_0x00bf
            com.google.android.exoplayer2.text.b.b$f r1 = m13118b(r6, r1)
            int r0 = r0.f9514c
            if (r0 != 0) goto L_0x008d
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$f> r0 = r7.f9537c
            int r2 = r1.f9518a
            java.lang.Object r0 = r0.get(r2)
            com.google.android.exoplayer2.text.b.b$f r0 = (com.google.android.exoplayer2.text.p110b.C2755b.C2761f) r0
            r1.mo9436a(r0)
        L_0x008d:
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$f> r7 = r7.f9537c
            int r0 = r1.f9518a
            r7.put(r0, r1)
            goto L_0x00bf
        L_0x0095:
            int r0 = r7.f9535a
            if (r2 != r0) goto L_0x00bf
            com.google.android.exoplayer2.text.b.b$d r0 = r7.f9543i
            com.google.android.exoplayer2.text.b.b$d r1 = m13111a(r6, r1)
            int r2 = r1.f9514c
            if (r2 == 0) goto L_0x00b5
            r7.f9543i = r1
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$f> r0 = r7.f9537c
            r0.clear()
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$a> r0 = r7.f9538d
            r0.clear()
            android.util.SparseArray<com.google.android.exoplayer2.text.b.b$c> r7 = r7.f9539e
            r7.clear()
            goto L_0x00bf
        L_0x00b5:
            if (r0 == 0) goto L_0x00bf
            int r0 = r0.f9513b
            int r2 = r1.f9513b
            if (r0 == r2) goto L_0x00bf
            r7.f9543i = r1
        L_0x00bf:
            int r7 = r6.mo8813c()
            int r3 = r3 - r7
            r6.mo8815d(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p110b.C2755b.m13112a(com.google.android.exoplayer2.c.j, com.google.android.exoplayer2.text.b.b$h):void");
    }

    /* renamed from: a */
    private static void m13113a(C2758c cVar, C2756a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr = i == 3 ? aVar.f9501d : i == 2 ? aVar.f9500c : aVar.f9499b;
        int[] iArr2 = iArr;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m13114a(cVar.f9510c, iArr2, i4, i5, i3, paint2, canvas2);
        m13114a(cVar.f9511d, iArr2, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: a */
    private static void m13114a(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        int a;
        byte[] bArr3;
        byte[] bArr4;
        int i4 = i;
        byte[] bArr5 = bArr;
        C2499j jVar = new C2499j(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (jVar.mo8807a() != 0) {
            int c = jVar.mo8814c(8);
            if (c != 240) {
                switch (c) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                                a = m13109a(jVar, iArr, bArr2, i5, i6, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f9488a : bArr7;
                            }
                        } else {
                            bArr3 = bArr6 == null ? f9489b : bArr6;
                        }
                        bArr2 = bArr3;
                        a = m13109a(jVar, iArr, bArr2, i5, i6, paint, canvas);
                    case 17:
                        a = m13116b(jVar, iArr, i4 == 3 ? f9490c : null, i5, i6, paint, canvas);
                        break;
                    case 18:
                        a = m13120c(jVar, iArr, null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (c) {
                            case 32:
                                bArr7 = m13115a(4, 4, jVar);
                                continue;
                            case 33:
                                bArr4 = m13115a(4, 8, jVar);
                                break;
                            case 34:
                                bArr4 = m13115a(16, 8, jVar);
                                break;
                            default:
                                continue;
                        }
                        bArr6 = bArr4;
                        break;
                }
                jVar.mo8817e();
                i5 = a;
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: a */
    private static byte[] m13115a(int i, int i2, C2499j jVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) jVar.mo8814c(i2);
        }
        return bArr;
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4, types: [byte] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v4, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r15v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v14
      assigns: []
      uses: []
      mth insns count: 69
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[LOOP:0: B:1:0x0009->B:30:0x0081, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 10 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m13116b(com.google.android.exoplayer2.p102c.C2499j r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 4
            int r4 = r13.mo8814c(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0016
            r12 = r2
            r3 = r4
        L_0x0014:
            r11 = 1
            goto L_0x0061
        L_0x0016:
            boolean r4 = r13.mo8816d()
            if (r4 != 0) goto L_0x002d
            r3 = 3
            int r3 = r13.mo8814c(r3)
            if (r3 == 0) goto L_0x0029
            int r3 = r3 + 2
            r12 = r2
            r11 = r3
            r3 = 0
            goto L_0x0061
        L_0x0029:
            r3 = 0
            r11 = 0
            r12 = 1
            goto L_0x0061
        L_0x002d:
            boolean r4 = r13.mo8816d()
            if (r4 != 0) goto L_0x003f
            int r4 = r13.mo8814c(r5)
            int r4 = r4 + r3
        L_0x0038:
            int r3 = r13.mo8814c(r3)
            r12 = r2
            r11 = r4
            goto L_0x0061
        L_0x003f:
            int r4 = r13.mo8814c(r5)
            switch(r4) {
                case 0: goto L_0x005e;
                case 1: goto L_0x005a;
                case 2: goto L_0x0053;
                case 3: goto L_0x004a;
                default: goto L_0x0046;
            }
        L_0x0046:
            r12 = r2
            r3 = 0
            r11 = 0
            goto L_0x0061
        L_0x004a:
            r4 = 8
            int r4 = r13.mo8814c(r4)
            int r4 = r4 + 25
            goto L_0x0038
        L_0x0053:
            int r4 = r13.mo8814c(r3)
            int r4 = r4 + 9
            goto L_0x0038
        L_0x005a:
            r12 = r2
            r3 = 0
            r11 = 2
            goto L_0x0061
        L_0x005e:
            r12 = r2
            r3 = 0
            goto L_0x0014
        L_0x0061:
            if (r11 == 0) goto L_0x007d
            if (r8 == 0) goto L_0x007d
            if (r15 == 0) goto L_0x0069
            byte r3 = r15[r3]
        L_0x0069:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007d:
            int r10 = r10 + r11
            if (r12 == 0) goto L_0x0081
            return r10
        L_0x0081:
            r2 = r12
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p110b.C2755b.m13116b(com.google.android.exoplayer2.c.j, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: b */
    private static C2758c m13117b(C2499j jVar) {
        byte[] bArr;
        int c = jVar.mo8814c(16);
        jVar.mo8812b(4);
        int c2 = jVar.mo8814c(2);
        boolean d = jVar.mo8816d();
        jVar.mo8812b(1);
        byte[] bArr2 = null;
        if (c2 == 1) {
            jVar.mo8812b(jVar.mo8814c(8) * 16);
        } else if (c2 == 0) {
            int c3 = jVar.mo8814c(16);
            int c4 = jVar.mo8814c(16);
            if (c3 > 0) {
                bArr2 = new byte[c3];
                jVar.mo8810a(bArr2, 0, c3);
            }
            if (c4 > 0) {
                bArr = new byte[c4];
                jVar.mo8810a(bArr, 0, c4);
                return new C2758c(c, d, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C2758c(c, d, bArr2, bArr);
    }

    /* renamed from: b */
    private static C2761f m13118b(C2499j jVar, int i) {
        int i2;
        int i3;
        C2499j jVar2 = jVar;
        int c = jVar2.mo8814c(8);
        jVar2.mo8812b(4);
        boolean d = jVar.mo8816d();
        jVar2.mo8812b(3);
        int i4 = 16;
        int c2 = jVar2.mo8814c(16);
        int c3 = jVar2.mo8814c(16);
        int c4 = jVar2.mo8814c(3);
        int c5 = jVar2.mo8814c(3);
        int i5 = 2;
        jVar2.mo8812b(2);
        int c6 = jVar2.mo8814c(8);
        int c7 = jVar2.mo8814c(8);
        int c8 = jVar2.mo8814c(4);
        int c9 = jVar2.mo8814c(2);
        jVar2.mo8812b(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int c10 = jVar2.mo8814c(i4);
            int c11 = jVar2.mo8814c(i5);
            int c12 = jVar2.mo8814c(i5);
            int c13 = jVar2.mo8814c(12);
            int i7 = c9;
            jVar2.mo8812b(4);
            int c14 = jVar2.mo8814c(12);
            i6 -= 6;
            if (c11 == 1 || c11 == 2) {
                i6 -= 2;
                i3 = jVar2.mo8814c(8);
                i2 = jVar2.mo8814c(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            C2762g gVar = new C2762g(c11, c12, c13, c14, i3, i2);
            sparseArray.put(c10, gVar);
            c9 = i7;
            i5 = 2;
            i4 = 16;
        }
        C2761f fVar = new C2761f(c, d, c2, c3, c4, c5, c6, c7, c8, c9, sparseArray);
        return fVar;
    }

    /* renamed from: b */
    private static int[] m13119b() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v4, types: [byte] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m13120c(com.google.android.exoplayer2.p102c.C2499j r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L_0x0009:
            r3 = 8
            int r4 = r13.mo8814c(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0016
            r12 = r2
            r3 = r4
            r11 = 1
            goto L_0x0035
        L_0x0016:
            boolean r4 = r13.mo8816d()
            r6 = 7
            if (r4 != 0) goto L_0x002b
            int r3 = r13.mo8814c(r6)
            if (r3 == 0) goto L_0x0027
            r12 = r2
            r11 = r3
            r3 = 0
            goto L_0x0035
        L_0x0027:
            r3 = 0
            r11 = 0
            r12 = 1
            goto L_0x0035
        L_0x002b:
            int r4 = r13.mo8814c(r6)
            int r3 = r13.mo8814c(r3)
            r12 = r2
            r11 = r4
        L_0x0035:
            if (r11 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r3 = r15[r3]
        L_0x003d:
            r2 = r14[r3]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r11
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r11
            if (r12 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r12
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p110b.C2755b.m13120c(com.google.android.exoplayer2.c.j, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: c */
    private static C2756a m13121c(C2499j jVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C2499j jVar2 = jVar;
        int i7 = 8;
        int c = jVar2.mo8814c(8);
        jVar2.mo8812b(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] b = m13119b();
        int[] c2 = m13122c();
        int[] d = m13123d();
        while (i9 > 0) {
            int c3 = jVar2.mo8814c(i7);
            int c4 = jVar2.mo8814c(i7);
            int i10 = i9 - 2;
            int[] iArr = (c4 & 128) != 0 ? b : (c4 & 64) != 0 ? c2 : d;
            if ((c4 & 1) != 0) {
                i5 = jVar2.mo8814c(i7);
                i4 = jVar2.mo8814c(i7);
                i3 = jVar2.mo8814c(i7);
                i2 = jVar2.mo8814c(i7);
                i6 = i10 - 4;
            } else {
                i3 = jVar2.mo8814c(4) << 4;
                i6 = i10 - 2;
                i2 = jVar2.mo8814c(i8) << 6;
                i5 = jVar2.mo8814c(6) << i8;
                i4 = jVar2.mo8814c(4) << 4;
            }
            if (i5 == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 255;
            }
            byte b2 = (byte) (255 - (i2 & 255));
            int i11 = i6;
            double d2 = (double) i5;
            int i12 = c;
            double d3 = (double) (i4 - 128);
            Double.isNaN(d3);
            double d4 = 1.402d * d3;
            Double.isNaN(d2);
            int i13 = (int) (d2 + d4);
            double d5 = (double) (i3 - 128);
            Double.isNaN(d5);
            double d6 = 0.34414d * d5;
            Double.isNaN(d2);
            double d7 = d2 - d6;
            Double.isNaN(d3);
            int i14 = (int) (d7 - (d3 * 0.71414d));
            Double.isNaN(d5);
            double d8 = d5 * 1.772d;
            Double.isNaN(d2);
            iArr[c3] = m13108a(b2, C2511s.m11798a(i13, 0, 255), C2511s.m11798a(i14, 0, 255), C2511s.m11798a((int) (d2 + d8), 0, 255));
            i9 = i11;
            c = i12;
            i7 = 8;
            i8 = 2;
        }
        return new C2756a(c, b, c2, d);
    }

    /* renamed from: c */
    private static int[] m13122c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < iArr.length; i++) {
            if (i < 8) {
                iArr[i] = m13108a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m13108a(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: d */
    private static int[] m13123d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m13108a(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m13108a(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m13108a(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m13108a(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m13108a(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public List<C2741a> mo9434a(byte[] bArr, int i) {
        int i2;
        SparseArray<C2762g> sparseArray;
        C2499j jVar = new C2499j(bArr, i);
        while (jVar.mo8807a() >= 48 && jVar.mo8814c(8) == 15) {
            m13112a(jVar, this.f9496i);
        }
        if (this.f9496i.f9543i == null) {
            return Collections.emptyList();
        }
        C2757b bVar = this.f9496i.f9542h != null ? this.f9496i.f9542h : this.f9494g;
        if (!(this.f9497j != null && bVar.f9502a + 1 == this.f9497j.getWidth() && bVar.f9503b + 1 == this.f9497j.getHeight())) {
            this.f9497j = Bitmap.createBitmap(bVar.f9502a + 1, bVar.f9503b + 1, Config.ARGB_8888);
            this.f9493f.setBitmap(this.f9497j);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C2760e> sparseArray2 = this.f9496i.f9543i.f9515d;
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            C2760e eVar = (C2760e) sparseArray2.valueAt(i3);
            C2761f fVar = (C2761f) this.f9496i.f9537c.get(sparseArray2.keyAt(i3));
            int i4 = eVar.f9516a + bVar.f9504c;
            int i5 = eVar.f9517b + bVar.f9506e;
            float f = (float) i4;
            float f2 = (float) i5;
            float f3 = f2;
            float f4 = f;
            this.f9493f.clipRect(f, f2, (float) Math.min(fVar.f9520c + i4, bVar.f9505d), (float) Math.min(fVar.f9521d + i5, bVar.f9507f), Op.REPLACE);
            C2756a aVar = (C2756a) this.f9496i.f9538d.get(fVar.f9524g);
            if (aVar == null) {
                aVar = (C2756a) this.f9496i.f9540f.get(fVar.f9524g);
                if (aVar == null) {
                    aVar = this.f9495h;
                }
            }
            SparseArray<C2762g> sparseArray3 = fVar.f9528k;
            int i6 = 0;
            while (i6 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i6);
                C2762g gVar = (C2762g) sparseArray3.valueAt(i6);
                C2758c cVar = (C2758c) this.f9496i.f9539e.get(keyAt);
                C2758c cVar2 = cVar == null ? (C2758c) this.f9496i.f9541g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i2 = i6;
                    sparseArray = sparseArray3;
                    m13113a(cVar2, aVar, fVar.f9523f, gVar.f9531c + i4, i5 + gVar.f9532d, cVar2.f9509b ? null : this.f9491d, this.f9493f);
                } else {
                    i2 = i6;
                    sparseArray = sparseArray3;
                }
                i6 = i2 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f9519b) {
                int i7 = fVar.f9523f == 3 ? aVar.f9501d[fVar.f9525h] : fVar.f9523f == 2 ? aVar.f9500c[fVar.f9526i] : aVar.f9499b[fVar.f9527j];
                this.f9492e.setColor(i7);
                this.f9493f.drawRect(f4, f3, (float) (fVar.f9520c + i4), (float) (fVar.f9521d + i5), this.f9492e);
            }
            C2741a aVar2 = new C2741a(Bitmap.createBitmap(this.f9497j, i4, i5, fVar.f9520c, fVar.f9521d), f4 / ((float) bVar.f9502a), 0, f3 / ((float) bVar.f9503b), 0, ((float) fVar.f9520c) / ((float) bVar.f9502a), ((float) fVar.f9521d) / ((float) bVar.f9503b));
            arrayList.add(aVar2);
            this.f9493f.drawColor(0, Mode.CLEAR);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo9435a() {
        this.f9496i.mo9437a();
    }
}
