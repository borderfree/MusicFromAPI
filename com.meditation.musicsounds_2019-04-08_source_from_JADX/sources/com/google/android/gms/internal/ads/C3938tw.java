package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tw */
final class C3938tw implements C3923th<C3914sz> {
    C3938tw() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3914sz mo13691a(zzbah zzbah) {
        try {
            C3985vh a = C3985vh.m20078a(zzbah);
            if (a instanceof C3985vh) {
                C3985vh vhVar = a;
                C4098yo.m20377a(vhVar.mo13734a(), 0);
                C4098yo.m20376a(vhVar.mo13735b().size());
                return new C4065xi(vhVar.mo13735b().toByteArray());
            }
            throw new GeneralSecurityException("expected AesGcmKey proto");
        } catch (zzbbu unused) {
            throw new GeneralSecurityException("expected AesGcmKey proto");
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C3985vh) {
            C3985vh vhVar = (C3985vh) abl;
            C4098yo.m20377a(vhVar.mo13734a(), 0);
            C4098yo.m20376a(vhVar.mo13735b().size());
            return new C4065xi(vhVar.mo13735b().toByteArray());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        if (abl instanceof C3988vj) {
            C3988vj vjVar = (C3988vj) abl;
            C4098yo.m20376a(vjVar.mo13738a());
            return C3985vh.m20083c().mo13737a(zzbah.zzo(C4093yj.m20365a(vjVar.mo13738a()))).mo13736a(0).mo11490c();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        try {
            return mo13692b((abl) C3988vj.m20090a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.AesGcmKey").mo13902a(((C3985vh) mo13693b(zzbah)).mo11552h()).mo13901a(zzb.SYMMETRIC).mo11490c();
    }
}
