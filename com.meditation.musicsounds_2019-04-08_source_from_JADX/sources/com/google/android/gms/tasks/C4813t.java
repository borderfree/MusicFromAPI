package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.t */
final class C4813t<TResult> implements C4815v<TResult> {

    /* renamed from: a */
    private final Executor f17351a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f17352b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C4795e<? super TResult> f17353c;

    public C4813t(Executor executor, C4795e<? super TResult> eVar) {
        this.f17351a = executor;
        this.f17353c = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r2.f17351a.execute(new com.google.android.gms.tasks.C4814u(r2, r3));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15937a(com.google.android.gms.tasks.C4796f<TResult> r3) {
        /*
            r2 = this;
            boolean r0 = r3.mo15925b()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.f17352b
            monitor-enter(r0)
            com.google.android.gms.tasks.e<? super TResult> r1 = r2.f17353c     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r0 = r2.f17351a
            com.google.android.gms.tasks.u r1 = new com.google.android.gms.tasks.u
            r1.<init>(r2, r3)
            r0.execute(r1)
            goto L_0x001e
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C4813t.mo15937a(com.google.android.gms.tasks.f):void");
    }
}
