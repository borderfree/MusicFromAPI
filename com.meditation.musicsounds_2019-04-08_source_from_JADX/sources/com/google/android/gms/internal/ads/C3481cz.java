package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.cz */
public abstract class C3481cz implements C3479cx, C3673ka<Void> {

    /* renamed from: a */
    private final C3765nl<zzaef> f13712a;

    /* renamed from: b */
    private final C3479cx f13713b;

    /* renamed from: c */
    private final Object f13714c = new Object();

    public C3481cz(C3765nl<zzaef> nlVar, C3479cx cxVar) {
        this.f13712a = nlVar;
        this.f13713b = cxVar;
    }

    /* renamed from: a */
    public abstract void mo12848a();

    /* renamed from: a */
    public final void mo12843a(zzaej zzaej) {
        synchronized (this.f13714c) {
            this.f13713b.mo12843a(zzaej);
            mo12848a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo12849a(C3493dk dkVar, zzaef zzaef) {
        try {
            dkVar.mo12860a(zzaef, (C3496dn) new C3490dh(this));
            return true;
        } catch (Throwable th) {
            C3643iy.m19175c("Could not fetch ad response from ad request service due to an Exception.", th);
            zzbv.zzeo().mo13047a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f13713b.mo12843a(new zzaej(0));
            return false;
        }
    }

    /* renamed from: b */
    public final void mo11912b() {
        mo12848a();
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo11913c() {
        C3493dk d = mo12850d();
        if (d == null) {
            this.f13713b.mo12843a(new zzaej(0));
            mo12848a();
            return null;
        }
        this.f13712a.mo13301a(new C3483da(this, d), new C3484db(this));
        return null;
    }

    /* renamed from: d */
    public abstract C3493dk mo12850d();
}
