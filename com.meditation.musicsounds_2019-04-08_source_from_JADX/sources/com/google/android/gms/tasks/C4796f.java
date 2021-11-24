package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.tasks.f */
public abstract class C4796f<TResult> {
    /* renamed from: a */
    public abstract C4796f<TResult> mo15915a(C4794d dVar);

    /* renamed from: a */
    public abstract C4796f<TResult> mo15916a(C4795e<? super TResult> eVar);

    /* renamed from: a */
    public <TContinuationResult> C4796f<TContinuationResult> mo15917a(Executor executor, C4791a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: a */
    public C4796f<TResult> mo15918a(Executor executor, C4792b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: a */
    public C4796f<TResult> mo15919a(Executor executor, C4793c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: a */
    public abstract C4796f<TResult> mo15920a(Executor executor, C4794d dVar);

    /* renamed from: a */
    public abstract C4796f<TResult> mo15921a(Executor executor, C4795e<? super TResult> eVar);

    /* renamed from: a */
    public abstract <X extends Throwable> TResult mo15922a(Class<X> cls);

    /* renamed from: a */
    public abstract boolean mo15923a();

    /* renamed from: b */
    public <TContinuationResult> C4796f<TContinuationResult> mo15924b(Executor executor, C4791a<TResult, C4796f<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: b */
    public abstract boolean mo15925b();

    /* renamed from: c */
    public abstract boolean mo15926c();

    /* renamed from: d */
    public abstract TResult mo15927d();

    /* renamed from: e */
    public abstract Exception mo15928e();
}
