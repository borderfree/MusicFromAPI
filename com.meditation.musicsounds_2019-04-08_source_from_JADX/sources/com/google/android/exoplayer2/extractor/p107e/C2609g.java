package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2635a;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.g */
public final class C2609g implements C2610h {

    /* renamed from: a */
    private final List<C2635a> f8769a;

    /* renamed from: b */
    private final C2659n[] f8770b;

    /* renamed from: c */
    private boolean f8771c;

    /* renamed from: d */
    private int f8772d;

    /* renamed from: e */
    private int f8773e;

    /* renamed from: f */
    private long f8774f;

    public C2609g(List<C2635a> list) {
        this.f8769a = list;
        this.f8770b = new C2659n[list.size()];
    }

    /* renamed from: a */
    private boolean m12301a(C2500k kVar, int i) {
        if (kVar.mo8824b() == 0) {
            return false;
        }
        if (kVar.mo8834g() != i) {
            this.f8771c = false;
        }
        this.f8772d--;
        return this.f8771c;
    }

    /* renamed from: a */
    public void mo9060a() {
        this.f8771c = false;
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        if (z) {
            this.f8771c = true;
            this.f8774f = j;
            this.f8773e = 0;
            this.f8772d = 2;
        }
    }

    /* renamed from: a */
    public void mo9062a(C2500k kVar) {
        C2659n[] nVarArr;
        if (this.f8771c && (this.f8772d != 2 || m12301a(kVar, 32))) {
            if (this.f8772d != 1 || m12301a(kVar, 0)) {
                int d = kVar.mo8828d();
                int b = kVar.mo8824b();
                for (C2659n nVar : this.f8770b) {
                    kVar.mo8827c(d);
                    nVar.mo9003a(kVar, b);
                }
                this.f8773e += b;
            }
        }
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        for (int i = 0; i < this.f8770b.length; i++) {
            C2635a aVar = (C2635a) this.f8769a.get(i);
            dVar.mo9099a();
            C2659n a = hVar.mo9116a(dVar.mo9100b(), 3);
            a.mo9002a(Format.m11321a(dVar.mo9101c(), "application/dvbsubs", (String) null, -1, Collections.singletonList(aVar.f8955c), aVar.f8953a, (DrmInitData) null));
            this.f8770b[i] = a;
        }
    }

    /* renamed from: b */
    public void mo9064b() {
        if (this.f8771c) {
            for (C2659n a : this.f8770b) {
                a.mo9001a(this.f8774f, 1, this.f8773e, 0, null);
            }
            this.f8771c = false;
        }
    }
}
