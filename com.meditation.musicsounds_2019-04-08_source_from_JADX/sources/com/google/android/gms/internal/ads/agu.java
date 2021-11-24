package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;

public final class agu extends ahl {
    public agu(aga aga, String str, String str2, C4110yz yzVar, int i, int i2) {
        super(aga, str, str2, yzVar, i, 24);
    }

    /* renamed from: c */
    private final void m16207c() {
        AdvertisingIdClient m = this.f12041a.mo11882m();
        if (m != null) {
            try {
                Info info = m.getInfo();
                String a = agi.m16184a(info.getId());
                if (a != null) {
                    synchronized (this.f12042b) {
                        this.f12042b.f15111T = a;
                        this.f12042b.f15113V = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                        this.f12042b.f15112U = Integer.valueOf(5);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11906a() {
        if (this.f12041a.mo11876g()) {
            m16207c();
            return;
        }
        synchronized (this.f12042b) {
            this.f12042b.f15111T = (String) this.f12043c.invoke(null, new Object[]{this.f12041a.mo11866a()});
        }
    }

    /* renamed from: b */
    public final Void mo11907b() {
        if (this.f12041a.mo11871b()) {
            return super.call();
        }
        if (this.f12041a.mo11876g()) {
            m16207c();
        }
        return null;
    }

    public final /* synthetic */ Object call() {
        return call();
    }
}
