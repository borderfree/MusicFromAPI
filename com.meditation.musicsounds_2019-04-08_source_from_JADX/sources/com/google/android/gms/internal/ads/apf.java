package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3327d;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
public final class apf {
    @GuardedBy("sLock")

    /* renamed from: a */
    private static apf f12573a;

    /* renamed from: b */
    private static final Object f12574b = new Object();

    /* renamed from: c */
    private aon f12575c;

    /* renamed from: d */
    private RewardedVideoAd f12576d;

    private apf() {
    }

    /* renamed from: a */
    public static apf m16830a() {
        apf apf;
        synchronized (f12574b) {
            if (f12573a == null) {
                f12573a = new apf();
            }
            apf = f12573a;
        }
        return apf;
    }

    /* renamed from: a */
    public final RewardedVideoAd mo12235a(Context context) {
        synchronized (f12574b) {
            if (this.f12576d != null) {
                RewardedVideoAd rewardedVideoAd = this.f12576d;
                return rewardedVideoAd;
            }
            this.f12576d = new C3573gi(context, (C3559fv) amt.m16608a(context, false, (C3412a<T>) new anb<T>(ane.m16646b(), context, new bar())));
            RewardedVideoAd rewardedVideoAd2 = this.f12576d;
            return rewardedVideoAd2;
        }
    }

    /* renamed from: a */
    public final void mo12236a(float f) {
        boolean z = true;
        C3266s.m14924b(0.0f <= f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        if (this.f12575c == null) {
            z = false;
        }
        C3266s.m14920a(z, (Object) "MobileAds.initialize() must be called prior to setting the app volume.");
        try {
            this.f12575c.setAppVolume(f);
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to set app volume.", e);
        }
    }

    /* renamed from: a */
    public final void mo12237a(Context context, String str) {
        C3266s.m14920a(this.f12575c != null, (Object) "MobileAds.initialize() must be called prior to opening debug menu.");
        try {
            this.f12575c.zzb(C3327d.m15136a(context), str);
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to open debug menu.", e);
        }
    }

    /* renamed from: a */
    public final void mo12238a(Context context, String str, aph aph) {
        synchronized (f12574b) {
            if (this.f12575c == null) {
                if (context != null) {
                    try {
                        this.f12575c = (aon) amt.m16608a(context, false, (C3412a<T>) new amy<T>(ane.m16646b(), context));
                        this.f12575c.zza();
                        if (str != null) {
                            this.f12575c.zza(str, C3327d.m15136a(new apg(this, context)));
                        }
                    } catch (RemoteException e) {
                        C3731me.m19175c("MobileAdsSettingManager initialization failed", e);
                    }
                } else {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12239a(boolean z) {
        C3266s.m14920a(this.f12575c != null, (Object) "MobileAds.initialize() must be called prior to setting app muted state.");
        try {
            this.f12575c.setAppMuted(z);
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to set app mute state.", e);
        }
    }

    /* renamed from: b */
    public final float mo12240b() {
        float f;
        if (this.f12575c == null) {
            return 1.0f;
        }
        try {
            f = this.f12575c.zzdo();
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to get app volume.", e);
            f = 1.0f;
        }
        return f;
    }

    /* renamed from: c */
    public final boolean mo12241c() {
        boolean z;
        if (this.f12575c == null) {
            return false;
        }
        try {
            z = this.f12575c.zzdp();
        } catch (RemoteException e) {
            C3731me.m19173b("Unable to get app mute state.", e);
            z = false;
        }
        return z;
    }
}
