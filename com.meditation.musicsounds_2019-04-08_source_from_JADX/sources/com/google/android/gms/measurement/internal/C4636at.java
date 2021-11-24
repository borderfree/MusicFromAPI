package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.at */
final class C4636at<V> extends FutureTask<V> implements Comparable<C4636at> {

    /* renamed from: a */
    final boolean f16720a;

    /* renamed from: b */
    private final long f16721b = C4634ar.f16708j.getAndIncrement();

    /* renamed from: c */
    private final String f16722c;

    /* renamed from: d */
    private final /* synthetic */ C4634ar f16723d;

    C4636at(C4634ar arVar, Runnable runnable, boolean z, String str) {
        this.f16723d = arVar;
        super(runnable, null);
        C3266s.m14913a(str);
        this.f16722c = str;
        this.f16720a = false;
        if (this.f16721b == Long.MAX_VALUE) {
            arVar.mo15253r().mo15852u_().mo15858a("Tasks index overflow");
        }
    }

    C4636at(C4634ar arVar, Callable<V> callable, boolean z, String str) {
        this.f16723d = arVar;
        super(callable);
        C3266s.m14913a(str);
        this.f16722c = str;
        this.f16720a = z;
        if (this.f16721b == Long.MAX_VALUE) {
            arVar.mo15253r().mo15852u_().mo15858a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        C4636at atVar = (C4636at) obj;
        if (this.f16720a != atVar.f16720a) {
            return this.f16720a ? -1 : 1;
        }
        if (this.f16721b < atVar.f16721b) {
            return -1;
        }
        if (this.f16721b > atVar.f16721b) {
            return 1;
        }
        this.f16723d.mo15253r().mo15847g().mo15859a("Two tasks share the same index. index", Long.valueOf(this.f16721b));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f16723d.mo15253r().mo15852u_().mo15859a(this.f16722c, th);
        if (th instanceof zzbs) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }
}
