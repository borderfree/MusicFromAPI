package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import java.util.Map;

@C3464ci
public final class zzy implements zzv<Object> {

    /* renamed from: a */
    private final zzz f10028a;

    public zzy(zzz zzz) {
        this.f10028a = zzz;
    }

    public final void zza(Object obj, Map<String, String> map) {
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            C3643iy.m19173b("Fail to parse float", e);
        }
        this.f10028a.zzd(equals);
        this.f10028a.zza(equals2, f);
    }
}
