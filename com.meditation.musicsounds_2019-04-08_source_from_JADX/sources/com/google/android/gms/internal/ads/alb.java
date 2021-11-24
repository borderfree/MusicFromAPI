package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class alb {

    /* renamed from: a */
    private final byte[] f12283a;

    /* renamed from: b */
    private int f12284b;

    /* renamed from: c */
    private int f12285c;

    /* renamed from: d */
    private final /* synthetic */ akz f12286d;

    private alb(akz akz, byte[] bArr) {
        this.f12286d = akz;
        this.f12283a = bArr;
    }

    /* renamed from: a */
    public final alb mo12085a(int i) {
        this.f12284b = i;
        return this;
    }

    /* renamed from: a */
    public final synchronized void mo12086a() {
        try {
            if (this.f12286d.f12280b) {
                this.f12286d.f12279a.mo11928a(this.f12283a);
                this.f12286d.f12279a.mo11925a(this.f12284b);
                this.f12286d.f12279a.mo11930b(this.f12285c);
                this.f12286d.f12279a.mo11929a((int[]) null);
                this.f12286d.f12279a.mo11924a();
            }
        } catch (RemoteException e) {
            C3731me.m19170a("Clearcut log failed", e);
        }
    }

    /* renamed from: b */
    public final alb mo12087b(int i) {
        this.f12285c = i;
        return this;
    }
}
