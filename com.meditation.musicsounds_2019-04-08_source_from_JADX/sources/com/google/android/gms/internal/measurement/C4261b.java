package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C2950n;
import com.google.android.gms.common.internal.C3266s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b */
public final class C4261b extends C2950n<C4261b> {

    /* renamed from: a */
    private final Map<String, Object> f15740a = new HashMap();

    /* renamed from: a */
    public final Map<String, Object> mo14163a() {
        return Collections.unmodifiableMap(this.f15740a);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4261b bVar = (C4261b) nVar;
        C3266s.m14913a(bVar);
        bVar.f15740a.putAll(this.f15740a);
    }

    /* renamed from: a */
    public final void mo14164a(String str, String str2) {
        C3266s.m14915a(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        C3266s.m14916a(str, (Object) "Name can not be empty or \"&\"");
        this.f15740a.put(str, str2);
    }

    public final String toString() {
        return m13814a((Object) this.f15740a);
    }
}
