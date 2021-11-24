package com.google.android.gms.internal.ads;

public enum zzaxl implements aal {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: c */
    private static final aam<zzaxl> f15385c = null;
    private final int value;

    static {
        f15385c = new C4028wl();
    }

    private zzaxl(int i) {
        this.value = i;
    }

    public static zzaxl zzax(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATUS;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return DESTROYED;
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
