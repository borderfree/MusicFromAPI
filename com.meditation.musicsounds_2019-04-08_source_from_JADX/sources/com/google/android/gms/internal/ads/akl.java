package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C3227d.C3228a;

final class akl implements C3228a {

    /* renamed from: a */
    private final /* synthetic */ aki f12273a;

    akl(aki aki) {
        this.f12273a = aki;
    }

    /* renamed from: a */
    public final void mo11230a(int i) {
        synchronized (this.f12273a.f12267b) {
            this.f12273a.f12270e = null;
            this.f12273a.f12267b.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo11231a(Bundle bundle) {
        synchronized (this.f12273a.f12267b) {
            try {
                if (this.f12273a.f12268c != null) {
                    this.f12273a.f12270e = this.f12273a.f12268c.mo10737e();
                }
            } catch (DeadObjectException e) {
                C3643iy.m19173b("Unable to obtain a cache service instance.", e);
                this.f12273a.m16438c();
            }
            this.f12273a.f12267b.notifyAll();
        }
    }
}
