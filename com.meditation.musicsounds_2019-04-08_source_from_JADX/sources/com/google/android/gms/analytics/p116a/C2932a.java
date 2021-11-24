package com.google.android.gms.analytics.p116a;

import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.a.a */
public class C2932a {

    /* renamed from: a */
    private Map<String, String> f10360a = new HashMap();

    /* renamed from: a */
    public final Map<String, String> mo10593a(String str) {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f10360a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return C2950n.m13816a((Map) this.f10360a);
    }
}
