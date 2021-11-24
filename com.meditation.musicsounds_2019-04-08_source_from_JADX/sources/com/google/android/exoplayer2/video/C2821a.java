package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.p102c.C2489b;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2496i.C2498b;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.video.a */
public final class C2821a {

    /* renamed from: a */
    public final List<byte[]> f9781a;

    /* renamed from: b */
    public final int f9782b;

    /* renamed from: c */
    public final int f9783c;

    /* renamed from: d */
    public final int f9784d;

    /* renamed from: e */
    public final float f9785e;

    private C2821a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f9781a = list;
        this.f9782b = i;
        this.f9783c = i2;
        this.f9784d = i3;
        this.f9785e = f;
    }

    /* renamed from: a */
    public static C2821a m13424a(C2500k kVar) {
        float f;
        int i;
        int i2;
        try {
            kVar.mo8829d(4);
            int g = (kVar.mo8834g() & 3) + 1;
            if (g != 3) {
                ArrayList arrayList = new ArrayList();
                int g2 = kVar.mo8834g() & 31;
                for (int i3 = 0; i3 < g2; i3++) {
                    arrayList.add(m13425b(kVar));
                }
                int g3 = kVar.mo8834g();
                for (int i4 = 0; i4 < g3; i4++) {
                    arrayList.add(m13425b(kVar));
                }
                if (g2 > 0) {
                    C2498b a = C2496i.m11699a((byte[]) arrayList.get(0), g, ((byte[]) arrayList.get(0)).length);
                    int i5 = a.f8081b;
                    int i6 = a.f8082c;
                    f = a.f8083d;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                C2821a aVar = new C2821a(arrayList, g, i2, i, f);
                return aVar;
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m13425b(C2500k kVar) {
        int h = kVar.mo8835h();
        int d = kVar.mo8828d();
        kVar.mo8829d(h);
        return C2489b.m11673a(kVar.f8094a, d, h);
    }
}
