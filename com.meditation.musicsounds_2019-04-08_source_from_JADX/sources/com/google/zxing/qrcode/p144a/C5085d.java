package com.google.zxing.qrcode.p144a;

/* renamed from: com.google.zxing.qrcode.a.d */
final class C5085d {
    /* renamed from: a */
    static int m25174a(C5082b bVar) {
        return m25175a(bVar, true) + m25175a(bVar, false);
    }

    /* renamed from: a */
    private static int m25175a(C5082b bVar, boolean z) {
        int a = z ? bVar.mo16495a() : bVar.mo16499b();
        int b = z ? bVar.mo16499b() : bVar.mo16495a();
        byte[][] c = bVar.mo16500c();
        int i = 0;
        int i2 = 0;
        while (i < a) {
            int i3 = i2;
            int i4 = 0;
            int i5 = 0;
            byte b2 = -1;
            while (i4 < b) {
                byte b3 = z ? c[i][i4] : c[i4][i];
                if (b3 == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    i5 = 1;
                    b2 = b3;
                }
                i4++;
            }
            if (i5 >= 5) {
                i3 += (i5 - 5) + 3;
            }
            i2 = i3;
            i++;
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r1 != 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        r1 = r1 & 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m25176a(int r1, int r2, int r3) {
        /*
            r0 = 1
            switch(r1) {
                case 0: goto L_0x003e;
                case 1: goto L_0x003f;
                case 2: goto L_0x003b;
                case 3: goto L_0x0037;
                case 4: goto L_0x0032;
                case 5: goto L_0x002a;
                case 6: goto L_0x0021;
                case 7: goto L_0x0018;
                default: goto L_0x0004;
            }
        L_0x0004:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid mask pattern: "
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0018:
            int r1 = r3 * r2
            int r1 = r1 % 3
            int r3 = r3 + r2
            r2 = r3 & 1
            int r1 = r1 + r2
            goto L_0x0028
        L_0x0021:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
        L_0x0028:
            r1 = r1 & r0
            goto L_0x0041
        L_0x002a:
            int r3 = r3 * r2
            r1 = r3 & 1
            int r3 = r3 % 3
            int r1 = r1 + r3
            goto L_0x0041
        L_0x0032:
            int r3 = r3 / 2
            int r2 = r2 / 3
            goto L_0x003e
        L_0x0037:
            int r3 = r3 + r2
            int r1 = r3 % 3
            goto L_0x0041
        L_0x003b:
            int r1 = r2 % 3
            goto L_0x0041
        L_0x003e:
            int r3 = r3 + r2
        L_0x003f:
            r1 = r3 & 1
        L_0x0041:
            if (r1 != 0) goto L_0x0044
            return r0
        L_0x0044:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.p144a.C5085d.m25176a(int, int, int):boolean");
    }

    /* renamed from: a */
    private static boolean m25177a(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m25178a(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    static int m25179b(C5082b bVar) {
        byte[][] c = bVar.mo16500c();
        int b = bVar.mo16499b();
        int a = bVar.mo16495a();
        int i = 0;
        int i2 = 0;
        while (i < a - 1) {
            int i3 = i2;
            int i4 = 0;
            while (i4 < b - 1) {
                byte b2 = c[i][i4];
                int i5 = i4 + 1;
                if (b2 == c[i][i5]) {
                    int i6 = i + 1;
                    if (b2 == c[i6][i4] && b2 == c[i6][i5]) {
                        i3++;
                    }
                }
                i4 = i5;
            }
            i++;
            i2 = i3;
        }
        return i2 * 3;
    }

    /* renamed from: c */
    static int m25180c(C5082b bVar) {
        byte[][] c = bVar.mo16500c();
        int b = bVar.mo16499b();
        int a = bVar.mo16495a();
        int i = 0;
        int i2 = 0;
        while (i < a) {
            int i3 = i2;
            for (int i4 = 0; i4 < b; i4++) {
                byte[] bArr = c[i];
                int i5 = i4 + 6;
                if (i5 < b && bArr[i4] == 1 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 1 && bArr[i4 + 3] == 1 && bArr[i4 + 4] == 1 && bArr[i4 + 5] == 0 && bArr[i5] == 1 && (m25177a(bArr, i4 - 4, i4) || m25177a(bArr, i4 + 7, i4 + 11))) {
                    i3++;
                }
                int i6 = i + 6;
                if (i6 < a && c[i][i4] == 1 && c[i + 1][i4] == 0 && c[i + 2][i4] == 1 && c[i + 3][i4] == 1 && c[i + 4][i4] == 1 && c[i + 5][i4] == 0 && c[i6][i4] == 1 && (m25178a(c, i4, i - 4, i) || m25178a(c, i4, i + 7, i + 11))) {
                    i3++;
                }
            }
            i++;
            i2 = i3;
        }
        return i2 * 40;
    }

    /* renamed from: d */
    static int m25181d(C5082b bVar) {
        byte[][] c = bVar.mo16500c();
        int b = bVar.mo16499b();
        int a = bVar.mo16495a();
        int i = 0;
        int i2 = 0;
        while (i < a) {
            byte[] bArr = c[i];
            int i3 = i2;
            for (int i4 = 0; i4 < b; i4++) {
                if (bArr[i4] == 1) {
                    i3++;
                }
            }
            i++;
            i2 = i3;
        }
        int a2 = bVar.mo16495a() * bVar.mo16499b();
        return ((Math.abs((i2 << 1) - a2) * 10) / a2) * 10;
    }
}
