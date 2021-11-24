package com.google.android.exoplayer2.extractor.p108f;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C2650g;
import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2511s;

/* renamed from: com.google.android.exoplayer2.extractor.f.c */
final class C2643c {

    /* renamed from: com.google.android.exoplayer2.extractor.f.c$a */
    private static final class C2644a {

        /* renamed from: a */
        public final int f8979a;

        /* renamed from: b */
        public final long f8980b;

        private C2644a(int i, long j) {
            this.f8979a = i;
            this.f8980b = j;
        }

        /* renamed from: a */
        public static C2644a m12466a(C2650g gVar, C2500k kVar) {
            gVar.mo8975c(kVar.f8094a, 0, 8);
            kVar.mo8827c(0);
            return new C2644a(kVar.mo8841n(), kVar.mo8840m());
        }
    }

    /* renamed from: a */
    public static C2642b m12464a(C2650g gVar) {
        C2644a a;
        String str;
        StringBuilder sb;
        C2488a.m11664a(gVar);
        C2500k kVar = new C2500k(16);
        if (C2644a.m12466a(gVar, kVar).f8979a != C2511s.m11819e("RIFF")) {
            return null;
        }
        gVar.mo8975c(kVar.f8094a, 0, 4);
        kVar.mo8827c(0);
        int n = kVar.mo8841n();
        if (n != C2511s.m11819e("WAVE")) {
            str = "WavHeaderReader";
            sb = new StringBuilder();
            sb.append("Unsupported RIFF format: ");
            sb.append(n);
        } else {
            while (true) {
                a = C2644a.m12466a(gVar, kVar);
                if (a.f8979a == C2511s.m11819e("fmt ")) {
                    break;
                }
                gVar.mo8974c((int) a.f8980b);
            }
            C2488a.m11668b(a.f8980b >= 16);
            gVar.mo8975c(kVar.f8094a, 0, 16);
            kVar.mo8827c(0);
            int i = kVar.mo8836i();
            int i2 = kVar.mo8836i();
            int u = kVar.mo8848u();
            int u2 = kVar.mo8848u();
            int i3 = kVar.mo8836i();
            int i4 = kVar.mo8836i();
            int i5 = (i2 * i4) / 8;
            if (i3 == i5) {
                int b = C2511s.m11811b(i4);
                if (b == 0) {
                    str = "WavHeaderReader";
                    sb = new StringBuilder();
                    sb.append("Unsupported WAV bit depth: ");
                    sb.append(i4);
                } else if (i == 1 || i == 65534) {
                    gVar.mo8974c(((int) a.f8980b) - 16);
                    C2642b bVar = new C2642b(i2, u, u2, i3, i4, b);
                    return bVar;
                } else {
                    str = "WavHeaderReader";
                    sb = new StringBuilder();
                    sb.append("Unsupported WAV format type: ");
                    sb.append(i);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected block alignment: ");
                sb2.append(i5);
                sb2.append("; got: ");
                sb2.append(i3);
                throw new ParserException(sb2.toString());
            }
        }
        Log.e(str, sb.toString());
        return null;
    }

    /* renamed from: a */
    public static void m12465a(C2650g gVar, C2642b bVar) {
        C2488a.m11664a(gVar);
        C2488a.m11664a(bVar);
        gVar.mo8965a();
        C2500k kVar = new C2500k(8);
        while (true) {
            C2644a a = C2644a.m12466a(gVar, kVar);
            if (a.f8979a != C2511s.m11819e("data")) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring unknown WAV chunk: ");
                sb.append(a.f8979a);
                Log.w("WavHeaderReader", sb.toString());
                long j = a.f8980b + 8;
                if (a.f8979a == C2511s.m11819e("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    gVar.mo8969b((int) j);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                    sb2.append(a.f8979a);
                    throw new ParserException(sb2.toString());
                }
            } else {
                gVar.mo8969b(8);
                bVar.mo9104a(gVar.mo8973c(), a.f8980b);
                return;
            }
        }
    }
}
