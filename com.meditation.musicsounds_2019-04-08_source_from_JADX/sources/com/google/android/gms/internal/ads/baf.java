package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
@C3464ci
public final class baf extends baz {

    /* renamed from: a */
    private final Object f13447a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private bak f13448b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private bad f13449c;

    /* renamed from: a */
    public final void mo12658a() {
        synchronized (this.f13447a) {
            if (this.f13449c != null) {
                this.f13449c.zzce();
            }
        }
    }

    /* renamed from: a */
    public final void mo12659a(int i) {
        synchronized (this.f13447a) {
            if (this.f13448b != null) {
                this.f13448b.mo12674a(i == 3 ? 1 : 2);
                this.f13448b = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo12660a(atu atu, String str) {
        synchronized (this.f13447a) {
            if (this.f13449c != null) {
                this.f13449c.zza(atu, str);
            }
        }
    }

    /* renamed from: a */
    public final void mo12661a(bad bad) {
        synchronized (this.f13447a) {
            this.f13449c = bad;
        }
    }

    /* renamed from: a */
    public final void mo12662a(bak bak) {
        synchronized (this.f13447a) {
            this.f13448b = bak;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12663a(com.google.android.gms.internal.ads.bbb r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13447a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bak r1 = r3.f13448b     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.bak r1 = r3.f13448b     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.mo12675a(r2, r4)     // Catch:{ all -> 0x001d }
            r4 = 0
            r3.f13448b = r4     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.bad r4 = r3.f13449c     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.bad r4 = r3.f13449c     // Catch:{ all -> 0x001d }
            r4.zzci()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.baf.mo12663a(com.google.android.gms.internal.ads.bbb):void");
    }

    /* renamed from: a */
    public final void mo12664a(String str) {
    }

    /* renamed from: a */
    public final void mo12665a(String str, String str2) {
        synchronized (this.f13447a) {
            if (this.f13449c != null) {
                this.f13449c.zzb(str, str2);
            }
        }
    }

    /* renamed from: b */
    public final void mo12666b() {
        synchronized (this.f13447a) {
            if (this.f13449c != null) {
                this.f13449c.zzcf();
            }
        }
    }

    /* renamed from: c */
    public final void mo12667c() {
        synchronized (this.f13447a) {
            if (this.f13449c != null) {
                this.f13449c.zzcg();
            }
        }
    }

    /* renamed from: d */
    public final void mo12668d() {
        synchronized (this.f13447a) {
            if (this.f13449c != null) {
                this.f13449c.zzch();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12669e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13447a
            monitor-enter(r0)
            com.google.android.gms.internal.ads.bak r1 = r3.f13448b     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            com.google.android.gms.internal.ads.bak r1 = r3.f13448b     // Catch:{ all -> 0x001d }
            r2 = 0
            r1.mo12674a(r2)     // Catch:{ all -> 0x001d }
            r1 = 0
            r3.f13448b = r1     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            com.google.android.gms.internal.ads.bad r1 = r3.f13449c     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.internal.ads.bad r1 = r3.f13449c     // Catch:{ all -> 0x001d }
            r1.zzci()     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.baf.mo12669e():void");
    }

    /* renamed from: f */
    public final void mo12670f() {
        synchronized (this.f13447a) {
            if (this.f13449c != null) {
                this.f13449c.zzcj();
            }
        }
    }

    /* renamed from: g */
    public final void mo12671g() {
        synchronized (this.f13447a) {
            if (this.f13449c != null) {
                this.f13449c.zzcd();
            }
        }
    }
}
