package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.util.C3309n;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3464ci
public final class ajk {

    /* renamed from: a */
    private final Object f12192a = new Object();
    @GuardedBy("mActivityTrackerLock")

    /* renamed from: b */
    private ajl f12193b = null;
    @GuardedBy("mActivityTrackerLock")

    /* renamed from: c */
    private boolean f12194c = false;

    /* renamed from: a */
    public final Activity mo12025a() {
        synchronized (this.f12192a) {
            if (!C3309n.m15070b()) {
                return null;
            }
            if (this.f12193b == null) {
                return null;
            }
            Activity a = this.f12193b.mo12029a();
            return a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12026a(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f12192a
            monitor-enter(r0)
            boolean r1 = r4.f12194c     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x004e
            boolean r1 = com.google.android.gms.common.util.C3309n.m15070b()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x000f:
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aqm.f12641aG     // Catch:{ all -> 0x0050 }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r2.mo12297a(r1)     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r1 != 0) goto L_0x0023
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0023:
            r1 = 0
            android.content.Context r2 = r5.getApplicationContext()     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x002b
            r2 = r5
        L_0x002b:
            boolean r3 = r2 instanceof android.app.Application     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0032
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0050 }
        L_0x0032:
            if (r1 != 0) goto L_0x003b
            java.lang.String r5 = "Can not cast Context to Application"
            com.google.android.gms.internal.ads.C3643iy.m19178e(r5)     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x003b:
            com.google.android.gms.internal.ads.ajl r2 = r4.f12193b     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x0046
            com.google.android.gms.internal.ads.ajl r2 = new com.google.android.gms.internal.ads.ajl     // Catch:{ all -> 0x0050 }
            r2.<init>()     // Catch:{ all -> 0x0050 }
            r4.f12193b = r2     // Catch:{ all -> 0x0050 }
        L_0x0046:
            com.google.android.gms.internal.ads.ajl r2 = r4.f12193b     // Catch:{ all -> 0x0050 }
            r2.mo12030a(r1, r5)     // Catch:{ all -> 0x0050 }
            r5 = 1
            r4.f12194c = r5     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ajk.mo12026a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo12027a(ajn ajn) {
        synchronized (this.f12192a) {
            if (C3309n.m15070b()) {
                if (((Boolean) ane.m16650f().mo12297a(aqm.f12641aG)).booleanValue()) {
                    if (this.f12193b == null) {
                        this.f12193b = new ajl();
                    }
                    this.f12193b.mo12031a(ajn);
                }
            }
        }
    }

    /* renamed from: b */
    public final Context mo12028b() {
        synchronized (this.f12192a) {
            if (!C3309n.m15070b()) {
                return null;
            }
            if (this.f12193b == null) {
                return null;
            }
            Context b = this.f12193b.mo12032b();
            return b;
        }
    }
}
