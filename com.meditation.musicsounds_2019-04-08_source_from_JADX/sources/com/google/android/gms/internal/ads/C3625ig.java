package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ig */
final class C3625ig {

    /* renamed from: a */
    private long f14182a = -1;

    /* renamed from: b */
    private long f14183b = -1;

    /* renamed from: a */
    public final long mo13033a() {
        return this.f14183b;
    }

    /* renamed from: b */
    public final void mo13034b() {
        this.f14183b = SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public final void mo13035c() {
        this.f14182a = SystemClock.elapsedRealtime();
    }

    /* renamed from: d */
    public final Bundle mo13036d() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f14182a);
        bundle.putLong("tclose", this.f14183b);
        return bundle;
    }
}
