package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.j */
final class C4803j<TResult, TContinuationResult> implements C4815v<TResult> {

    /* renamed from: a */
    private final Executor f17327a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4791a<TResult, TContinuationResult> f17328b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4818y<TContinuationResult> f17329c;

    public C4803j(Executor executor, C4791a<TResult, TContinuationResult> aVar, C4818y<TContinuationResult> yVar) {
        this.f17327a = executor;
        this.f17328b = aVar;
        this.f17329c = yVar;
    }

    /* renamed from: a */
    public final void mo15937a(C4796f<TResult> fVar) {
        this.f17327a.execute(new C4804k(this, fVar));
    }
}
