package com.google.android.exoplayer2.text.p109a;

import android.util.Log;
import com.google.android.exoplayer2.extractor.C2659n;
import com.google.android.exoplayer2.p102c.C2500k;

/* renamed from: com.google.android.exoplayer2.text.a.g */
public final class C2752g {
    /* renamed from: a */
    private static int m13093a(C2500k kVar) {
        int i = 0;
        while (kVar.mo8824b() != 0) {
            int g = kVar.mo8834g();
            i += g;
            if (g != 255) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static void m13094a(long j, C2500k kVar, C2659n[] nVarArr) {
        while (kVar.mo8824b() > 1) {
            int a = m13093a(kVar);
            int a2 = m13093a(kVar);
            if (a2 == -1 || a2 > kVar.mo8824b()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                kVar.mo8827c(kVar.mo8826c());
            } else {
                if (m13095a(a, a2, kVar)) {
                    kVar.mo8829d(8);
                    int g = kVar.mo8834g() & 31;
                    kVar.mo8829d(1);
                    int i = g * 3;
                    int d = kVar.mo8828d();
                    for (C2659n nVar : nVarArr) {
                        kVar.mo8827c(d);
                        nVar.mo9003a(kVar, i);
                        nVar.mo9001a(j, 1, i, 0, null);
                    }
                    a2 -= i + 10;
                }
                kVar.mo8829d(a2);
            }
        }
    }

    /* renamed from: a */
    private static boolean m13095a(int i, int i2, C2500k kVar) {
        if (i != 4 || i2 < 8) {
            return false;
        }
        int d = kVar.mo8828d();
        int g = kVar.mo8834g();
        int h = kVar.mo8835h();
        int n = kVar.mo8841n();
        int g2 = kVar.mo8834g();
        kVar.mo8827c(d);
        return g == 181 && h == 49 && n == 1195456820 && g2 == 3;
    }
}
