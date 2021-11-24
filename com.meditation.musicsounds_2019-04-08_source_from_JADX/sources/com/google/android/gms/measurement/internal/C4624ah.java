package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.ah */
public final class C4624ah {

    /* renamed from: a */
    private final String f16675a;

    /* renamed from: b */
    private final String f16676b;

    /* renamed from: c */
    private final String f16677c;

    /* renamed from: d */
    private final long f16678d;

    /* renamed from: e */
    private final /* synthetic */ C4620ad f16679e;

    private C4624ah(C4620ad adVar, String str, long j) {
        this.f16679e = adVar;
        C3266s.m14915a(str);
        C3266s.m14923b(j > 0);
        this.f16675a = String.valueOf(str).concat(":start");
        this.f16676b = String.valueOf(str).concat(":count");
        this.f16677c = String.valueOf(str).concat(":value");
        this.f16678d = j;
    }

    /* renamed from: b */
    private final void m22955b() {
        this.f16679e.mo15239d();
        long a = this.f16679e.mo15248m().mo11326a();
        Editor edit = this.f16679e.m22931y().edit();
        edit.remove(this.f16676b);
        edit.remove(this.f16677c);
        edit.putLong(this.f16675a, a);
        edit.apply();
    }

    /* renamed from: c */
    private final long m22956c() {
        return this.f16679e.m22931y().getLong(this.f16675a, 0);
    }

    /* renamed from: a */
    public final Pair<String, Long> mo15285a() {
        long j;
        this.f16679e.mo15239d();
        this.f16679e.mo15239d();
        long c = m22956c();
        if (c == 0) {
            m22955b();
            j = 0;
        } else {
            j = Math.abs(c - this.f16679e.mo15248m().mo11326a());
        }
        if (j < this.f16678d) {
            return null;
        }
        if (j > (this.f16678d << 1)) {
            m22955b();
            return null;
        }
        String string = this.f16679e.m22931y().getString(this.f16677c, null);
        long j2 = this.f16679e.m22931y().getLong(this.f16676b, 0);
        m22955b();
        return (string == null || j2 <= 0) ? C4620ad.f16645a : new Pair<>(string, Long.valueOf(j2));
    }

    /* renamed from: a */
    public final void mo15286a(String str, long j) {
        this.f16679e.mo15239d();
        if (m22956c() == 0) {
            m22955b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f16679e.m22931y().getLong(this.f16676b, 0);
        if (j2 <= 0) {
            Editor edit = this.f16679e.m22931y().edit();
            edit.putString(this.f16677c, str);
            edit.putLong(this.f16676b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f16679e.mo15251p().mo15599h().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        Editor edit2 = this.f16679e.m22931y().edit();
        if (z) {
            edit2.putString(this.f16677c, str);
        }
        edit2.putLong(this.f16676b, j3);
        edit2.apply();
    }
}
