package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

final class aja implements ajg {

    /* renamed from: a */
    private final /* synthetic */ Activity f12166a;

    aja(aiy aiy, Activity activity) {
        this.f12166a = activity;
    }

    /* renamed from: a */
    public final void mo12002a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f12166a);
    }
}
