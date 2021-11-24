package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3266s;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.google.android.gms.measurement.internal.au */
final class C4637au extends Thread {

    /* renamed from: a */
    private final Object f16724a = new Object();

    /* renamed from: b */
    private final BlockingQueue<C4636at<?>> f16725b;

    /* renamed from: c */
    private final /* synthetic */ C4634ar f16726c;

    public C4637au(C4634ar arVar, String str, BlockingQueue<C4636at<?>> blockingQueue) {
        this.f16726c = arVar;
        C3266s.m14913a(str);
        C3266s.m14913a(blockingQueue);
        this.f16725b = blockingQueue;
        setName(str);
    }

    /* renamed from: a */
    private final void m23032a(InterruptedException interruptedException) {
        this.f16726c.mo15253r().mo15849i().mo15859a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* renamed from: a */
    public final void mo15321a() {
        synchronized (this.f16724a) {
            this.f16724a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        r1 = r6.f16726c.f16715g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.f16726c.f16716h.release();
        r6.f16726c.f16715g.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (r6 != r6.f16726c.f16709a) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        r6.f16726c.f16709a = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        if (r6 != r6.f16726c.f16710b) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        r6.f16726c.f16710b = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        r6.f16726c.mo15253r().mo15852u_().mo15858a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            r0 = 0
        L_0x0001:
            if (r0 != 0) goto L_0x0013
            com.google.android.gms.measurement.internal.ar r1 = r6.f16726c     // Catch:{ InterruptedException -> 0x000e }
            java.util.concurrent.Semaphore r1 = r1.f16716h     // Catch:{ InterruptedException -> 0x000e }
            r1.acquire()     // Catch:{ InterruptedException -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x000e:
            r1 = move-exception
            r6.m23032a(r1)
            goto L_0x0001
        L_0x0013:
            r0 = 0
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x00b7 }
            int r1 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x00b7 }
        L_0x001c:
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.at<?>> r2 = r6.f16725b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.measurement.internal.at r2 = (com.google.android.gms.measurement.internal.C4636at) r2     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.f16720a     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x002c
            r3 = r1
            goto L_0x002e
        L_0x002c:
            r3 = 10
        L_0x002e:
            android.os.Process.setThreadPriority(r3)     // Catch:{ all -> 0x00b7 }
            r2.run()     // Catch:{ all -> 0x00b7 }
            goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r6.f16724a     // Catch:{ all -> 0x00b7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.at<?>> r3 = r6.f16725b     // Catch:{ all -> 0x00b4 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x0054
            com.google.android.gms.measurement.internal.ar r3 = r6.f16726c     // Catch:{ all -> 0x00b4 }
            boolean r3 = r3.f16717i     // Catch:{ all -> 0x00b4 }
            if (r3 != 0) goto L_0x0054
            java.lang.Object r3 = r6.f16724a     // Catch:{ InterruptedException -> 0x0050 }
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r3 = move-exception
            r6.m23032a(r3)     // Catch:{ all -> 0x00b4 }
        L_0x0054:
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            com.google.android.gms.measurement.internal.ar r2 = r6.f16726c     // Catch:{ all -> 0x00b7 }
            java.lang.Object r2 = r2.f16715g     // Catch:{ all -> 0x00b7 }
            monitor-enter(r2)     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.BlockingQueue<com.google.android.gms.measurement.internal.at<?>> r3 = r6.f16725b     // Catch:{ all -> 0x00b1 }
            java.lang.Object r3 = r3.peek()     // Catch:{ all -> 0x00b1 }
            if (r3 != 0) goto L_0x00ae
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.measurement.internal.ar r1 = r6.f16726c
            java.lang.Object r1 = r1.f16715g
            monitor-enter(r1)
            com.google.android.gms.measurement.internal.ar r2 = r6.f16726c     // Catch:{ all -> 0x00ab }
            java.util.concurrent.Semaphore r2 = r2.f16716h     // Catch:{ all -> 0x00ab }
            r2.release()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.ar r2 = r6.f16726c     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = r2.f16715g     // Catch:{ all -> 0x00ab }
            r2.notifyAll()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.ar r2 = r6.f16726c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.au r2 = r2.f16709a     // Catch:{ all -> 0x00ab }
            if (r6 != r2) goto L_0x008c
            com.google.android.gms.measurement.internal.ar r2 = r6.f16726c     // Catch:{ all -> 0x00ab }
            r2.f16709a = null     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x008c:
            com.google.android.gms.measurement.internal.ar r2 = r6.f16726c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.au r2 = r2.f16710b     // Catch:{ all -> 0x00ab }
            if (r6 != r2) goto L_0x009a
            com.google.android.gms.measurement.internal.ar r2 = r6.f16726c     // Catch:{ all -> 0x00ab }
            r2.f16710b = null     // Catch:{ all -> 0x00ab }
            goto L_0x00a9
        L_0x009a:
            com.google.android.gms.measurement.internal.ar r0 = r6.f16726c     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x00ab }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = "Current scheduler thread is neither worker nor network"
            r0.mo15858a(r2)     // Catch:{ all -> 0x00ab }
        L_0x00a9:
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            return
        L_0x00ab:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ab }
            throw r0
        L_0x00ae:
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            goto L_0x001c
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b1 }
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b4:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            com.google.android.gms.measurement.internal.ar r2 = r6.f16726c
            java.lang.Object r2 = r2.f16715g
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.ar r3 = r6.f16726c     // Catch:{ all -> 0x00fe }
            java.util.concurrent.Semaphore r3 = r3.f16716h     // Catch:{ all -> 0x00fe }
            r3.release()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.ar r3 = r6.f16726c     // Catch:{ all -> 0x00fe }
            java.lang.Object r3 = r3.f16715g     // Catch:{ all -> 0x00fe }
            r3.notifyAll()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.ar r3 = r6.f16726c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.au r3 = r3.f16709a     // Catch:{ all -> 0x00fe }
            if (r6 == r3) goto L_0x00f7
            com.google.android.gms.measurement.internal.ar r3 = r6.f16726c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.au r3 = r3.f16710b     // Catch:{ all -> 0x00fe }
            if (r6 != r3) goto L_0x00e7
            com.google.android.gms.measurement.internal.ar r3 = r6.f16726c     // Catch:{ all -> 0x00fe }
            r3.f16710b = null     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00e7:
            com.google.android.gms.measurement.internal.ar r0 = r6.f16726c     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.r r0 = r0.mo15253r()     // Catch:{ all -> 0x00fe }
            com.google.android.gms.measurement.internal.t r0 = r0.mo15852u_()     // Catch:{ all -> 0x00fe }
            java.lang.String r3 = "Current scheduler thread is neither worker nor network"
            r0.mo15858a(r3)     // Catch:{ all -> 0x00fe }
            goto L_0x00fc
        L_0x00f7:
            com.google.android.gms.measurement.internal.ar r3 = r6.f16726c     // Catch:{ all -> 0x00fe }
            r3.f16709a = null     // Catch:{ all -> 0x00fe }
        L_0x00fc:
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            throw r1
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fe }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4637au.run():void");
    }
}
