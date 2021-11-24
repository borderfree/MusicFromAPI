package com.google.android.gms.internal.ads;

public enum zzawy implements aal {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: c */
    private static final aam<zzawy> f15375c = null;
    private final int value;

    static {
        f15375c = new C4014wa();
    }

    private zzawy(int i) {
        this.value = i;
    }

    public static zzawy zzat(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CURVE;
            case 1:
                return NIST_P224;
            case 2:
                return NIST_P256;
            case 3:
                return NIST_P384;
            case 4:
                return NIST_P521;
            default:
                return null;
        }
    }

    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
