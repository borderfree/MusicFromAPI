package com.google.android.exoplayer2.p102c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.c.o */
public class C2504o {

    /* renamed from: a */
    private static final Comparator<C2507a> f8104a = new Comparator<C2507a>() {
        /* renamed from: a */
        public int compare(C2507a aVar, C2507a aVar2) {
            return aVar.f8113a - aVar2.f8113a;
        }
    };

    /* renamed from: b */
    private static final Comparator<C2507a> f8105b = new Comparator<C2507a>() {
        /* renamed from: a */
        public int compare(C2507a aVar, C2507a aVar2) {
            if (aVar.f8115c < aVar2.f8115c) {
                return -1;
            }
            return aVar2.f8115c < aVar.f8115c ? 1 : 0;
        }
    };

    /* renamed from: c */
    private final int f8106c;

    /* renamed from: d */
    private final ArrayList<C2507a> f8107d = new ArrayList<>();

    /* renamed from: e */
    private final C2507a[] f8108e = new C2507a[5];

    /* renamed from: f */
    private int f8109f = -1;

    /* renamed from: g */
    private int f8110g;

    /* renamed from: h */
    private int f8111h;

    /* renamed from: i */
    private int f8112i;

    /* renamed from: com.google.android.exoplayer2.c.o$a */
    private static class C2507a {

        /* renamed from: a */
        public int f8113a;

        /* renamed from: b */
        public int f8114b;

        /* renamed from: c */
        public float f8115c;

        private C2507a() {
        }
    }

    public C2504o(int i) {
        this.f8106c = i;
    }

    /* renamed from: a */
    private void m11770a() {
        if (this.f8109f != 1) {
            Collections.sort(this.f8107d, f8104a);
            this.f8109f = 1;
        }
    }

    /* renamed from: b */
    private void m11771b() {
        if (this.f8109f != 0) {
            Collections.sort(this.f8107d, f8105b);
            this.f8109f = 0;
        }
    }

    /* renamed from: a */
    public float mo8865a(float f) {
        m11771b();
        float f2 = f * ((float) this.f8111h);
        int i = 0;
        for (int i2 = 0; i2 < this.f8107d.size(); i2++) {
            C2507a aVar = (C2507a) this.f8107d.get(i2);
            i += aVar.f8114b;
            if (((float) i) >= f2) {
                return aVar.f8115c;
            }
        }
        return this.f8107d.isEmpty() ? Float.NaN : ((C2507a) this.f8107d.get(this.f8107d.size() - 1)).f8115c;
    }

    /* renamed from: a */
    public void mo8866a(int i, float f) {
        C2507a aVar;
        m11770a();
        if (this.f8112i > 0) {
            C2507a[] aVarArr = this.f8108e;
            int i2 = this.f8112i - 1;
            this.f8112i = i2;
            aVar = aVarArr[i2];
        } else {
            aVar = new C2507a();
        }
        int i3 = this.f8110g;
        this.f8110g = i3 + 1;
        aVar.f8113a = i3;
        aVar.f8114b = i;
        aVar.f8115c = f;
        this.f8107d.add(aVar);
        int i4 = this.f8111h + i;
        while (true) {
            this.f8111h = i4;
            while (this.f8111h > this.f8106c) {
                int i5 = this.f8111h - this.f8106c;
                C2507a aVar2 = (C2507a) this.f8107d.get(0);
                if (aVar2.f8114b <= i5) {
                    this.f8111h -= aVar2.f8114b;
                    this.f8107d.remove(0);
                    if (this.f8112i < 5) {
                        C2507a[] aVarArr2 = this.f8108e;
                        int i6 = this.f8112i;
                        this.f8112i = i6 + 1;
                        aVarArr2[i6] = aVar2;
                    }
                } else {
                    aVar2.f8114b -= i5;
                    i4 = this.f8111h - i5;
                }
            }
            return;
        }
    }
}
