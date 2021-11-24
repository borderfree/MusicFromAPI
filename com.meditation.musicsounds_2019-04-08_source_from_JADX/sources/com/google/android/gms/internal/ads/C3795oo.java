package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.C3266s;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.oo */
public final class C3795oo {

    /* renamed from: a */
    private final Context f14560a;

    /* renamed from: b */
    private final C3804ox f14561b;

    /* renamed from: c */
    private final ViewGroup f14562c;

    /* renamed from: d */
    private C3790oj f14563d;

    private C3795oo(Context context, ViewGroup viewGroup, C3804ox oxVar, C3790oj ojVar) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f14560a = context;
        this.f14562c = viewGroup;
        this.f14561b = oxVar;
        this.f14563d = null;
    }

    public C3795oo(Context context, ViewGroup viewGroup, C3832py pyVar) {
        this(context, viewGroup, pyVar, null);
    }

    /* renamed from: a */
    public final C3790oj mo13383a() {
        C3266s.m14922b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f14563d;
    }

    /* renamed from: a */
    public final void mo13384a(int i, int i2, int i3, int i4) {
        C3266s.m14922b("The underlay may only be modified from the UI thread.");
        if (this.f14563d != null) {
            this.f14563d.mo13366a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo13385a(int i, int i2, int i3, int i4, int i5, boolean z, C3803ow owVar) {
        if (this.f14563d == null) {
            aqs.m16936a(this.f14561b.mo13416h().mo12315a(), this.f14561b.mo13410c(), "vpr2");
            C3790oj ojVar = new C3790oj(this.f14560a, this.f14561b, i5, z, this.f14561b.mo13416h().mo12315a(), owVar);
            this.f14563d = ojVar;
            this.f14562c.addView(this.f14563d, 0, new LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            this.f14563d.mo13366a(i, i2, i3, i4);
            this.f14561b.mo13408a(false);
        }
    }

    /* renamed from: b */
    public final void mo13386b() {
        C3266s.m14922b("onPause must be called from the UI thread.");
        if (this.f14563d != null) {
            this.f14563d.mo13371i();
        }
    }

    /* renamed from: c */
    public final void mo13387c() {
        C3266s.m14922b("onDestroy must be called from the UI thread.");
        if (this.f14563d != null) {
            this.f14563d.mo13376n();
            this.f14562c.removeView(this.f14563d);
            this.f14563d = null;
        }
    }
}
