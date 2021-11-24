package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.ai */
public final class C4625ai {

    /* renamed from: a */
    private final String f16680a;

    /* renamed from: b */
    private final String f16681b = null;

    /* renamed from: c */
    private boolean f16682c;

    /* renamed from: d */
    private String f16683d;

    /* renamed from: e */
    private final /* synthetic */ C4620ad f16684e;

    public C4625ai(C4620ad adVar, String str, String str2) {
        this.f16684e = adVar;
        C3266s.m14915a(str);
        this.f16680a = str;
    }

    /* renamed from: a */
    public final String mo15287a() {
        if (!this.f16682c) {
            this.f16682c = true;
            this.f16683d = this.f16684e.m22931y().getString(this.f16680a, null);
        }
        return this.f16683d;
    }

    /* renamed from: a */
    public final void mo15288a(String str) {
        if (!C4736ek.m23540c(str, this.f16683d)) {
            Editor edit = this.f16684e.m22931y().edit();
            edit.putString(this.f16680a, str);
            edit.apply();
            this.f16683d = str;
        }
    }
}
