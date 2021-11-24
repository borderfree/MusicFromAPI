package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.C3411am;
import com.google.android.gms.internal.ads.C3606ho;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.aqz;
import com.google.android.gms.internal.ads.ara;
import com.google.android.gms.internal.ads.zzarg;

/* renamed from: com.google.android.gms.ads.internal.am */
final class C2864am implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3623ie f9949a;

    /* renamed from: b */
    final /* synthetic */ C3606ho f9950b;

    /* renamed from: c */
    final /* synthetic */ zzi f9951c;

    /* renamed from: d */
    private final /* synthetic */ aqz f9952d;

    C2864am(zzi zzi, C3623ie ieVar, C3606ho hoVar, aqz aqz) {
        this.f9951c = zzi;
        this.f9949a = ieVar;
        this.f9950b = hoVar;
        this.f9952d = aqz;
    }

    public final void run() {
        if (this.f9949a.f14161b.f15324r && this.f9951c.f10120e.f10272s != null) {
            String str = null;
            if (this.f9949a.f14161b.f15307a != null) {
                zzbv.zzek();
                str = C3653jh.m18869a(this.f9949a.f14161b.f15307a);
            }
            ara ara = new ara(this.f9951c, str, this.f9949a.f14161b.f15308b);
            this.f9951c.f10120e.zzadv = 1;
            try {
                this.f9951c.f10118c = false;
                this.f9951c.f10120e.f10272s.mo12333a(ara);
                return;
            } catch (RemoteException e) {
                C3643iy.m19177d("#007 Could not call remote method.", e);
                this.f9951c.f10118c = true;
            }
        }
        zzx zzx = new zzx(this.f9951c.f10120e.zzrt, this.f9950b, this.f9949a.f14161b.f15287E);
        try {
            C3832py a = this.f9951c.mo10193a(this.f9949a, zzx, this.f9950b);
            a.setOnTouchListener(new C2866ao(this, zzx));
            a.setOnClickListener(new C2867ap(this, zzx));
            this.f9951c.f10120e.zzadv = 0;
            zzbw zzbw = this.f9951c.f10120e;
            zzbv.zzej();
            zzbw.zzacu = C3411am.m16559a(this.f9951c.f10120e.zzrt, this.f9951c, this.f9949a, this.f9951c.f10120e.f10255b, a, this.f9951c.f10283j, this.f9951c, this.f9952d);
        } catch (zzarg e2) {
            C3643iy.m19173b("Could not obtain webview.", e2);
            C3653jh.f14275a.post(new C2865an(this));
        }
    }
}
