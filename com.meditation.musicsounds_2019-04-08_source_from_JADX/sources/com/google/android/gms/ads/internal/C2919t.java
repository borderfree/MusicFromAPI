package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.arq;
import com.google.android.gms.internal.ads.ars;
import com.google.android.gms.internal.ads.arx;
import com.google.android.gms.internal.ads.ase;
import java.util.List;

/* renamed from: com.google.android.gms.ads.internal.t */
final class C2919t implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ase f10099a;

    /* renamed from: b */
    private final /* synthetic */ int f10100b;

    /* renamed from: c */
    private final /* synthetic */ List f10101c;

    /* renamed from: d */
    private final /* synthetic */ zzbc f10102d;

    C2919t(zzbc zzbc, ase ase, int i, List list) {
        this.f10102d = zzbc;
        this.f10099a = ase;
        this.f10100b = i;
        this.f10101c = list;
    }

    public final void run() {
        try {
            boolean z = false;
            if ((this.f10099a instanceof ars) && this.f10102d.f10120e.f10264k != null) {
                zzbc zzbc = this.f10102d;
                if (this.f10100b != this.f10101c.size() - 1) {
                    z = true;
                }
                zzbc.f10118c = z;
                arx a = zzbc.m13657b(this.f10099a);
                this.f10102d.f10120e.f10264k.mo12516a(a);
                this.f10102d.mo10211a(a.mo12423n());
            } else if ((this.f10099a instanceof ars) && this.f10102d.f10120e.f10263j != null) {
                zzbc zzbc2 = this.f10102d;
                if (this.f10100b != this.f10101c.size() - 1) {
                    z = true;
                }
                zzbc2.f10118c = z;
                ars ars = (ars) this.f10099a;
                this.f10102d.f10120e.f10263j.mo12487a(ars);
                this.f10102d.mo10211a(ars.mo12392j());
            } else if ((this.f10099a instanceof arq) && this.f10102d.f10120e.f10264k != null) {
                zzbc zzbc3 = this.f10102d;
                if (this.f10100b != this.f10101c.size() - 1) {
                    z = true;
                }
                zzbc3.f10118c = z;
                arx a2 = zzbc.m13657b(this.f10099a);
                this.f10102d.f10120e.f10264k.mo12516a(a2);
                this.f10102d.mo10211a(a2.mo12423n());
            } else if (!(this.f10099a instanceof arq) || this.f10102d.f10120e.f10262i == null) {
                zzbc zzbc4 = this.f10102d;
                if (this.f10100b != this.f10101c.size() - 1) {
                    z = true;
                }
                zzbc4.mo10109a(3, z);
            } else {
                zzbc zzbc5 = this.f10102d;
                if (this.f10100b != this.f10101c.size() - 1) {
                    z = true;
                }
                zzbc5.f10118c = z;
                arq arq = (arq) this.f10099a;
                this.f10102d.f10120e.f10262i.mo12486a(arq);
                this.f10102d.mo10211a(arq.mo12370j());
            }
        } catch (RemoteException e) {
            C3643iy.m19177d("#007 Could not call remote method.", e);
        }
    }
}
