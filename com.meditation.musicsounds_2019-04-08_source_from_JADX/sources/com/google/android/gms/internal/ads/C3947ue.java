package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4060xe.C4061a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ue */
public final class C3947ue {

    /* renamed from: a */
    public static final C4060xe f14965a = ((C4060xe) ((C4061a) C4060xe.m20308b().mo11488a(C3934ts.f14957a)).mo13813a(C3918tc.m19874a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).mo13813a(C3918tc.m19874a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).mo13814a("TINK_HYBRID_1_0_0").mo11490c());

    /* renamed from: b */
    private static final C4060xe f14966b = ((C4060xe) ((C4061a) C4060xe.m20308b().mo11488a(f14965a)).mo13814a("TINK_HYBRID_1_1_0").mo11490c());

    static {
        try {
            C3931tp.m19900a("TinkHybridEncrypt", (C3917tb<P>) new C3949ug<P>());
            C3931tp.m19900a("TinkHybridDecrypt", (C3917tb<P>) new C3948uf<P>());
            C3934ts.m19909a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
