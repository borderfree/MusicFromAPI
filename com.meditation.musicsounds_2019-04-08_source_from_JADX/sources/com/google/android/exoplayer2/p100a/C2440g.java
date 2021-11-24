package com.google.android.exoplayer2.p100a;

import com.google.android.exoplayer2.p100a.C2438e;
import com.google.android.exoplayer2.p100a.C2439f;
import com.google.android.exoplayer2.p102c.C2488a;
import java.lang.Exception;
import java.util.LinkedList;

/* renamed from: com.google.android.exoplayer2.a.g */
public abstract class C2440g<I extends C2438e, O extends C2439f, E extends Exception> implements C2436c<I, O, E> {

    /* renamed from: a */
    private final Thread f7793a;

    /* renamed from: b */
    private final Object f7794b = new Object();

    /* renamed from: c */
    private final LinkedList<I> f7795c = new LinkedList<>();

    /* renamed from: d */
    private final LinkedList<O> f7796d = new LinkedList<>();

    /* renamed from: e */
    private final I[] f7797e;

    /* renamed from: f */
    private final O[] f7798f;

    /* renamed from: g */
    private int f7799g;

    /* renamed from: h */
    private int f7800h;

    /* renamed from: i */
    private I f7801i;

    /* renamed from: j */
    private E f7802j;

    /* renamed from: k */
    private boolean f7803k;

    /* renamed from: l */
    private boolean f7804l;

    /* renamed from: m */
    private int f7805m;

    protected C2440g(I[] iArr, O[] oArr) {
        this.f7797e = iArr;
        this.f7799g = iArr.length;
        for (int i = 0; i < this.f7799g; i++) {
            this.f7797e[i] = mo8667g();
        }
        this.f7798f = oArr;
        this.f7800h = oArr.length;
        for (int i2 = 0; i2 < this.f7800h; i2++) {
            this.f7798f[i2] = mo8668h();
        }
        this.f7793a = new Thread() {
            public void run() {
                C2440g.this.m11397k();
            }
        };
        this.f7793a.start();
    }

