package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3832py;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.m */
final class C2906m implements zzv<C3832py> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f10040a;

    C2906m(CountDownLatch countDownLatch) {
        this.f10040a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        C3643iy.m19178e("Adapter returned an ad, but assets substitution failed");
        this.f10040a.countDown();
        pyVar.destroy();
    }
}
