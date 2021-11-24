package com.facebook.ads.internal.p077s.p078a;

import android.os.AsyncTask;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.s.a.m */
public class C1802m implements Executor {

    /* renamed from: a */
    public static final Executor f5871a = new C1802m("ASYNC_TASK", 32);

    /* renamed from: b */
    public static final Executor f5872b = new C1802m("DB", 0);

    /* renamed from: c */
    private ThreadPoolExecutor f5873c;

    /* renamed from: d */
    private Executor f5874d = AsyncTask.THREAD_POOL_EXECUTOR;

    /* renamed from: e */
    private final int f5875e;

    C1802m(final String str, int i) {
        this.f5875e = i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(Math.max(2, Math.min(availableProcessors - 1, 4)), (availableProcessors * 2) + 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() {

            /* renamed from: c */
            private final AtomicInteger f5878c = new AtomicInteger(1);

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, String.format(Locale.US, "FAN:%s #%d", new Object[]{str, Integer.valueOf(this.f5878c.getAndIncrement())}));
            }
        });
        this.f5873c = threadPoolExecutor;
        this.f5873c.allowCoreThreadTimeOut(true);
    }

    public void execute(Runnable runnable) {
        if (!(this.f5874d instanceof ThreadPoolExecutor) || ((ThreadPoolExecutor) this.f5874d).getQueue().size() >= this.f5875e) {
            this.f5873c.execute(runnable);
        } else {
            this.f5874d.execute(runnable);
        }
    }
}
