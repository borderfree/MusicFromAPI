package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ud */
final class C3946ud implements C3923th<C3922tg> {
    C3946ud() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3922tg mo13691a(zzbah zzbah) {
        try {
            C4007vw a = C4007vw.m20137a(zzbah);
            if (a instanceof C4007vw) {
                C4007vw vwVar = a;
                C4098yo.m20377a(vwVar.mo13754a(), 0);
                C3952uj.m19988a(vwVar.mo13755b());
                C4001vs b = vwVar.mo13755b();
                C4010vy a2 = b.mo13745a();
                C4071xo xoVar = new C4071xo(C4075xs.m20335a(C3952uj.m19985a(a2.mo13762a()), vwVar.mo13756c().toByteArray(), vwVar.mo13757d().toByteArray()), a2.mo13764c().toByteArray(), C3952uj.m19987a(a2.mo13763b()), C3952uj.m19986a(b.mo13747c()), new C3954ul(b.mo13746b().mo13743a()));
                return xoVar;
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C4007vw) {
            C4007vw vwVar = (C4007vw) abl;
            C4098yo.m20377a(vwVar.mo13754a(), 0);
            C3952uj.m19988a(vwVar.mo13755b());
            C4001vs b = vwVar.mo13755b();
            C4010vy a = b.mo13745a();
            C4071xo xoVar = new C4071xo(C4075xs.m20335a(C3952uj.m19985a(a.mo13762a()), vwVar.mo13756c().toByteArray(), vwVar.mo13757d().toByteArray()), a.mo13764c().toByteArray(), C3952uj.m19987a(a.mo13763b()), C3952uj.m19986a(b.mo13747c()), new C3954ul(b.mo13746b().mo13743a()));
            return xoVar;
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        throw new GeneralSecurityException("Not implemented.");
    }
}
