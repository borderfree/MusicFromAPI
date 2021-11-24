package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.r */
final class C4811r<TResult> implements C4815v<TResult> {

    /* renamed from: a */
    private final Executor f17346a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f17347b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C4794d f17348c;

    public C4811r(Executor executor, C4794d dVar) {
        this.f17346a = executor;
        this.f17348c = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        r2.f17346a.execute(new com.google.android.gms.tasks.C4812s(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15937a(com.google.android.gms.tasks.C4796f<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo15925b()
            if (r0 != 0) goto L_0x0024
            boolean r0 = r3.mo15926c()
            if (r0 != 0) goto L_0x0024
            java.lang.Object r0 = r2.f17347b
            monitor-enter(r0)
            com.google.android.gms.tasks.d r1 = r2.f17348c     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            java.util.concurrent.Executor r0 = r2.f17346a
            com.google.android.gms.tasks.s r1 = new com.google.android.gms.tasks.s
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x0024
        L_0x0021:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C4811r.mo15937a(com.google.android.gms.tasks.f):void");
    }
}
