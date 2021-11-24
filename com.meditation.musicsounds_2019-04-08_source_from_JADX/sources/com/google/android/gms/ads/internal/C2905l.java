package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.internal.ads.C3832py;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.l */
final class C2905l implements zzv<C3832py> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f10039a;

    C2905l(CountDownLatch countDownLatch) {
        this.f10039a = countDownLatch;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        this.f10039a.countDown();
        pyVar.getView().setVisibility(0);
    }
}
