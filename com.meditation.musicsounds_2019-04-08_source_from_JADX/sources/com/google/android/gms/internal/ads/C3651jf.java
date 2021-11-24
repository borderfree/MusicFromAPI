package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.jf */
public final class C3651jf {

    /* renamed from: a */
    public static final C3757nd f14271a;

    /* renamed from: b */
    private static final C3757nd f14272b;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), m18857a("Default"));
        f14271a = C3758ne.m19212a(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), m18857a("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f14272b = C3758ne.m19212a(threadPoolExecutor2);
    }

    /* renamed from: a */
    public static C3751my<?> m18855a(Runnable runnable) {
        return f14271a.mo13253a(runnable);
    }

    /* renamed from: a */
    public static <T> C3751my<T> m18856a(Callable<T> callable) {
        return f14271a.mo13254a(callable);
    }

    /* renamed from: a */
    private static ThreadFactory m18857a(String str) {
        return new C3652jg(str);
    }

    /* renamed from: b */
    public static C3751my<?> m18858b(Runnable runnable) {
        return f14272b.mo13253a(runnable);
    }
}
