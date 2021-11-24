package com.pollfish.p147c;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.pollfish.p150f.C5162b;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pollfish.c.h */
public abstract class C5119h {

    /* renamed from: a */
    private static final LinkedBlockingQueue f18298a = new LinkedBlockingQueue();

    /* renamed from: b */
    private static final ThreadFactory f18299b = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f18305a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTaskEx #");
            sb.append(this.f18305a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: c */
    private static final ThreadPoolExecutor f18300c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C5124a f18301d = new C5124a();

    /* renamed from: e */
    private final C5127d f18302e = new C5127d() {
        public Object call() {
            Process.setThreadPriority(10);
            return C5119h.this.mo16674a(this.f18315b);
        }
    };

    /* renamed from: f */
    private final FutureTask f18303f = new FutureTask(this.f18302e) {
        /* access modifiers changed from: protected */
        public void done() {
            Message obtainMessage;
            Object obj = null;
            try {
                obj = get();
            } catch (InterruptedException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("error:");
                sb.append(e);
                C5162b.m25518a("PollfishAsyncTask", sb.toString());
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occured while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                obtainMessage = C5119h.f18301d.obtainMessage(3, new C5125b(C5119h.this, null));
            } catch (Throwable th) {
                throw new RuntimeException("An error occured while executing doInBackground()", th);
            }
            obtainMessage = C5119h.f18301d.obtainMessage(1, new C5125b(C5119h.this, obj));
            obtainMessage.sendToTarget();
        }
    };

    /* renamed from: g */
    private volatile C5126c f18304g = C5126c.PENDING;

    /* renamed from: com.pollfish.c.h$a */
    private static class C5124a extends Handler {
        private C5124a() {
        }

        public void handleMessage(Message message) {
            C5125b bVar = (C5125b) message.obj;
            switch (message.what) {
                case 1:
                    bVar.f18309a.m25384b(bVar.f18310b[0]);
                    return;
                case 2:
                    bVar.f18309a.mo16698b(bVar.f18310b);
                    return;
                case 3:
                    bVar.f18309a.mo16700c();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.pollfish.c.h$b */
    private static class C5125b {

        /* renamed from: a */
        final C5119h f18309a;

        /* renamed from: b */
        final Object[] f18310b;

        C5125b(C5119h hVar, Object... objArr) {
            this.f18309a = hVar;
            this.f18310b = objArr;
        }
    }

    /* renamed from: com.pollfish.c.h$c */
    public enum C5126c {
        PENDING,
        RUNNING,
        FINISHED;

        /* renamed from: a */
        public static C5126c[] m25392a() {
            return (C5126c[]) f18314d.clone();
        }
    }

    /* renamed from: com.pollfish.c.h$d */
    private static abstract class C5127d implements Callable {

        /* renamed from: b */
        Object[] f18315b;

        private C5127d() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 10, 1, TimeUnit.SECONDS, f18298a, f18299b);
        f18300c = threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25384b(Object obj) {
        mo16677a(obj);
        this.f18304g = C5126c.FINISHED;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo16674a(Object... objArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16676a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16677a(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16698b(Object... objArr) {
    }

    /* renamed from: c */
    public final C5119h mo16699c(Object... objArr) {
        if (this.f18304g != C5126c.PENDING) {
            switch (this.f18304g) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f18304g = C5126c.RUNNING;
        mo16676a();
        this.f18302e.f18315b = objArr;
        f18300c.execute(this.f18303f);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo16700c() {
    }
}
