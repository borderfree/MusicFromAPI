package com.google.android.exoplayer2.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;
import com.google.android.exoplayer2.p102c.C2489b;
import com.google.android.exoplayer2.p102c.C2500k;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.flv.a */
final class C2645a extends TagPayloadReader {

    /* renamed from: b */
    private static final int[] f8982b = {5512, 11025, 22050, 44100};

    /* renamed from: c */
    private boolean f8983c;

    /* renamed from: d */
    private boolean f8984d;

    /* renamed from: e */
    private int f8985e;

    public C2645a(C2659n nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9112a(C2500k kVar, long j) {
        C2500k kVar2 = kVar;
        if (this.f8985e == 2) {
            int b = kVar.mo8824b();
            this.f8981a.mo9003a(kVar2, b);
            this.f8981a.mo9001a(j, 1, b, 0, null);
            return;
        }
        int g = kVar.mo8834g();
        if (g == 0 && !this.f8984d) {
            byte[] bArr = new byte[kVar.mo8824b()];
            kVar2.mo8823a(bArr, 0, bArr.length);
            Pair a = C2489b.m11671a(bArr);
            this.f8981a.mo9002a(Format.m11316a(null, "audio/mp4a-latm", null, -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            this.f8984d = true;
        } else if (this.f8985e != 10 || g == 1) {
            int b2 = kVar.mo8824b();
            this.f8981a.mo9003a(kVar2, b2);
            this.f8981a.mo9001a(j, 1, b2, 0, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9113a(C2500k kVar) {
        Format a;
        if (!this.f8983c) {
            int g = kVar.mo8834g();
            this.f8985e = (g >> 4) & 15;
            if (this.f8985e == 2) {
                a = Format.m11316a(null, "audio/mpeg", null, -1, -1, 1, f8982b[(g >> 2) & 3], null, null, 0, null);
            } else if (this.f8985e == 7 || this.f8985e == 8) {
                a = Format.m11315a((String) null, this.f8985e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", (String) null, -1, -1, 1, 8000, (g & 1) == 1 ? 2 : 3, null, (DrmInitData) null, 0, (String) null);
            } else {
                if (this.f8985e != 10) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Audio format not supported: ");
                    sb.append(this.f8985e);
                    throw new UnsupportedFormatException(sb.toString());
                }
                this.f8983c = true;
            }
            this.f8981a.mo9002a(a);
            this.f8984d = true;
            this.f8983c = true;
        } else {
            kVar.mo8829d(1);
        }
        return true;
    }
}
