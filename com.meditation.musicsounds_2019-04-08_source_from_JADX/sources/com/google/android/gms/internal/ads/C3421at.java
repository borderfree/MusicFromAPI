package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzas;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.at */
final class C3421at implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f13125a;

    /* renamed from: b */
    private final /* synthetic */ C3420as f13126b;

    C3421at(C3420as asVar, CountDownLatch countDownLatch) {
        this.f13126b = asVar;
        this.f13125a = countDownLatch;
    }

    public final void run() {
        synchronized (this.f13126b.f12163d) {
            this.f13126b.f13049m = zzas.zza(this.f13126b.f13048l, this.f13126b.f13043g, this.f13125a);
        }
    }
}
