package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import org.json.JSONObject;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.fj */
public final class C3547fj implements C3523em {

    /* renamed from: a */
    private azj<JSONObject, JSONObject> f13980a;

    /* renamed from: b */
    private azj<JSONObject, JSONObject> f13981b;

    public C3547fj(Context context) {
        this.f13980a = zzbv.zzey().mo12647a(context, zzang.m20619a()).mo12650a("google.afma.request.getAdDictionary", azo.f13379a, azo.f13379a);
        this.f13981b = zzbv.zzey().mo12647a(context, zzang.m20619a()).mo12650a("google.afma.sdkConstants.getSdkConstants", azo.f13379a, azo.f13379a);
    }

    /* renamed from: a */
    public final azj<JSONObject, JSONObject> mo12879a() {
        return this.f13980a;
    }

    /* renamed from: b */
    public final azj<JSONObject, JSONObject> mo12880b() {
        return this.f13981b;
    }
}