    /* renamed from: b */
    private void m11393b(I i) {
        i.mo8641a();
        I[] iArr = this.f7797e;
        int i2 = this.f7799g;
        this.f7799g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    private void m11394b(O o) {
        o.mo8641a();
        O[] oArr = this.f7798f;
        int i = this.f7800h;
        this.f7800h = i + 1;
        oArr[i] = o;
    }

    /* renamed from: i */
    private void mo9431i() {
        if (this.f7802j != null) {
            throw this.f7802j;
        }
    }

    /* renamed from: j */
    private void mo9432j() {
        if (m11399m()) {
            this.f7794b.notify();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m11397k() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m11398l());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.mo8645c() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.mo8643b(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.mo8648g_() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.mo8643b(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        r6.f7802j = mo8661a(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r6.f7802j == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r0 = r6.f7794b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r4 = r6.f7794b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        if (r6.f7803k == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
        m11394b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0068, code lost:
        if (r3.mo8648g_() == false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006a, code lost:
        r6.f7805m++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        r3.f7792b = r6.f7805m;
        r6.f7805m = 0;
        r6.f7796d.addLast(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
        m11393b((I) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007e, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007f, code lost:
        return true;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m11398l() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f7794b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f7804l     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.m11399m()     // Catch:{ all -> 0x0083 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f7794b     // Catch:{ all -> 0x0083 }
            r1.wait()     // Catch:{ all -> 0x0083 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f7804l     // Catch:{ all -> 0x0083 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            return r2
        L_0x001a:
            java.util.LinkedList<I> r1 = r6.f7795c     // Catch:{ all -> 0x0083 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0083 }
            com.google.android.exoplayer2.a.e r1 = (com.google.android.exoplayer2.p100a.C2438e) r1     // Catch:{ all -> 0x0083 }
            O[] r3 = r6.f7798f     // Catch:{ all -> 0x0083 }
            int r4 = r6.f7800h     // Catch:{ all -> 0x0083 }
            r5 = 1
            int r4 = r4 - r5
            r6.f7800h = r4     // Catch:{ all -> 0x0083 }
            r3 = r3[r4]     // Catch:{ all -> 0x0083 }
            boolean r4 = r6.f7803k     // Catch:{ all -> 0x0083 }
            r6.f7803k = r2     // Catch:{ all -> 0x0083 }
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            boolean r0 = r1.mo8645c()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.mo8643b(r0)
            goto L_0x0059
        L_0x003c:
            boolean r0 = r1.mo8648g_()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo8643b(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.mo8661a(r1, r3, r4)
            r6.f7802j = r0
            E r0 = r6.f7802j
            if (r0 == 0) goto L_0x0059
            java.lang.Object r0 = r6.f7794b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return r2
        L_0x0056:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r1
        L_0x0059:
            java.lang.Object r4 = r6.f7794b
            monitor-enter(r4)
            boolean r0 = r6.f7803k     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0064
        L_0x0060:
            r6.m11394b((O) r3)     // Catch:{ all -> 0x0080 }
            goto L_0x007b
        L_0x0064:
            boolean r0 = r3.mo8648g_()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0070
            int r0 = r6.f7805m     // Catch:{ all -> 0x0080 }
            int r0 = r0 + r5
            r6.f7805m = r0     // Catch:{ all -> 0x0080 }
            goto L_0x0060
        L_0x0070:
            int r0 = r6.f7805m     // Catch:{ all -> 0x0080 }
            r3.f7792b = r0     // Catch:{ all -> 0x0080 }
            r6.f7805m = r2     // Catch:{ all -> 0x0080 }
            java.util.LinkedList<O> r0 = r6.f7796d     // Catch:{ all -> 0x0080 }
            r0.addLast(r3)     // Catch:{ all -> 0x0080 }
        L_0x007b:
            r6.m11393b((I) r1)     // Catch:{ all -> 0x0080 }
            monitor-exit(r4)     // Catch:{ all -> 0x0080 }
            return r5
        L_0x0080:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0080 }
            throw r0
        L_0x0083:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0083 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p100a.C2440g.m11398l():boolean");
    }

    /* renamed from: m */
    private boolean m11399m() {
        return !this.f7795c.isEmpty() && this.f7800h > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo8661a(I i, O o, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8662a(int i) {
        C2488a.m11668b(this.f7799g == this.f7797e.length);
        for (I e : this.f7797e) {
            e.mo8657e(i);
        }
    }

    /* renamed from: a */
    public final void mo8652a(I i) {
        synchronized (this.f7794b) {
            mo9431i();
            C2488a.m11666a(i == this.f7801i);
            this.f7795c.addLast(i);
            mo9432j();
            this.f7801i = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8664a(O o) {
        synchronized (this.f7794b) {
            m11394b(o);
            mo9432j();
        }
    }

    /* renamed from: c */
    public final void mo8654c() {
        synchronized (this.f7794b) {
            this.f7803k = true;
            this.f7805m = 0;
            if (this.f7801i != null) {
                m11393b(this.f7801i);
                this.f7801i = null;
            }
            while (!this.f7795c.isEmpty()) {
                m11393b((I) (C2438e) this.f7795c.removeFirst());
            }
            while (!this.f7796d.isEmpty()) {
                m11394b((O) (C2439f) this.f7796d.removeFirst());
            }
        }
    }

    /* renamed from: d */
    public void mo8655d() {
        synchronized (this.f7794b) {
            this.f7804l = true;
            this.f7794b.notify();
        }
        try {
            this.f7793a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: e */
    public final I mo8651a() {
        I i;
        I i2;
        synchronized (this.f7794b) {
            mo9431i();
            C2488a.m11668b(this.f7801i == null);
            if (this.f7799g == 0) {
                i = null;
            } else {
                I[] iArr = this.f7797e;
                int i3 = this.f7799g - 1;
                this.f7799g = i3;
                i = iArr[i3];
            }
            this.f7801i = i;
            i2 = this.f7801i;
        }
        return i2;
    }

    /* renamed from: f */
    public final O mo8653b() {
        synchronized (this.f7794b) {
            mo9431i();
            if (this.f7796d.isEmpty()) {
                return null;
            }
            O o = (C2439f) this.f7796d.removeFirst();
            return o;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract I mo8667g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract O mo8668h();
}
