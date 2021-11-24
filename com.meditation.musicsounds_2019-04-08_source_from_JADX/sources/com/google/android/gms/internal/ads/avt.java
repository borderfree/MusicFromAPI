package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3227d.C3229b;

final class avt implements C3229b {

    /* renamed from: a */
    private final /* synthetic */ C3763nj f13200a;

    /* renamed from: b */
    private final /* synthetic */ avo f13201b;

    avt(avo avo, C3763nj njVar) {
        this.f13201b = avo;
        this.f13200a = njVar;
    }

    /* renamed from: a */
    public final void mo11160a(ConnectionResult connectionResult) {
        synchronized (this.f13201b.f13189d) {
            this.f13200a.mo13295a(new RuntimeException("Connection failed."));
        }
    }
}
