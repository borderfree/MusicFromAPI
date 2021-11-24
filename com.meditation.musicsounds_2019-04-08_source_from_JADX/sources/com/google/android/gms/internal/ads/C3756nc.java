package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import javax.annotation.Nullable;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.nc */
final class C3756nc<V> extends FutureTask<V> implements C3751my<V> {

    /* renamed from: a */
    private final C3754na f14480a = new C3754na();

    C3756nc(Runnable runnable, @Nullable V v) {
        super(runnable, v);
    }

    C3756nc(Callable<V> callable) {
        super(callable);
    }

    /* renamed from: a */
    public final void mo13268a(Runnable runnable, Executor executor) {
        this.f14480a.mo13283a(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f14480a.mo13282a();
    }
}
