package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.gmsg.zzb;
import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.Future;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.gj */
public final class C3574gj extends C3638it implements C3580gp, C3583gs, C3588gx {

    /* renamed from: a */
    public final String f14014a;

    /* renamed from: b */
    private final C3623ie f14015b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f14016c;

    /* renamed from: d */
    private final C3589gy f14017d;

    /* renamed from: e */
    private final C3583gs f14018e;

    /* renamed from: f */
    private final Object f14019f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final String f14020g;

    /* renamed from: h */
    private final bab f14021h;

    /* renamed from: i */
    private final long f14022i;

    /* renamed from: j */
    private int f14023j = 0;

    /* renamed from: k */
    private int f14024k = 3;

    /* renamed from: l */
    private C3577gm f14025l;

    /* renamed from: m */
    private Future f14026m;

    /* renamed from: n */
    private volatile zzb f14027n;

    public C3574gj(Context context, String str, String str2, bab bab, C3623ie ieVar, C3589gy gyVar, C3583gs gsVar, long j) {
        this.f14016c = context;
        this.f14014a = str;
        this.f14020g = str2;
        this.f14021h = bab;
        this.f14015b = ieVar;
        this.f14017d = gyVar;
        this.f14019f = new Object();
        this.f14018e = gsVar;
        this.f14022i = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18523a(zzjj zzjj, bav bav) {
        this.f14017d.mo12972b().mo12956a((C3583gs) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f14014a)) {
                bav.mo12695a(zzjj, this.f14020g, this.f14021h.f13402a);
            } else {
                bav.mo12694a(zzjj, this.f14020g);
            }
        } catch (RemoteException e) {
            C3643iy.m19175c("Fail to load ad from adapter.", e);
            mo12939a(this.f14014a, 0);
        }
    }

    /* renamed from: a */
    private final boolean m18524a(long j) {
        int i;
        long b = this.f14022i - (zzbv.zzer().mo11327b() - j);
        if (b <= 0) {
            i = 4;
        } else {
            try {
                this.f14019f.wait(b);
                return true;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i = 5;
            }
        }
        this.f14024k = i;
        return false;
    }

    /* renamed from: a */
    public final void mo10051a() {
        Handler handler;
        Runnable glVar;
        if (this.f14017d != null && this.f14017d.mo12972b() != null && this.f14017d.mo12971a() != null) {
            C3582gr b = this.f14017d.mo12972b();
            b.mo12956a((C3583gs) null);
            b.mo12955a((C3580gp) this);
            b.mo12957a((C3588gx) this);
            zzjj zzjj = this.f14015b.f14160a.f15259c;
            bav a = this.f14017d.mo12971a();
            try {
                if (a.mo12702g()) {
                    handler = C3719lt.f14416a;
                    glVar = new C3575gk(this, zzjj, a);
                } else {
                    handler = C3719lt.f14416a;
                    glVar = new C3576gl(this, a, zzjj, b);
                }
                handler.post(glVar);
            } catch (RemoteException e) {
                C3643iy.m19175c("Fail to check if adapter is initialized.", e);
                mo12939a(this.f14014a, 0);
            }
            long b2 = zzbv.zzer().mo11327b();
            while (true) {
                synchronized (this.f14019f) {
                    if (this.f14023j != 0) {
                        this.f14025l = new C3579go().mo12948a(zzbv.zzer().mo11327b() - b2).mo12947a(1 == this.f14023j ? 6 : this.f14024k).mo12949a(this.f14014a).mo12950b(this.f14021h.f13405d).mo12946a();
                    } else if (!m18524a(b2)) {
                        this.f14025l = new C3579go().mo12947a(this.f14024k).mo12948a(zzbv.zzer().mo11327b() - b2).mo12949a(this.f14014a).mo12950b(this.f14021h.f13405d).mo12946a();
                        break;
                    }
                }
            }
            b.mo12956a((C3583gs) null);
            b.mo12955a((C3580gp) null);
            if (this.f14023j == 1) {
                this.f14018e.mo12938a(this.f14014a);
            } else {
                this.f14018e.mo12939a(this.f14014a, this.f14024k);
            }
        }
    }

    /* renamed from: a */
    public final void mo12935a(int i) {
        mo12939a(this.f14014a, 0);
    }

    /* renamed from: a */
    public final void mo12936a(Bundle bundle) {
        zzb zzb = this.f14027n;
        if (zzb != null) {
            zzb.zza("", bundle);
        }
    }

    /* renamed from: a */
    public final void mo12937a(zzb zzb) {
        this.f14027n = zzb;
    }

    /* renamed from: a */
    public final void mo12938a(String str) {
        synchronized (this.f14019f) {
            this.f14023j = 1;
            this.f14019f.notify();
        }
    }

    /* renamed from: a */
    public final void mo12939a(String str, int i) {
        synchronized (this.f14019f) {
            this.f14023j = 2;
            this.f14024k = i;
            this.f14019f.notify();
        }
    }

    /* renamed from: d */
    public final Future mo12940d() {
        if (this.f14026m != null) {
            return this.f14026m;
        }
        C3751my myVar = (C3751my) mo11913c();
        this.f14026m = myVar;
        return myVar;
    }

    /* renamed from: e */
    public final C3577gm mo12941e() {
        C3577gm gmVar;
        synchronized (this.f14019f) {
            gmVar = this.f14025l;
        }
        return gmVar;
    }

    /* renamed from: f */
    public final bab mo12942f() {
        return this.f14021h;
    }

    /* renamed from: g */
    public final void mo12943g() {
        m18523a(this.f14015b.f14160a.f15259c, this.f14017d.mo12971a());
    }

    /* renamed from: h_ */
    public final void mo10052h_() {
    }
}
