package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C4629am;
import com.google.android.gms.measurement.internal.C4632ap;

public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements C4632ap {

    /* renamed from: a */
    private C4629am f16626a;

    /* renamed from: a */
    public final PendingResult mo15214a() {
        return goAsync();
    }

    /* renamed from: a */
    public final void mo15215a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f16626a == null) {
            this.f16626a = new C4629am(this);
        }
        this.f16626a.mo15294a(context, intent);
    }
}
