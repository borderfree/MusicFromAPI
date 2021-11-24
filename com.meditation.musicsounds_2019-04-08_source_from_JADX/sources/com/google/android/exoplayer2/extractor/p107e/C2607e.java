package com.google.android.exoplayer2.extractor.p107e;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2636b;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2637c;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.e */
public final class C2607e implements C2637c {

    /* renamed from: a */
    private final int f8756a;

    /* renamed from: b */
    private final List<Format> f8757b;

    public C2607e() {
        this(0);
    }

    public C2607e(int i) {
        this(i, Collections.emptyList());
    }

    public C2607e(int i, List<Format> list) {
        this.f8756a = i;
        if (!m12290a(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.m11319a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (DrmInitData) null));
        }
        this.f8757b = list;
    }

    /* renamed from: a */
    private C2628s m12289a(C2636b bVar) {
        int i;
        String str;
        if (m12290a(32)) {
            return new C2628s(this.f8757b);
        }
        C2500k kVar = new C2500k(bVar.f8959d);
        List<Format> list = this.f8757b;
        while (kVar.mo8824b() > 0) {
            int d = kVar.mo8828d() + kVar.mo8834g();
            if (kVar.mo8834g() == 134) {
                list = new ArrayList<>();
                int g = kVar.mo8834g() & 31;
                for (int i2 = 0; i2 < g; i2++) {
                    String e = kVar.mo8831e(3);
                    int g2 = kVar.mo8834g();
                    if ((g2 & 128) != 0) {
                        i = g2 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    list.add(Format.m11317a(null, str, null, -1, 0, e, i, null));
                    kVar.mo8829d(2);
                }
            }
            kVar.mo8827c(d);
        }
        return new C2628s(list);
    }

    /* renamed from: a */
    private boolean m12290a(int i) {
        return (i & this.f8756a) != 0;
    }

    /* renamed from: a */
    public SparseArray<C2634v> mo9065a() {
        return new SparseArray<>();
    }

    /* renamed from: a */
    public C2634v mo9066a(int i, C2636b bVar) {
        C2634v vVar = null;
        switch (i) {
            case 2:
                return new C2622o(new C2611i());
            case 3:
            case 4:
                return new C2622o(new C2620m(bVar.f8957b));
            case 15:
                if (!m12290a(2)) {
                    vVar = new C2622o(new C2606d(false, bVar.f8957b));
                }
                return vVar;
            case 21:
                return new C2622o(new C2619l());
            case 27:
                if (!m12290a(4)) {
                    vVar = new C2622o(new C2613j(m12289a(bVar), m12290a(1), m12290a(8)));
                }
                return vVar;
            case 36:
                return new C2622o(new C2617k(m12289a(bVar)));
            case 89:
                return new C2622o(new C2609g(bVar.f8958c));
            case 129:
            case 135:
                return new C2622o(new C2603b(bVar.f8957b));
            case 130:
            case 138:
                return new C2622o(new C2608f(bVar.f8957b));
            case 134:
                if (!m12290a(16)) {
                    vVar = new C2627r(new C2629t());
                }
                return vVar;
            default:
                return null;
        }
    }
}
