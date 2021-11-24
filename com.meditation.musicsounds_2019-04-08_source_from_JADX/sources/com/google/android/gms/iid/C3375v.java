package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.C4796f;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.iid.v */
public final class C3375v {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f11311a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f11312b;
    @GuardedBy("this")

    /* renamed from: c */
    private C3377x f11313c;
    @GuardedBy("this")

    /* renamed from: d */
    private int f11314d;

    public C3375v(Context context) {
        this(context, Executors.newSingleThreadScheduledExecutor());
    }

    private C3375v(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11313c = new C3377x(this);
        this.f11314d = 1;
        this.f11311a = context.getApplicationContext();
        this.f11312b = scheduledExecutorService;
    }

    /* renamed from: a */
    private final synchronized int m15265a() {
        int i;
        i = this.f11314d;
        this.f11314d = i + 1;
        return i;
    }

    /* renamed from: a */
    private final synchronized <T> C4796f<T> m15267a(C3354ad<T> adVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(adVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f11313c.mo11412a((C3354ad) adVar)) {
            this.f11313c = new C3377x(this);
            this.f11313c.mo11412a((C3354ad) adVar);
        }
        return adVar.f11276b.mo15929a();
    }

    /* renamed from: a */
    public final C4796f<Bundle> mo11407a(int i, Bundle bundle) {
        return m15267a((C3354ad<T>) new C3356c<T>(m15265a(), 1, bundle));
    }
}
