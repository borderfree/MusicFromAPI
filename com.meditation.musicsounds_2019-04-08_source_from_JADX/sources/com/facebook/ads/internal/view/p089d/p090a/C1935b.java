package com.facebook.ads.internal.view.p089d.p090a;

import com.facebook.ads.internal.adapters.p059a.C1651h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.d.a.b */
public class C1935b {

    /* renamed from: a */
    private final int f6393a;

    /* renamed from: b */
    private final int f6394b;

    /* renamed from: c */
    private final C1651h f6395c;

    C1935b(int i, int i2, C1651h hVar) {
        this.f6393a = i;
        this.f6394b = i2;
        this.f6395c = hVar;
    }

    /* renamed from: a */
    public Map<String, String> mo7334a() {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6393a);
        sb.append("");
        hashMap.put("cardind", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6394b);
        sb2.append("");
        hashMap.put("cardcnt", sb2.toString());
        return hashMap;
    }

    /* renamed from: b */
    public int mo7335b() {
        return this.f6393a;
    }

    /* renamed from: c */
    public C1651h mo7336c() {
        return this.f6395c;
    }
}
