package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import javax.annotation.Nullable;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.mh */
public abstract class C3734mh extends AbstractExecutorService implements C3757nd {
    /* renamed from: a */
    public final C3751my<?> submit(Runnable runnable) {
        return (C3751my) super.submit(runnable);
    }

    /* renamed from: a */
    public final <T> C3751my<T> submit(Callable<T> callable) {
        return (C3751my) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C3756nc(runnable, t);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new C3756nc(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @Nullable Object obj) {
        return (C3751my) super.submit(runnable, obj);
    }
}
