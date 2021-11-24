package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.ug */
final class C3949ug implements C3917tb<C3922tg> {
    /* renamed from: a */
    public final C3923th<C3922tg> mo13687a(String str, String str2, int i) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 1420614889 && lowerCase.equals("hybridencrypt")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == 396454335 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                c = 0;
            }
            if (c == 0) {
                C3946ud udVar = new C3946ud();
                if (i <= 0) {
                    return udVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
