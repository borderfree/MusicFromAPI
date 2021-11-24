package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.qh */
final /* synthetic */ class C3842qh implements Callable {

    /* renamed from: a */
    private final Context f14723a;

    /* renamed from: b */
    private final C3873rl f14724b;

    /* renamed from: c */
    private final String f14725c;

    /* renamed from: d */
    private final boolean f14726d;

    /* renamed from: e */
    private final boolean f14727e;

    /* renamed from: f */
    private final afm f14728f;

    /* renamed from: g */
    private final zzang f14729g;

    /* renamed from: h */
    private final aqz f14730h;

    /* renamed from: i */
    private final zzbo f14731i;

    /* renamed from: j */
    private final zzw f14732j;

    /* renamed from: k */
    private final akv f14733k;

    C3842qh(Context context, C3873rl rlVar, String str, boolean z, boolean z2, afm afm, zzang zzang, aqz aqz, zzbo zzbo, zzw zzw, akv akv) {
        this.f14723a = context;
        this.f14724b = rlVar;
        this.f14725c = str;
        this.f14726d = z;
        this.f14727e = z2;
        this.f14728f = afm;
        this.f14729g = zzang;
        this.f14730h = aqz;
        this.f14731i = zzbo;
        this.f14732j = zzw;
        this.f14733k = akv;
    }

    public final Object call() {
        Context context = this.f14723a;
        C3873rl rlVar = this.f14724b;
        String str = this.f14725c;
        boolean z = this.f14726d;
        boolean z2 = this.f14727e;
        C3844qj qjVar = new C3844qj(C3845qk.m19565a(context, rlVar, str, z, z2, this.f14728f, this.f14729g, this.f14730h, this.f14731i, this.f14732j, this.f14733k));
        qjVar.setWebViewClient(zzbv.zzem().mo13146a((C3832py) qjVar, z2));
        qjVar.setWebChromeClient(new C3824pq(qjVar));
        return qjVar;
    }
}
