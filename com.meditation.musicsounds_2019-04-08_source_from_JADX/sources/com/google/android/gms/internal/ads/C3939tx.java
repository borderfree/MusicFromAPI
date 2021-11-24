package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tx */
final class C3939tx implements C3923th<C3914sz> {
    C3939tx() {
    }

    /* renamed from: b */
    private static C3991vl m19939b() {
        return (C3991vl) C3991vl.m20099c().mo13741a(0).mo13742a(zzbah.zzo(C4093yj.m20365a(32))).mo11490c();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3914sz mo13691a(zzbah zzbah) {
        try {
            C3991vl a = C3991vl.m20094a(zzbah);
            if (a instanceof C3991vl) {
                C3991vl vlVar = a;
                C4098yo.m20377a(vlVar.mo13739a(), 0);
                if (vlVar.mo13740b().size() == 32) {
                    return new C4068xl(vlVar.mo13740b().toByteArray());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C3991vl) {
            C3991vl vlVar = (C3991vl) abl;
            C4098yo.m20377a(vlVar.mo13739a(), 0);
            if (vlVar.mo13740b().size() == 32) {
                return new C4068xl(vlVar.mo13740b().toByteArray());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        return m19939b();
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        return m19939b();
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").mo13902a(m19939b().mo11552h()).mo13901a(zzb.SYMMETRIC).mo11490c();
    }
}
