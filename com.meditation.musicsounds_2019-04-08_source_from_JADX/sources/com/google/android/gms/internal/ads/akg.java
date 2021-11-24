package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class akg implements Comparator<ajt> {
    public akg(akf akf) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ajt ajt = (ajt) obj;
        ajt ajt2 = (ajt) obj2;
        if (ajt.mo12053b() < ajt2.mo12053b()) {
            return -1;
        }
        if (ajt.mo12053b() > ajt2.mo12053b()) {
            return 1;
        }
        if (ajt.mo12052a() < ajt2.mo12052a()) {
            return -1;
        }
        if (ajt.mo12052a() > ajt2.mo12052a()) {
            return 1;
        }
        float d = (ajt.mo12055d() - ajt.mo12053b()) * (ajt.mo12054c() - ajt.mo12052a());
        float d2 = (ajt2.mo12055d() - ajt2.mo12053b()) * (ajt2.mo12054c() - ajt2.mo12052a());
        if (d > d2) {
            return -1;
        }
        return d < d2 ? 1 : 0;
    }
}
