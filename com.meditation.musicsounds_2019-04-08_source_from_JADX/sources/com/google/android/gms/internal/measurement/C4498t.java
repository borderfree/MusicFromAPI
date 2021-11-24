package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.C3182e;

/* renamed from: com.google.android.gms.internal.measurement.t */
public final class C4498t {

    /* renamed from: a */
    public static final String f16366a = String.valueOf(C3182e.f10966b / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");

    /* renamed from: b */
    public static final String f16367b;

    static {
        String str = "ma";
        String valueOf = String.valueOf(f16366a);
        f16367b = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
