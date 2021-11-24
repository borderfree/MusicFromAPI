package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final /* synthetic */ class axw implements Runnable {

    /* renamed from: a */
    private final axv f13294a;

    /* renamed from: b */
    private final zzv f13295b;

    /* renamed from: c */
    private final Map f13296c;

    axw(axv axv, zzv zzv, Map map) {
        this.f13294a = axv;
        this.f13295b = zzv;
        this.f13296c = map;
    }

    public final void run() {
        axv axv = this.f13294a;
        this.f13295b.zza(axv.mo12602o(), this.f13296c);
    }
}
