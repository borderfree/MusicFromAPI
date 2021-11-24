package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.ads.xy */
public final class C4081xy implements C4079xw<Cipher> {
    /* renamed from: a */
    public final /* synthetic */ Object mo13823a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
