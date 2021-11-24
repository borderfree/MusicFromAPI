package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class afp implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f11916a;

    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f11917b;

    /* renamed from: c */
    private boolean f11918c = false;

    public afp(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f11917b = new WeakReference<>(activityLifecycleCallbacks);
        this.f11916a = application;
    }

    /* renamed from: a */
    private final void m16132a(afx afx) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f11917b.get();
            if (activityLifecycleCallbacks != null) {
                afx.mo11865a(activityLifecycleCallbacks);
                return;
            }
            if (!this.f11918c) {
                this.f11916a.unregisterActivityLifecycleCallbacks(this);
                this.f11918c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m16132a(new afq(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m16132a(new afw(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m16132a(new aft(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m16132a(new afs(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m16132a(new afv(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m16132a(new afr(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m16132a(new afu(this, activity));
    }
}
