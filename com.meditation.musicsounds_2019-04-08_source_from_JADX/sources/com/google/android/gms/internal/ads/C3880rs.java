package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzw;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.rs */
final /* synthetic */ class C3880rs implements Callable {

    /* renamed from: a */
    private final Context f14852a;

    /* renamed from: b */
    private final C3873rl f14853b;

    /* renamed from: c */
    private final String f14854c;

    /* renamed from: d */
    private final boolean f14855d;

    /* renamed from: e */
    private final boolean f14856e;

    /* renamed from: f */
    private final afm f14857f;

    /* renamed from: g */
    private final zzang f14858g;

    /* renamed from: h */
    private final aqz f14859h;

    /* renamed from: i */
    private final zzbo f14860i;

    /* renamed from: j */
    private final zzw f14861j;

    /* renamed from: k */
    private final akv f14862k;

    C3880rs(Context context, C3873rl rlVar, String str, boolean z, boolean z2, afm afm, zzang zzang, aqz aqz, zzbo zzbo, zzw zzw, akv akv) {
        this.f14852a = context;
        this.f14853b = rlVar;
        this.f14854c = str;
        this.f14855d = z;
        this.f14856e = z2;
        this.f14857f = afm;
        this.f14858g = zzang;
        this.f14859h = aqz;
        this.f14860i = zzbo;
        this.f14861j = zzw;
        this.f14862k = akv;
    }

    public final Object call() {
        Context context = this.f14852a;
        C3873rl rlVar = this.f14853b;
        String str = this.f14854c;
        boolean z = this.f14855d;
        boolean z2 = this.f14856e;
        C3881rt a = C3881rt.m19747a(context, rlVar, str, z, z2, this.f14857f, this.f14858g, this.f14859h, this.f14860i, this.f14861j, this.f14862k);
        C3844qj qjVar = new C3844qj(a);
        C3874rm rmVar = new C3874rm(qjVar, z2);
        a.setWebChromeClient(new C3824pq(qjVar));
        a.mo13637a((C3889sa) rmVar);
        a.mo13640a((C3894sf) rmVar);
        a.mo13639a((C3893se) rmVar);
        a.mo13638a((C3891sc) rmVar);
        a.mo13626a(rmVar);
        return qjVar;
    }
}
