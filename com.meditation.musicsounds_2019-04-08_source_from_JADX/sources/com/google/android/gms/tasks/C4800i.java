package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.tasks.i */
public final class C4800i {

    /* renamed from: com.google.android.gms.tasks.i$a */
    private static final class C4801a implements C4802b {

        /* renamed from: a */
        private final CountDownLatch f17326a;

        private C4801a() {
            this.f17326a = new CountDownLatch(1);
        }

        /* synthetic */ C4801a(C4819z zVar) {
            this();
        }

        /* renamed from: a */
        public final void mo15912a() {
            this.f17326a.countDown();
        }

        /* renamed from: a */
        public final void mo15913a(Exception exc) {
            this.f17326a.countDown();
        }

        /* renamed from: a */
        public final void mo15914a(Object obj) {
            this.f17326a.countDown();
        }

        /* renamed from: a */
        public final boolean mo15935a(long j, TimeUnit timeUnit) {
            return this.f17326a.await(j, timeUnit);
        }

        /* renamed from: b */
        public final void mo15936b() {
            this.f17326a.await();
        }
    }

    /* renamed from: com.google.android.gms.tasks.i$b */
    interface C4802b extends C4792b, C4794d, C4795e<Object> {
    }

    /* renamed from: a */
    public static <TResult> C4796f<TResult> m24062a(TResult tresult) {
        C4818y yVar = new C4818y();
        yVar.mo15948a(tresult);
        return yVar;
    }

    /* renamed from: a */
    public static <TResult> TResult m24063a(C4796f<TResult> fVar) {
        C3266s.m14917a();
        C3266s.m14914a(fVar, (Object) "Task must not be null");
        if (fVar.mo15923a()) {
            return m24066b(fVar);
        }
        C4801a aVar = new C4801a(null);
        m24065a(fVar, aVar);
        aVar.mo15936b();
        return m24066b(fVar);
    }

    /* renamed from: a */
    public static <TResult> TResult m24064a(C4796f<TResult> fVar, long j, TimeUnit timeUnit) {
        C3266s.m14917a();
        C3266s.m14914a(fVar, (Object) "Task must not be null");
        C3266s.m14914a(timeUnit, (Object) "TimeUnit must not be null");
        if (fVar.mo15923a()) {
            return m24066b(fVar);
        }
        C4801a aVar = new C4801a(null);
        m24065a(fVar, aVar);
        if (aVar.mo15935a(j, timeUnit)) {
            return m24066b(fVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: a */
    private static void m24065a(C4796f<?> fVar, C4802b bVar) {
        fVar.mo15921a(C4798h.f17324b, (C4795e<? super TResult>) bVar);
        fVar.mo15920a(C4798h.f17324b, (C4794d) bVar);
        fVar.mo15918a(C4798h.f17324b, (C4792b) bVar);
    }

    /* renamed from: b */
    private static <TResult> TResult m24066b(C4796f<TResult> fVar) {
        if (fVar.mo15925b()) {
            return fVar.mo15927d();
        }
        if (fVar.mo15926c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(fVar.mo15928e());
    }
}
