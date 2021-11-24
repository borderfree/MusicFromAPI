package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.j */
public final class C4487j extends C2950n<C4487j> {

    /* renamed from: a */
    public String f16341a;

    /* renamed from: b */
    public long f16342b;

    /* renamed from: c */
    public String f16343c;

    /* renamed from: d */
    public String f16344d;

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4487j jVar = (C4487j) nVar;
        if (!TextUtils.isEmpty(this.f16341a)) {
            jVar.f16341a = this.f16341a;
        }
        if (this.f16342b != 0) {
            jVar.f16342b = this.f16342b;
        }
        if (!TextUtils.isEmpty(this.f16343c)) {
            jVar.f16343c = this.f16343c;
        }
        if (!TextUtils.isEmpty(this.f16344d)) {
            jVar.f16344d = this.f16344d;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", this.f16341a);
        hashMap.put("timeInMillis", Long.valueOf(this.f16342b));
        hashMap.put("category", this.f16343c);
        hashMap.put("label", this.f16344d);
        return m13814a((Object) hashMap);
    }
}
