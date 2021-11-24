package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.c */
public final class C4288c extends C2950n<C4288c> {

    /* renamed from: a */
    public int f15851a;

    /* renamed from: b */
    public int f15852b;

    /* renamed from: c */
    public int f15853c;

    /* renamed from: d */
    public int f15854d;

    /* renamed from: e */
    public int f15855e;

    /* renamed from: f */
    private String f15856f;

    /* renamed from: a */
    public final String mo14217a() {
        return this.f15856f;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4288c cVar = (C4288c) nVar;
        if (this.f15851a != 0) {
            cVar.f15851a = this.f15851a;
        }
        if (this.f15852b != 0) {
            cVar.f15852b = this.f15852b;
        }
        if (this.f15853c != 0) {
            cVar.f15853c = this.f15853c;
        }
        if (this.f15854d != 0) {
            cVar.f15854d = this.f15854d;
        }
        if (this.f15855e != 0) {
            cVar.f15855e = this.f15855e;
        }
        if (!TextUtils.isEmpty(this.f15856f)) {
            cVar.f15856f = this.f15856f;
        }
    }

    /* renamed from: a */
    public final void mo14218a(String str) {
        this.f15856f = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.f15856f);
        hashMap.put("screenColors", Integer.valueOf(this.f15851a));
        hashMap.put("screenWidth", Integer.valueOf(this.f15852b));
        hashMap.put("screenHeight", Integer.valueOf(this.f15853c));
        hashMap.put("viewportWidth", Integer.valueOf(this.f15854d));
        hashMap.put("viewportHeight", Integer.valueOf(this.f15855e));
        return m13814a((Object) hashMap);
    }
}
