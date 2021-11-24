package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ajd implements ajg {

    /* renamed from: a */
    private final /* synthetic */ Activity f12169a;

    ajd(aiy aiy, Activity activity) {
        this.f12169a = activity;
    }

    /* renamed from: a */
    public final void mo12002a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f12169a);
    }
}
