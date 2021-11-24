package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.da */
final class C4698da implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f16938a;

    /* renamed from: b */
    private final /* synthetic */ boolean f16939b;

    /* renamed from: c */
    private final /* synthetic */ zzo f16940c;

    /* renamed from: d */
    private final /* synthetic */ zzk f16941d;

    /* renamed from: e */
    private final /* synthetic */ zzo f16942e;

    /* renamed from: f */
    private final /* synthetic */ C4689cs f16943f;

    C4698da(C4689cs csVar, boolean z, boolean z2, zzo zzo, zzk zzk, zzo zzo2) {
        this.f16943f = csVar;
        this.f16938a = z;
        this.f16939b = z2;
        this.f16940c = zzo;
        this.f16941d = zzk;
        this.f16942e = zzo2;
    }

    public final void run() {
        C4758i d = this.f16943f.f16905b;
        if (d == null) {
            this.f16943f.mo15253r().mo15852u_().mo15858a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f16938a) {
            this.f16943f.mo15459a(d, this.f16939b ? null : this.f16940c, this.f16941d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f16942e.f17282a)) {
                    d.mo15367a(this.f16940c, this.f16941d);
                } else {
                    d.mo15366a(this.f16940c);
                }
            } catch (RemoteException e) {
                this.f16943f.mo15253r().mo15852u_().mo15859a("Failed to send conditional user property to the service", e);
            }
        }
        this.f16943f.m23260I();
    }
}
