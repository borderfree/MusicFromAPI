package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class aje implements ajg {

    /* renamed from: a */
    private final /* synthetic */ Activity f12170a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f12171b;

    aje(aiy aiy, Activity activity, Bundle bundle) {
        this.f12170a = activity;
        this.f12171b = bundle;
    }

    /* renamed from: a */
    public final void mo12002a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f12170a, this.f12171b);
    }
}
