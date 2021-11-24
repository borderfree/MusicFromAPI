package com.google.android.gms.analytics;

import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.analytics.r */
final class C2957r extends FutureTask<T> {

    /* renamed from: a */
    private final /* synthetic */ C2953a f10415a;

    C2957r(C2953a aVar, Runnable runnable, Object obj) {
        this.f10415a = aVar;
        super(runnable, obj);
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        UncaughtExceptionHandler b = C2952p.this.f10410g;
        if (b != null) {
            b.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("MeasurementExecutor: job failed with ");
            sb.append(valueOf);
            Log.e("GAv4", sb.toString());
        }
        super.setException(th);
    }
}
