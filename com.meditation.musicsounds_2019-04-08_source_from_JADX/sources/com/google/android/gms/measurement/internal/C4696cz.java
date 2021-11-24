package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.cz */
final class C4696cz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ boolean f16922a;

    /* renamed from: b */
    private final /* synthetic */ boolean f16923b;

    /* renamed from: c */
    private final /* synthetic */ zzag f16924c;

    /* renamed from: d */
    private final /* synthetic */ zzk f16925d;

    /* renamed from: e */
    private final /* synthetic */ String f16926e;

    /* renamed from: f */
    private final /* synthetic */ C4689cs f16927f;

    C4696cz(C4689cs csVar, boolean z, boolean z2, zzag zzag, zzk zzk, String str) {
        this.f16927f = csVar;
        this.f16922a = z;
        this.f16923b = z2;
        this.f16924c = zzag;
        this.f16925d = zzk;
        this.f16926e = str;
    }

    public final void run() {
        C4758i d = this.f16927f.f16905b;
        if (d == null) {
            this.f16927f.mo15253r().mo15852u_().mo15858a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f16922a) {
            this.f16927f.mo15459a(d, this.f16923b ? null : this.f16924c, this.f16925d);
        } else {
            try {
                if (TextUtils.isEmpty(this.f16926e)) {
                    d.mo15362a(this.f16924c, this.f16925d);
                } else {
                    d.mo15363a(this.f16924c, this.f16926e, this.f16927f.mo15253r().mo15856y());
                }
            } catch (RemoteException e) {
                this.f16927f.mo15253r().mo15852u_().mo15859a("Failed to send event to the service", e);
            }
        }
        this.f16927f.m23260I();
    }
}
