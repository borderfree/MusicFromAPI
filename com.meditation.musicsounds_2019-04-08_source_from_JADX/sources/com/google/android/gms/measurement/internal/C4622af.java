package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.af */
public final class C4622af {

    /* renamed from: a */
    private final String f16665a;

    /* renamed from: b */
    private final boolean f16666b = true;

    /* renamed from: c */
    private boolean f16667c;

    /* renamed from: d */
    private boolean f16668d;

    /* renamed from: e */
    private final /* synthetic */ C4620ad f16669e;

    public C4622af(C4620ad adVar, String str, boolean z) {
        this.f16669e = adVar;
        C3266s.m14915a(str);
        this.f16665a = str;
    }

    /* renamed from: a */
    public final void mo15281a(boolean z) {
        Editor edit = this.f16669e.m22931y().edit();
        edit.putBoolean(this.f16665a, z);
        edit.apply();
        this.f16668d = z;
    }

    /* renamed from: a */
    public final boolean mo15282a() {
        if (!this.f16667c) {
            this.f16667c = true;
            this.f16668d = this.f16669e.m22931y().getBoolean(this.f16665a, this.f16666b);
        }
        return this.f16668d;
    }
}
