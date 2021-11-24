package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjj;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.ads.internal.ae */
final class C2856ae {

    /* renamed from: a */
    private final String f9937a;

    /* renamed from: b */
    private final Map<String, String> f9938b = new TreeMap();

    /* renamed from: c */
    private String f9939c;

    /* renamed from: d */
    private String f9940d;

    public C2856ae(String str) {
        this.f9937a = str;
    }

    /* renamed from: a */
    public final String mo9989a() {
        return this.f9940d;
    }

    /* renamed from: a */
    public final void mo9990a(zzjj zzjj, zzang zzang) {
        this.f9939c = zzjj.f15490j.f15510a;
        Bundle bundle = zzjj.f15493m != null ? zzjj.f15493m.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle != null) {
            String str = (String) ane.m16650f().mo12297a(aqm.f12791cy);
            for (String str2 : bundle.keySet()) {
                if (str.equals(str2)) {
                    this.f9940d = bundle.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    this.f9938b.put(str2.substring(4), bundle.getString(str2));
                }
            }
            this.f9938b.put("SDKVersion", zzang.f15360a);
        }
    }

    /* renamed from: b */
    public final String mo9991b() {
        return this.f9939c;
    }

    /* renamed from: c */
    public final String mo9992c() {
        return this.f9937a;
    }

    /* renamed from: d */
    public final Map<String, String> mo9993d() {
        return this.f9938b;
    }
}
