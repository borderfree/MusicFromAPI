package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class afs implements afx {

    /* renamed from: a */
    private final /* synthetic */ Activity f11922a;

    afs(afp afp, Activity activity) {
        this.f11922a = activity;
    }

    /* renamed from: a */
    public final void mo11865a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f11922a);
    }
}
