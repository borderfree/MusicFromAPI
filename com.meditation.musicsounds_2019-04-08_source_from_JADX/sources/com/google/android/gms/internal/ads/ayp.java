package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;

final class ayp implements zzv<azg> {

    /* renamed from: a */
    private final /* synthetic */ afm f13344a;

    /* renamed from: b */
    private final /* synthetic */ axx f13345b;

    /* renamed from: c */
    private final /* synthetic */ C3709lj f13346c;

    /* renamed from: d */
    private final /* synthetic */ ayj f13347d;

    ayp(ayj ayj, afm afm, axx axx, C3709lj ljVar) {
        this.f13347d = ayj;
        this.f13344a = afm;
        this.f13345b = axx;
        this.f13346c = ljVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        synchronized (this.f13347d.f13323a) {
            C3643iy.m19176d("JS Engine is requesting an update");
            if (this.f13347d.f13330h == 0) {
                C3643iy.m19176d("Starting reload.");
                this.f13347d.f13330h = 2;
                this.f13347d.mo12628a(this.f13344a);
            }
            this.f13345b.mo12618b("/requestReload", (zzv) this.f13346c.mo13220a());
        }
    }
}
