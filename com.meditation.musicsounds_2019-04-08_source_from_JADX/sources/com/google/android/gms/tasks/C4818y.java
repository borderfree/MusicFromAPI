package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.y */
final class C4818y<TResult> extends C4796f<TResult> {

    /* renamed from: a */
    private final Object f17359a = new Object();

    /* renamed from: b */
    private final C4816w<TResult> f17360b = new C4816w<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f17361c;

    /* renamed from: d */
    private volatile boolean f17362d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private TResult f17363e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f17364f;

    C4818y() {
    }

    @GuardedBy("mLock")
    /* renamed from: g */
    private final void m24096g() {
        C3266s.m14920a(this.f17361c, (Object) "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: h */
    private final void m24097h() {
        C3266s.m14920a(!this.f17361c, (Object) "Task is already complete");
    }

    @GuardedBy("mLock")
    /* renamed from: i */
    private final void m24098i() {
        if (this.f17362d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: j */
    private final void m24099j() {
        synchronized (this.f17359a) {
            if (this.f17361c) {
                this.f17360b.mo15944a((C4796f<TResult>) this);
            }
        }
    }

    /* renamed from: a */
    public final C4796f<TResult> mo15915a(C4794d dVar) {
        return mo15920a(C4798h.f17323a, dVar);
    }

    /* renamed from: a */
    public final C4796f<TResult> mo15916a(C4795e<? super TResult> eVar) {
        return mo15921a(C4798h.f17323a, eVar);
    }

    /* renamed from: a */
    public final <TContinuationResult> C4796f<TContinuationResult> mo15917a(Executor executor, C4791a<TResult, TContinuationResult> aVar) {
        C4818y yVar = new C4818y();
        this.f17360b.mo15945a((C4815v<TResult>) new C4803j<TResult>(executor, aVar, yVar));
        m24099j();
        return yVar;
    }

    /* renamed from: a */
    public final C4796f<TResult> mo15918a(Executor executor, C4792b bVar) {
        this.f17360b.mo15945a((C4815v<TResult>) new C4807n<TResult>(executor, bVar));
        m24099j();
        return this;
    }

    /* renamed from: a */
    public final C4796f<TResult> mo15919a(Executor executor, C4793c<TResult> cVar) {
        this.f17360b.mo15945a((C4815v<TResult>) new C4809p<TResult>(executor, cVar));
        m24099j();
        return this;
    }

    /* renamed from: a */
    public final C4796f<TResult> mo15920a(Executor executor, C4794d dVar) {
        this.f17360b.mo15945a((C4815v<TResult>) new C4811r<TResult>(executor, dVar));
        m24099j();
        return this;
    }

    /* renamed from: a */
    public final C4796f<TResult> mo15921a(Executor executor, C4795e<? super TResult> eVar) {
        this.f17360b.mo15945a((C4815v<TResult>) new C4813t<TResult>(executor, eVar));
        m24099j();
        return this;
    }

    /* renamed from: a */
    public final <X extends Throwable> TResult mo15922a(Class<X> cls) {
        TResult tresult;
        synchronized (this.f17359a) {
            m24096g();
            m24098i();
            if (cls.isInstance(this.f17364f)) {
                throw ((Throwable) cls.cast(this.f17364f));
            } else if (this.f17364f == null) {
                tresult = this.f17363e;
            } else {
                throw new RuntimeExecutionException(this.f17364f);
            }
        }
        return tresult;
    }

    /* renamed from: a */
    public final void mo15947a(Exception exc) {
        C3266s.m14914a(exc, (Object) "Exception must not be null");
        synchronized (this.f17359a) {
            m24097h();
            this.f17361c = true;
            this.f17364f = exc;
        }
        this.f17360b.mo15944a((C4796f<TResult>) this);
    }

    /* renamed from: a */
    public final void mo15948a(TResult tresult) {
        synchronized (this.f17359a) {
            m24097h();
            this.f17361c = true;
            this.f17363e = tresult;
        }
        this.f17360b.mo15944a((C4796f<TResult>) this);
    }

    /* renamed from: a */
    public final boolean mo15923a() {
        boolean z;
        synchronized (this.f17359a) {
            z = this.f17361c;
        }
        return z;
    }

    /* renamed from: b */
    public final <TContinuationResult> C4796f<TContinuationResult> mo15924b(Executor executor, C4791a<TResult, C4796f<TContinuationResult>> aVar) {
        C4818y yVar = new C4818y();
        this.f17360b.mo15945a((C4815v<TResult>) new C4805l<TResult>(executor, aVar, yVar));
        m24099j();
        return yVar;
    }

    /* renamed from: b */
    public final boolean mo15925b() {
        boolean z;
        synchronized (this.f17359a) {
            z = this.f17361c && !this.f17362d && this.f17364f == null;
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo15949b(Exception exc) {
        C3266s.m14914a(exc, (Object) "Exception must not be null");
        synchronized (this.f17359a) {
            if (this.f17361c) {
                return false;
            }
            this.f17361c = true;
            this.f17364f = exc;
            this.f17360b.mo15944a((C4796f<TResult>) this);
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo15950b(TResult tresult) {
        synchronized (this.f17359a) {
            if (this.f17361c) {
                return false;
            }
            this.f17361c = true;
            this.f17363e = tresult;
            this.f17360b.mo15944a((C4796f<TResult>) this);
            return true;
        }
    }

    /* renamed from: c */
    public final boolean mo15926c() {
        return this.f17362d;
    }

    /* renamed from: d */
    public final TResult mo15927d() {
        TResult tresult;
        synchronized (this.f17359a) {
            m24096g();
            m24098i();
            if (this.f17364f == null) {
                tresult = this.f17363e;
            } else {
                throw new RuntimeExecutionException(this.f17364f);
            }
        }
        return tresult;
    }

    /* renamed from: e */
    public final Exception mo15928e() {
        Exception exc;
        synchronized (this.f17359a) {
            exc = this.f17364f;
        }
        return exc;
    }

    /* renamed from: f */
    public final boolean mo15951f() {
        synchronized (this.f17359a) {
            if (this.f17361c) {
                return false;
            }
            this.f17361c = true;
            this.f17362d = true;
            this.f17360b.mo15944a((C4796f<TResult>) this);
            return true;
        }
    }
}
