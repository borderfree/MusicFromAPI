package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* renamed from: com.google.android.gms.internal.ads.ye */
public final class C4088ye implements C4079xw<Signature> {
    /* renamed from: a */
    public final /* synthetic */ Object mo13823a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
