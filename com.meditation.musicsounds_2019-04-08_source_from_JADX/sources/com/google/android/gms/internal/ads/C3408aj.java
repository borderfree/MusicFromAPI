package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.aj */
public abstract class C3408aj extends C3638it {

    /* renamed from: a */
    protected final C3413an f12160a;

    /* renamed from: b */
    protected final Context f12161b;

    /* renamed from: c */
    protected final Object f12162c = new Object();

    /* renamed from: d */
    protected final Object f12163d = new Object();

    /* renamed from: e */
    protected final C3623ie f12164e;
    @GuardedBy("mLock")

    /* renamed from: f */
    protected zzaej f12165f;

    protected C3408aj(Context context, C3623ie ieVar, C3413an anVar) {
        super(true);
        this.f12161b = context;
        this.f12164e = ieVar;
        this.f12165f = ieVar.f14161b;
        this.f12160a = anVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C3622id mo12003a(int i);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ zzabk -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ zzabk -> 0x0014 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10051a() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f12162c
            monitor-enter(r0)
            java.lang.String r1 = "AdRendererBackgroundTask started."
            com.google.android.gms.internal.ads.C3643iy.m19172b(r1)     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.ie r1 = r5.f12164e     // Catch:{ all -> 0x0060 }
            int r1 = r1.f14164e     // Catch:{ all -> 0x0060 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ zzabk -> 0x0014 }
            r5.mo12004a(r2)     // Catch:{ zzabk -> 0x0014 }
            goto L_0x0050
        L_0x0014:
            r1 = move-exception
            int r2 = r1.getErrorCode()     // Catch:{ all -> 0x0060 }
            r3 = 3
            if (r2 == r3) goto L_0x0028
            r3 = -1
            if (r2 != r3) goto L_0x0020
            goto L_0x0028
        L_0x0020:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.C3643iy.m19178e(r1)     // Catch:{ all -> 0x0060 }
            goto L_0x002f
        L_0x0028:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.C3643iy.m19176d(r1)     // Catch:{ all -> 0x0060 }
        L_0x002f:
            com.google.android.gms.internal.ads.zzaej r1 = r5.f12165f     // Catch:{ all -> 0x0060 }
            if (r1 != 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x0060 }
            r1.<init>(r2)     // Catch:{ all -> 0x0060 }
        L_0x0038:
            r5.f12165f = r1     // Catch:{ all -> 0x0060 }
            goto L_0x0045
        L_0x003b:
            com.google.android.gms.internal.ads.zzaej r1 = new com.google.android.gms.internal.ads.zzaej     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.zzaej r3 = r5.f12165f     // Catch:{ all -> 0x0060 }
            long r3 = r3.f15316j     // Catch:{ all -> 0x0060 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0038
        L_0x0045:
            android.os.Handler r1 = com.google.android.gms.internal.ads.C3653jh.f14275a     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.ak r3 = new com.google.android.gms.internal.ads.ak     // Catch:{ all -> 0x0060 }
            r3.<init>(r5)     // Catch:{ all -> 0x0060 }
            r1.post(r3)     // Catch:{ all -> 0x0060 }
            r1 = r2
        L_0x0050:
            com.google.android.gms.internal.ads.id r1 = r5.mo12003a(r1)     // Catch:{ all -> 0x0060 }
            android.os.Handler r2 = com.google.android.gms.internal.ads.C3653jh.f14275a     // Catch:{ all -> 0x0060 }
            com.google.android.gms.internal.ads.al r3 = new com.google.android.gms.internal.ads.al     // Catch:{ all -> 0x0060 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0060 }
            r2.post(r3)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            return
        L_0x0060:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0060 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3408aj.mo10051a():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12004a(long j);

    /* renamed from: h_ */
    public void mo10052h_() {
    }
}
