package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class afu implements afx {

    /* renamed from: a */
    private final /* synthetic */ Activity f11924a;

    afu(afp afp, Activity activity) {
        this.f11924a = activity;
    }

    /* renamed from: a */
    public final void mo11865a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f11924a);
    }
}
