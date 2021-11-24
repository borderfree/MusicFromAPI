package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.util.C3300e;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.ar */
public final class C4634ar extends C4662bs {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicLong f16708j = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4637au f16709a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4637au f16710b;

    /* renamed from: c */
    private final PriorityBlockingQueue<C4636at<?>> f16711c = new PriorityBlockingQueue<>();

    /* renamed from: d */
    private final BlockingQueue<C4636at<?>> f16712d = new LinkedBlockingQueue();

    /* renamed from: e */
    private final UncaughtExceptionHandler f16713e = new C4635as(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: f */
    private final UncaughtExceptionHandler f16714f = new C4635as(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Object f16715g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Semaphore f16716h = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public volatile boolean f16717i;

    C4634ar(C4638av avVar) {
        super(avVar);
    }

    /* renamed from: a */
    private final void m23005a(C4636at<?> atVar) {
        synchronized (this.f16715g) {
            this.f16711c.add(atVar);
            if (this.f16709a == null) {
                this.f16709a = new C4637au(this, "Measurement Worker", this.f16711c);
                this.f16709a.setUncaughtExceptionHandler(this.f16713e);
                this.f16709a.start();
            } else {
                this.f16709a.mo15321a();
            }
        }
    }

    /* renamed from: a */
    public final <V> Future<V> mo15313a(Callable<V> callable) {
        mo15395A();
        C3266s.m14913a(callable);
        C4636at atVar = new C4636at(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f16709a) {
            if (!this.f16711c.isEmpty()) {
                mo15253r().mo15849i().mo15858a("Callable skipped the worker queue.");
            }
            atVar.run();
        } else {
            m23005a(atVar);
        }
        return atVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15233a() {
        super.mo15233a();
    }

    /* renamed from: a */
    public final void mo15314a(Runnable runnable) {
        mo15395A();
        C3266s.m14913a(runnable);
        m23005a(new C4636at<>(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: b */
    public final <V> Future<V> mo15315b(Callable<V> callable) {
        mo15395A();
        C3266s.m14913a(callable);
        C4636at atVar = new C4636at(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f16709a) {
            atVar.run();
        } else {
            m23005a(atVar);
        }
        return atVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15236b() {
        super.mo15236b();
    }

    /* renamed from: b */
    public final void mo15316b(Runnable runnable) {
        mo15395A();
        C3266s.m14913a(runnable);
        C4636at atVar = new C4636at(this, runnable, false, "Task exception on network thread");
        synchronized (this.f16715g) {
            this.f16712d.add(atVar);
            if (this.f16710b == null) {
                this.f16710b = new C4637au(this, "Measurement Network", this.f16712d);
                this.f16710b.setUncaughtExceptionHandler(this.f16714f);
                this.f16710b.start();
            } else {
                this.f16710b.mo15321a();
            }
        }
    }

    /* renamed from: c */
    public final void mo15238c() {
        if (Thread.currentThread() != this.f16710b) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: d */
    public final void mo15239d() {
        if (Thread.currentThread() != this.f16709a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo15271e() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo15317g() {
        return Thread.currentThread() == this.f16709a;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C4643b mo15247l() {
        return super.mo15247l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C3300e mo15248m() {
        return super.mo15248m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo15249n() {
        return super.mo15249n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C4765p mo15250o() {
        return super.mo15250o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C4736ek mo15251p() {
        return super.mo15251p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C4634ar mo15252q() {
        return super.mo15252q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C4767r mo15253r() {
        return super.mo15253r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4620ad mo15254s() {
        return super.mo15254s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C4744es mo15255t() {
        return super.mo15255t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ C4742eq mo15256u() {
        return super.mo15256u();
    }
}
