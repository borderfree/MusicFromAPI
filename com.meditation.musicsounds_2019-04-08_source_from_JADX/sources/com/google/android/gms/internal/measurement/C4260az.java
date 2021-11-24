package com.google.android.gms.internal.measurement;

import android.os.Build.VERSION;

/* renamed from: com.google.android.gms.internal.measurement.az */
public final class C4260az {
    /* renamed from: a */
    public static int m21032a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException unused) {
            C4271bj.m21063a("Invalid version number", VERSION.SDK);
            return 0;
        }
    }
}
