package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3393e;

final class aca implements abj {

    /* renamed from: a */
    private final abl f11432a;

    /* renamed from: b */
    private final String f11433b;

    /* renamed from: c */
    private final acb f11434c;

    aca(abl abl, String str, Object[] objArr) {
        this.f11432a = abl;
        this.f11433b = str;
        this.f11434c = new acb(abl.getClass(), str, objArr);
    }

    /* renamed from: a */
    public final int mo11549a() {
        return (this.f11434c.f11444d & 1) == 1 ? C3393e.f11352h : C3393e.f11353i;
    }

    /* renamed from: b */
    public final boolean mo11550b() {
        return (this.f11434c.f11444d & 2) == 2;
    }

    /* renamed from: c */
    public final abl mo11551c() {
        return this.f11432a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final acb mo11571d() {
        return this.f11434c;
    }

    /* renamed from: e */
    public final int mo11572e() {
        return this.f11434c.f11448h;
    }

    /* renamed from: f */
    public final int mo11573f() {
        return this.f11434c.f11449i;
    }

    /* renamed from: g */
    public final int mo11574g() {
        return this.f11434c.f11445e;
    }

    /* renamed from: h */
    public final int mo11575h() {
        return this.f11434c.f11450j;
    }

    /* renamed from: i */
    public final int mo11576i() {
        return this.f11434c.f11453m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final int[] mo11577j() {
        return this.f11434c.f11454n;
    }

    /* renamed from: k */
    public final int mo11578k() {
        return this.f11434c.f11452l;
    }

    /* renamed from: l */
    public final int mo11579l() {
        return this.f11434c.f11451k;
    }
}
