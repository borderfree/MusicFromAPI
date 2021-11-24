package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ip */
public final class C3634ip {
    @GuardedBy("this")

    /* renamed from: a */
    private BigInteger f14225a = BigInteger.ONE;

    /* renamed from: a */
    public final synchronized String mo13073a() {
        String bigInteger;
        bigInteger = this.f14225a.toString();
        this.f14225a = this.f14225a.add(BigInteger.ONE);
        return bigInteger;
    }
}
