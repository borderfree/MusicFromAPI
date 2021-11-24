package com.android.vending.billing.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.vending.billing.util.d */
public class C1162d {

    /* renamed from: a */
    Map<String, C1165g> f4182a = new HashMap();

    /* renamed from: b */
    Map<String, C1163e> f4183b = new HashMap();

    C1162d() {
    }

    /* renamed from: a */
    public C1165g mo5636a(String str) {
        return (C1165g) this.f4182a.get(str);
    }

    /* renamed from: a */
    public List<String> mo5637a() {
        return new ArrayList(this.f4183b.keySet());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5638a(C1163e eVar) {
        this.f4183b.put(eVar.mo5644b(), eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5639a(C1165g gVar) {
        this.f4182a.put(gVar.mo5647a(), gVar);
    }

    /* renamed from: b */
    public C1163e mo5640b(String str) {
        return (C1163e) this.f4183b.get(str);
    }

    /* renamed from: c */
    public boolean mo5641c(String str) {
        return this.f4182a.containsKey(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public List<String> mo5642d(String str) {
        ArrayList arrayList = new ArrayList();
        for (C1163e eVar : this.f4183b.values()) {
            if (eVar.mo5643a().equals(str)) {
                arrayList.add(eVar.mo5644b());
            }
        }
        return arrayList;
    }
}
