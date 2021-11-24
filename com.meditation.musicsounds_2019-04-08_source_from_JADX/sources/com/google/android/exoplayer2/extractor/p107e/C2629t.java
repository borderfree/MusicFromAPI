package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;

/* renamed from: com.google.android.exoplayer2.extractor.e.t */
public final class C2629t implements C2626q {

    /* renamed from: a */
    private C2509q f8927a;

    /* renamed from: b */
    private C2659n f8928b;

    /* renamed from: c */
    private boolean f8929c;

    /* renamed from: a */
    public void mo9095a(C2500k kVar) {
        if (!this.f8929c) {
            if (this.f8927a.mo8879c() != -9223372036854775807L) {
                this.f8928b.mo9002a(Format.m11311a((String) null, "application/x-scte35", this.f8927a.mo8879c()));
                this.f8929c = true;
            } else {
                return;
            }
        }
        int b = kVar.mo8824b();
        this.f8928b.mo9003a(kVar, b);
        this.f8928b.mo9001a(this.f8927a.mo8877b(), 1, b, 0, null);
    }

    /* renamed from: a */
    public void mo9096a(C2509q qVar, C2651h hVar, C2638d dVar) {
        this.f8927a = qVar;
        dVar.mo9099a();
        this.f8928b = hVar.mo9116a(dVar.mo9100b(), 4);
        this.f8928b.mo9002a(Format.m11320a(dVar.mo9101c(), "application/x-scte35", null, -1, null));
    }
}
