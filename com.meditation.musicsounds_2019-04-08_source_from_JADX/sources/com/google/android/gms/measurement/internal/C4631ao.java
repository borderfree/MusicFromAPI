package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.ao */
final class C4631ao implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4638av f16694a;

    /* renamed from: b */
    private final /* synthetic */ long f16695b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f16696c;

    /* renamed from: d */
    private final /* synthetic */ Context f16697d;

    /* renamed from: e */
    private final /* synthetic */ C4767r f16698e;

    /* renamed from: f */
    private final /* synthetic */ PendingResult f16699f;

    C4631ao(C4629am amVar, C4638av avVar, long j, Bundle bundle, Context context, C4767r rVar, PendingResult pendingResult) {
        this.f16694a = avVar;
        this.f16695b = j;
        this.f16696c = bundle;
        this.f16697d = context;
        this.f16698e = rVar;
        this.f16699f = pendingResult;
    }

    public final void run() {
        long a = this.f16694a.mo15336c().f16652h.mo15283a();
        long j = this.f16695b;
        if (a > 0 && (j >= a || j <= 0)) {
            j = a - 1;
        }
        if (j > 0) {
            this.f16696c.putLong("click_timestamp", j);
        }
        this.f16696c.putString("_cis", "referrer broadcast");
        C4638av.m23035a(this.f16697d, (C4762m) null).mo15341h().mo15413a("auto", "_cmp", this.f16696c);
        this.f16698e.mo15855x().mo15858a("Install campaign recorded");
        if (this.f16699f != null) {
            this.f16699f.finish();
        }
    }
}
