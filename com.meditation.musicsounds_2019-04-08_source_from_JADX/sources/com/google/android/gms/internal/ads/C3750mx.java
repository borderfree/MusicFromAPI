package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.mx */
final class C3750mx<T> implements C3751my<T> {

    /* renamed from: a */
    private final T f14471a;

    /* renamed from: b */
    private final C3754na f14472b = new C3754na();

    C3750mx(T t) {
        this.f14471a = t;
        this.f14472b.mo13282a();
    }

    /* renamed from: a */
    public final void mo13268a(Runnable runnable, Executor executor) {
        this.f14472b.mo13283a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.f14471a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f14471a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }
}
