package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
public final class aki {

    /* renamed from: a */
    private final Runnable f12266a = new akj(this);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f12267b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public ako f12268c;
    @GuardedBy("mLock")

    /* renamed from: d */
    private Context f12269d;
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: e */
    public akr f12270e;

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m16435b() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f12267b
            monitor-enter(r0)
            android.content.Context r1 = r6.f12269d     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.ako r1 = r6.f12268c     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000c
            goto L_0x002e
        L_0x000c:
            com.google.android.gms.internal.ads.akl r1 = new com.google.android.gms.internal.ads.akl     // Catch:{ all -> 0x0030 }
            r1.<init>(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.akm r2 = new com.google.android.gms.internal.ads.akm     // Catch:{ all -> 0x0030 }
            r2.<init>(r6)     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.ako r3 = new com.google.android.gms.internal.ads.ako     // Catch:{ all -> 0x0030 }
            android.content.Context r4 = r6.f12269d     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.lf r5 = com.google.android.gms.ads.internal.zzbv.zzez()     // Catch:{ all -> 0x0030 }
            android.os.Looper r5 = r5.mo13214a()     // Catch:{ all -> 0x0030 }
            r3.<init>(r4, r5, r1, r2)     // Catch:{ all -> 0x0030 }
            r6.f12268c = r3     // Catch:{ all -> 0x0030 }
            com.google.android.gms.internal.ads.ako r1 = r6.f12268c     // Catch:{ all -> 0x0030 }
            r1.mo11221q()     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aki.m16435b():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m16438c() {
        synchronized (this.f12267b) {
            if (this.f12268c != null) {
                if (this.f12268c.mo11212h() || this.f12268c.mo11213i()) {
                    this.f12268c.mo11211g();
                }
                this.f12268c = null;
                this.f12270e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* renamed from: a */
    public final zzhi mo12071a(zzhl zzhl) {
        synchronized (this.f12267b) {
            if (this.f12270e == null) {
                zzhi zzhi = new zzhi();
                return zzhi;
            }
            try {
                zzhi a = this.f12270e.mo12080a(zzhl);
                return a;
            } catch (RemoteException e) {
                C3643iy.m19173b("Unable to call into cache service.", e);
                return new zzhi();
            }
        }
    }

    /* renamed from: a */
    public final void mo12072a() {
        if (((Boolean) ane.m16650f().mo12297a(aqm.f12746cF)).booleanValue()) {
            synchronized (this.f12267b) {
                m16435b();
                zzbv.zzek();
                C3653jh.f14275a.removeCallbacks(this.f12266a);
                zzbv.zzek();
                C3653jh.f14275a.postDelayed(this.f12266a, ((Long) ane.m16650f().mo12297a(aqm.f12747cG)).longValue());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12073a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f12267b
            monitor-enter(r0)
            android.content.Context r1 = r2.f12269d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f12269d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.aqm.f12745cE     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.aqk r1 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo12297a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.m16435b()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.aqm.f12744cD     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.aqk r1 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo12297a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.akk r3 = new com.google.android.gms.internal.ads.akk     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.ajk r1 = com.google.android.gms.ads.internal.zzbv.zzen()     // Catch:{ all -> 0x0048 }
            r1.mo12027a(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aki.mo12073a(android.content.Context):void");
    }
}
