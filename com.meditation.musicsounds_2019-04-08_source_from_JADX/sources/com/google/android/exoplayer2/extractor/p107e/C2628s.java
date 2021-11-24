package com.google.android.exoplayer2.extractor.p107e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.extractor.p107e.C2634v.C2638d;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.text.p109a.C2752g;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.e.s */
final class C2628s {

    /* renamed from: a */
    private final List<Format> f8925a;

    /* renamed from: b */
    private final C2659n[] f8926b;

    public C2628s(List<Format> list) {
        this.f8925a = list;
        this.f8926b = new C2659n[list.size()];
    }

    /* renamed from: a */
    public void mo9097a(long j, C2500k kVar) {
        C2752g.m13094a(j, kVar, this.f8926b);
    }

    /* renamed from: a */
    public void mo9098a(C2651h hVar, C2638d dVar) {
        for (int i = 0; i < this.f8926b.length; i++) {
            dVar.mo9099a();
            C2659n a = hVar.mo9116a(dVar.mo9100b(), 3);
            Format format = (Format) this.f8925a.get(i);
            String str = format.f7738f;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid closed caption mime type provided: ");
            sb.append(str);
            C2488a.m11667a(z, sb.toString());
            a.mo9002a(Format.m11317a(dVar.mo9101c(), str, null, -1, format.f7756x, format.f7757y, format.f7758z, null));
            this.f8926b[i] = a;
        }
    }
}
