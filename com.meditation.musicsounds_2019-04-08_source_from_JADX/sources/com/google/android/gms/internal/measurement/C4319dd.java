package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.dd */
final class C4319dd extends ContentObserver {
    C4319dd(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        C4318dc.f16003e.set(true);
    }
}
