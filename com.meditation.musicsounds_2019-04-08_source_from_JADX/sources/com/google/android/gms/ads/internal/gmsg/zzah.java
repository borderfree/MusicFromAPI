package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.zzaig;
import java.util.Map;

@C3464ci
public final class zzah implements zzv<Object> {

    /* renamed from: a */
    private final zzai f10025a;

    public zzah(zzai zzai) {
        this.f10025a = zzai;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("action");
        if ("grant".equals(str)) {
            zzaig zzaig = null;
            try {
                int parseInt = Integer.parseInt((String) map.get("amount"));
                String str2 = (String) map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzaig = new zzaig(str2, parseInt);
                }
            } catch (NumberFormatException e) {
                C3643iy.m19175c("Unable to parse reward amount.", e);
            }
            this.f10025a.zzb(zzaig);
        } else if ("video_start".equals(str)) {
            this.f10025a.zzdk();
        } else {
            if ("video_complete".equals(str)) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12684ax)).booleanValue()) {
                    if (((Boolean) ane.m16650f().mo12297a(aqm.f12684ax)).booleanValue()) {
                        this.f10025a.zzdl();
                    }
                }
            }
        }
    }
}
