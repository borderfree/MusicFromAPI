package com.google.android.gms.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.p119b.C3007a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.iid.n */
public abstract class C3367n extends Service {

    /* renamed from: a */
    final ExecutorService f11300a;

    /* renamed from: b */
    private Binder f11301b;

    /* renamed from: c */
    private final Object f11302c;

    /* renamed from: d */
    private int f11303d;

    /* renamed from: e */
    private int f11304e;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15239b(Intent intent) {
        if (intent != null) {
            C3007a.m2105a(intent);
        }
        synchronized (this.f11302c) {
            this.f11304e--;
            if (this.f11304e == 0) {
                stopSelfResult(this.f11303d);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo11380a(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f11301b == null) {
            this.f11301b = new C3369p(this);
        }
        return this.f11301b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f11302c) {
            this.f11303d = i2;
            this.f11304e++;
        }
        if (intent == null) {
            m15239b(intent);
            return 2;
        }
        this.f11300a.execute(new C3368o(this, intent, intent));
        return 3;
    }
}
