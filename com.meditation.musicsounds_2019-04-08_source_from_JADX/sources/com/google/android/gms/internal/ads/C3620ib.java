package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ib */
final class C3620ib implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Context f14113a;

    /* renamed from: b */
    private final /* synthetic */ C3763nj f14114b;

    C3620ib(C3619ia iaVar, Context context, C3763nj njVar) {
        this.f14113a = context;
        this.f14114b = njVar;
    }

    public final void run() {
        try {
            this.f14114b.mo13296b(AdvertisingIdClient.getAdvertisingIdInfo(this.f14113a));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.f14114b.mo13295a(e);
            C3731me.m19173b("Exception while getting advertising Id info", e);
        }
    }
}
