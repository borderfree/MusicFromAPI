package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.i */
public final class C4456i extends C2950n<C4456i> {

    /* renamed from: a */
    public String f16244a;

    /* renamed from: b */
    public String f16245b;

    /* renamed from: c */
    public String f16246c;

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4456i iVar = (C4456i) nVar;
        if (!TextUtils.isEmpty(this.f16244a)) {
            iVar.f16244a = this.f16244a;
        }
        if (!TextUtils.isEmpty(this.f16245b)) {
            iVar.f16245b = this.f16245b;
        }
        if (!TextUtils.isEmpty(this.f16246c)) {
            iVar.f16246c = this.f16246c;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("network", this.f16244a);
        hashMap.put("action", this.f16245b);
        hashMap.put("target", this.f16246c);
        return m13814a((Object) hashMap);
    }
}
