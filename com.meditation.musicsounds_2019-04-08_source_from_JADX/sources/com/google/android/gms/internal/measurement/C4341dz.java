package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: com.google.android.gms.internal.measurement.dz */
final /* synthetic */ class C4341dz implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final C4340dy f16050a;

    C4341dz(C4340dy dyVar) {
        this.f16050a = dyVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f16050a.mo14293a(sharedPreferences, str);
    }
}
