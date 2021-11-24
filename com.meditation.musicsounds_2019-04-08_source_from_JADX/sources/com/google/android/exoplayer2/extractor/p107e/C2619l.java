package com.google.android.exoplayer2.extractor.p107e;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.extractor.e.l */
public final class C2619l implements C2610h {

    /* renamed from: a */
    private final C2500k f8868a = new C2500k(10);

    /* renamed from: b */
    private C2659n f8869b;

    /* renamed from: c */
    private boolean f8870c;

    /* renamed from: d */
    private long f8871d;

    /* renamed from: e */
    private int f8872e;

    /* renamed from: f */
    private int f8873f;

    /* renamed from: a */
    public void mo9060a() {
        this.f8870c = false;
    }

    /* renamed from: a */
    public void mo9061a(long j, boolean z) {
        if (z) {
            this.f8870c = true;
            this.f8871d = j;
            this.f8872e = 0;
            this.f8873f = 0;
        }
    }

    /* renamed from: a */
    public void mo9062a(C2500k kVar) {
        if (this.f8870c) {
            int b = kVar.mo8824b();
            if (this.f8873f < 10) {
                int min = Math.min(b, 10 - this.f8873f);
                System.arraycopy(kVar.f8094a, kVar.mo8828d(), this.f8868a.f8094a, this.f8873f, min);
                if (this.f8873f + min == 10) {
                    this.f8868a.mo8827c(0);
                    if (73 == this.f8868a.mo8834g() && 68 == this.f8868a.mo8834g() && 51 == this.f8868a.mo8834g()) {
                        this.f8868a.mo8829d(3);
                        this.f8872e = this.f8868a.mo8846s() + 10;
                    } else {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.f8870c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(b, this.f8872e - this.f8873f);
            this.f8869b.mo9003a(kVar, min2);
            this.f8873f += min2;
        }
    }

    /* renamed from: a */
    public void mo9063a(C2651h hVar, C2638d dVar) {
        dVar.mo9099a();
        this.f8869b = hVar.mo9116a(dVar.mo9100b(), 4);
        this.f8869b.mo9002a(Format.m11320a(dVar.mo9101c(), "application/id3", null, -1, null));
    }

    /* renamed from: b */
    public void mo9064b() {
        if (this.f8870c && this.f8872e != 0 && this.f8873f == this.f8872e) {
            this.f8869b.mo9001a(this.f8871d, 1, this.f8872e, 0, null);
            this.f8870c = false;
        }
    }
}
