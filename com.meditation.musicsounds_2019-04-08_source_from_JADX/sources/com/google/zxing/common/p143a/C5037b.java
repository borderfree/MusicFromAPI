package com.google.zxing.common.p143a;

/* renamed from: com.google.zxing.common.a.b */
final class C5037b {

    /* renamed from: a */
    private final C5036a f17968a;

    /* renamed from: b */
    private final int[] f17969b;

    C5037b(C5036a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f17968a = aVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.f17969b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f17969b = new int[]{0};
                return;
            }
            this.f17969b = new int[(length - i)];
            System.arraycopy(iArr, i, this.f17969b, 0, this.f17969b.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo16416a(int i) {
        return this.f17969b[(this.f17969b.length - 1) - i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5037b mo16417a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f17968a.mo16409a();
        } else {
            int length = this.f17969b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f17968a.mo16414c(this.f17969b[i3], i2);
            }
            return new C5037b(this.f17968a, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5037b mo16418a(C5037b bVar) {
        if (!this.f17968a.equals(bVar.f17968a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo16422c()) {
            return bVar;
        } else {
            if (bVar.mo16422c()) {
                return this;
            }
            int[] iArr = this.f17969b;
            int[] iArr2 = bVar.f17969b;
            if (iArr.length > iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr2.length];
            int length = iArr2.length - iArr.length;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            for (int i = length; i < iArr2.length; i++) {
                iArr4[i] = C5036a.m24953b(iArr[i - length], iArr2[i]);
            }
            return new C5037b(this.f17968a, iArr4);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo16419a() {
        return this.f17969b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo16420b() {
        return this.f17969b.length - 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C5037b mo16421b(C5037b bVar) {
        if (!this.f17968a.equals(bVar.f17968a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (mo16422c() || bVar.mo16422c()) {
            return this.f17968a.mo16409a();
        } else {
            int[] iArr = this.f17969b;
            int length = iArr.length;
            int[] iArr2 = bVar.f17969b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C5036a.m24953b(iArr3[i4], this.f17968a.mo16414c(i2, iArr2[i3]));
                }
            }
            return new C5037b(this.f17968a, iArr3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo16422c() {
        return this.f17969b[0] == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C5037b[] mo16423c(C5037b bVar) {
        if (!this.f17968a.equals(bVar.f17968a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.mo16422c()) {
            C5037b a = this.f17968a.mo16409a();
            int c = this.f17968a.mo16413c(bVar.mo16416a(bVar.mo16420b()));
            C5037b bVar2 = a;
            C5037b bVar3 = this;
            while (bVar3.mo16420b() >= bVar.mo16420b() && !bVar3.mo16422c()) {
                int b = bVar3.mo16420b() - bVar.mo16420b();
                int c2 = this.f17968a.mo16414c(bVar3.mo16416a(bVar3.mo16420b()), c);
                C5037b a2 = bVar.mo16417a(b, c2);
                bVar2 = bVar2.mo16418a(this.f17968a.mo16410a(b, c2));
                bVar3 = bVar3.mo16418a(a2);
            }
            return new C5037b[]{bVar2, bVar3};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder(mo16420b() * 8);
        for (int b = mo16420b(); b >= 0; b--) {
            int a = mo16416a(b);
            if (a != 0) {
                if (a < 0) {
                    sb.append(" - ");
                    a = -a;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b == 0 || a != 1) {
                    int b2 = this.f17968a.mo16412b(a);
                    if (b2 == 0) {
                        c = '1';
                    } else if (b2 == 1) {
                        c = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(b2);
                    }
                    sb.append(c);
                }
                if (b != 0) {
                    if (b == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b);
                    }
                }
            }
        }
        return sb.toString();
    }
}
