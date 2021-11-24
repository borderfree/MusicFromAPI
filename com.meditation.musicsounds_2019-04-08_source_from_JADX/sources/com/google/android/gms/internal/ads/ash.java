package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class ash implements zzv<Object> {

    /* renamed from: a */
    private final WeakReference<asd> f13077a;

    /* renamed from: b */
    private final String f13078b;

    public ash(asd asd, String str) {
        this.f13077a = new WeakReference<>(asd);
        this.f13078b = str;
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = (String) map.get("ads_id");
        String str2 = (String) map.get("eventName");
        if (!TextUtils.isEmpty(str) && this.f13078b.equals(str)) {
            try {
                Integer.parseInt((String) map.get("eventType"));
            } catch (Exception e) {
                C3643iy.m19173b("Parse Scion log event type error", e);
            }
            if ("_ai".equals(str2)) {
                asd asd = (asd) this.f13077a.get();
                if (asd != null) {
                    asd.zzbr();
                }
            } else if ("_ac".equals(str2)) {
                asd asd2 = (asd) this.f13077a.get();
                if (asd2 != null) {
                    asd2.zzbs();
                }
            }
        }
    }
}
