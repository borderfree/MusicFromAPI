package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.facebook.ads.internal.p065g.C1694e;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.aqz;
import java.util.Map;

@C3464ci
public final class zze implements zzv<C3832py> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        C3832py pyVar = (C3832py) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                C3643iy.m19178e("No label given for CSI tick.");
            } else if (TextUtils.isEmpty(str4)) {
                C3643iy.m19178e("No timestamp given for CSI tick.");
            } else {
                try {
                    long b = zzbv.zzer().mo11327b() + (Long.parseLong(str4) - zzbv.zzer().mo11326a());
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "native:view_load";
                    }
                    pyVar.mo13416h().mo12317a(str2, str3, b);
                } catch (NumberFormatException e) {
                    C3643iy.m19175c("Malformed timestamp for CSI tick.", e);
                }
            }
        } else if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                C3643iy.m19178e("No value given for CSI experiment.");
                return;
            }
            aqz a = pyVar.mo13416h().mo12315a();
            if (a == null) {
                C3643iy.m19178e("No ticker for WebView, dropping experiment ID.");
            } else {
                a.mo12322a(C1694e.f5581a, str5);
            }
        } else {
            if ("extra".equals(str)) {
                String str6 = (String) map.get("name");
                String str7 = (String) map.get("value");
                if (TextUtils.isEmpty(str7)) {
                    C3643iy.m19178e("No value given for CSI extra.");
                } else if (TextUtils.isEmpty(str6)) {
                    C3643iy.m19178e("No name given for CSI extra.");
                } else {
                    aqz a2 = pyVar.mo13416h().mo12315a();
                    if (a2 == null) {
                        C3643iy.m19178e("No ticker for WebView, dropping extra parameter.");
                        return;
                    }
                    a2.mo12322a(str6, str7);
                }
            }
        }
    }
}
