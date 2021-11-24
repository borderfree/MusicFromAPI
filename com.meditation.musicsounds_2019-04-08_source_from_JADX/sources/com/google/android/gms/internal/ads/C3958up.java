package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4060xe.C4061a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.up */
public final class C3958up {

    /* renamed from: a */
    public static final C4060xe f14978a = ((C4060xe) C4060xe.m20308b().mo13814a("TINK_MAC_1_0_0").mo13813a(C3918tc.m19874a("TinkMac", "Mac", "HmacKey", 0, true)).mo11490c());

    /* renamed from: b */
    private static final C4060xe f14979b = ((C4060xe) ((C4061a) C4060xe.m20308b().mo11488a(f14978a)).mo13814a("TINK_MAC_1_1_0").mo11490c());

    static {
        try {
            m20000a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m20000a() {
        C3931tp.m19900a("TinkMac", (C3917tb<P>) new C3957uo<P>());
    }
}
