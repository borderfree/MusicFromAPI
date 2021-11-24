package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.l */
final class C4805l<TResult, TContinuationResult> implements C4792b, C4794d, C4795e<TContinuationResult>, C4815v<TResult> {

    /* renamed from: a */
    private final Executor f17332a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4791a<TResult, C4796f<TContinuationResult>> f17333b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4818y<TContinuationResult> f17334c;

    public C4805l(Executor executor, C4791a<TResult, C4796f<TContinuationResult>> aVar, C4818y<TContinuationResult> yVar) {
        this.f17332a = executor;
        this.f17333b = aVar;
        this.f17334c = yVar;
    }

    /* renamed from: a */
    public final void mo15912a() {
        this.f17334c.mo15951f();
    }

    /* renamed from: a */
    public final void mo15937a(C4796f<TResult> fVar) {
        this.f17332a.execute(new C4806m(this, fVar));
    }

    /* renamed from: a */
    public final void mo15913a(Exception exc) {
        this.f17334c.mo15947a(exc);
    }

    /* renamed from: a */
    public final void mo15914a(TContinuationResult tcontinuationresult) {
        this.f17334c.mo15948a(tcontinuationresult);
    }
}
