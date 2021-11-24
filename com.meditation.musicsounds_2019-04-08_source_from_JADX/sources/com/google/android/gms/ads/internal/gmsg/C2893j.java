package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.C3643iy;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.gmsg.j */
final class C2893j implements zzv<Object> {
    C2893j() {
    }

    public final void zza(Object obj, Map<String, String> map) {
        String str = "Received log message: ";
        String valueOf = String.valueOf((String) map.get("string"));
        C3643iy.m19176d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
