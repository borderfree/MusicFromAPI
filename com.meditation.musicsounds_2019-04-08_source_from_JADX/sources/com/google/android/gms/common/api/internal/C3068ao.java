package com.google.android.gms.common.api.internal;

import com.google.android.gms.auth.api.signin.internal.C2981b;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.C3050i;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.ao */
final class C3068ao implements C3050i<Status> {

    /* renamed from: a */
    private final /* synthetic */ C3150m f10683a;

    /* renamed from: b */
    private final /* synthetic */ boolean f10684b;

    /* renamed from: c */
    private final /* synthetic */ C3040d f10685c;

    /* renamed from: d */
    private final /* synthetic */ C3063aj f10686d;

    C3068ao(C3063aj ajVar, C3150m mVar, boolean z, C3040d dVar) {
        this.f10686d = ajVar;
        this.f10683a = mVar;
        this.f10684b = z;
        this.f10685c = dVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo10874a(C3049h hVar) {
        Status status = (Status) hVar;
        C2981b.m13903a(this.f10686d.f10662k).mo10724d();
        if (status.mo10795d() && this.f10686d.mo10855j()) {
            this.f10686d.mo10853h();
        }
        this.f10683a.mo10876b(status);
        if (this.f10684b) {
            this.f10685c.mo10852g();
        }
    }
}
