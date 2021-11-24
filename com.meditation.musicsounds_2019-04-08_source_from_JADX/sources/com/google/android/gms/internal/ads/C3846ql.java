package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ql */
final class C3846ql implements zzv<C3832py> {

    /* renamed from: a */
    private final /* synthetic */ C3845qk f14780a;

    C3846ql(C3845qk qkVar) {
        this.f14780a = qkVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f14780a) {
                        if (this.f14780a.f14738B != parseInt) {
                            this.f14780a.f14738B = parseInt;
                            this.f14780a.requestLayout();
                        }
                    }
                } catch (Exception e) {
                    C3643iy.m19175c("Exception occurred while getting webview content height", e);
                }
            }
        }
    }
}
