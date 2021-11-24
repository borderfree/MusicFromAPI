package com.google.android.gms.measurement;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.support.p009v4.content.C0461f;
import com.google.android.gms.measurement.internal.C4629am;
import com.google.android.gms.measurement.internal.C4632ap;

public final class AppMeasurementReceiver extends C0461f implements C4632ap {

    /* renamed from: a */
    private C4629am f16628a;

    /* renamed from: a */
    public final PendingResult mo15214a() {
        return goAsync();
    }

    /* renamed from: a */
    public final void mo15215a(Context context, Intent intent) {
        m2106a_(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f16628a == null) {
            this.f16628a = new C4629am(this);
        }
        this.f16628a.mo15294a(context, intent);
    }
}
