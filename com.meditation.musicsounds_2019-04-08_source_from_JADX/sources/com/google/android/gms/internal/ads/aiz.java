package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class aiz implements ajg {

    /* renamed from: a */
    private final /* synthetic */ Activity f12158a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f12159b;

    aiz(aiy aiy, Activity activity, Bundle bundle) {
        this.f12158a = activity;
        this.f12159b = bundle;
    }

    /* renamed from: a */
    public final void mo12002a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f12158a, this.f12159b);
    }
}
