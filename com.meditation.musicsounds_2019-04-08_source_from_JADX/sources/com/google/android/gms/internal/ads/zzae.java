package com.google.android.gms.internal.ads;

public class zzae extends Exception {
    private long zzad;
    private final asc zzbj;

    public zzae() {
        this.zzbj = null;
    }

    public zzae(asc asc) {
        this.zzbj = asc;
    }

    public zzae(String str) {
        super(str);
        this.zzbj = null;
    }

    public zzae(Throwable th) {
        super(th);
        this.zzbj = null;
    }

    /* access modifiers changed from: 0000 */
    public final void zza(long j) {
        this.zzad = j;
    }
}
