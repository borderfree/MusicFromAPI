package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.tasks.w */
final class C4816w<TResult> {

    /* renamed from: a */
    private final Object f17356a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private Queue<C4815v<TResult>> f17357b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f17358c;

    C4816w() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f17356a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (com.google.android.gms.tasks.C4815v) r2.f17357b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f17358c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo15937a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15944a(com.google.android.gms.tasks.C4796f<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f17356a
            monitor-enter(r0)
            java.util.Queue<com.google.android.gms.tasks.v<TResult>> r1 = r2.f17357b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f17358c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f17358c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f17356a
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.tasks.v<TResult>> r0 = r2.f17357b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            com.google.android.gms.tasks.v r0 = (com.google.android.gms.tasks.C4815v) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f17358c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo15937a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C4816w.mo15944a(com.google.android.gms.tasks.f):void");
    }

    /* renamed from: a */
    public final void mo15945a(C4815v<TResult> vVar) {
        synchronized (this.f17356a) {
            if (this.f17357b == null) {
                this.f17357b = new ArrayDeque();
            }
            this.f17357b.add(vVar);
        }
    }
}
