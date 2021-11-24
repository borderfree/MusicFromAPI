package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C3309n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C3080b implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: a */
    private static final C3080b f10712a = new C3080b();

    /* renamed from: b */
    private final AtomicBoolean f10713b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f10714c = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: d */
    private final ArrayList<C3081a> f10715d = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: e */
    private boolean f10716e = false;

    /* renamed from: com.google.android.gms.common.api.internal.b$a */
    public interface C3081a {
        /* renamed from: a */
        void mo10936a(boolean z);
    }

    private C3080b() {
    }

    /* renamed from: a */
    public static C3080b m14205a() {
        return f10712a;
    }

    /* renamed from: a */
    public static void m14206a(Application application) {
        synchronized (f10712a) {
            if (!f10712a.f10716e) {
                application.registerActivityLifecycleCallbacks(f10712a);
                application.registerComponentCallbacks(f10712a);
                f10712a.f10716e = true;
            }
        }
    }

    /* renamed from: b */
    private final void m14207b(boolean z) {
        synchronized (f10712a) {
            ArrayList arrayList = this.f10715d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C3081a) obj).mo10936a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo10940a(C3081a aVar) {
        synchronized (f10712a) {
            this.f10715d.add(aVar);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean mo10941a(boolean z) {
        if (!this.f10714c.get()) {
            if (!C3309n.m15072d()) {
                return z;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f10714c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f10713b.set(true);
            }
        }
        return mo10942b();
    }

    /* renamed from: b */
    public final boolean mo10942b() {
        return this.f10713b.get();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f10713b.compareAndSet(true, false);
        this.f10714c.set(true);
        if (compareAndSet) {
            m14207b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f10713b.compareAndSet(true, false);
        this.f10714c.set(true);
        if (compareAndSet) {
            m14207b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f10713b.compareAndSet(false, true)) {
            this.f10714c.set(true);
            m14207b(true);
        }
    }
}
