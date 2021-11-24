package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.dh */
final class C4323dh extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ C4321df f16022a;

    C4323dh(C4321df dfVar, Handler handler) {
        this.f16022a = dfVar;
        super(null);
    }

    public final void onChange(boolean z) {
        this.f16022a.mo14277b();
    }
}
