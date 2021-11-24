package com.google.android.gms.analytics.p116a;

import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.analytics.a.b */
public class C2933b {

    /* renamed from: a */
    private Map<String, String> f10361a;

    /* renamed from: a */
    public final Map<String, String> mo10595a() {
        return new HashMap(this.f10361a);
    }

    public String toString() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f10361a.entrySet()) {
            hashMap.put(((String) entry.getKey()).startsWith("&") ? ((String) entry.getKey()).substring(1) : (String) entry.getKey(), (String) entry.getValue());
        }
        return C2950n.m13816a((Map) hashMap);
    }
}
