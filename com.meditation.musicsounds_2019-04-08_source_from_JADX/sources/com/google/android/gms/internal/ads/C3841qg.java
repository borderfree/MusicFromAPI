package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;

/* renamed from: com.google.android.gms.internal.ads.qg */
final /* synthetic */ class C3841qg implements C3735mi {

    /* renamed from: a */
    private final Context f14718a;

    /* renamed from: b */
    private final afm f14719b;

    /* renamed from: c */
    private final zzang f14720c;

    /* renamed from: d */
    private final zzw f14721d;

    /* renamed from: e */
    private final String f14722e;

    C3841qg(Context context, afm afm, zzang zzang, zzw zzw, String str) {
        this.f14718a = context;
        this.f14719b = afm;
        this.f14720c = zzang;
        this.f14721d = zzw;
        this.f14722e = str;
    }

    /* renamed from: a */
    public final C3751my mo10012a(Object obj) {
        Context context = this.f14718a;
        afm afm = this.f14719b;
        zzang zzang = this.f14720c;
        zzw zzw = this.f14721d;
        String str = this.f14722e;
        zzbv.zzel();
        C3832py a = C3840qf.m19490a(context, C3873rl.m19690a(), "", false, false, afm, zzang, null, null, zzw, akv.m16455a());
        C3762ni a2 = C3762ni.m19213a(a);
        a.mo13527t().mo13541a((C3868rg) new C3843qi(a2));
        a.loadUrl(str);
        return a2;
    }
}
