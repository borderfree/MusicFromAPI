package android.support.p009v4.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.content.ModernAsyncTask */
abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: a */
    private static final ThreadFactory f1324a = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f1334a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder();
            sb.append("ModernAsyncTask #");
            sb.append(this.f1334a.getAndIncrement());
            return new Thread(runnable, sb.toString());
        }
    };

    /* renamed from: b */
    private static final BlockingQueue<Runnable> f1325b = new LinkedBlockingQueue(10);

    /* renamed from: c */
    public static final Executor f1326c;

    /* renamed from: d */
    private static C0438b f1327d;

    /* renamed from: e */
    private static volatile Executor f1328e = f1326c;

    /* renamed from: f */
    private final C0439c<Params, Result> f1329f = new C0439c<Params, Result>() {
        public Result call() {
            ModernAsyncTask.this.f1333j.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                Result a = ModernAsyncTask.this.mo1778a((Params[]) this.f1341b);
                try {
                    Binder.flushPendingCommands();
                    ModernAsyncTask.this.mo1787d(a);
                    return a;
                } catch (Throwable th) {
                    th = th;
                    obj = a;
                    ModernAsyncTask.this.mo1787d(obj);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                ModernAsyncTask.this.f1332i.set(true);
                throw th;
            }
        }
    };

    /* renamed from: g */
    private final FutureTask<Result> f1330g = new FutureTask<Result>(this.f1329f) {
        /* access modifiers changed from: protected */
        public void done() {
            try {
                ModernAsyncTask.this.mo1785c(get());
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                ModernAsyncTask.this.mo1785c(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    /* renamed from: h */
    private volatile Status f1331h = Status.PENDING;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicBoolean f1332i = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final AtomicBoolean f1333j = new AtomicBoolean();

    /* renamed from: android.support.v4.content.ModernAsyncTask$Status */
    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$a */
    private static class C0437a<Data> {

        /* renamed from: a */
        final ModernAsyncTask f1339a;

        /* renamed from: b */
        final Data[] f1340b;

        C0437a(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f1339a = modernAsyncTask;
            this.f1340b = dataArr;
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$b */
    private static class C0438b extends Handler {
        C0438b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C0437a aVar = (C0437a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f1339a.mo1788e(aVar.f1340b[0]);
                    return;
                case 2:
                    aVar.f1339a.mo1784b((Progress[]) aVar.f1340b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.content.ModernAsyncTask$c */
    private static abstract class C0439c<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f1341b;

        C0439c() {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f1325b, f1324a);
        f1326c = threadPoolExecutor;
    }

    ModernAsyncTask() {
    }

    /* renamed from: d */
    private static Handler m2000d() {
        C0438b bVar;
        synchronized (ModernAsyncTask.class) {
            if (f1327d == null) {
                f1327d = new C0438b();
            }
            bVar = f1327d;
        }
        return bVar;
    }

    /* renamed from: a */
    public final ModernAsyncTask<Params, Progress, Result> mo1777a(Executor executor, Params... paramsArr) {
        if (this.f1331h != Status.PENDING) {
            switch (this.f1331h) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    throw new IllegalStateException("We should never reach this state");
            }
        } else {
            this.f1331h = Status.RUNNING;
            mo1779a();
            this.f1329f.f1341b = paramsArr;
            executor.execute(this.f1330g);
            return this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo1778a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1779a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1780a(Result result) {
    }

    /* renamed from: a */
    public final boolean mo1781a(boolean z) {
        this.f1332i.set(true);
        return this.f1330g.cancel(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1782b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1783b(Result result) {
        mo1782b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1784b(Progress... progressArr) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1785c(Result result) {
        if (!this.f1333j.get()) {
            mo1787d(result);
        }
    }

    /* renamed from: c */
    public final boolean mo1786c() {
        return this.f1332i.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Result mo1787d(Result result) {
        m2000d().obtainMessage(1, new C0437a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1788e(Result result) {
        if (mo1786c()) {
            mo1783b(result);
        } else {
            mo1780a(result);
        }
        this.f1331h = Status.FINISHED;
    }
}
