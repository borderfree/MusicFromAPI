package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.hw */
final class C3614hw implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f14107a = new AtomicInteger(1);

    C3614hw(C3611ht htVar) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f14107a.getAndIncrement();
        StringBuilder sb = new StringBuilder(42);
        sb.append("AdWorker(SCION_TASK_EXECUTOR) #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
