package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kv */
final class C3694kv implements bbf {

    /* renamed from: a */
    private final /* synthetic */ String f14356a;

    /* renamed from: b */
    private final /* synthetic */ C3698kz f14357b;

    C3694kv(C3690kr krVar, String str, C3698kz kzVar) {
        this.f14356a = str;
        this.f14357b = kzVar;
    }

    /* renamed from: a */
    public final void mo12734a(zzae zzae) {
        String str = this.f14356a;
        String zzae2 = zzae.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzae2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzae2);
        C3643iy.m19178e(sb.toString());
        this.f14357b.mo12789a(null);
    }
}
