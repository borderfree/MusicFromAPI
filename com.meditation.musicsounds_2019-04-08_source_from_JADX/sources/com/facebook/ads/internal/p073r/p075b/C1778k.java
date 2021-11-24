package com.facebook.ads.internal.p073r.p075b;

import android.util.Log;
import java.lang.Thread.State;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.r.b.k */
class C1778k {

    /* renamed from: a */
    private final C1783n f5803a;

    /* renamed from: b */
    private final C1752a f5804b;

    /* renamed from: c */
    private final Object f5805c = new Object();

    /* renamed from: d */
    private final Object f5806d = new Object();

    /* renamed from: e */
    private final AtomicInteger f5807e;

    /* renamed from: f */
    private volatile Thread f5808f;

    /* renamed from: g */
    private volatile boolean f5809g;

    /* renamed from: h */
    private volatile int f5810h = -1;

    /* renamed from: com.facebook.ads.internal.r.b.k$a */
    private class C1780a implements Runnable {
        private C1780a() {
        }

        public void run() {
            C1778k.this.m8849e();
        }
    }

    public C1778k(C1783n nVar, C1752a aVar) {
        this.f5803a = (C1783n) C1777j.m8841a(nVar);
        this.f5804b = (C1752a) C1777j.m8841a(aVar);
        this.f5807e = new AtomicInteger();
    }

    /* renamed from: b */
    private void m8845b() {
        int i = this.f5807e.get();
        if (i >= 1) {
            this.f5807e.set(0);
            StringBuilder sb = new StringBuilder();
            sb.append("Error reading source ");
            sb.append(i);
            sb.append(" times");
            throw new C1781l(sb.toString());
        }
    }

    /* renamed from: b */
    private void m8846b(long j, long j2) {
        mo7051a(j, j2);
        synchronized (this.f5805c) {
            this.f5805c.notifyAll();
        }
    }

    /* renamed from: c */
    private synchronized void m8847c() {
        boolean z = (this.f5808f == null || this.f5808f.getState() == State.TERMINATED) ? false : true;
        if (!this.f5809g && !this.f5804b.mo7019d() && !z) {
            C1780a aVar = new C1780a();
            StringBuilder sb = new StringBuilder();
            sb.append("Source reader for ");
            sb.append(this.f5803a);
            this.f5808f = new Thread(aVar, sb.toString());
            this.f5808f.start();
        }
    }

