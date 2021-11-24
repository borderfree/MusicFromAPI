package com.google.android.gms.internal.ads;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.yb */
public final class C4085yb implements C4079xw<KeyPairGenerator> {
    /* renamed from: a */
    public final /* synthetic */ Object mo13823a(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
