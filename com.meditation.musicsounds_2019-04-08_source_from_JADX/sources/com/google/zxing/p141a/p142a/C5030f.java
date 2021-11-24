package com.google.zxing.p141a.p142a;

import com.google.zxing.common.C5035a;
import java.util.LinkedList;

/* renamed from: com.google.zxing.a.a.f */
final class C5030f {

    /* renamed from: a */
    static final C5030f f17940a = new C5030f(C5031g.f17945a, 0, 0, 0);

    /* renamed from: b */
    private final int f17941b;

    /* renamed from: c */
    private final C5031g f17942c;

    /* renamed from: d */
    private final int f17943d;

    /* renamed from: e */
    private final int f17944e;

    private C5030f(C5031g gVar, int i, int i2, int i3) {
        this.f17942c = gVar;
        this.f17941b = i;
        this.f17943d = i2;
        this.f17944e = i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo16381a() {
        return this.f17941b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5030f mo16382a(int i) {
        C5031g gVar = this.f17942c;
        int i2 = this.f17941b;
        int i3 = this.f17944e;
        if (this.f17941b == 4 || this.f17941b == 2) {
            int i4 = C5027d.f17933b[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.mo16392a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = (this.f17943d == 0 || this.f17943d == 31) ? 18 : this.f17943d == 62 ? 9 : 8;
        C5030f fVar = new C5030f(gVar, i2, this.f17943d + 1, i3 + i7);
        return fVar.f17943d == 2078 ? fVar.mo16387b(i + 1) : fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5030f mo16383a(int i, int i2) {
        int i3 = this.f17944e;
        C5031g gVar = this.f17942c;
        if (i != this.f17941b) {
            int i4 = C5027d.f17933b[this.f17941b][i];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            gVar = gVar.mo16392a(i5, i6);
            i3 += i6;
        }
        int i7 = i == 2 ? 4 : 5;
        return new C5030f(gVar.mo16392a(i2, i7), i, 0, i3 + i7);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5035a mo16384a(byte[] bArr) {
        LinkedList<C5031g> linkedList = new LinkedList<>();
        for (C5031g gVar = mo16387b(bArr.length).f17942c; gVar != null; gVar = gVar.mo16391a()) {
            linkedList.addFirst(gVar);
        }
        C5035a aVar = new C5035a();
        for (C5031g a : linkedList) {
            a.mo16375a(aVar, bArr);
        }
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo16385a(C5030f fVar) {
        int i = this.f17944e + (C5027d.f17933b[this.f17941b][fVar.f17941b] >> 16);
        if (fVar.f17943d > 0 && (this.f17943d == 0 || this.f17943d > fVar.f17943d)) {
            i += 10;
        }
        return i <= fVar.f17944e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo16386b() {
        return this.f17943d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C5030f mo16387b(int i) {
        return this.f17943d == 0 ? this : new C5030f(this.f17942c.mo16393b(i - this.f17943d, this.f17943d), this.f17941b, 0, this.f17944e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C5030f mo16388b(int i, int i2) {
        C5031g gVar = this.f17942c;
        int i3 = this.f17941b == 2 ? 4 : 5;
        return new C5030f(gVar.mo16392a(C5027d.f17934c[this.f17941b][i], i3).mo16392a(i2, 5), this.f17941b, 0, this.f17944e + i3 + 5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo16389c() {
        return this.f17944e;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C5027d.f17932a[this.f17941b], Integer.valueOf(this.f17944e), Integer.valueOf(this.f17943d)});
    }
}
