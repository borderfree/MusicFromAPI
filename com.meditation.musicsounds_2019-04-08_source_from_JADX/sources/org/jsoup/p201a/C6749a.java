package org.jsoup.p201a;

import org.jsoup.nodes.C6766f;
import org.jsoup.nodes.C6767g;

/* renamed from: org.jsoup.a.a */
public class C6749a {

    /* renamed from: org.jsoup.a.a$a */
    private static class C6750a implements C6755e {

        /* renamed from: a */
        private final C6766f f23710a;

        /* renamed from: b */
        private final C6751b f23711b;

        /* renamed from: c */
        private final C6752c f23712c;

        C6750a(C6766f fVar, C6751b bVar, C6752c cVar) {
            this.f23710a = fVar;
            this.f23711b = bVar;
            this.f23712c = cVar;
        }

        /* renamed from: a */
        public void mo21177a(C6767g gVar, int i) {
            if (gVar instanceof C6766f) {
                C6766f fVar = (C6766f) gVar;
                if (this.f23712c.mo21213a(this.f23710a, fVar)) {
                    this.f23711b.add(fVar);
                }
            }
        }

        /* renamed from: b */
        public void mo21178b(C6767g gVar, int i) {
        }
    }

    /* renamed from: a */
    public static C6751b m32583a(C6752c cVar, C6766f fVar) {
        C6751b bVar = new C6751b();
        new C6754d(new C6750a(fVar, bVar, cVar)).mo21215a(fVar);
        return bVar;
    }
}
