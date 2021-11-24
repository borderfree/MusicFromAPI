package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4035wq.C4037b;
import com.google.android.gms.internal.ads.C4040ws.C4041a;
import com.google.android.gms.internal.ads.C4040ws.C4042b;
import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.tq */
final class C3932tq {

    /* renamed from: a */
    private static final Charset f14956a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static C4040ws m19906a(C4035wq wqVar) {
        C4041a a = C4040ws.m20241a().mo13795a(wqVar.mo13787a());
        for (C4037b bVar : wqVar.mo13788b()) {
            a.mo13796a((C4042b) C4042b.m20250a().mo13800a(bVar.mo13791b().mo13898a()).mo13798a(bVar.mo13792c()).mo13799a(bVar.mo13794e()).mo13797a(bVar.mo13793d()).mo11490c());
        }
        return (C4040ws) a.mo11490c();
    }

    /* renamed from: b */
    public static void m19907b(C4035wq wqVar) {
        if (wqVar.mo13789c() != 0) {
            int a = wqVar.mo13787a();
            boolean z = false;
            boolean z2 = true;
            for (C4037b bVar : wqVar.mo13788b()) {
                if (!bVar.mo13790a()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(bVar.mo13793d())}));
                } else if (bVar.mo13794e() == zzayd.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(bVar.mo13793d())}));
                } else if (bVar.mo13792c() != zzaxl.UNKNOWN_STATUS) {
                    if (bVar.mo13792c() == zzaxl.ENABLED && bVar.mo13793d() == a) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (bVar.mo13791b().mo13900c() != zzb.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(bVar.mo13793d())}));
                }
            }
            if (!z && !z2) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
}
