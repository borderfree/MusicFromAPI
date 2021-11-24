package com.bumptech.glide.load.engine.p048c;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.load.engine.c.a */
public final class C1440a implements ExecutorService {

    /* renamed from: a */
    private static final long f4784a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static volatile int f4785b;

    /* renamed from: c */
    private final ExecutorService f4786c;

    /* renamed from: com.bumptech.glide.load.engine.c.a$a */
    private static final class C1441a implements ThreadFactory {

        /* renamed from: a */
        final C1443b f4787a;

        /* renamed from: b */
        final boolean f4788b;

        /* renamed from: c */
        private final String f4789c;

        /* renamed from: d */
        private int f4790d;

        C1441a(String str, C1443b bVar, boolean z) {
            this.f4789c = str;
            this.f4787a = bVar;
            this.f4788b = z;
        }

        public synchronized Thread newThread(Runnable runnable) {
            C14421 r0;
            StringBuilder sb = new StringBuilder();
            sb.append("glide-");
            sb.append(this.f4789c);
            sb.append("-thread-");
            sb.append(this.f4790d);
            r0 = new Thread(runnable, sb.toString()) {
                public void run() {
                    Process.setThreadPriority(9);
                    if (C1441a.this.f4788b) {
                        StrictMode.setThreadPolicy(new Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        super.run();
                    } catch (Throwable th) {
                        C1441a.this.f4787a.mo6214a(th);
                    }
                }
            };
            this.f4790d++;
            return r0;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.c.a$b */
    public interface C1443b {

        /* renamed from: a */
        public static final C1443b f4792a = new C1443b() {
            /* renamed from: a */
            public void mo6214a(Throwable th) {
            }
        };

        /* renamed from: b */
        public static final C1443b f4793b = new C1443b() {
            /* renamed from: a */
            public void mo6214a(Throwable th) {
                if (th != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                }
            }
        };

        /* renamed from: c */
        public static final C1443b f4794c = new C1443b() {
            /* renamed from: a */
            public void mo6214a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        };

        /* renamed from: d */
        public static final C1443b f4795d = f4793b;

        /* renamed from: a */
        void mo6214a(Throwable th);
    }

    C1440a(ExecutorService executorService) {
        this.f4786c = executorService;
    }

    /* renamed from: a */
    public static C1440a m7291a() {
        return m7293a(1, "disk-cache", C1443b.f4795d);
    }

    /* renamed from: a */
    public static C1440a m7292a(int i, C1443b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, i, f4784a, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1441a("animation", bVar, true));
        return new C1440a(threadPoolExecutor);
    }

    /* renamed from: a */
    public static C1440a m7293a(int i, String str, C1443b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1441a(str, bVar, true));
        return new C1440a(threadPoolExecutor);
    }

    /* renamed from: b */
    public static C1440a m7294b() {
        return m7295b(m7298e(), "source", C1443b.f4795d);
    }

    /* renamed from: b */
    public static C1440a m7295b(int i, String str, C1443b bVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C1441a(str, bVar, false));
        return new C1440a(threadPoolExecutor);
    }

    /* renamed from: c */
    public static C1440a m7296c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, f4784a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new C1441a("source-unlimited", C1443b.f4795d, false));
        return new C1440a(threadPoolExecutor);
    }

    /* renamed from: d */
    public static C1440a m7297d() {
        return m7292a(m7298e() >= 4 ? 2 : 1, C1443b.f4795d);
    }

    /* renamed from: e */
    public static int m7298e() {
        if (f4785b == 0) {
            f4785b = Math.min(4, C1447b.m7303a());
        }
        return f4785b;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f4786c.awaitTermination(j, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f4786c.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f4786c.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f4786c.invokeAll(collection, j, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f4786c.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f4786c.invokeAny(collection, j, timeUnit);
    }

    public boolean isShutdown() {
        return this.f4786c.isShutdown();
    }

    public boolean isTerminated() {
        return this.f4786c.isTerminated();
    }

    public void shutdown() {
        this.f4786c.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f4786c.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f4786c.submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f4786c.submit(runnable, t);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f4786c.submit(callable);
    }

    public String toString() {
        return this.f4786c.toString();
    }
}
