package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.ag */
public final class C4623ag {

    /* renamed from: a */
    private final String f16670a;

    /* renamed from: b */
    private final long f16671b;

    /* renamed from: c */
    private boolean f16672c;

    /* renamed from: d */
    private long f16673d;

    /* renamed from: e */
    private final /* synthetic */ C4620ad f16674e;

    public C4623ag(C4620ad adVar, String str, long j) {
        this.f16674e = adVar;
        C3266s.m14915a(str);
        this.f16670a = str;
        this.f16671b = j;
    }

    /* renamed from: a */
    public final long mo15283a() {
        if (!this.f16672c) {
            this.f16672c = true;
            this.f16673d = this.f16674e.m22931y().getLong(this.f16670a, this.f16671b);
        }
        return this.f16673d;
    }

    /* renamed from: a */
    public final void mo15284a(long j) {
        Editor edit = this.f16674e.m22931y().edit();
        edit.putLong(this.f16670a, j);
        edit.apply();
        this.f16673d = j;
    }
}
