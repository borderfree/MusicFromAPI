package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class afv implements afx {

    /* renamed from: a */
    private final /* synthetic */ Activity f11925a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f11926b;

    afv(afp afp, Activity activity, Bundle bundle) {
        this.f11925a = activity;
        this.f11926b = bundle;
    }

    /* renamed from: a */
    public final void mo11865a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f11925a, this.f11926b);
    }
}
