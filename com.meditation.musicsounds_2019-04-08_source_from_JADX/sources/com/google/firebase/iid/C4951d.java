package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.p125a.C3294b;
import com.google.android.gms.tasks.C4796f;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.d */
public final class C4951d {
    @GuardedBy("MessengerIpcClient.class")

    /* renamed from: a */
    private static C4951d f17749a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f17750b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ScheduledExecutorService f17751c;
    @GuardedBy("this")

    /* renamed from: d */
    private C4953f f17752d = new C4953f(this);
    @GuardedBy("this")

    /* renamed from: e */
    private int f17753e = 1;

    private C4951d(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f17751c = scheduledExecutorService;
        this.f17750b = context.getApplicationContext();
    }

    /* renamed from: a */
    private final synchronized int m24615a() {
        int i;
        i = this.f17753e;
        this.f17753e = i + 1;
        return i;
    }

    /* renamed from: a */
    private final synchronized <T> C4796f<T> m24617a(C4960m<T> mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(mVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f17752d.mo16222a((C4960m) mVar)) {
            this.f17752d = new C4953f(this);
            this.f17752d.mo16222a((C4960m) mVar);
        }
        return mVar.f17768b.mo15929a();
    }

    /* renamed from: a */
    public static synchronized C4951d m24618a(Context context) {
        C4951d dVar;
        synchronized (C4951d.class) {
            if (f17749a == null) {
                f17749a = new C4951d(context, Executors.newSingleThreadScheduledExecutor(new C3294b("MessengerIpcClient")));
            }
            dVar = f17749a;
        }
        return dVar;
    }

    /* renamed from: a */
    public final C4796f<Void> mo16216a(int i, Bundle bundle) {
        return m24617a((C4960m<T>) new C4959l<T>(m24615a(), 2, bundle));
    }

    /* renamed from: b */
    public final C4796f<Bundle> mo16217b(int i, Bundle bundle) {
        return m24617a((C4960m<T>) new C4961n<T>(m24615a(), 1, bundle));
    }
}
