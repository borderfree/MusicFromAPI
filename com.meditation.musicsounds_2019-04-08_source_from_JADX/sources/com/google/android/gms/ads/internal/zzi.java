package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.ads.C3411am;
import com.google.android.gms.internal.ads.C3464ci;
import com.google.android.gms.internal.ads.C3606ho;
import com.google.android.gms.internal.ads.C3622id;
import com.google.android.gms.internal.ads.C3623ie;
import com.google.android.gms.internal.ads.C3643iy;
import com.google.android.gms.internal.ads.C3653jh;
import com.google.android.gms.internal.ads.C3753n;
import com.google.android.gms.internal.ads.C3832py;
import com.google.android.gms.internal.ads.C3840qf;
import com.google.android.gms.internal.ads.C3873rl;
import com.google.android.gms.internal.ads.ane;
import com.google.android.gms.internal.ads.aqm;
import com.google.android.gms.internal.ads.aqz;
import com.google.android.gms.internal.ads.arf;
import com.google.android.gms.internal.ads.bas;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzjn;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public abstract class zzi extends zzd implements zzaf, C3753n {

    /* renamed from: k */
    private boolean f10285k;

    public zzi(Context context, zzjn zzjn, String str, bas bas, zzang zzang, zzw zzw) {
        super(context, zzjn, str, bas, zzang, zzw);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3832py mo10193a(C3623ie ieVar, zzx zzx, C3606ho hoVar) {
        C3623ie ieVar2 = ieVar;
        View nextView = this.f10120e.f10256c.getNextView();
        if (nextView instanceof C3832py) {
            ((C3832py) nextView).destroy();
        }
        if (nextView != null) {
            this.f10120e.f10256c.removeView(nextView);
        }
        zzbv.zzel();
        C3832py a = C3840qf.m19490a(this.f10120e.zzrt, C3873rl.m19692a(this.f10120e.zzacv), this.f10120e.zzacv.f15499a, false, false, this.f10120e.f10255b, this.f10120e.zzacr, this.f10116a, this, this.f10124i, ieVar2.f14168i);
        if (this.f10120e.zzacv.f15505g == null) {
            mo10110a(a.getView());
        }
        a.mo13527t().mo13540a(this, this, this, this, this, false, null, zzx, this, hoVar);
        mo10285a(a);
        a.mo13487a(ieVar2.f14160a.f15278v);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10285a(C3832py pyVar) {
        pyVar.mo13488a("/trackActiveViewUnit", (zzv<? super C3832py>) new C2862ak<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo10286b(C3832py pyVar) {
        if (this.f10120e.zzacw != null) {
            this.f10122g.mo11942a(this.f10120e.zzacv, this.f10120e.zzacw, pyVar.getView(), pyVar);
            this.f10285k = false;
            return;
        }
        this.f10285k = true;
        C3643iy.m19178e("Request to enable ActiveView before adState is available.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo10116d() {
        super.mo10116d();
        if (this.f10285k) {
            if (((Boolean) ane.m16650f().mo12297a(aqm.f12773cg)).booleanValue()) {
                mo10286b(this.f10120e.zzacw.f14135b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo10287j() {
        return (this.f10120e.zzacx == null || this.f10120e.zzacx.f14161b == null || !this.f10120e.zzacx.f14161b.f15299Q) ? false : true;
    }

    public final void zza(int i, int i2, int i3, int i4) {
        mo10126n_();
    }

    public final void zza(arf arf) {
        C3266s.m14922b("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f10120e.f10272s = arf;
    }

    /* access modifiers changed from: protected */
    public void zza(C3623ie ieVar, aqz aqz) {
        if (ieVar.f14164e != -2) {
            C3653jh.f14275a.post(new C2863al(this, ieVar));
            return;
        }
        if (ieVar.f14163d != null) {
            this.f10120e.zzacv = ieVar.f14163d;
        }
        if (!ieVar.f14161b.f15313g || ieVar.f14161b.f15332z) {
            C3653jh.f14275a.post(new C2864am(this, ieVar, this.f10124i.zzxa.mo12989a(this.f10120e.zzrt, this.f10120e.zzacr, ieVar.f14161b), aqz));
            return;
        }
        this.f10120e.zzadv = 0;
        zzbw zzbw = this.f10120e;
        zzbv.zzej();
        zzbw.zzacu = C3411am.m16559a(this.f10120e.zzrt, this, ieVar, this.f10120e.f10255b, null, this.f10283j, this, aqz);
    }

    /* access modifiers changed from: protected */
    public boolean zza(C3622id idVar, C3622id idVar2) {
        if (this.f10120e.zzfo() && this.f10120e.f10256c != null) {
            this.f10120e.f10256c.zzfr().mo13183c(idVar2.f14115A);
        }
        try {
            if (idVar2.f14135b != null && !idVar2.f14147n && idVar2.f14127M) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12831dl)).booleanValue() && !idVar2.f14134a.f15483c.containsKey("sdk_less_server_data")) {
                    try {
                        idVar2.f14135b.mo13481H();
                    } catch (Throwable unused) {
                        C3643iy.m18780a("Could not render test Ad label.");
                    }
                }
            }
        } catch (RuntimeException unused2) {
            C3643iy.m18780a("Could not render test AdLabel.");
        }
        return super.zza(idVar, idVar2);
    }

    public final void zzcn() {
        onAdClicked();
    }

    public final void zzco() {
        recordImpression();
        zzbm();
    }

    public final void zzcq() {
        mo10124k_();
    }

    public final void zzh(View view) {
        this.f10120e.f10276w = view;
        C3622id idVar = new C3622id(this.f10120e.zzacx, null, null, null, null, null, null, null);
        zzb(idVar);
    }
}
