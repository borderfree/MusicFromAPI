package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.pi */
public final class C3816pi implements Iterable<C3814pg> {

    /* renamed from: a */
    private final List<C3814pg> f14647a = new ArrayList();

    /* renamed from: a */
    public static boolean m19383a(C3804ox oxVar) {
        C3814pg b = m19384b(oxVar);
        if (b == null) {
            return false;
        }
        b.f14644b.mo13450b();
        return true;
    }

    /* renamed from: b */
    static C3814pg m19384b(C3804ox oxVar) {
        Iterator it = zzbv.zzff().iterator();
        while (it.hasNext()) {
            C3814pg pgVar = (C3814pg) it.next();
            if (pgVar.f14643a == oxVar) {
                return pgVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo13443a() {
        return this.f14647a.size();
    }

    /* renamed from: a */
    public final void mo13444a(C3814pg pgVar) {
        this.f14647a.add(pgVar);
    }

    /* renamed from: b */
    public final void mo13445b(C3814pg pgVar) {
        this.f14647a.remove(pgVar);
    }

    public final Iterator<C3814pg> iterator() {
        return this.f14647a.iterator();
    }
}
