package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.video.b */
public final class C2822b {

    /* renamed from: a */
    public final List<byte[]> f9786a;

    /* renamed from: b */
    public final int f9787b;

    private C2822b(List<byte[]> list, int i) {
        this.f9786a = list;
        this.f9787b = i;
    }

    /* renamed from: a */
    public static C2822b m13426a(C2500k kVar) {
        try {
            kVar.mo8829d(21);
            int g = kVar.mo8834g() & 3;
            int g2 = kVar.mo8834g();
            int d = kVar.mo8828d();
            int i = 0;
            int i2 = 0;
            while (i < g2) {
                kVar.mo8829d(1);
                int h = kVar.mo8835h();
                int i3 = i2;
                for (int i4 = 0; i4 < h; i4++) {
                    int h2 = kVar.mo8835h();
                    i3 += h2 + 4;
                    kVar.mo8829d(h2);
                }
                i++;
                i2 = i3;
            }
            kVar.mo8827c(d);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            int i6 = 0;
            while (i5 < g2) {
                kVar.mo8829d(1);
                int h3 = kVar.mo8835h();
                int i7 = i6;
                for (int i8 = 0; i8 < h3; i8++) {
                    int h4 = kVar.mo8835h();
                    System.arraycopy(C2496i.f8073a, 0, bArr, i7, C2496i.f8073a.length);
                    int length = i7 + C2496i.f8073a.length;
                    System.arraycopy(kVar.f8094a, kVar.mo8828d(), bArr, length, h4);
                    i7 = length + h4;
                    kVar.mo8829d(h4);
                }
                i5++;
                i6 = i7;
            }
            return new C2822b(i2 == 0 ? null : Collections.singletonList(bArr), g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
