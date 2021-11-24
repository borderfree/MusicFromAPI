package com.google.android.gms.internal.measurement;

public enum zzbt {
    NONE,
    GZIP;

    public static zzbt zzaa(String str) {
        return "GZIP".equalsIgnoreCase(str) ? GZIP : NONE;
    }
}
