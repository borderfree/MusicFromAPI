package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final class arn implements zzv<Object> {

    /* renamed from: a */
    private final /* synthetic */ arm f12977a;

    arn(arm arm) {
        this.f12977a = arm;
    }

    public final void zza(Object obj, Map<String, String> map) {
        try {
            this.f12977a.f12972b = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            C3643iy.m19174c("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f12977a.f12971a = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (this.f12977a.f12975e == null) {
            C3643iy.m19172b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            this.f12977a.f12975e.mo12518a(str);
        } catch (RemoteException e) {
            C3731me.m19177d("#007 Could not call remote method.", e);
        }
    }
}
