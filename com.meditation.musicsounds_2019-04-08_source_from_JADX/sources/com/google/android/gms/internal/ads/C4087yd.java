package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.ads.yd */
public final class C4087yd implements C4079xw<MessageDigest> {
    /* renamed from: a */
    public final /* synthetic */ Object mo13823a(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
