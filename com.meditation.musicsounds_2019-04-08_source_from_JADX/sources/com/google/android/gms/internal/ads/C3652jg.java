package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.jg */
final class C3652jg implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f14273a = new AtomicInteger(1);

    /* renamed from: b */
    private final /* synthetic */ String f14274b;

    C3652jg(String str) {
        this.f14274b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f14274b;
        int andIncrement = this.f14273a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
