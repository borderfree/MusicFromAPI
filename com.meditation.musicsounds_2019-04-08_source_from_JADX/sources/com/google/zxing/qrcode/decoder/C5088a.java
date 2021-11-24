package com.google.zxing.qrcode.decoder;

/* renamed from: com.google.zxing.qrcode.decoder.a */
public final class C5088a {

    /* renamed from: a */
    private static final int[] f18083a = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: b */
    private static final C5088a[] f18084b = m25209d();

    /* renamed from: c */
    private final int f18085c;

    /* renamed from: d */
    private final int[] f18086d;

    /* renamed from: e */
    private final C5090b[] f18087e;

    /* renamed from: f */
    private final int f18088f;

    /* renamed from: com.google.zxing.qrcode.decoder.a$a */
    public static final class C5089a {

        /* renamed from: a */
        private final int f18089a;

        /* renamed from: b */
        private final int f18090b;

        C5089a(int i, int i2) {
            this.f18089a = i;
            this.f18090b = i2;
        }

        /* renamed from: a */
        public int mo16517a() {
            return this.f18089a;
        }

        /* renamed from: b */
        public int mo16518b() {
            return this.f18090b;
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.a$b */
    public static final class C5090b {

        /* renamed from: a */
        private final int f18091a;

        /* renamed from: b */
        private final C5089a[] f18092b;

        C5090b(int i, C5089a... aVarArr) {
            this.f18091a = i;
            this.f18092b = aVarArr;
        }

        /* renamed from: a */
        public int mo16519a() {
            return this.f18091a;
        }

        /* renamed from: b */
        public int mo16520b() {
            int i = 0;
            for (C5089a a : this.f18092b) {
                i += a.mo16517a();
            }
            return i;
        }

        /* renamed from: c */
        public int mo16521c() {
            return this.f18091a * mo16520b();
        }

        /* renamed from: d */
        public C5089a[] mo16522d() {
            return this.f18092b;
        }
    }

    private C5088a(int i, int[] iArr, C5090b... bVarArr) {
        this.f18085c = i;
        this.f18086d = iArr;
        this.f18087e = bVarArr;
        int a = bVarArr[0].mo16519a();
        int i2 = 0;
        for (C5089a aVar : bVarArr[0].mo16522d()) {
            i2 += aVar.mo16517a() * (aVar.mo16518b() + a);
        }
        this.f18088f = i2;
    }

    /* renamed from: a */
    public static C5088a m25208a(int i) {
        if (i > 0 && i <= 40) {
            return f18084b[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    private static C5088a[] m25209d() {
        return new C5088a[]{new C5088a(1, new int[0], new C5090b(7, new C5089a(1, 19)), new C5090b(10, new C5089a(1, 16)), new C5090b(13, new C5089a(1, 13)), new C5090b(17, new C5089a(1, 9))), new C5088a(2, new int[]{6, 18}, new C5090b(10, new C5089a(1, 34)), new C5090b(16, new C5089a(1, 28)), new C5090b(22, new C5089a(1, 22)), new C5090b(28, new C5089a(1, 16))), new C5088a(3, new int[]{6, 22}, new C5090b(15, new C5089a(1, 55)), new C5090b(26, new C5089a(1, 44)), new C5090b(18, new C5089a(2, 17)), new C5090b(22, new C5089a(2, 13))), new C5088a(4, new int[]{6, 26}, new C5090b(20, new C5089a(1, 80)), new C5090b(18, new C5089a(2, 32)), new C5090b(26, new C5089a(2, 24)), new C5090b(16, new C5089a(4, 9))), new C5088a(5, new int[]{6, 30}, new C5090b(26, new C5089a(1, 108)), new C5090b(24, new C5089a(2, 43)), new C5090b(18, new C5089a(2, 15), new C5089a(2, 16)), new C5090b(22, new C5089a(2, 11), new C5089a(2, 12))), new C5088a(6, new int[]{6, 34}, new C5090b(18, new C5089a(2, 68)), new C5090b(16, new C5089a(4, 27)), new C5090b(24, new C5089a(4, 19)), new C5090b(28, new C5089a(4, 15))), new C5088a(7, new int[]{6, 22, 38}, new C5090b(20, new C5089a(2, 78)), new C5090b(18, new C5089a(4, 31)), new C5090b(18, new C5089a(2, 14), new C5089a(4, 15)), new C5090b(26, new C5089a(4, 13), new C5089a(1, 14))), new C5088a(8, new int[]{6, 24, 42}, new C5090b(24, new C5089a(2, 97)), new C5090b(22, new C5089a(2, 38), new C5089a(2, 39)), new C5090b(22, new C5089a(4, 18), new C5089a(2, 19)), new C5090b(26, new C5089a(4, 14), new C5089a(2, 15))), new C5088a(9, new int[]{6, 26, 46}, new C5090b(30, new C5089a(2, 116)), new C5090b(22, new C5089a(3, 36), new C5089a(2, 37)), new C5090b(20, new C5089a(4, 16), new C5089a(4, 17)), new C5090b(24, new C5089a(4, 12), new C5089a(4, 13))), new C5088a(10, new int[]{6, 28, 50}, new C5090b(18, new C5089a(2, 68), new C5089a(2, 69)), new C5090b(26, new C5089a(4, 43), new C5089a(1, 44)), new C5090b(24, new C5089a(6, 19), new C5089a(2, 20)), new C5090b(28, new C5089a(6, 15), new C5089a(2, 16))), new C5088a(11, new int[]{6, 30, 54}, new C5090b(20, new C5089a(4, 81)), new C5090b(30, new C5089a(1, 50), new C5089a(4, 51)), new C5090b(28, new C5089a(4, 22), new C5089a(4, 23)), new C5090b(24, new C5089a(3, 12), new C5089a(8, 13))), new C5088a(12, new int[]{6, 32, 58}, new C5090b(24, new C5089a(2, 92), new C5089a(2, 93)), new C5090b(22, new C5089a(6, 36), new C5089a(2, 37)), new C5090b(26, new C5089a(4, 20), new C5089a(6, 21)), new C5090b(28, new C5089a(7, 14), new C5089a(4, 15))), new C5088a(13, new int[]{6, 34, 62}, new C5090b(26, new C5089a(4, 107)), new C5090b(22, new C5089a(8, 37), new C5089a(1, 38)), new C5090b(24, new C5089a(8, 20), new C5089a(4, 21)), new C5090b(22, new C5089a(12, 11), new C5089a(4, 12))), new C5088a(14, new int[]{6, 26, 46, 66}, new C5090b(30, new C5089a(3, 115), new C5089a(1, 116)), new C5090b(24, new C5089a(4, 40), new C5089a(5, 41)), new C5090b(20, new C5089a(11, 16), new C5089a(5, 17)), new C5090b(24, new C5089a(11, 12), new C5089a(5, 13))), new C5088a(15, new int[]{6, 26, 48, 70}, new C5090b(22, new C5089a(5, 87), new C5089a(1, 88)), new C5090b(24, new C5089a(5, 41), new C5089a(5, 42)), new C5090b(30, new C5089a(5, 24), new C5089a(7, 25)), new C5090b(24, new C5089a(11, 12), new C5089a(7, 13))), new C5088a(16, new int[]{6, 26, 50, 74}, new C5090b(24, new C5089a(5, 98), new C5089a(1, 99)), new C5090b(28, new C5089a(7, 45), new C5089a(3, 46)), new C5090b(24, new C5089a(15, 19), new C5089a(2, 20)), new C5090b(30, new C5089a(3, 15), new C5089a(13, 16))), new C5088a(17, new int[]{6, 30, 54, 78}, new C5090b(28, new C5089a(1, 107), new C5089a(5, 108)), new C5090b(28, new C5089a(10, 46), new C5089a(1, 47)), new C5090b(28, new C5089a(1, 22), new C5089a(15, 23)), new C5090b(28, new C5089a(2, 14), new C5089a(17, 15))), new C5088a(18, new int[]{6, 30, 56, 82}, new C5090b(30, new C5089a(5, 120), new C5089a(1, 121)), new C5090b(26, new C5089a(9, 43), new C5089a(4, 44)), new C5090b(28, new C5089a(17, 22), new C5089a(1, 23)), new C5090b(28, new C5089a(2, 14), new C5089a(19, 15))), new C5088a(19, new int[]{6, 30, 58, 86}, new C5090b(28, new C5089a(3, 113), new C5089a(4, 114)), new C5090b(26, new C5089a(3, 44), new C5089a(11, 45)), new C5090b(26, new C5089a(17, 21), new C5089a(4, 22)), new C5090b(26, new C5089a(9, 13), new C5089a(16, 14))), new C5088a(20, new int[]{6, 34, 62, 90}, new C5090b(28, new C5089a(3, 107), new C5089a(5, 108)), new C5090b(26, new C5089a(3, 41), new C5089a(13, 42)), new C5090b(30, new C5089a(15, 24), new C5089a(5, 25)), new C5090b(28, new C5089a(15, 15), new C5089a(10, 16))), new C5088a(21, new int[]{6, 28, 50, 72, 94}, new C5090b(28, new C5089a(4, 116), new C5089a(4, 117)), new C5090b(26, new C5089a(17, 42)), new C5090b(28, new C5089a(17, 22), new C5089a(6, 23)), new C5090b(30, new C5089a(19, 16), new C5089a(6, 17))), new C5088a(22, new int[]{6, 26, 50, 74, 98}, new C5090b(28, new C5089a(2, 111), new C5089a(7, 112)), new C5090b(28, new C5089a(17, 46)), new C5090b(30, new C5089a(7, 24), new C5089a(16, 25)), new C5090b(24, new C5089a(34, 13))), new C5088a(23, new int[]{6, 30, 54, 78, 102}, new C5090b(30, new C5089a(4, 121), new C5089a(5, 122)), new C5090b(28, new C5089a(4, 47), new C5089a(14, 48)), new C5090b(30, new C5089a(11, 24), new C5089a(14, 25)), new C5090b(30, new C5089a(16, 15), new C5089a(14, 16))), new C5088a(24, new int[]{6, 28, 54, 80, 106}, new C5090b(30, new C5089a(6, 117), new C5089a(4, 118)), new C5090b(28, new C5089a(6, 45), new C5089a(14, 46)), new C5090b(30, new C5089a(11, 24), new C5089a(16, 25)), new C5090b(30, new C5089a(30, 16), new C5089a(2, 17))), new C5088a(25, new int[]{6, 32, 58, 84, 110}, new C5090b(26, new C5089a(8, 106), new C5089a(4, 107)), new C5090b(28, new C5089a(8, 47), new C5089a(13, 48)), new C5090b(30, new C5089a(7, 24), new C5089a(22, 25)), new C5090b(30, new C5089a(22, 15), new C5089a(13, 16))), new C5088a(26, new int[]{6, 30, 58, 86, 114}, new C5090b(28, new C5089a(10, 114), new C5089a(2, 115)), new C5090b(28, new C5089a(19, 46), new C5089a(4, 47)), new C5090b(28, new C5089a(28, 22), new C5089a(6, 23)), new C5090b(30, new C5089a(33, 16), new C5089a(4, 17))), new C5088a(27, new int[]{6, 34, 62, 90, 118}, new C5090b(30, new C5089a(8, 122), new C5089a(4, 123)), new C5090b(28, new C5089a(22, 45), new C5089a(3, 46)), new C5090b(30, new C5089a(8, 23), new C5089a(26, 24)), new C5090b(30, new C5089a(12, 15), new C5089a(28, 16))), new C5088a(28, new int[]{6, 26, 50, 74, 98, 122}, new C5090b(30, new C5089a(3, 117), new C5089a(10, 118)), new C5090b(28, new C5089a(3, 45), new C5089a(23, 46)), new C5090b(30, new C5089a(4, 24), new C5089a(31, 25)), new C5090b(30, new C5089a(11, 15), new C5089a(31, 16))), new C5088a(29, new int[]{6, 30, 54, 78, 102, 126}, new C5090b(30, new C5089a(7, 116), new C5089a(7, 117)), new C5090b(28, new C5089a(21, 45), new C5089a(7, 46)), new C5090b(30, new C5089a(1, 23), new C5089a(37, 24)), new C5090b(30, new C5089a(19, 15), new C5089a(26, 16))), new C5088a(30, new int[]{6, 26, 52, 78, 104, 130}, new C5090b(30, new C5089a(5, 115), new C5089a(10, 116)), new C5090b(28, new C5089a(19, 47), new C5089a(10, 48)), new C5090b(30, new C5089a(15, 24), new C5089a(25, 25)), new C5090b(30, new C5089a(23, 15), new C5089a(25, 16))), new C5088a(31, new int[]{6, 30, 56, 82, 108, 134}, new C5090b(30, new C5089a(13, 115), new C5089a(3, 116)), new C5090b(28, new C5089a(2, 46), new C5089a(29, 47)), new C5090b(30, new C5089a(42, 24), new C5089a(1, 25)), new C5090b(30, new C5089a(23, 15), new C5089a(28, 16))), new C5088a(32, new int[]{6, 34, 60, 86, 112, 138}, new C5090b(30, new C5089a(17, 115)), new C5090b(28, new C5089a(10, 46), new C5089a(23, 47)), new C5090b(30, new C5089a(10, 24), new C5089a(35, 25)), new C5090b(30, new C5089a(19, 15), new C5089a(35, 16))), new C5088a(33, new int[]{6, 30, 58, 86, 114, 142}, new C5090b(30, new C5089a(17, 115), new C5089a(1, 116)), new C5090b(28, new C5089a(14, 46), new C5089a(21, 47)), new C5090b(30, new C5089a(29, 24), new C5089a(19, 25)), new C5090b(30, new C5089a(11, 15), new C5089a(46, 16))), new C5088a(34, new int[]{6, 34, 62, 90, 118, 146}, new C5090b(30, new C5089a(13, 115), new C5089a(6, 116)), new C5090b(28, new C5089a(14, 46), new C5089a(23, 47)), new C5090b(30, new C5089a(44, 24), new C5089a(7, 25)), new C5090b(30, new C5089a(59, 16), new C5089a(1, 17))), new C5088a(35, new int[]{6, 30, 54, 78, 102, 126, 150}, new C5090b(30, new C5089a(12, 121), new C5089a(7, 122)), new C5090b(28, new C5089a(12, 47), new C5089a(26, 48)), new C5090b(30, new C5089a(39, 24), new C5089a(14, 25)), new C5090b(30, new C5089a(22, 15), new C5089a(41, 16))), new C5088a(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new C5090b(30, new C5089a(6, 121), new C5089a(14, 122)), new C5090b(28, new C5089a(6, 47), new C5089a(34, 48)), new C5090b(30, new C5089a(46, 24), new C5089a(10, 25)), new C5090b(30, new C5089a(2, 15), new C5089a(64, 16))), new C5088a(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C5090b(30, new C5089a(17, 122), new C5089a(4, 123)), new C5090b(28, new C5089a(29, 46), new C5089a(14, 47)), new C5090b(30, new C5089a(49, 24), new C5089a(10, 25)), new C5090b(30, new C5089a(24, 15), new C5089a(46, 16))), new C5088a(38, new int[]{6, 32, 58, 84, 110, 136, 162}, new C5090b(30, new C5089a(4, 122), new C5089a(18, 123)), new C5090b(28, new C5089a(13, 46), new C5089a(32, 47)), new C5090b(30, new C5089a(48, 24), new C5089a(14, 25)), new C5090b(30, new C5089a(42, 15), new C5089a(32, 16))), new C5088a(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new C5090b(30, new C5089a(20, 117), new C5089a(4, 118)), new C5090b(28, new C5089a(40, 47), new C5089a(7, 48)), new C5090b(30, new C5089a(43, 24), new C5089a(22, 25)), new C5090b(30, new C5089a(10, 15), new C5089a(67, 16))), new C5088a(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new C5090b(30, new C5089a(19, 118), new C5089a(6, 119)), new C5090b(28, new C5089a(18, 47), new C5089a(31, 48)), new C5090b(30, new C5089a(34, 24), new C5089a(34, 25)), new C5090b(30, new C5089a(20, 15), new C5089a(61, 16)))};
    }

    /* renamed from: a */
    public int mo16512a() {
        return this.f18085c;
    }

    /* renamed from: a */
    public C5090b mo16513a(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.f18087e[errorCorrectionLevel.ordinal()];
    }

    /* renamed from: b */
    public int mo16514b() {
        return this.f18088f;
    }

    /* renamed from: c */
    public int mo16515c() {
        return (this.f18085c * 4) + 17;
    }

    public String toString() {
        return String.valueOf(this.f18085c);
    }
}
