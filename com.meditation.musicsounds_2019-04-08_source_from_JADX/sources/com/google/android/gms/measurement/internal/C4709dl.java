package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.dl */
final /* synthetic */ class C4709dl implements Runnable {

    /* renamed from: a */
    private final C4708dk f16973a;

    /* renamed from: b */
    private final int f16974b;

    /* renamed from: c */
    private final C4767r f16975c;

    /* renamed from: d */
    private final Intent f16976d;

    C4709dl(C4708dk dkVar, int i, C4767r rVar, Intent intent) {
        this.f16973a = dkVar;
        this.f16974b = i;
        this.f16975c = rVar;
        this.f16976d = intent;
    }

    public final void run() {
        this.f16973a.mo15495a(this.f16974b, this.f16975c, this.f16976d);
    }
}
