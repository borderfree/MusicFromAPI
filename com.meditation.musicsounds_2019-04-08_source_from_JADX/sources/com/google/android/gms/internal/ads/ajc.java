package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class ajc implements ajg {

    /* renamed from: a */
    private final /* synthetic */ Activity f12168a;

    ajc(aiy aiy, Activity activity) {
        this.f12168a = activity;
    }

    /* renamed from: a */
    public final void mo12002a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f12168a);
    }
}
