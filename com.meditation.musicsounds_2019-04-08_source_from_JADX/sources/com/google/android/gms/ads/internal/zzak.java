package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.p009v4.p019g.C0510m;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.ank;
import com.google.android.gms.internal.ads.ann;
import com.google.android.gms.internal.ads.anr;
import com.google.android.gms.internal.ads.aok;
import com.google.android.gms.internal.ads.aty;
import com.google.android.gms.internal.ads.aub;
import com.google.android.gms.internal.ads.auf;
import com.google.android.gms.internal.ads.aui;
import com.google.android.gms.internal.ads.aul;
import com.google.android.gms.internal.ads.auo;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzpl;

@C3464ci
public final class zzak extends anr {

    /* renamed from: a */
    private ank f10156a;

    /* renamed from: b */
    private aty f10157b;

    /* renamed from: c */
    private auo f10158c;

    /* renamed from: d */
    private aub f10159d;

    /* renamed from: e */
    private C0510m<String, auf> f10160e = new C0510m<>();

    /* renamed from: f */
    private C0510m<String, aui> f10161f = new C0510m<>();

    /* renamed from: g */
    private aul f10162g;

    /* renamed from: h */
    private zzjn f10163h;

    /* renamed from: i */
    private PublisherAdViewOptions f10164i;

    /* renamed from: j */
    private zzpl f10165j;

    /* renamed from: k */
    private aok f10166k;

    /* renamed from: l */
    private final Context f10167l;

    /* renamed from: m */
    private final bas f10168m;

    /* renamed from: n */
    private final String f10169n;

    /* renamed from: o */
    private final zzang f10170o;

    /* renamed from: p */
    private final zzw f10171p;

    public zzak(Context context, String str, bas bas, zzang zzang, zzw zzw) {
        this.f10167l = context;
        this.f10169n = str;
        this.f10168m = bas;
        this.f10170o = zzang;
        this.f10171p = zzw;
    }

    public final void zza(PublisherAdViewOptions publisherAdViewOptions) {
        this.f10164i = publisherAdViewOptions;
    }

    public final void zza(aty aty) {
        this.f10157b = aty;
    }

    public final void zza(aub aub) {
        this.f10159d = aub;
    }

    public final void zza(aul aul, zzjn zzjn) {
        this.f10162g = aul;
        this.f10163h = zzjn;
    }

    public final void zza(auo auo) {
        this.f10158c = auo;
    }

    public final void zza(zzpl zzpl) {
        this.f10165j = zzpl;
    }

    public final void zza(String str, aui aui, auf auf) {
        if (!TextUtils.isEmpty(str)) {
            this.f10161f.put(str, aui);
            this.f10160e.put(str, auf);
            return;
        }
        throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }

    public final void zzb(ank ank) {
        this.f10156a = ank;
    }

    public final void zzb(aok aok) {
        this.f10166k = aok;
    }

    public final ann zzdh() {
        zzah zzah = new zzah(this.f10167l, this.f10169n, this.f10168m, this.f10170o, this.f10156a, this.f10157b, this.f10158c, this.f10159d, this.f10161f, this.f10160e, this.f10165j, this.f10166k, this.f10171p, this.f10162g, this.f10163h, this.f10164i);
        return zzah;
    }
}
