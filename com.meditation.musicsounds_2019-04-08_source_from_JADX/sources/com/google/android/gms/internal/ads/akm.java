package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3227d.C3229b;

final class akm implements C3229b {

    /* renamed from: a */
    private final /* synthetic */ aki f12274a;

    akm(aki aki) {
        this.f12274a = aki;
    }

    /* renamed from: a */
    public final void mo11160a(ConnectionResult connectionResult) {
        synchronized (this.f12274a.f12267b) {
            this.f12274a.f12270e = null;
            if (this.f12274a.f12268c != null) {
                this.f12274a.f12268c = null;
            }
            this.f12274a.f12267b.notifyAll();
        }
    }
}
