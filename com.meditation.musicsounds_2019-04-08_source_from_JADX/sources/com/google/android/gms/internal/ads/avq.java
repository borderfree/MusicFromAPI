package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C3227d.C3228a;

final class avq implements C3228a {

    /* renamed from: a */
    final /* synthetic */ avo f13191a;

    /* renamed from: b */
    private final /* synthetic */ C3763nj f13192b;

    /* renamed from: c */
    private final /* synthetic */ zzsg f13193c;

    avq(avo avo, C3763nj njVar, zzsg zzsg) {
        this.f13191a = avo;
        this.f13192b = njVar;
        this.f13193c = zzsg;
    }

    /* renamed from: a */
    public final void mo11230a(int i) {
    }

    /* renamed from: a */
    public final void mo11231a(Bundle bundle) {
        synchronized (this.f13191a.f13189d) {
            if (!this.f13191a.f13187b) {
                this.f13191a.f13187b = true;
                avj d = this.f13191a.f13186a;
                if (d != null) {
                    this.f13192b.mo13268a(new avs(this.f13192b, C3651jf.m18855a((Runnable) new avr(this, d, this.f13192b, this.f13193c))), C3758ne.f14482b);
                }
            }
        }
    }
}
