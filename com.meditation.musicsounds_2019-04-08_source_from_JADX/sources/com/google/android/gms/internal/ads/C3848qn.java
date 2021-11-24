package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.C3301f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.qn */
public final class C3848qn extends aot {

    /* renamed from: a */
    private final C3804ox f14782a;

    /* renamed from: b */
    private final Object f14783b = new Object();

    /* renamed from: c */
    private final boolean f14784c;

    /* renamed from: d */
    private final boolean f14785d;

    /* renamed from: e */
    private final float f14786e;
    @GuardedBy("lock")

    /* renamed from: f */
    private int f14787f;
    @GuardedBy("lock")

    /* renamed from: g */
    private aov f14788g;
    @GuardedBy("lock")

    /* renamed from: h */
    private boolean f14789h;
    @GuardedBy("lock")

    /* renamed from: i */
    private boolean f14790i = true;
    @GuardedBy("lock")

    /* renamed from: j */
    private float f14791j;
    @GuardedBy("lock")

    /* renamed from: k */
    private float f14792k;
    @GuardedBy("lock")

    /* renamed from: l */
    private boolean f14793l = true;
    @GuardedBy("lock")

    /* renamed from: m */
    private boolean f14794m;
    @GuardedBy("lock")

    /* renamed from: n */
    private boolean f14795n;

    public C3848qn(C3804ox oxVar, float f, boolean z, boolean z2) {
        this.f14782a = oxVar;
        this.f14786e = f;
        this.f14784c = z;
        this.f14785d = z2;
    }

    /* renamed from: a */
    private final void m19633a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        C3758ne.f14481a.execute(new C3849qo(this, hashMap));
    }

    /* renamed from: a */
    public final void mo12132a() {
        m19633a("play", null);
    }

    /* renamed from: a */
    public final void mo13593a(float f, int i, boolean z, float f2) {
        boolean z2;
        int i2;
        synchronized (this.f14783b) {
            this.f14791j = f;
            z2 = this.f14790i;
            this.f14790i = z;
            i2 = this.f14787f;
            this.f14787f = i;
            float f3 = this.f14792k;
            this.f14792k = f2;
            if (Math.abs(this.f14792k - f3) > 1.0E-4f) {
                this.f14782a.getView().invalidate();
            }
        }
        Executor executor = C3758ne.f14481a;
        C3850qp qpVar = new C3850qp(this, i2, i, z2, z);
        executor.execute(qpVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13594a(int i, int i2, boolean z, boolean z2) {
        synchronized (this.f14783b) {
            boolean z3 = false;
            boolean z4 = i != i2;
            boolean z5 = !this.f14789h && i2 == 1;
            boolean z6 = z4 && i2 == 1;
            boolean z7 = z4 && i2 == 2;
            boolean z8 = z4 && i2 == 3;
            boolean z9 = z != z2;
            if (this.f14789h || z5) {
                z3 = true;
            }
            this.f14789h = z3;
            if (this.f14788g != null) {
                if (z5) {
                    try {
                        this.f14788g.mo12144a();
                    } catch (RemoteException e) {
                        C3643iy.m19175c("Unable to call onVideoStart()", e);
                    }
                }
                if (z6) {
                    try {
                        this.f14788g.mo12146b();
                    } catch (RemoteException e2) {
                        C3643iy.m19175c("Unable to call onVideoPlay()", e2);
                    }
                }
                if (z7) {
                    try {
                        this.f14788g.mo12147c();
                    } catch (RemoteException e3) {
                        C3643iy.m19175c("Unable to call onVideoPause()", e3);
                    }
                }
                if (z8) {
                    try {
                        this.f14788g.mo12148d();
                    } catch (RemoteException e4) {
                        C3643iy.m19175c("Unable to call onVideoEnd()", e4);
                    }
                }
                if (z9) {
                    try {
                        this.f14788g.mo12145a(z2);
                    } catch (RemoteException e5) {
                        C3643iy.m19175c("Unable to call onVideoMute()", e5);
                    }
                }
            } else {
                return;
            }
        }
        return;
    }

    /* renamed from: a */
    public final void mo12133a(aov aov) {
        synchronized (this.f14783b) {
            this.f14788g = aov;
        }
    }

    /* renamed from: a */
    public final void mo13595a(zzmu zzmu) {
        synchronized (this.f14783b) {
            this.f14793l = zzmu.f15511a;
            this.f14794m = zzmu.f15512b;
            this.f14795n = zzmu.f15513c;
        }
        m19633a("initialState", C3301f.m15044a("muteStart", zzmu.f15511a ? "1" : "0", "customControlsRequested", zzmu.f15512b ? "1" : "0", "clickToExpandRequested", zzmu.f15513c ? "1" : "0"));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13596a(Map map) {
        this.f14782a.mo12588a("pubVideoCmd", map);
    }

    /* renamed from: a */
    public final void mo12134a(boolean z) {
        m19633a(z ? "mute" : "unmute", null);
    }

    /* renamed from: b */
    public final void mo12135b() {
        m19633a("pause", null);
    }

    /* renamed from: c */
    public final boolean mo12136c() {
        boolean z;
        synchronized (this.f14783b) {
            z = this.f14790i;
        }
        return z;
    }

    /* renamed from: d */
    public final int mo12137d() {
        int i;
        synchronized (this.f14783b) {
            i = this.f14787f;
        }
        return i;
    }

    /* renamed from: e */
    public final float mo12138e() {
        float f;
        synchronized (this.f14783b) {
            f = this.f14792k;
        }
        return f;
    }

    /* renamed from: f */
    public final float mo12139f() {
        return this.f14786e;
    }

    /* renamed from: g */
    public final float mo12140g() {
        float f;
        synchronized (this.f14783b) {
            f = this.f14791j;
        }
        return f;
    }

    /* renamed from: h */
    public final aov mo12141h() {
        aov aov;
        synchronized (this.f14783b) {
            aov = this.f14788g;
        }
        return aov;
    }

    /* renamed from: i */
    public final boolean mo12142i() {
        boolean z;
        synchronized (this.f14783b) {
            z = this.f14784c && this.f14794m;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo12143j() {
        boolean z;
        boolean i = mo12142i();
        synchronized (this.f14783b) {
            if (!i) {
                try {
                    if (this.f14795n && this.f14785d) {
                        z = true;
                    }
                } finally {
                }
            }
            z = false;
        }
        return z;
    }
}
