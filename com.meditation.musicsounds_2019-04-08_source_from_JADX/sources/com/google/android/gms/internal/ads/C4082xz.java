package com.google.android.gms.internal.ads;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.ads.xz */
public final class C4082xz implements C4079xw<KeyAgreement> {
    /* renamed from: a */
    public final /* synthetic */ Object mo13823a(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
