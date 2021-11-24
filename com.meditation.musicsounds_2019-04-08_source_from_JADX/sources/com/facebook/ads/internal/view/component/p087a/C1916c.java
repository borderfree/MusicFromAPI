package com.facebook.ads.internal.view.component.p087a;

import com.facebook.ads.internal.adapters.p059a.C1647d;
import com.facebook.ads.internal.adapters.p059a.C1651h;
import com.facebook.ads.internal.p077s.p078a.C1808r;
import com.facebook.ads.internal.view.component.C1898a;

/* renamed from: com.facebook.ads.internal.view.component.a.c */
public final class C1916c {

    /* renamed from: a */
    private static final int f6305a = C1808r.f5898a.heightPixels;

    /* renamed from: b */
    private static final int f6306b = C1808r.f5898a.widthPixels;

    /* renamed from: a */
    private static float m9269a(C1651h hVar) {
        int h = hVar.mo6731c().mo6686h();
        int i = hVar.mo6731c().mo6687i();
        if (i > 0) {
            return ((float) h) / ((float) i);
        }
        return -1.0f;
    }

    /* renamed from: a */
    private static int m9270a(int i) {
        return (f6305a - i) - ((C1808r.m8930a(16) + (C1898a.f6333a * 2)) + (C1920e.f6300a * 2));
    }

    /* renamed from: a */
    public static C1915b m9271a(C1917d dVar) {
        C1915b bVar;
        boolean z = true;
        C1647d a = dVar.mo7306k() == 1 ? dVar.mo7302g().mo6722b().mo6676a() : dVar.mo7302g().mo6722b().mo6677b();
        C1651h hVar = (C1651h) dVar.mo7302g().mo6724d().get(0);
        double a2 = (double) m9269a(hVar);
        if (m9274a(dVar.mo7306k(), dVar.mo7305j(), a2)) {
            if (dVar.mo7306k() != 2) {
                z = false;
            }
            bVar = new C1900a(dVar, a, z);
        } else {
            bVar = new C1920e(dVar, m9272a(a2), a);
        }
        bVar.mo7291a(hVar, dVar.mo7302g().mo6723c(), a2);
        return bVar;
    }

    /* renamed from: a */
    private static boolean m9272a(double d) {
        return d < 0.9d;
    }

    /* renamed from: a */
    private static boolean m9273a(double d, int i) {
        return m9270a(i) < m9275b(d);
    }

    /* renamed from: a */
    private static boolean m9274a(int i, int i2, double d) {
        return i == 2 || m9273a(d, i2);
    }

    /* renamed from: b */
    private static int m9275b(double d) {
        double d2 = (double) (f6306b - (C1920e.f6300a * 2));
        Double.isNaN(d2);
        return (int) (d2 / d);
    }
}
