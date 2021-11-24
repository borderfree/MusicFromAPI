package com.google.android.gms.tasks;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.n */
final class C4807n<TResult> implements C4815v<TResult> {

    /* renamed from: a */
    private final Executor f17337a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f17338b = new Object();
    /* access modifiers changed from: private */
    @GuardedBy("mLock")

    /* renamed from: c */
    public C4792b f17339c;

    public C4807n(Executor executor, C4792b bVar) {
        this.f17337a = executor;
        this.f17339c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1.f17337a.execute(new com.google.android.gms.tasks.C4808o(r1));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15937a(com.google.android.gms.tasks.C4796f r2) {
        /*
            r1 = this;
            boolean r2 = r2.mo15926c()
            if (r2 == 0) goto L_0x001e
            java.lang.Object r2 = r1.f17338b
            monitor-enter(r2)
            com.google.android.gms.tasks.b r0 = r1.f17339c     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            java.util.concurrent.Executor r2 = r1.f17337a
            com.google.android.gms.tasks.o r0 = new com.google.android.gms.tasks.o
            r0.<init>(r1)
            r2.execute(r0)
            goto L_0x001e
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C4807n.mo15937a(com.google.android.gms.tasks.f):void");
    }
}
