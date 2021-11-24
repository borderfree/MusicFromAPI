package com.google.android.gms.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.i */
final class C3362i extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ C3360g f11294a;

    C3362i(C3360g gVar) {
        this.f11294a = gVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Received GSF callback via dynamic receiver");
        }
        this.f11294a.mo11384a(intent);
    }
}
