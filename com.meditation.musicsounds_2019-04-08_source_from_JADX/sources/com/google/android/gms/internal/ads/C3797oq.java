package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
@C3464ci
/* renamed from: com.google.android.gms.internal.ads.oq */
public final class C3797oq {

    /* renamed from: a */
    private final long f14564a = TimeUnit.MILLISECONDS.toNanos(((Long) ane.m16650f().mo12297a(aqm.f12914x)).longValue());

    /* renamed from: b */
    private long f14565b;

    /* renamed from: c */
    private boolean f14566c = true;

    C3797oq() {
    }

    /* renamed from: a */
    public final void mo13388a() {
        this.f14566c = true;
    }

    /* renamed from: a */
    public final void mo13389a(SurfaceTexture surfaceTexture, C3787og ogVar) {
        if (ogVar != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f14566c || Math.abs(timestamp - this.f14565b) >= this.f14564a) {
                this.f14566c = false;
                this.f14565b = timestamp;
                C3653jh.f14275a.post(new C3798or(this, ogVar));
            }
        }
    }
}
