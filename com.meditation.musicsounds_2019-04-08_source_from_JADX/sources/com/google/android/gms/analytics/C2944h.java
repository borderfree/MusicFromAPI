package com.google.android.gms.analytics;

import android.content.BroadcastReceiver.PendingResult;

/* renamed from: com.google.android.gms.analytics.h */
final class C2944h implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ PendingResult f10387a;

    C2944h(C2931a aVar, PendingResult pendingResult) {
        this.f10387a = pendingResult;
    }

    public final void run() {
        if (this.f10387a != null) {
            this.f10387a.finish();
        }
    }
}
