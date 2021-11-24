package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tv */
final class C3937tv implements C3923th<C3914sz> {
    C3937tv() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C3914sz mo13691a(zzbah zzbah) {
        try {
            C3975va a = C3975va.m20050a(zzbah);
            if (a instanceof C3975va) {
                C3975va vaVar = a;
                C4098yo.m20377a(vaVar.mo13725a(), 0);
                C4098yo.m20376a(vaVar.mo13727c().size());
                if (vaVar.mo13726b().mo13733a() != 12) {
                    if (vaVar.mo13726b().mo13733a() != 16) {
                        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                    }
                }
                return new C4064xh(vaVar.mo13727c().toByteArray(), vaVar.mo13726b().mo13733a());
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        if (abl instanceof C3975va) {
            C3975va vaVar = (C3975va) abl;
            C4098yo.m20377a(vaVar.mo13725a(), 0);
            C4098yo.m20376a(vaVar.mo13727c().size());
            if (vaVar.mo13726b().mo13733a() == 12 || vaVar.mo13726b().mo13733a() == 16) {
                return new C4064xh(vaVar.mo13727c().toByteArray(), vaVar.mo13726b().mo13733a());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        if (abl instanceof C3979vd) {
            C3979vd vdVar = (C3979vd) abl;
            C4098yo.m20376a(vdVar.mo13732b());
            if (vdVar.mo13731a().mo13733a() == 12 || vdVar.mo13731a().mo13733a() == 16) {
                return C3975va.m20057d().mo13730a(zzbah.zzo(C4093yj.m20365a(vdVar.mo13732b()))).mo13729a(vdVar.mo13731a()).mo13728a(0).mo11490c();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        try {
            return mo13692b((abl) C3979vd.m20069a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.AesEaxKey").mo13902a(((C3975va) mo13693b(zzbah)).mo11552h()).mo13901a(zzb.SYMMETRIC).mo11490c();
    }
}
