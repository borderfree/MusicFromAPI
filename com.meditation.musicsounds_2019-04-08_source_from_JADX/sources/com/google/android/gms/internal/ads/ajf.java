package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ajf implements ajg {

    /* renamed from: a */
    private final /* synthetic */ Activity f12172a;

    ajf(aiy aiy, Activity activity) {
        this.f12172a = activity;
    }

    /* renamed from: a */
    public final void mo12002a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f12172a);
    }
}
