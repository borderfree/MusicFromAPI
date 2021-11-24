package com.google.android.gms.internal.ads;

@C3464ci
final class zzadu extends Exception {
    private final int mErrorCode;

    public zzadu(String str, int i) {
        super(str);
        this.mErrorCode = i;
    }

    public final int getErrorCode() {
        return this.mErrorCode;
    }
}
