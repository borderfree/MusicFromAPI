package com.google.android.gms.internal.measurement;

import com.google.android.gms.analytics.C2950n;
import com.google.android.gms.analytics.p116a.C2932a;
import com.google.android.gms.analytics.p116a.C2933b;
import com.google.android.gms.analytics.p116a.C2934c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.d */
public final class C4315d extends C2950n<C4315d> {

    /* renamed from: a */
    private final List<C2932a> f15992a = new ArrayList();

    /* renamed from: b */
    private final List<C2934c> f15993b = new ArrayList();

    /* renamed from: c */
    private final Map<String, List<C2932a>> f15994c = new HashMap();

    /* renamed from: d */
    private C2933b f15995d;

    /* renamed from: a */
    public final C2933b mo14262a() {
        return this.f15995d;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4315d dVar = (C4315d) nVar;
        dVar.f15992a.addAll(this.f15992a);
        dVar.f15993b.addAll(this.f15993b);
        for (Entry entry : this.f15994c.entrySet()) {
            String str = (String) entry.getKey();
            for (C2932a aVar : (List) entry.getValue()) {
                if (aVar != null) {
                    String str2 = str == null ? "" : str;
                    if (!dVar.f15994c.containsKey(str2)) {
                        dVar.f15994c.put(str2, new ArrayList());
                    }
                    ((List) dVar.f15994c.get(str2)).add(aVar);
                }
            }
        }
        if (this.f15995d != null) {
            dVar.f15995d = this.f15995d;
        }
    }

    /* renamed from: b */
    public final List<C2932a> mo14263b() {
        return Collections.unmodifiableList(this.f15992a);
    }

    /* renamed from: c */
    public final Map<String, List<C2932a>> mo14264c() {
        return this.f15994c;
    }

    /* renamed from: d */
    public final List<C2934c> mo14265d() {
        return Collections.unmodifiableList(this.f15993b);
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.f15992a.isEmpty()) {
            hashMap.put("products", this.f15992a);
        }
        if (!this.f15993b.isEmpty()) {
            hashMap.put("promotions", this.f15993b);
        }
        if (!this.f15994c.isEmpty()) {
            hashMap.put("impressions", this.f15994c);
        }
        hashMap.put("productAction", this.f15995d);
        return m13814a((Object) hashMap);
    }
}
