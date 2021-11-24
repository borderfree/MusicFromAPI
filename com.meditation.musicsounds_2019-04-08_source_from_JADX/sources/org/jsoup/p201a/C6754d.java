package org.jsoup.p201a;

import org.jsoup.nodes.C6767g;

/* renamed from: org.jsoup.a.d */
public class C6754d {

    /* renamed from: a */
    private C6755e f23715a;

    public C6754d(C6755e eVar) {
        this.f23715a = eVar;
    }

    /* renamed from: a */
    public void mo21215a(C6767g gVar) {
        C6767g gVar2 = gVar;
        int i = 0;
        while (gVar2 != null) {
            this.f23715a.mo21177a(gVar2, i);
            if (gVar2.mo21304q().size() > 0) {
                gVar2 = gVar2.mo21290a(0);
                i++;
            } else {
                while (gVar2.mo21307t() == null && i > 0) {
                    this.f23715a.mo21178b(gVar2, i);
                    gVar2 = gVar2.mo21289o();
                    i--;
                }
                this.f23715a.mo21178b(gVar2, i);
                if (gVar2 != gVar) {
                    gVar2 = gVar2.mo21307t();
                } else {
                    return;
                }
            }
        }
    }
}
