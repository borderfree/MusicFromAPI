package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.nj */
public class C3763nj<T> implements C3751my<T> {

    /* renamed from: a */
    private final Object f14488a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private T f14489b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private Throwable f14490c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private boolean f14491d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private boolean f14492e;

    /* renamed from: f */
    private final C3754na f14493f = new C3754na();

    @GuardedBy("mLock")
    /* renamed from: a */
    private final boolean mo13294a() {
        return this.f14490c != null || this.f14491d;
    }

    /* renamed from: a */
    public final void mo13268a(Runnable runnable, Executor executor) {
        this.f14493f.mo13283a(runnable, executor);
    }

    /* renamed from: a */
    public final void mo13295a(Throwable th) {
        synchronized (this.f14488a) {
            if (!this.f14492e) {
                if (mo13294a()) {
                    zzbv.zzeo().mo13050b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.setException");
                    return;
                }
                this.f14490c = th;
                this.f14488a.notifyAll();
                this.f14493f.mo13282a();
            }
        }
    }

    /* renamed from: b */
    public final void mo13296b(T t) {
        synchronized (this.f14488a) {
            if (!this.f14492e) {
                if (mo13294a()) {
                    zzbv.zzeo().mo13050b(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture.set");
                    return;
                }
                this.f14491d = true;
                this.f14489b = t;
                this.f14488a.notifyAll();
                this.f14493f.mo13282a();
            }
        }
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f14488a) {
            if (mo13294a()) {
                return false;
            }
            this.f14492e = true;
            this.f14491d = true;
            this.f14488a.notifyAll();
            this.f14493f.mo13282a();
            return true;
        }
    }

    public T get() {
        T t;
        synchronized (this.f14488a) {
            if (!mo13294a()) {
                try {
                    this.f14488a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f14490c != null) {
                throw new ExecutionException(this.f14490c);
            } else if (!this.f14492e) {
                t = this.f14489b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) {
        T t;
        synchronized (this.f14488a) {
            if (!mo13294a()) {
                try {
                    long millis = timeUnit.toMillis(j);
                    if (millis != 0) {
                        this.f14488a.wait(millis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f14490c != null) {
                throw new ExecutionException(this.f14490c);
            } else if (!this.f14491d) {
                throw new TimeoutException("SettableFuture timed out.");
            } else if (!this.f14492e) {
                t = this.f14489b;
            } else {
                throw new CancellationException("SettableFuture was cancelled.");
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f14488a) {
            z = this.f14492e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f14488a) {
            a = mo13294a();
        }
        return a;
    }
}
