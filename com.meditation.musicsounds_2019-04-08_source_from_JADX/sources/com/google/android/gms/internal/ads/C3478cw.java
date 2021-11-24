package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.C3304i;

/* renamed from: com.google.android.gms.internal.ads.cw */
final class C3478cw implements C3480cy {

    /* renamed from: a */
    private final /* synthetic */ Context f13711a;

    C3478cw(Context context) {
        this.f13711a = context;
    }

    /* renamed from: a */
    public final boolean mo12847a(zzang zzang) {
        ane.m16645a();
        boolean c = C3719lt.m19123c(this.f13711a);
        boolean z = ((Boolean) ane.m16650f().mo12297a(aqm.f12823dd)).booleanValue() && zzang.f15363d;
        if (C3477cv.m18276b(this.f13711a, zzang.f15363d) && c && !z) {
            if (C3304i.m15059c(this.f13711a)) {
                if (!((Boolean) ane.m16650f().mo12297a(aqm.f12615H)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
}
