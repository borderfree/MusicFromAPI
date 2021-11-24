package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.ads.internal.z */
final class C2925z implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ WeakReference f10114a;

    /* renamed from: b */
    private final /* synthetic */ zzbl f10115b;

    C2925z(zzbl zzbl, WeakReference weakReference) {
        this.f10115b = zzbl;
        this.f10114a = weakReference;
    }

    public final void run() {
        this.f10115b.f10200d = false;
        zza zza = (zza) this.f10114a.get();
        if (zza != null) {
            zzjj a = this.f10115b.f10199c;
            if (zza.mo10115b(a)) {
                zza.zzb(a);
            } else {
                C3643iy.m19176d("Ad is not visible. Not refreshing ad.");
                zza.f10119d.zzg(a);
            }
        }
    }
}
