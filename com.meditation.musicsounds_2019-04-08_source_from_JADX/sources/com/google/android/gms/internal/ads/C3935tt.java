package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.tt */
class C3935tt implements C3923th<C3914sz> {

    /* renamed from: a */
    private static final Logger f14959a = Logger.getLogger(C3935tt.class.getName());

    C3935tt() {
        C3931tp.m19901a("type.googleapis.com/google.crypto.tink.AesCtrKey", (C3923th<P>) new C3936tu<P>());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3914sz mo13691a(zzbah zzbah) {
        try {
            C3959uq a = C3959uq.m20001a(zzbah);
            if (a instanceof C3959uq) {
                C3959uq uqVar = a;
                C4098yo.m20377a(uqVar.mo13707a(), 0);
                return new C4077xu((C4090yg) C3931tp.m19905b("type.googleapis.com/google.crypto.tink.AesCtrKey", uqVar.mo13708b()), (C3927tl) C3931tp.m19905b("type.googleapis.com/google.crypto.tink.HmacKey", uqVar.mo13709c()), uqVar.mo13709c().mo13766b().mo13774b());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C3959uq) {
            C3959uq uqVar = (C3959uq) abl;
            C4098yo.m20377a(uqVar.mo13707a(), 0);
            return new C4077xu((C4090yg) C3931tp.m19905b("type.googleapis.com/google.crypto.tink.AesCtrKey", uqVar.mo13708b()), (C3927tl) C3931tp.m19905b("type.googleapis.com/google.crypto.tink.HmacKey", uqVar.mo13709c()), uqVar.mo13709c().mo13766b().mo13774b());
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        if (abl instanceof C3962us) {
            C3962us usVar = (C3962us) abl;
            C3965uu uuVar = (C3965uu) C3931tp.m19894a("type.googleapis.com/google.crypto.tink.AesCtrKey", (abl) usVar.mo13713a());
            return C3959uq.m20008d().mo13711a(uuVar).mo13712a((C4017wd) C3931tp.m19894a("type.googleapis.com/google.crypto.tink.HmacKey", (abl) usVar.mo13714b())).mo13710a(0).mo11490c();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        try {
            return mo13692b((abl) C3962us.m20017a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").mo13902a(((C3959uq) mo13693b(zzbah)).mo11552h()).mo13901a(zzb.SYMMETRIC).mo11490c();
    }
}
