package com.google.android.bitmapfun;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AsyncTask<Params, Progress, Result> {

    /* renamed from: a */
    public static final Executor f7639a;

    /* renamed from: b */
    public static final Executor f7640b = (C2429g.m11309c() ? new C2409c() : Executors.newSingleThreadExecutor(f7642d));

    /* renamed from: c */
    public static final Executor f7641c = Executors.newFixedThreadPool(2, f7642d);

    /* renamed from: d */
    private static final ThreadFactory f7642d = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f7651a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTask #");
            sb.append(this.f7651a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: e */
    private static final BlockingQueue<Runnable> f7643e = new LinkedBlockingQueue(10);

    /* renamed from: f */
    private static final C2408b f7644f = new C2408b();

    /* renamed from: g */
    private static volatile Executor f7645g = f7640b;

    /* renamed from: h */
    private final C2411d<Params, Result> f7646h = new C2411d<Params, Result>() {
        public Result call() {
            AsyncTask.this.f7650l.set(true);
            Process.setThreadPriority(10);
            return AsyncTask.this.m11158d(AsyncTask.this.mo8517a((Params[]) this.f7662b));
        }
    };

    /* renamed from: i */
    private final FutureTask<Result> f7647i = new FutureTask<Result>(this.f7646h) {
        /* access modifiers changed from: protected */
        public void done() {
            try {
                AsyncTask.this.m11157c(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                AsyncTask.this.m11157c(null);
            }
        }
    };

    /* renamed from: j */
    private volatile Status f7648j = Status.PENDING;

    /* renamed from: k */
    private final AtomicBoolean f7649k = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final AtomicBoolean f7650l = new AtomicBoolean();

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: com.google.android.bitmapfun.AsyncTask$a */
    private static class C2407a<Data> {

        /* renamed from: a */
        final AsyncTask f7656a;

        /* renamed from: b */
        final Data[] f7657b;

        C2407a(AsyncTask asyncTask, Data... dataArr) {
            this.f7656a = asyncTask;
            this.f7657b = dataArr;
        }
    }

    /* renamed from: com.google.android.bitmapfun.AsyncTask$b */
    private static class C2408b extends Handler {
        private C2408b() {
        }

        public void handleMessage(Message message) {
            C2407a aVar = (C2407a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f7656a.m11159e(aVar.f7657b[0]);
                    return;
                case 2:
                    aVar.f7656a.mo8523b((Progress[]) aVar.f7657b);
                    return;
                default:
                    return;
            }
        }
    }

    @TargetApi(11)
    /* renamed from: com.google.android.bitmapfun.AsyncTask$c */
    private static class C2409c implements Executor {

        /* renamed from: a */
        final ArrayDeque<Runnable> f7658a;

        /* renamed from: b */
        Runnable f7659b;

        private C2409c() {
            this.f7658a = new ArrayDeque<>();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public synchronized void mo8530a() {
            Runnable runnable = (Runnable) this.f7658a.poll();
            this.f7659b = runnable;
            if (runnable != null) {
                AsyncTask.f7639a.execute(this.f7659b);
            }
        }

        public synchronized void execute(final Runnable runnable) {
            this.f7658a.offer(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } finally {
                        C2409c.this.mo8530a();
                    }
                }
            });
            if (this.f7659b == null) {
                mo8530a();
            }
        }
    }

    /* renamed from: com.google.android.bitmapfun.AsyncTask$d */
    private static abstract class C2411d<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f7662b;

        private C2411d() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f7643e, f7642d, new DiscardOldestPolicy());
        f7639a = threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11157c(Result result) {
        if (!this.f7650l.get()) {
            m11158d(result);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public Result m11158d(Result result) {
        f7644f.obtainMessage(1, new C2407a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m11159e(Result result) {
        if (mo8525c()) {
            mo8522b(result);
        } else {
            mo8519a(result);
        }
        this.f7648j = Status.FINISHED;
    }

    /* renamed from: a */
    public final AsyncTask<Params, Progress, Result> mo8516a(Executor executor, Params... paramsArr) {
        if (this.f7648j != Status.PENDING) {
            switch (this.f7648j) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f7648j = Status.RUNNING;
        mo8518a();
        this.f7646h.f7662b = paramsArr;
        executor.execute(this.f7647i);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo8517a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8518a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8519a(Result result) {
    }

    /* renamed from: a */
    public final boolean mo8520a(boolean z) {
        this.f7649k.set(true);
        return this.f7647i.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8521b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8522b(Result result) {
        mo8521b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8523b(Progress... progressArr) {
    }

    /* renamed from: c */
    public final AsyncTask<Params, Progress, Result> mo8524c(Params... paramsArr) {
        return mo8516a(f7645g, paramsArr);
    }

    /* renamed from: c */
    public final boolean mo8525c() {
        return this.f7649k.get();
    }
}
