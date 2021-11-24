package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tu */
final class C3936tu implements C3923th<C4090yg> {
    C3936tu() {
    }

    /* renamed from: a */
    private static void m19917a(C3971uy uyVar) {
        if (uyVar.mo13723a() < 12 || uyVar.mo13723a() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C4063xg mo13691a(zzbah zzbah) {
        try {
            C3965uu a = C3965uu.m20022a(zzbah);
            if (a instanceof C3965uu) {
                C3965uu uuVar = a;
                C4098yo.m20377a(uuVar.mo13715a(), 0);
                C4098yo.m20376a(uuVar.mo13717c().size());
                m19917a(uuVar.mo13716b());
                return new C4063xg(uuVar.mo13717c().toByteArray(), uuVar.mo13716b().mo13723a());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C3965uu) {
            C3965uu uuVar = (C3965uu) abl;
            C4098yo.m20377a(uuVar.mo13715a(), 0);
            C4098yo.m20376a(uuVar.mo13717c().size());
            m19917a(uuVar.mo13716b());
            return new C4063xg(uuVar.mo13717c().toByteArray(), uuVar.mo13716b().mo13723a());
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        if (abl instanceof C3968uw) {
            C3968uw uwVar = (C3968uw) abl;
            C4098yo.m20376a(uwVar.mo13722b());
            m19917a(uwVar.mo13721a());
            return C3965uu.m20029d().mo13719a(uwVar.mo13721a()).mo13720a(zzbah.zzo(C4093yj.m20365a(uwVar.mo13722b()))).mo13718a(0).mo11490c();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        try {
            return mo13692b((abl) C3968uw.m20039a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.AesCtrKey").mo13902a(((C3965uu) mo13693b(zzbah)).mo11552h()).mo13901a(zzb.SYMMETRIC).mo11490c();
    }
}
