package com.google.zxing.common.p143a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.common.a.c */
public final class C5038c {

    /* renamed from: a */
    private final C5036a f17970a;

    /* renamed from: b */
    private final List<C5037b> f17971b = new ArrayList();

    public C5038c(C5036a aVar) {
        this.f17970a = aVar;
        this.f17971b.add(new C5037b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C5037b m24969a(int i) {
        if (i >= this.f17971b.size()) {
            C5037b bVar = (C5037b) this.f17971b.get(this.f17971b.size() - 1);
            for (int size = this.f17971b.size(); size <= i; size++) {
                bVar = bVar.mo16421b(new C5037b(this.f17970a, new int[]{1, this.f17970a.mo16408a((size - 1) + this.f17970a.mo16411b())}));
                this.f17971b.add(bVar);
            }
        }
        return (C5037b) this.f17971b.get(i);
    }

    /* renamed from: a */
    public void mo16425a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C5037b a = m24969a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] a2 = new C5037b(this.f17970a, iArr2).mo16417a(i, 1).mo16423c(a)[1].mo16419a();
                int length2 = i - a2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(a2, 0, iArr, length + length2, a2.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
