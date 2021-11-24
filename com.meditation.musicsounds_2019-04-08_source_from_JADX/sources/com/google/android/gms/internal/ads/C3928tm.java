package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4035wq.C4037b;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tm */
public final class C3928tm {
    @Deprecated
    /* renamed from: a */
    public static final C3924ti m19888a(byte[] bArr) {
        try {
            C4035wq a = C4035wq.m20228a(bArr);
            for (C4037b bVar : a.mo13788b()) {
                if (bVar.mo13791b().mo13900c() == zzb.UNKNOWN_KEYMATERIAL || bVar.mo13791b().mo13900c() == zzb.SYMMETRIC || bVar.mo13791b().mo13900c() == zzb.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return C3924ti.m19882a(a);
        } catch (zzbbu unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
