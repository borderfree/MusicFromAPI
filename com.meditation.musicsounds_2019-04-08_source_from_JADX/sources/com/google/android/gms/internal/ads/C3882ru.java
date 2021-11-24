package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ru */
final class C3882ru implements zzv<C3832py> {

    /* renamed from: a */
    private final /* synthetic */ C3881rt f14898a;

    C3882ru(C3881rt rtVar) {
        this.f14898a = rtVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f14898a) {
                        if (this.f14898a.f14893v != parseInt) {
                            this.f14898a.f14893v = parseInt;
                            this.f14898a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C3643iy.m19175c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
