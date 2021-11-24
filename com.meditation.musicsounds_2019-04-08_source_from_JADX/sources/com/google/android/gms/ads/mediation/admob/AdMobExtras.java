package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

@Deprecated
public final class AdMobExtras implements NetworkExtras {

    /* renamed from: a */
    private final Bundle f10335a;

    public AdMobExtras(Bundle bundle) {
        this.f10335a = bundle != null ? new Bundle(bundle) : null;
    }

    public final Bundle getExtras() {
        return this.f10335a;
    }
}
