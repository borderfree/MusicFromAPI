package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.mw */
final class C3749mw<T> implements C3751my<T> {

    /* renamed from: a */
    private final Throwable f14469a;

    /* renamed from: b */
    private final C3754na f14470b = new C3754na();

    C3749mw(Throwable th) {
        this.f14469a = th;
        this.f14470b.mo13282a();
    }

    /* renamed from: a */
    public final void mo13268a(Runnable runnable, Executor executor) {
        this.f14470b.mo13283a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        throw new ExecutionException(this.f14469a);
    }

    public final T get(long j, TimeUnit timeUnit) {
        throw new ExecutionException(this.f14469a);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
