package com.google.android.gms.internal.ads;

import android.os.Bundle;

@C3464ci
public final class axd {

    /* renamed from: a */
    private static axd f13262a = new axd();

    /* renamed from: b */
    private int f13263b;

    /* renamed from: c */
    private int f13264c;

    /* renamed from: d */
    private int f13265d;

    /* renamed from: e */
    private int f13266e;

    /* renamed from: f */
    private int f13267f;

    /* renamed from: a */
    public static axd m17586a() {
        return f13262a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12577a(int i) {
        this.f13263b += i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo12578b() {
        this.f13264c++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo12579c() {
        this.f13265d++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo12580d() {
        this.f13266e++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo12581e() {
        this.f13267f++;
    }

    /* renamed from: f */
    public final int mo12582f() {
        return this.f13264c;
    }

    /* renamed from: g */
    public final int mo12583g() {
        return this.f13265d;
    }

    /* renamed from: h */
    public final int mo12584h() {
        return this.f13266e;
    }

    /* renamed from: i */
    public final int mo12585i() {
        return this.f13267f;
    }

    /* renamed from: j */
    public final Bundle mo12586j() {
        Bundle bundle = new Bundle();
        bundle.putInt("ipl", this.f13263b);
        bundle.putInt("ipds", this.f13264c);
        bundle.putInt("ipde", this.f13265d);
        bundle.putInt("iph", this.f13266e);
        bundle.putInt("ipm", this.f13267f);
        return bundle;
    }
}
