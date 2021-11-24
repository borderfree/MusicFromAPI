package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.ads.yj */
public final class C4093yj {

    /* renamed from: a */
    private static final ThreadLocal<SecureRandom> f15073a = new C4094yk();

    /* renamed from: a */
    public static byte[] m20365a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f15073a.get()).nextBytes(bArr);
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static SecureRandom m20366b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
