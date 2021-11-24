package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4060xe.C4061a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ts */
public final class C3934ts {

    /* renamed from: a */
    public static final C4060xe f14957a = ((C4060xe) ((C4061a) C4060xe.m20308b().mo11488a(C3958up.f14978a)).mo13813a(C3918tc.m19874a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).mo13813a(C3918tc.m19874a("TinkAead", "Aead", "AesEaxKey", 0, true)).mo13813a(C3918tc.m19874a("TinkAead", "Aead", "AesGcmKey", 0, true)).mo13813a(C3918tc.m19874a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).mo13813a(C3918tc.m19874a("TinkAead", "Aead", "KmsAeadKey", 0, true)).mo13813a(C3918tc.m19874a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).mo13814a("TINK_AEAD_1_0_0").mo11490c());

    /* renamed from: b */
    private static final C4060xe f14958b = ((C4060xe) ((C4061a) C4060xe.m20308b().mo11488a(f14957a)).mo13814a("TINK_AEAD_1_1_0").mo11490c());

    static {
        try {
            m19909a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m19909a() {
        C3931tp.m19900a("TinkAead", (C3917tb<P>) new C3933tr<P>());
        C3958up.m20000a();
    }
}
