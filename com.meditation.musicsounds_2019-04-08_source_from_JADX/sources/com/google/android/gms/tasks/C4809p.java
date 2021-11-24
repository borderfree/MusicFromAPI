package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.p */
final class C4809p<TResult> implements C4815v<TResult> {

    /* renamed from: a */
    private final Executor f17341a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f17342b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C4793c<TResult> f17343c;

    public C4809p(Executor executor, C4793c<TResult> cVar) {
        this.f17341a = executor;
        this.f17343c = cVar;
    }

    /* renamed from: a */
    public final void mo15937a(C4796f<TResult> fVar) {
        synchronized (this.f17342b) {
            if (this.f17343c != null) {
                this.f17341a.execute(new C4810q(this, fVar));
            }
        }
    }
}
