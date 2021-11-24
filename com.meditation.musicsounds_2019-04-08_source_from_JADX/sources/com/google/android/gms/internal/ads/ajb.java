package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ajb implements ajg {

    /* renamed from: a */
    private final /* synthetic */ Activity f12167a;

    ajb(aiy aiy, Activity activity) {
        this.f12167a = activity;
    }

    /* renamed from: a */
    public final void mo12002a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f12167a);
    }
}
