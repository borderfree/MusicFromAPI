package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.f */
public final class C4369f extends C2950n<C4369f> {

    /* renamed from: a */
    public String f16089a;

    /* renamed from: b */
    public boolean f16090b;

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4369f fVar = (C4369f) nVar;
        if (!TextUtils.isEmpty(this.f16089a)) {
            fVar.f16089a = this.f16089a;
        }
        if (this.f16090b) {
            fVar.f16090b = this.f16090b;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", this.f16089a);
        hashMap.put("fatal", Boolean.valueOf(this.f16090b));
        return m13814a((Object) hashMap);
    }
}
