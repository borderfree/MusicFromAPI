package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import java.util.Map;

@C3464ci
public final class zzc implements zzv<Object> {

    /* renamed from: a */
    private final zzd f10026a;

    public zzc(zzd zzd) {
        this.f10026a = zzd;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("name");
        if (str == null) {
            C3643iy.m19178e("App event with no name parameter.");
        } else {
            this.f10026a.onAppEvent(str, (String) map.get("info"));
        }
    }
}
