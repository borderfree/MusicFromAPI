package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.p009v4.content.C0461f;
import android.util.Log;
import com.google.android.gms.common.util.p125a.C3294b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.firebase.iid.ab */
public abstract class C4924ab extends Service {

    /* renamed from: a */
    final ExecutorService f17691a;

    /* renamed from: b */
    private Binder f17692b;

    /* renamed from: c */
    private final Object f17693c;

    /* renamed from: d */
    private int f17694d;

    /* renamed from: e */
    private int f17695e;

    public C4924ab() {
        String str = "Firebase-";
        String valueOf = String.valueOf(getClass().getSimpleName());
        this.f17691a = Executors.newSingleThreadExecutor(new C3294b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
        this.f17693c = new Object();
        this.f17695e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m24544d(Intent intent) {
        if (intent != null) {
            C0461f.m2105a(intent);
        }
        synchronized (this.f17693c) {
            this.f17695e--;
            if (this.f17695e == 0) {
                stopSelfResult(this.f17694d);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Intent mo16175a(Intent intent) {
        return intent;
    }

    /* renamed from: b */
    public abstract void mo16177b(Intent intent);

    /* renamed from: c */
    public boolean mo16181c(Intent intent) {
        return false;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f17692b == null) {
            this.f17692b = new C4929ag(this);
        }
        return this.f17692b;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f17693c) {
            this.f17694d = i2;
            this.f17695e++;
        }
        Intent a = mo16175a(intent);
        if (a == null) {
            m24544d(intent);
            return 2;
        } else if (mo16181c(a)) {
            m24544d(intent);
            return 2;
        } else {
            this.f17691a.execute(new C4926ad(this, a, intent));
            return 3;
        }
    }
}
