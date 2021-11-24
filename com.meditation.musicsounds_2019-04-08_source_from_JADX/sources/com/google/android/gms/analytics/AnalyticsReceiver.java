package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C4279br;

public final class AnalyticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C4279br f10357a;

    public final void onReceive(Context context, Intent intent) {
        if (this.f10357a == null) {
            this.f10357a = new C4279br();
        }
        C4279br.m21110a(context, intent);
    }
}
