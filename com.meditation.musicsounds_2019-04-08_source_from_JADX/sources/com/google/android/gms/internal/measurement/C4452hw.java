package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.hw */
public final class C4452hw extends C2950n<C4452hw> {

    /* renamed from: a */
    private String f16239a;

    /* renamed from: b */
    private String f16240b;

    /* renamed from: c */
    private String f16241c;

    /* renamed from: d */
    private String f16242d;

    /* renamed from: a */
    public final String mo14630a() {
        return this.f16239a;
    }

    /* renamed from: a */
    public final void mo10641a(C4452hw hwVar) {
        if (!TextUtils.isEmpty(this.f16239a)) {
            hwVar.f16239a = this.f16239a;
        }
        if (!TextUtils.isEmpty(this.f16240b)) {
            hwVar.f16240b = this.f16240b;
        }
        if (!TextUtils.isEmpty(this.f16241c)) {
            hwVar.f16241c = this.f16241c;
        }
        if (!TextUtils.isEmpty(this.f16242d)) {
            hwVar.f16242d = this.f16242d;
        }
    }

    /* renamed from: a */
    public final void mo14632a(String str) {
        this.f16239a = str;
    }

    /* renamed from: b */
    public final String mo14633b() {
        return this.f16240b;
    }

    /* renamed from: b */
    public final void mo14634b(String str) {
        this.f16240b = str;
    }

    /* renamed from: c */
    public final String mo14635c() {
        return this.f16241c;
    }

    /* renamed from: c */
    public final void mo14636c(String str) {
        this.f16241c = str;
    }

    /* renamed from: d */
    public final String mo14637d() {
        return this.f16242d;
    }

    /* renamed from: d */
    public final void mo14638d(String str) {
        this.f16242d = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f16239a);
        hashMap.put("appVersion", this.f16240b);
        hashMap.put("appId", this.f16241c);
        hashMap.put("appInstallerId", this.f16242d);
        return m13814a((Object) hashMap);
    }
}
