package com.google.android.gms.ads.internal.gmsg;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C3464ci;
import java.util.Map;

@C3464ci
public final class zzab implements zzv<Object> {

    /* renamed from: a */
    private final Context f10004a;

    public zzab(Context context) {
        this.f10004a = context;
    }

    public final void zza(Object obj, Map<String, String> map) {
        if (zzbv.zzfh().mo12999a(this.f10004a)) {
            zzbv.zzfh().mo12997a(this.f10004a, (String) map.get("eventName"), (String) map.get("eventId"));
        }
    }
}
