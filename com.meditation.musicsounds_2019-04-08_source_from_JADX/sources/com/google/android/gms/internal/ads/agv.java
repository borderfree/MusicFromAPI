package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class agv implements Callable {

    /* renamed from: a */
    private final aga f12007a;

    /* renamed from: b */
    private final C4110yz f12008b;

    public agv(aga aga, C4110yz yzVar) {
        this.f12007a = aga;
        this.f12008b = yzVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.f12007a.mo11881l() != null) {
            this.f12007a.mo11881l().get();
        }
        C4110yz k = this.f12007a.mo11880k();
        if (k != null) {
            try {
                synchronized (this.f12008b) {
                    C3401ads.m16011a(this.f12008b, C3401ads.m16013a((C3401ads) k));
                }
            } catch (zzbfh unused) {
            }
        }
        return null;
    }
}
