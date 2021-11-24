package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ia */
public final class C3619ia implements C3621ic {
    /* renamed from: a */
    public final C3751my<Info> mo13020a(Context context) {
        C3763nj njVar = new C3763nj();
        ane.m16645a();
        if (C3719lt.m19126f(context)) {
            C3651jf.m18855a((Runnable) new C3620ib(this, context, njVar));
        }
        return njVar;
    }

    /* renamed from: a */
    public final C3751my<String> mo13021a(String str, PackageInfo packageInfo) {
        return C3740mn.m19191a(str);
    }
}
