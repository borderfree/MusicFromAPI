package com.google.android.gms.internal.ads;

final class apl extends ano {

    /* renamed from: a */
    final /* synthetic */ apj f12580a;

    private apl(apj apj) {
        this.f12580a = apj;
    }

    public final String getMediationAdapterClassName() {
        return null;
    }

    public final boolean isLoading() {
        return false;
    }

    public final void zza(zzjj zzjj, int i) {
        C3731me.m19174c("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        C3719lt.f14416a.post(new apm(this));
    }

    public final String zzck() {
        return null;
    }

    public final void zzd(zzjj zzjj) {
        zza(zzjj, 1);
    }
}
