package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: com.google.android.gms.internal.ads.uc */
final class C3945uc implements C3923th<C3921tf> {
    C3945uc() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3921tf mo13691a(zzbah zzbah) {
        try {
            C4004vu a = C4004vu.m20121a(zzbah);
            if (a instanceof C4004vu) {
                C4004vu vuVar = a;
                C4098yo.m20377a(vuVar.mo13748a(), 0);
                C3952uj.m19988a(vuVar.mo13749b().mo13755b());
                C4001vs b = vuVar.mo13749b().mo13755b();
                C4010vy a2 = b.mo13745a();
                zzayv a3 = C3952uj.m19985a(a2.mo13762a());
                byte[] byteArray = vuVar.mo13750c().toByteArray();
                C4070xn xnVar = new C4070xn((ECPrivateKey) ((KeyFactory) C4078xv.f15060e.mo13822a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), C4075xs.m20336a(a3))), a2.mo13764c().toByteArray(), C3952uj.m19987a(a2.mo13763b()), C3952uj.m19986a(b.mo13747c()), new C3954ul(b.mo13746b().mo13743a()));
                return xnVar;
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C4004vu) {
            C4004vu vuVar = (C4004vu) abl;
            C4098yo.m20377a(vuVar.mo13748a(), 0);
            C3952uj.m19988a(vuVar.mo13749b().mo13755b());
            C4001vs b = vuVar.mo13749b().mo13755b();
            C4010vy a = b.mo13745a();
            zzayv a2 = C3952uj.m19985a(a.mo13762a());
            byte[] byteArray = vuVar.mo13750c().toByteArray();
            C4070xn xnVar = new C4070xn((ECPrivateKey) ((KeyFactory) C4078xv.f15060e.mo13822a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), C4075xs.m20336a(a2))), a.mo13764c().toByteArray(), C3952uj.m19987a(a.mo13763b()), C3952uj.m19986a(b.mo13747c()), new C3954ul(b.mo13746b().mo13743a()));
            return xnVar;
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        if (abl instanceof C3998vq) {
            C3998vq vqVar = (C3998vq) abl;
            C3952uj.m19988a(vqVar.mo13744a());
            KeyPair a = C4075xs.m20334a(C4075xs.m20336a(C3952uj.m19985a(vqVar.mo13744a().mo13745a().mo13762a())));
            ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
            ECPoint w = eCPublicKey.getW();
            return C4004vu.m20128d().mo13751a(0).mo13752a((C4007vw) C4007vw.m20146e().mo13758a(0).mo13759a(vqVar.mo13744a()).mo13760a(zzbah.zzo(w.getAffineX().toByteArray())).mo13761b(zzbah.zzo(w.getAffineY().toByteArray())).mo11490c()).mo13753a(zzbah.zzo(eCPrivateKey.getS().toByteArray())).mo11490c();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        try {
            return mo13692b((abl) C3998vq.m20111a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").mo13902a(((C4004vu) mo13693b(zzbah)).mo11552h()).mo13901a(zzb.ASYMMETRIC_PRIVATE).mo11490c();
    }
}
