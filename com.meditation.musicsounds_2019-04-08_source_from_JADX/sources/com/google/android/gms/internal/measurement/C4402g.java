package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import com.google.android.gms.common.internal.C3266s;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.g */
public final class C4402g extends C2950n<C4402g> {

    /* renamed from: a */
    private String f16150a;

    /* renamed from: b */
    private String f16151b;

    /* renamed from: c */
    private String f16152c;

    /* renamed from: d */
    private String f16153d;

    /* renamed from: e */
    private boolean f16154e;

    /* renamed from: f */
    private String f16155f;

    /* renamed from: g */
    private boolean f16156g;

    /* renamed from: h */
    private double f16157h;

    /* renamed from: a */
    public final String mo14535a() {
        return this.f16150a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4402g gVar = (C4402g) nVar;
        if (!TextUtils.isEmpty(this.f16150a)) {
            gVar.f16150a = this.f16150a;
        }
        if (!TextUtils.isEmpty(this.f16151b)) {
            gVar.f16151b = this.f16151b;
        }
        if (!TextUtils.isEmpty(this.f16152c)) {
            gVar.f16152c = this.f16152c;
        }
        if (!TextUtils.isEmpty(this.f16153d)) {
            gVar.f16153d = this.f16153d;
        }
        boolean z = true;
        if (this.f16154e) {
            gVar.f16154e = true;
        }
        if (!TextUtils.isEmpty(this.f16155f)) {
            gVar.f16155f = this.f16155f;
        }
        if (this.f16156g) {
            gVar.f16156g = this.f16156g;
        }
        if (this.f16157h != 0.0d) {
            double d = this.f16157h;
            if (d < 0.0d || d > 100.0d) {
                z = false;
            }
            C3266s.m14924b(z, "Sample rate must be between 0% and 100%");
            gVar.f16157h = d;
        }
    }

    /* renamed from: a */
    public final void mo14536a(String str) {
        this.f16150a = str;
    }

    /* renamed from: a */
    public final void mo14537a(boolean z) {
        this.f16154e = z;
    }

    /* renamed from: b */
    public final String mo14538b() {
        return this.f16151b;
    }

    /* renamed from: b */
    public final void mo14539b(String str) {
        this.f16151b = str;
    }

    /* renamed from: b */
    public final void mo14540b(boolean z) {
        this.f16156g = true;
    }

    /* renamed from: c */
    public final String mo14541c() {
        return this.f16152c;
    }

    /* renamed from: c */
    public final void mo14542c(String str) {
        this.f16152c = str;
    }

    /* renamed from: d */
    public final String mo14543d() {
        return this.f16153d;
    }

    /* renamed from: d */
    public final void mo14544d(String str) {
        this.f16153d = str;
    }

    /* renamed from: e */
    public final boolean mo14545e() {
        return this.f16154e;
    }

    /* renamed from: f */
    public final String mo14546f() {
        return this.f16155f;
    }

    /* renamed from: g */
    public final boolean mo14547g() {
        return this.f16156g;
    }

    /* renamed from: h */
    public final double mo14548h() {
        return this.f16157h;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.f16150a);
        hashMap.put("clientId", this.f16151b);
        hashMap.put("userId", this.f16152c);
        hashMap.put("androidAdId", this.f16153d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f16154e));
        hashMap.put("sessionControl", this.f16155f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f16156g));
        hashMap.put("sampleRate", Double.valueOf(this.f16157h));
        return m13814a((Object) hashMap);
    }
}
