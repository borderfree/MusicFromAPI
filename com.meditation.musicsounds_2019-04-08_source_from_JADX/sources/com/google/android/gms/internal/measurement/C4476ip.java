package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C2950n;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.ip */
public final class C4476ip extends C2950n<C4476ip> {

    /* renamed from: a */
    private String f16297a;

    /* renamed from: b */
    private String f16298b;

    /* renamed from: c */
    private String f16299c;

    /* renamed from: d */
    private String f16300d;

    /* renamed from: e */
    private String f16301e;

    /* renamed from: f */
    private String f16302f;

    /* renamed from: g */
    private String f16303g;

    /* renamed from: h */
    private String f16304h;

    /* renamed from: i */
    private String f16305i;

    /* renamed from: j */
    private String f16306j;

    /* renamed from: a */
    public final String mo14726a() {
        return this.f16297a;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10641a(C2950n nVar) {
        C4476ip ipVar = (C4476ip) nVar;
        if (!TextUtils.isEmpty(this.f16297a)) {
            ipVar.f16297a = this.f16297a;
        }
        if (!TextUtils.isEmpty(this.f16298b)) {
            ipVar.f16298b = this.f16298b;
        }
        if (!TextUtils.isEmpty(this.f16299c)) {
            ipVar.f16299c = this.f16299c;
        }
        if (!TextUtils.isEmpty(this.f16300d)) {
            ipVar.f16300d = this.f16300d;
        }
        if (!TextUtils.isEmpty(this.f16301e)) {
            ipVar.f16301e = this.f16301e;
        }
        if (!TextUtils.isEmpty(this.f16302f)) {
            ipVar.f16302f = this.f16302f;
        }
        if (!TextUtils.isEmpty(this.f16303g)) {
            ipVar.f16303g = this.f16303g;
        }
        if (!TextUtils.isEmpty(this.f16304h)) {
            ipVar.f16304h = this.f16304h;
        }
        if (!TextUtils.isEmpty(this.f16305i)) {
            ipVar.f16305i = this.f16305i;
        }
        if (!TextUtils.isEmpty(this.f16306j)) {
            ipVar.f16306j = this.f16306j;
        }
    }

    /* renamed from: a */
    public final void mo14727a(String str) {
        this.f16297a = str;
    }

    /* renamed from: b */
    public final String mo14728b() {
        return this.f16298b;
    }

    /* renamed from: b */
    public final void mo14729b(String str) {
        this.f16298b = str;
    }

    /* renamed from: c */
    public final String mo14730c() {
        return this.f16299c;
    }

    /* renamed from: c */
    public final void mo14731c(String str) {
        this.f16299c = str;
    }

    /* renamed from: d */
    public final String mo14732d() {
        return this.f16300d;
    }

    /* renamed from: d */
    public final void mo14733d(String str) {
        this.f16300d = str;
    }

    /* renamed from: e */
    public final String mo14734e() {
        return this.f16301e;
    }

    /* renamed from: e */
    public final void mo14735e(String str) {
        this.f16301e = str;
    }

    /* renamed from: f */
    public final String mo14736f() {
        return this.f16302f;
    }

    /* renamed from: f */
    public final void mo14737f(String str) {
        this.f16302f = str;
    }

    /* renamed from: g */
    public final String mo14738g() {
        return this.f16303g;
    }

    /* renamed from: g */
    public final void mo14739g(String str) {
        this.f16303g = str;
    }

    /* renamed from: h */
    public final String mo14740h() {
        return this.f16304h;
    }

    /* renamed from: h */
    public final void mo14741h(String str) {
        this.f16304h = str;
    }

    /* renamed from: i */
    public final String mo14742i() {
        return this.f16305i;
    }

    /* renamed from: i */
    public final void mo14743i(String str) {
        this.f16305i = str;
    }

    /* renamed from: j */
    public final String mo14744j() {
        return this.f16306j;
    }

    /* renamed from: j */
    public final void mo14745j(String str) {
        this.f16306j = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("name", this.f16297a);
        hashMap.put("source", this.f16298b);
        hashMap.put("medium", this.f16299c);
        hashMap.put("keyword", this.f16300d);
        hashMap.put("content", this.f16301e);
        hashMap.put("id", this.f16302f);
        hashMap.put("adNetworkId", this.f16303g);
        hashMap.put("gclid", this.f16304h);
        hashMap.put("dclid", this.f16305i);
        hashMap.put("aclid", this.f16306j);
        return m13814a((Object) hashMap);
    }
}
