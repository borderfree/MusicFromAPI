package com.google.android.gms.internal.ads;

public enum zzawk implements aal {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    private static final aam<zzawk> f15371a = null;
    private final int value;

    static {
        f15371a = new C3994vn();
    }

    private zzawk(int i) {
        this.value = i;
    }

    public static zzawk zzaq(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_FORMAT;
            case 1:
                return UNCOMPRESSED;
            case 2:
                return COMPRESSED;
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
