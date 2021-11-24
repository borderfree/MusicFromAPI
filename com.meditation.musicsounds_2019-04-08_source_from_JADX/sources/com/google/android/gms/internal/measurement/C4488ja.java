package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C2950n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.ja */
public final class C4488ja extends C2950n<C4488ja> {

    /* renamed from: a */
    private Map<Integer, String> f16345a = new HashMap(4);

    /* renamed from: a */
    public final Map<Integer, String> mo14789a() {
        return Collections.unmodifiableMap(this.f16345a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        ((C4488ja) nVar).f16345a.putAll(this.f16345a);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f16345a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("dimension");
            sb.append(valueOf);
            hashMap.put(sb.toString(), entry.getValue());
        }
        return m13814a((Object) hashMap);
    }
}
