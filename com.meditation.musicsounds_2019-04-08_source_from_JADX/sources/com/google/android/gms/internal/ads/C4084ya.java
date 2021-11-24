package com.google.android.gms.internal.ads;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.ya */
public final class C4084ya implements C4079xw<KeyFactory> {
    /* renamed from: a */
    public final /* synthetic */ Object mo13823a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
