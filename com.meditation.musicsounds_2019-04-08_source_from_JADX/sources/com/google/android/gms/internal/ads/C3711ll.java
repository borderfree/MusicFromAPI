package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.ll */
public final class C3711ll {
    /* renamed from: a */
    public static boolean m19090a(zzjj zzjj) {
        Bundle bundle = zzjj.f15493m != null ? zzjj.f15493m : new Bundle();
        return (bundle.getBundle(AdMobAdapter.class.getName()) != null ? bundle.getBundle(AdMobAdapter.class.getName()) : new Bundle()).getBoolean("render_test_label", false);
    }
}
