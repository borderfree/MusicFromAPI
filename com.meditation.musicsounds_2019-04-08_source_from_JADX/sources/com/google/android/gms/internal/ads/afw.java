package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class afw implements afx {

    /* renamed from: a */
    private final /* synthetic */ Activity f11927a;

    afw(afp afp, Activity activity) {
        this.f11927a = activity;
    }

    /* renamed from: a */
    public final void mo11865a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f11927a);
    }
}
