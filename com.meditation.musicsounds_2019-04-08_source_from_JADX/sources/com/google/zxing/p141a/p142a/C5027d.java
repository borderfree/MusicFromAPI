package com.google.zxing.p141a.p142a;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.google.zxing.a.a.d */
public final class C5027d {

    /* renamed from: a */
    static final String[] f17932a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* renamed from: b */
    static final int[][] f17933b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* renamed from: c */
    static final int[][] f17934c;

    /* renamed from: d */
    private static final int[][] f17935d;

    /* renamed from: e */
    private final byte[] f17936e;

    static {
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{5, 256});
        f17935d = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f17935d[0][i] = (i - 65) + 2;
        }
        f17935d[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f17935d[1][i2] = (i2 - 97) + 2;
        }
        f17935d[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f17935d[2][i3] = (i3 - 48) + 2;
        }
        f17935d[2][44] = 12;
        f17935d[2][46] = 13;
        int[] iArr2 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f17935d[3][iArr2[i4]] = i4;
        }
        int[] iArr3 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr3[i5] > 0) {
                f17935d[4][iArr3[i5]] = i5;
            }
        }
        int[][] iArr4 = (int[][]) Array.newInstance(int.class, new int[]{6, 6});
        f17934c = iArr4;
        for (int[] fill : iArr4) {
            Arrays.fill(fill, -1);
        }
        f17934c[0][4] = 0;
        f17934c[1][4] = 0;
        f17934c[1][0] = 28;
        f17934c[3][4] = 0;
        f17934c[2][4] = 0;
        f17934c[2][0] = 15;
    }

    public C5027d(byte[] bArr) {
        this.f17936e = bArr;
    }

    /* renamed from: a */
    private static Collection<C5030f> m24919a(Iterable<C5030f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (C5030f fVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C5030f fVar2 = (C5030f) it.next();
                if (fVar2.mo16385a(fVar)) {
                    z = false;
                    break;
                } else if (fVar.mo16385a(fVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    private Collection<C5030f> m24920a(Iterable<C5030f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (C5030f a : iterable) {
            m24923a(a, i, (Collection<C5030f>) linkedList);
        }
        return m24919a(linkedList);
    }

    /* renamed from: a */
    private static Collection<C5030f> m24921a(Iterable<C5030f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C5030f a : iterable) {
            m24922a(a, i, i2, linkedList);
        }
        return m24919a(linkedList);
    }

    /* renamed from: a */
    private static void m24922a(C5030f fVar, int i, int i2, Collection<C5030f> collection) {
        C5030f b = fVar.mo16387b(i);
        collection.add(b.mo16383a(4, i2));
        if (fVar.mo16381a() != 4) {
            collection.add(b.mo16388b(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(b.mo16383a(2, 16 - i2).mo16383a(2, 1));
        }
        if (fVar.mo16386b() > 0) {
            collection.add(fVar.mo16382a(i).mo16382a(i + 1));
        }
    }

    /* renamed from: a */
    private void m24923a(C5030f fVar, int i, Collection<C5030f> collection) {
        char c = (char) (this.f17936e[i] & 255);
        boolean z = f17935d[fVar.mo16381a()][c] > 0;
        C5030f fVar2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f17935d[i2][c];
            if (i3 > 0) {
                if (fVar2 == null) {
                    fVar2 = fVar.mo16387b(i);
                }
                if (!z || i2 == fVar.mo16381a() || i2 == 2) {
                    collection.add(fVar2.mo16383a(i2, i3));
                }
                if (!z && f17934c[fVar.mo16381a()][i2] >= 0) {
                    collection.add(fVar2.mo16388b(i2, i3));
                }
            }
        }
        if (fVar.mo16386b() > 0 || f17935d[fVar.mo16381a()][c] == 0) {
            collection.add(fVar.mo16382a(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.common.C5035a mo16377a() {
        /*
            r8 = this;
            com.google.zxing.a.a.f r0 = com.google.zxing.p141a.p142a.C5030f.f17940a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1 = 0
            r2 = r0
            r0 = 0
        L_0x0009:
            byte[] r3 = r8.f17936e
            int r3 = r3.length
            if (r0 >= r3) goto L_0x0054
            int r3 = r0 + 1
            byte[] r4 = r8.f17936e
            int r4 = r4.length
            if (r3 >= r4) goto L_0x001a
            byte[] r4 = r8.f17936e
            byte r4 = r4[r3]
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            byte[] r5 = r8.f17936e
            byte r5 = r5[r0]
            r6 = 13
            if (r5 == r6) goto L_0x003f
            r6 = 44
            r7 = 32
            if (r5 == r6) goto L_0x003b
            r6 = 46
            if (r5 == r6) goto L_0x0037
            r6 = 58
            if (r5 == r6) goto L_0x0033
        L_0x0031:
            r4 = 0
            goto L_0x0044
        L_0x0033:
            if (r4 != r7) goto L_0x0031
            r4 = 5
            goto L_0x0044
        L_0x0037:
            if (r4 != r7) goto L_0x0031
            r4 = 3
            goto L_0x0044
        L_0x003b:
            if (r4 != r7) goto L_0x0031
            r4 = 4
            goto L_0x0044
        L_0x003f:
            r5 = 10
            if (r4 != r5) goto L_0x0031
            r4 = 2
        L_0x0044:
            if (r4 <= 0) goto L_0x004d
            java.util.Collection r0 = m24921a(r2, r0, r4)
            r2 = r0
            r0 = r3
            goto L_0x0051
        L_0x004d:
            java.util.Collection r2 = r8.m24920a(r2, r0)
        L_0x0051:
            int r0 = r0 + 1
            goto L_0x0009
        L_0x0054:
            com.google.zxing.a.a.d$1 r0 = new com.google.zxing.a.a.d$1
            r0.<init>()
            java.lang.Object r0 = java.util.Collections.min(r2, r0)
            com.google.zxing.a.a.f r0 = (com.google.zxing.p141a.p142a.C5030f) r0
            byte[] r1 = r8.f17936e
            com.google.zxing.common.a r0 = r0.mo16384a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p141a.p142a.C5027d.mo16377a():com.google.zxing.common.a");
    }
}
