package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader.UnsupportedFormatException;
import com.google.android.exoplayer2.p102c.C2496i;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.video.C2821a;

/* renamed from: com.google.android.exoplayer2.extractor.flv.d */
final class C2649d extends TagPayloadReader {

    /* renamed from: b */
    private final C2500k f9002b = new C2500k(C2496i.f8073a);

    /* renamed from: c */
    private final C2500k f9003c = new C2500k(4);

    /* renamed from: d */
    private int f9004d;

    /* renamed from: e */
    private boolean f9005e;

    /* renamed from: f */
    private int f9006f;

    public C2649d(C2659n nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9112a(C2500k kVar, long j) {
        int g = kVar.mo8834g();
        long k = j + (((long) kVar.mo8838k()) * 1000);
        if (g == 0 && !this.f9005e) {
            C2500k kVar2 = new C2500k(new byte[kVar.mo8824b()]);
            kVar.mo8823a(kVar2.f8094a, 0, kVar.mo8824b());
            C2821a a = C2821a.m13424a(kVar2);
            this.f9004d = a.f9782b;
            this.f8981a.mo9002a(Format.m11312a((String) null, "video/avc", (String) null, -1, -1, a.f9783c, a.f9784d, -1.0f, a.f9781a, -1, a.f9785e, (DrmInitData) null));
            this.f9005e = true;
        } else if (g == 1 && this.f9005e) {
            byte[] bArr = this.f9003c.f8094a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.f9004d;
            int i2 = 0;
            while (kVar.mo8824b() > 0) {
                kVar.mo8823a(this.f9003c.f8094a, i, this.f9004d);
                this.f9003c.mo8827c(0);
                int t = this.f9003c.mo8847t();
                this.f9002b.mo8827c(0);
                this.f8981a.mo9003a(this.f9002b, 4);
                int i3 = i2 + 4;
                this.f8981a.mo9003a(kVar, t);
                i2 = i3 + t;
            }
            this.f8981a.mo9001a(k, this.f9006f == 1 ? 1 : 0, i2, 0, null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo9113a(C2500k kVar) {
        int g = kVar.mo8834g();
        int i = (g >> 4) & 15;
        int i2 = g & 15;
        if (i2 == 7) {
            this.f9006f = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new UnsupportedFormatException(sb.toString());
    }
}
