package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uf */
final class C3948uf implements C3917tb<C3921tf> {
    /* renamed from: a */
    public final C3923th<C3921tf> mo13687a(String str, String str2, int i) {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 275448849 && lowerCase.equals("hybriddecrypt")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == -80133005 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
                c = 0;
            }
            if (c == 0) {
                C3945uc ucVar = new C3945uc();
                if (i <= 0) {
                    return ucVar;
                }
                throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(String.format("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(String.format("No support for primitive '%s'.", new Object[]{str2}));
    }
}
