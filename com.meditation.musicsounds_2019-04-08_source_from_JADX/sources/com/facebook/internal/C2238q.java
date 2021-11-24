package com.facebook.internal;

import com.facebook.C2189f;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.q */
public class C2238q<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f7222a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f7223b = new CountDownLatch(1);

    public C2238q(final Callable<T> callable) {
        C2189f.m10090d().execute(new FutureTask(new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public Void call() {
                try {
                    C2238q.this.f7222a = callable.call();
                    C2238q.this.f7223b.countDown();
                    return null;
                } catch (Throwable th) {
                    C2238q.this.f7223b.countDown();
                    throw th;
                }
            }
        }));
    }
}
