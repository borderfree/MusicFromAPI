package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzw;
import com.google.android.gms.dynamic.C3323b;
import com.google.android.gms.dynamic.C3327d;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.fm */
public final class C3550fm extends C3561fx {

    /* renamed from: a */
    private final Context f13991a;

    /* renamed from: b */
    private final Object f13992b;

    /* renamed from: c */
    private final zzang f13993c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private final C3551fn f13994d;

    public C3550fm(Context context, zzw zzw, bas bas, zzang zzang) {
        C3551fn fnVar = new C3551fn(context, zzw, zzjn.m20759a(), bas, zzang);
        this(context, zzang, fnVar);
    }

    private C3550fm(Context context, zzang zzang, C3551fn fnVar) {
        this.f13992b = new Object();
        this.f13991a = context;
        this.f13993c = zzang;
        this.f13994d = fnVar;
    }

    /* renamed from: a */
    public final void mo12255a() {
        synchronized (this.f13992b) {
            this.f13994d.mo12922j();
        }
    }

    /* renamed from: a */
    public final void mo12256a(C3323b bVar) {
        synchronized (this.f13992b) {
            this.f13994d.pause();
        }
    }

    /* renamed from: a */
    public final void mo12257a(aoa aoa) {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12640aF)).booleanValue()) {
            synchronized (this.f13992b) {
                this.f13994d.zza(aoa);
            }
        }
    }

    /* renamed from: a */
    public final void mo12258a(C3557ft ftVar) {
        synchronized (this.f13992b) {
            this.f13994d.zza(ftVar);
        }
    }

    /* renamed from: a */
    public final void mo12259a(C3566gb gbVar) {
        synchronized (this.f13992b) {
            this.f13994d.zza(gbVar);
        }
    }

    /* renamed from: a */
    public final void mo12260a(zzahk zzahk) {
        synchronized (this.f13992b) {
            this.f13994d.mo12921a(zzahk);
        }
    }

    /* renamed from: a */
    public final void mo12261a(String str) {
        synchronized (this.f13992b) {
            this.f13994d.setUserId(str);
        }
    }

    /* renamed from: a */
    public final void mo12262a(boolean z) {
        synchronized (this.f13992b) {
            this.f13994d.setImmersiveMode(z);
        }
    }

    /* renamed from: b */
    public final Bundle mo12263b() {
        Bundle zzba;
        if (!((Boolean) ane.m16650f().mo12297a(aqm.f12640aF)).booleanValue()) {
            return new Bundle();
        }
        synchronized (this.f13992b) {
            zzba = this.f13994d.zzba();
        }
        return zzba;
    }

    /* renamed from: b */
    public final void mo12264b(C3323b bVar) {
        Context context;
        synchronized (this.f13992b) {
            if (bVar == null) {
                context = null;
            } else {
                try {
                    context = (Context) C3327d.m15137a(bVar);
                } catch (Exception e) {
                    C3643iy.m19175c("Unable to extract updated context.", e);
                }
            }
            if (context != null) {
                this.f13994d.mo12920a(context);
            }
            this.f13994d.resume();
        }
    }

    /* renamed from: c */
    public final void mo12265c(C3323b bVar) {
        synchronized (this.f13992b) {
            this.f13994d.destroy();
        }
    }

    /* renamed from: c */
    public final boolean mo12266c() {
        boolean l;
        synchronized (this.f13992b) {
            l = this.f13994d.mo12923l();
        }
        return l;
    }

    /* renamed from: d */
    public final void mo12267d() {
        mo12256a((C3323b) null);
    }

    /* renamed from: e */
    public final void mo12268e() {
        mo12264b(null);
    }

    /* renamed from: f */
    public final void mo12269f() {
        mo12265c(null);
    }

    /* renamed from: g */
    public final String mo12270g() {
        String mediationAdapterClassName;
        synchronized (this.f13992b) {
            mediationAdapterClassName = this.f13994d.getMediationAdapterClassName();
        }
        return mediationAdapterClassName;
    }
}
