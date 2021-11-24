package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class aft implements afx {

    /* renamed from: a */
    private final /* synthetic */ Activity f11923a;

    aft(afp afp, Activity activity) {
        this.f11923a = activity;
    }

    /* renamed from: a */
    public final void mo11865a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f11923a);
    }
}
