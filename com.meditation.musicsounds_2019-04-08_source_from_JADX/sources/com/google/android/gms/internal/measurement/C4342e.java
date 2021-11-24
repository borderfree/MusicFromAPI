package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.e */
public final class C4342e extends C2950n<C4342e> {

    /* renamed from: a */
    private String f16051a;

    /* renamed from: b */
    private String f16052b;

    /* renamed from: c */
    private String f16053c;

    /* renamed from: d */
    private long f16054d;

    /* renamed from: a */
    public final String mo14295a() {
        return this.f16051a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4342e eVar = (C4342e) nVar;
        if (!TextUtils.isEmpty(this.f16051a)) {
            eVar.f16051a = this.f16051a;
        }
        if (!TextUtils.isEmpty(this.f16052b)) {
            eVar.f16052b = this.f16052b;
        }
        if (!TextUtils.isEmpty(this.f16053c)) {
            eVar.f16053c = this.f16053c;
        }
        if (this.f16054d != 0) {
            eVar.f16054d = this.f16054d;
        }
    }

    /* renamed from: b */
    public final String mo14296b() {
        return this.f16052b;
    }

    /* renamed from: c */
    public final String mo14297c() {
        return this.f16053c;
    }

    /* renamed from: d */
    public final long mo14298d() {
        return this.f16054d;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("category", this.f16051a);
        hashMap.put("action", this.f16052b);
        hashMap.put("label", this.f16053c);
        hashMap.put("value", Long.valueOf(this.f16054d));
        return m13814a((Object) hashMap);
    }
}
