package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C2950n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.a */
public final class C4234a extends C2950n<C4234a> {

    /* renamed from: a */
    private Map<Integer, Double> f15691a = new HashMap(4);

    /* renamed from: a */
    public final Map<Integer, Double> mo14096a() {
        return Collections.unmodifiableMap(this.f15691a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        ((C4234a) nVar).f15691a.putAll(this.f15691a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f15691a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
            sb.append("metric");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return m13814a((Object) hashMap);
    }
}
