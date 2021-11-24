package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class afr implements afx {

    /* renamed from: a */
    private final /* synthetic */ Activity f11921a;

    afr(afp afp, Activity activity) {
        this.f11921a = activity;
    }

    /* renamed from: a */
    public final void mo11865a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f11921a);
    }
}
