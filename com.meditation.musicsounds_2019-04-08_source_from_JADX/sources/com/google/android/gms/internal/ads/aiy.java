package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

final class aiy implements ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final Application f12155a;

    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f12156b;

    /* renamed from: c */
    private boolean f12157c = false;

    public aiy(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f12156b = new WeakReference<>(activityLifecycleCallbacks);
        this.f12155a = application;
    }

    /* renamed from: a */
    private final void m16347a(ajg ajg) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f12156b.get();
            if (activityLifecycleCallbacks != null) {
                ajg.mo12002a(activityLifecycleCallbacks);
                return;
            }
            if (!this.f12157c) {
                this.f12155a.unregisterActivityLifecycleCallbacks(this);
                this.f12157c = true;
            }
        } catch (Exception e) {
            C3643iy.m19173b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m16347a(new aiz(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        m16347a(new ajf(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        m16347a(new ajc(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        m16347a(new ajb(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m16347a(new aje(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        m16347a(new aja(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        m16347a(new ajd(this, activity));
    }
}
