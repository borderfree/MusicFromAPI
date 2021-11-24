package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mp */
final /* synthetic */ class C3742mp implements Runnable {

    /* renamed from: a */
    private final C3763nj f14452a;

    /* renamed from: b */
    private final C3736mj f14453b;

    /* renamed from: c */
    private final C3751my f14454c;

    C3742mp(C3763nj njVar, C3736mj mjVar, C3751my myVar) {
        this.f14452a = njVar;
        this.f14453b = mjVar;
        this.f14454c = myVar;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.nj r0 = r3.f14452a
            com.google.android.gms.internal.ads.mj r1 = r3.f14453b
            com.google.android.gms.internal.ads.my r2 = r3.f14454c
            java.lang.Object r2 = r2.get()     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            java.lang.Object r1 = r1.mo12712a(r2)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            r0.mo13296b(r1)     // Catch:{ CancellationException -> 0x0030, ExecutionException -> 0x0023, InterruptedException -> 0x0017, Exception -> 0x0012 }
            return
        L_0x0012:
            r1 = move-exception
            r0.mo13295a(r1)
            return
        L_0x0017:
            r1 = move-exception
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.interrupt()
            r0.mo13295a(r1)
            return
        L_0x0023:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()
            if (r2 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            r0.mo13295a(r1)
            return
        L_0x0030:
            r1 = 1
            r0.cancel(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3742mp.run():void");
    }
}
