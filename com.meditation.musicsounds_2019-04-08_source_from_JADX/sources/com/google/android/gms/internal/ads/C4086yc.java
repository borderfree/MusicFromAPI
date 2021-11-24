package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.yc */
public final class C4086yc implements C4079xw<Mac> {
    /* renamed from: a */
    public final /* synthetic */ Object mo13823a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
