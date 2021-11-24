package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaxi.zzb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ty */
final class C3940ty implements C3923th<C3914sz> {
    C3940ty() {
    }

    /* renamed from: c */
    private static C3914sz m19947c(abl abl) {
        if (abl instanceof C4045wu) {
            C4045wu wuVar = (C4045wu) abl;
            C4098yo.m20377a(wuVar.mo13801a(), 0);
            String a = wuVar.mo13802b().mo13805a();
            return C3926tk.m19886a(a).mo13698b(a);
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    /* renamed from: d */
    private static C3914sz m19948d(zzbah zzbah) {
        try {
            return m19947c((abl) C4045wu.m20265a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    /* renamed from: a */
    public final int mo13689a() {
        return 0;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13690a(abl abl) {
        return m19947c(abl);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo13691a(zzbah zzbah) {
        return m19948d(zzbah);
    }

    /* renamed from: b */
    public final abl mo13692b(abl abl) {
        if (abl instanceof C4048ww) {
            return C4045wu.m20270c().mo13804a((C4048ww) abl).mo13803a(0).mo11490c();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    /* renamed from: b */
    public final abl mo13693b(zzbah zzbah) {
        try {
            return mo13692b((abl) C4048ww.m20277a(zzbah));
        } catch (zzbbu e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    /* renamed from: c */
    public final zzaxi mo13694c(zzbah zzbah) {
        return (zzaxi) zzaxi.m20628d().mo13903a("type.googleapis.com/google.crypto.tink.KmsAeadKey").mo13902a(((C4045wu) mo13693b(zzbah)).mo11552h()).mo13901a(zzb.REMOTE).mo11490c();
    }
}
