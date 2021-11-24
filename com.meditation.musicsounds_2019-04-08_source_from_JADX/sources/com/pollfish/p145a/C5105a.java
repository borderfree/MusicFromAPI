package com.pollfish.p145a;

import com.pollfish.p150f.C5162b;

/* renamed from: com.pollfish.a.a */
public class C5105a {

    /* renamed from: a */
    private String f18183a;

    /* renamed from: b */
    private Boolean f18184b;

    public C5105a(String str, Boolean bool) {
        this.f18183a = str;
        this.f18184b = bool;
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleAdId advertisingIdentifier: ");
        sb.append(str);
        sb.append("optOutFromAdsEnabled: ");
        sb.append(bool);
        C5162b.m25518a("GoogleAdId", sb.toString());
    }

    /* renamed from: a */
    public String mo16589a() {
        return this.f18183a;
    }

    /* renamed from: b */
    public Boolean mo16590b() {
        return this.f18184b;
    }
}
