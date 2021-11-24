package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ua */
final class C3943ua implements C3923th<C3914sz> {
    C3943ua() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3914sz mo13691a(zzbah zzbah) {
        try {
            C4051wy a = C4051wy.m20282a(zzbah);
            if (a instanceof C4051wy) {
                C4051wy wyVar = a;
                C4098yo.m20377a(wyVar.mo13806a(), 0);
                String a2 = wyVar.mo13807b().mo13810a();
                return new C3941tz(wyVar.mo13807b().mo13811b(), C3926tk.m19886a(a2).mo13698b(a2));
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C4051wy) {
            C4051wy wyVar = (C4051wy) abl;
            C4098yo.m20377a(wyVar.mo13806a(), 0);
            String a = wyVar.mo13807b().mo13810a();
            return new C3941tz(wyVar.mo13807b().mo13811b(), C3926tk.m19886a(a).mo13698b(a));
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        if (abl instanceof C4056xb) {
            return C4051wy.m20287c().mo13809a((C4056xb) abl).mo13808a(0).mo11490c();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        try {
            return mo13692b((abl) C4056xb.m20297a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").mo13902a(((C4051wy) mo13693b(zzbah)).mo11552h()).mo13901a(zzb.REMOTE).mo11490c();
    }
}