    /* renamed from: d */
    private void m8848d() {
        synchronized (this.f5805c) {
            try {
                this.f5805c.wait(1000);
            } catch (InterruptedException e) {
                throw new C1781l("Waiting source data is interrupted!", e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        r2 = r2 + r4;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m8849e() {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            com.facebook.ads.internal.r.b.a r2 = r9.f5804b     // Catch:{ Throwable -> 0x0062, all -> 0x005d }
            int r2 = r2.mo7014a()     // Catch:{ Throwable -> 0x0062, all -> 0x005d }
            com.facebook.ads.internal.r.b.n r1 = r9.f5803a     // Catch:{ Throwable -> 0x0059, all -> 0x0055 }
            r1.mo7045a(r2)     // Catch:{ Throwable -> 0x0059, all -> 0x0055 }
            com.facebook.ads.internal.r.b.n r1 = r9.f5803a     // Catch:{ Throwable -> 0x0059, all -> 0x0055 }
            int r1 = r1.mo7043a()     // Catch:{ Throwable -> 0x0059, all -> 0x0055 }
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch:{ Throwable -> 0x0050, all -> 0x004e }
        L_0x0017:
            com.facebook.ads.internal.r.b.n r4 = r9.f5803a     // Catch:{ Throwable -> 0x0050, all -> 0x004e }
            int r4 = r4.mo7044a(r3)     // Catch:{ Throwable -> 0x0050, all -> 0x004e }
            if (r4 == r0) goto L_0x0042
            java.lang.Object r5 = r9.f5806d     // Catch:{ Throwable -> 0x0050, all -> 0x004e }
            monitor-enter(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x004e }
            boolean r6 = r9.m8851g()     // Catch:{ all -> 0x003f }
            if (r6 == 0) goto L_0x0032
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            r9.m8852h()
            long r2 = (long) r2
            long r0 = (long) r1
            r9.m8846b(r2, r0)
            return
        L_0x0032:
            com.facebook.ads.internal.r.b.a r6 = r9.f5804b     // Catch:{ all -> 0x003f }
            r6.mo7016a(r3, r4)     // Catch:{ all -> 0x003f }
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            int r2 = r2 + r4
            long r4 = (long) r2
            long r6 = (long) r1
            r9.m8846b(r4, r6)     // Catch:{ Throwable -> 0x0050, all -> 0x004e }
            goto L_0x0017
        L_0x003f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ Throwable -> 0x0050, all -> 0x004e }
        L_0x0042:
            r9.m8850f()     // Catch:{ Throwable -> 0x0050, all -> 0x004e }
            r9.m8852h()
            long r2 = (long) r2
            long r0 = (long) r1
            r9.m8846b(r2, r0)
            goto L_0x0075
        L_0x004e:
            r0 = move-exception
            goto L_0x007a
        L_0x0050:
            r0 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
            goto L_0x0065
        L_0x0055:
            r1 = move-exception
            r0 = r1
            r1 = -1
            goto L_0x007a
        L_0x0059:
            r1 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x0064
        L_0x005d:
            r2 = move-exception
            r0 = r2
            r1 = -1
            r2 = 0
            goto L_0x007a
        L_0x0062:
            r2 = move-exception
            r0 = r2
        L_0x0064:
            r2 = -1
        L_0x0065:
            java.util.concurrent.atomic.AtomicInteger r3 = r9.f5807e     // Catch:{ all -> 0x0076 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0076 }
            r9.mo7052a(r0)     // Catch:{ all -> 0x0076 }
            r9.m8852h()
            long r0 = (long) r1
            long r2 = (long) r2
            r9.m8846b(r0, r2)
        L_0x0075:
            return
        L_0x0076:
            r0 = move-exception
            r8 = r2
            r2 = r1
            r1 = r8
        L_0x007a:
            r9.m8852h()
            long r2 = (long) r2
            long r4 = (long) r1
            r9.m8846b(r2, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p073r.p075b.C1778k.m8849e():void");
    }

    /* renamed from: f */
    private void m8850f() {
        synchronized (this.f5806d) {
            if (!m8851g() && this.f5804b.mo7014a() == this.f5803a.mo7043a()) {
                this.f5804b.mo7018c();
            }
        }
    }

    /* renamed from: g */
    private boolean m8851g() {
        return Thread.currentThread().isInterrupted() || this.f5809g;
    }

    /* renamed from: h */
    private void m8852h() {
        try {
            this.f5803a.mo7046b();
        } catch (C1781l e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error closing source ");
            sb.append(this.f5803a);
            mo7052a((Throwable) new C1781l(sb.toString(), e));
        }
    }

    /* renamed from: a */
    public int mo7049a(byte[] bArr, long j, int i) {
        C1782m.m8861a(bArr, j, i);
        while (!this.f5804b.mo7019d() && ((long) this.f5804b.mo7014a()) < ((long) i) + j && !this.f5809g) {
            m8847c();
            m8848d();
            m8845b();
        }
        int a = this.f5804b.mo7015a(bArr, j, i);
        if (this.f5804b.mo7019d() && this.f5810h != 100) {
            this.f5810h = 100;
            mo7030a(100);
        }
        return a;
    }

    /* renamed from: a */
    public void mo7050a() {
        synchronized (this.f5806d) {
            String str = "ProxyCache";
            StringBuilder sb = new StringBuilder();
            sb.append("Shutdown proxy for ");
            sb.append(this.f5803a);
            Log.d(str, sb.toString());
            try {
                this.f5809g = true;
                if (this.f5808f != null) {
                    this.f5808f.interrupt();
                }
                this.f5804b.mo7017b();
            } catch (C1781l e) {
                mo7052a((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7030a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7051a(long j, long j2) {
        boolean z = false;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)) == 0 ? 100 : (int) ((j * 100) / j2);
        boolean z2 = i != this.f5810h;
        if (j2 >= 0) {
            z = true;
        }
        if (z && z2) {
            mo7030a(i);
        }
        this.f5810h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7052a(Throwable th) {
        if (th instanceof C1776i) {
            Log.d("ProxyCache", "ProxyCache is interrupted");
        } else {
            Log.e("ProxyCache", "ProxyCache error", th);
        }
    }
}
