package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class afq implements afx {

    /* renamed from: a */
    private final /* synthetic */ Activity f11919a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f11920b;

    afq(afp afp, Activity activity, Bundle bundle) {
        this.f11919a = activity;
        this.f11920b = bundle;
    }

    /* renamed from: a */
    public final void mo11865a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f11919a, this.f11920b);
    }
}
