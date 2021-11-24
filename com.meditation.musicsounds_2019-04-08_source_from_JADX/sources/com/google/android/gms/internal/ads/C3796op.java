package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.common.util.C3309n;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.op */
public final class C3796op extends C3789oi {
    /* renamed from: a */
    public final C3788oh mo13363a(Context context, C3804ox oxVar, int i, boolean z, aqz aqz, C3803ow owVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (!(C3309n.m15070b() && (applicationInfo == null || applicationInfo.targetSdkVersion >= 11))) {
            return null;
        }
        boolean d = oxVar.mo13519r().mo13607d();
        C3805oy oyVar = new C3805oy(context, oxVar.mo13417i(), oxVar.mo13414g(), aqz, oxVar.mo13410c());
        C3775nv nvVar = new C3775nv(context, z, d, owVar, oyVar);
        return nvVar;
    }
}
