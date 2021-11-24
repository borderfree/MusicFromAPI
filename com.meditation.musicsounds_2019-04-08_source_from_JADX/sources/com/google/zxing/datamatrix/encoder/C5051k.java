package com.google.zxing.datamatrix.encoder;

import com.google.zxing.C5022a;

/* renamed from: com.google.zxing.datamatrix.encoder.k */
public class C5051k {

    /* renamed from: a */
    static final C5051k[] f17994a;

    /* renamed from: d */
    private static C5051k[] f17995d;

    /* renamed from: b */
    public final int f17996b;

    /* renamed from: c */
    public final int f17997c;

    /* renamed from: e */
    private final boolean f17998e;

    /* renamed from: f */
    private final int f17999f;

    /* renamed from: g */
    private final int f18000g;

    /* renamed from: h */
    private final int f18001h;

    /* renamed from: i */
    private final int f18002i;

    /* renamed from: j */
    private final int f18003j;

    static {
        C5051k kVar = new C5051k(false, 3, 5, 8, 8, 1);
        C5051k kVar2 = new C5051k(false, 5, 7, 10, 10, 1);
        C5051k kVar3 = new C5051k(true, 5, 7, 16, 6, 1);
        C5051k kVar4 = new C5051k(false, 8, 10, 12, 12, 1);
        C5051k kVar5 = new C5051k(true, 10, 11, 14, 6, 2);
        C5051k kVar6 = new C5051k(false, 12, 12, 14, 14, 1);
        C5051k kVar7 = new C5051k(true, 16, 14, 24, 10, 1);
        C5051k kVar8 = new C5051k(false, 18, 14, 16, 16, 1);
        C5051k kVar9 = new C5051k(false, 22, 18, 18, 18, 1);
        C5051k kVar10 = new C5051k(true, 22, 18, 16, 10, 2);
        C5051k kVar11 = new C5051k(false, 30, 20, 20, 20, 1);
        C5051k kVar12 = new C5051k(true, 32, 24, 16, 14, 2);
        C5051k kVar13 = new C5051k(false, 36, 24, 22, 22, 1);
        C5051k kVar14 = new C5051k(false, 44, 28, 24, 24, 1);
        C5051k kVar15 = new C5051k(true, 49, 28, 22, 14, 2);
        C5051k kVar16 = new C5051k(false, 62, 36, 14, 14, 4);
        C5051k kVar17 = new C5051k(false, 86, 42, 16, 16, 4);
        C5051k kVar18 = new C5051k(false, 114, 48, 18, 18, 4);
        C5051k kVar19 = new C5051k(false, 144, 56, 20, 20, 4);
        C5051k kVar20 = new C5051k(false, 174, 68, 22, 22, 4);
        C5051k kVar21 = new C5051k(false, 204, 84, 24, 24, 4, 102, 42);
        C5051k kVar22 = new C5051k(false, 280, 112, 14, 14, 16, 140, 56);
        C5051k kVar23 = new C5051k(false, 368, 144, 16, 16, 16, 92, 36);
        C5051k kVar24 = new C5051k(false, 456, 192, 18, 18, 16, 114, 48);
        C5051k kVar25 = new C5051k(false, 576, 224, 20, 20, 16, 144, 56);
        C5051k kVar26 = new C5051k(false, 696, 272, 22, 22, 16, 174, 68);
        C5051k kVar27 = new C5051k(false, 816, 336, 24, 24, 16, 136, 56);
        C5051k kVar28 = new C5051k(false, 1050, 408, 18, 18, 36, 175, 68);
        C5051k kVar29 = new C5051k(false, 1304, 496, 20, 20, 36, 163, 62);
        C5051k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20, kVar21, kVar22, kVar23, kVar24, kVar25, kVar26, kVar27, kVar28, kVar29, new C5044d()};
        f17994a = kVarArr;
        f17995d = kVarArr;
    }

    public C5051k(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    C5051k(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f17998e = z;
        this.f17999f = i;
        this.f18000g = i2;
        this.f17996b = i3;
        this.f17997c = i4;
        this.f18001h = i5;
        this.f18002i = i6;
        this.f18003j = i7;
    }

    /* renamed from: a */
    public static C5051k m25051a(int i, SymbolShapeHint symbolShapeHint, C5022a aVar, C5022a aVar2, boolean z) {
        C5051k[] kVarArr;
        for (C5051k kVar : f17995d) {
            if ((symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !kVar.f17998e) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || kVar.f17998e) && ((aVar == null || (kVar.mo16470d() >= aVar.mo16363a() && kVar.mo16471e() >= aVar.mo16364b())) && ((aVar2 == null || (kVar.mo16470d() <= aVar2.mo16363a() && kVar.mo16471e() <= aVar2.mo16364b())) && i <= kVar.f17999f)))) {
                return kVar;
            }
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Can't find a symbol arrangement that matches the message. Data codewords: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: h */
    private int m25052h() {
        int i = this.f18001h;
        if (i != 4) {
            if (i == 16) {
                return 4;
            }
            if (i == 36) {
                return 6;
            }
            switch (i) {
                case 1:
                    return 1;
                case 2:
                    break;
                default:
                    throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return 2;
    }

    /* renamed from: i */
    private int m25053i() {
        int i = this.f18001h;
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        switch (i) {
            case 1:
            case 2:
                return 1;
            default:
                throw new IllegalStateException("Cannot handle this number of data regions");
        }
    }

    /* renamed from: a */
    public int mo16444a() {
        return this.f17999f / this.f18002i;
    }

    /* renamed from: a */
    public int mo16445a(int i) {
        return this.f18002i;
    }

    /* renamed from: b */
    public final int mo16467b() {
        return m25052h() * this.f17996b;
    }

    /* renamed from: b */
    public final int mo16468b(int i) {
        return this.f18003j;
    }

    /* renamed from: c */
    public final int mo16469c() {
        return m25053i() * this.f17997c;
    }

    /* renamed from: d */
    public final int mo16470d() {
        return mo16467b() + (m25052h() << 1);
    }

    /* renamed from: e */
    public final int mo16471e() {
        return mo16469c() + (m25053i() << 1);
    }

    /* renamed from: f */
    public final int mo16472f() {
        return this.f17999f;
    }

    /* renamed from: g */
    public final int mo16473g() {
        return this.f18000g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17998e ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f17996b);
        sb.append('x');
        sb.append(this.f17997c);
        sb.append(", symbol size ");
        sb.append(mo16470d());
        sb.append('x');
        sb.append(mo16471e());
        sb.append(", symbol data size ");
        sb.append(mo16467b());
        sb.append('x');
        sb.append(mo16469c());
        sb.append(", codewords ");
        sb.append(this.f17999f);
        sb.append('+');
        sb.append(this.f18000g);
        return sb.toString();
    }
}
