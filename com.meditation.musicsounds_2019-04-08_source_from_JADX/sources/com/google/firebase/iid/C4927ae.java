package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.ae */
final class C4927ae {

    /* renamed from: a */
    final Intent f17702a;

    /* renamed from: b */
    private final PendingResult f17703b;

    /* renamed from: c */
    private boolean f17704c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f17705d;

    C4927ae(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f17702a = intent;
        this.f17703b = pendingResult;
        this.f17705d = scheduledExecutorService.schedule(new C4928af(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo16187a() {
        if (!this.f17704c) {
            this.f17703b.finish();
            this.f17705d.cancel(false);
            this.f17704c = true;
        }
    }
}
