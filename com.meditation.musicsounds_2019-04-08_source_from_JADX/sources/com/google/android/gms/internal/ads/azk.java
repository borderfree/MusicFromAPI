package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3464ci
public final class azk {

    /* renamed from: a */
    private final Object f13377a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private azr f13378b;

    /* renamed from: a */
    public final azr mo12647a(Context context, zzang zzang) {
        azr azr;
        synchronized (this.f13377a) {
            if (this.f13378b == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f13378b = new azr(context, zzang, (String) ane.m16650f().mo12297a(aqm.f12634a));
            }
            azr = this.f13378b;
        }
        return azr;
    }
}
