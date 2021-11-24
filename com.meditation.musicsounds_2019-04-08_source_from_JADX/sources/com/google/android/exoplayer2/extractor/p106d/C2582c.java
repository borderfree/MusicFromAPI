package com.google.android.exoplayer2.extractor.p106d;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2639f;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2652i;
import com.google.android.exoplayer2.extractor.C2656l;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.extractor.d.c */
public class C2582c implements C2639f {

    /* renamed from: a */
    public static final C2652i f8641a = new C2652i() {
        /* renamed from: a */
        public C2639f[] mo8957a() {
            return new C2639f[]{new C2582c()};
        }
    };

    /* renamed from: b */
    private C2588h f8642b;

    /* renamed from: a */
    private static C2500k m12189a(C2500k kVar) {
        kVar.mo8827c(0);
        return kVar;
    }

    /* renamed from: a */
    public int mo8945a(C2650g gVar, C2656l lVar) {
        return this.f8642b.mo9049a(gVar, lVar);
    }

    /* renamed from: a */
    public void mo8951a(long j, long j2) {
        this.f8642b.mo9051a(j, j2);
    }

    /* renamed from: a */
    public void mo8952a(C2651h hVar) {
        C2659n a = hVar.mo9116a(0, 1);
        hVar.mo9117a();
        this.f8642b.mo9052a(hVar, a);
    }

    /* renamed from: a */
    public boolean mo8953a(C2650g gVar) {
        C2588h gVar2;
        try {
            C2585e eVar = new C2585e();
            if (eVar.mo9048a(gVar, true)) {
                if ((eVar.f8650b & 2) == 2) {
                    int min = Math.min(eVar.f8657i, 8);
                    C2500k kVar = new C2500k(min);
                    gVar.mo8975c(kVar.f8094a, 0, min);
                    if (C2580b.m12175a(m12189a(kVar))) {
                        gVar2 = new C2580b();
                    } else if (C2593j.m12234a(m12189a(kVar))) {
                        gVar2 = new C2593j();
                    } else if (C2587g.m12209a(m12189a(kVar))) {
                        gVar2 = new C2587g();
                    }
                    this.f8642b = gVar2;
                    return true;
                }
            }
        } catch (ParserException unused) {
        }
        return false;
    }

    /* renamed from: c */
    public void mo8955c() {
    }
}
