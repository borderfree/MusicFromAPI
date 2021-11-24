package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C3040d;
import com.google.android.gms.common.api.C3044e;
import com.google.android.gms.common.api.C3044e.C3045a;
import com.google.android.gms.common.api.C3048g;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.C3050i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3255n;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.internal.p128c.C4164e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends C3049h> extends C3044e<R> {

    /* renamed from: a */
    static final ThreadLocal<Boolean> f10621a = new C3120ci();

    /* renamed from: b */
    private final Object f10622b;

    /* renamed from: c */
    private final C3051a<R> f10623c;

    /* renamed from: d */
    private final WeakReference<C3040d> f10624d;

    /* renamed from: e */
    private final CountDownLatch f10625e;

    /* renamed from: f */
    private final ArrayList<C3045a> f10626f;

    /* renamed from: g */
    private C3050i<? super R> f10627g;

    /* renamed from: h */
    private final AtomicReference<C3105bx> f10628h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public R f10629i;

    /* renamed from: j */
    private Status f10630j;

    /* renamed from: k */
    private volatile boolean f10631k;

    /* renamed from: l */
    private boolean f10632l;

    /* renamed from: m */
    private boolean f10633m;
    @KeepName
    private C3052b mResultGuardian;

    /* renamed from: n */
    private C3255n f10634n;

    /* renamed from: o */
    private volatile C3099br<R> f10635o;

    /* renamed from: p */
    private boolean f10636p;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C3051a<R extends C3049h> extends C4164e {
        public C3051a() {
            this(Looper.getMainLooper());
        }

        public C3051a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo10881a(C3050i<? super R> iVar, R r) {
            sendMessage(obtainMessage(1, new Pair(iVar, r)));
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Pair pair = (Pair) message.obj;
                    C3050i iVar = (C3050i) pair.first;
                    C3049h hVar = (C3049h) pair.second;
                    try {
                        iVar.mo10874a(hVar);
                        return;
                    } catch (RuntimeException e) {
                        BasePendingResult.m14084c(hVar);
                        throw e;
                    }
                case 2:
                    ((BasePendingResult) message.obj).mo10877c(Status.f10573d);
                    return;
                default:
                    int i = message.what;
                    StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(i);
                    Log.wtf("BasePendingResult", sb.toString(), new Exception());
                    return;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C3052b {
        private C3052b() {
        }

        /* synthetic */ C3052b(BasePendingResult basePendingResult, C3120ci ciVar) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.m14084c(BasePendingResult.this.f10629i);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f10622b = new Object();
        this.f10625e = new CountDownLatch(1);
        this.f10626f = new ArrayList<>();
        this.f10628h = new AtomicReference<>();
        this.f10636p = false;
        this.f10623c = new C3051a<>(Looper.getMainLooper());
        this.f10624d = new WeakReference<>(null);
    }

    protected BasePendingResult(C3040d dVar) {
        this.f10622b = new Object();
        this.f10625e = new CountDownLatch(1);
        this.f10626f = new ArrayList<>();
        this.f10628h = new AtomicReference<>();
        this.f10636p = false;
        this.f10623c = new C3051a<>(dVar != null ? dVar.mo10848c() : Looper.getMainLooper());
        this.f10624d = new WeakReference<>(dVar);
    }

    /* renamed from: a */
    private final void mo10979a(R r) {
        this.f10629i = r;
        this.f10634n = null;
        this.f10625e.countDown();
        this.f10630j = this.f10629i.mo10791a();
        if (this.f10632l) {
            this.f10627g = null;
        } else if (this.f10627g != null) {
            this.f10623c.removeMessages(2);
            this.f10623c.mo10881a(this.f10627g, mo10983d());
        } else if (this.f10629i instanceof C3048g) {
            this.mResultGuardian = new C3052b(this, null);
        }
        ArrayList arrayList = this.f10626f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C3045a) obj).mo10872a(this.f10630j);
        }
        this.f10626f.clear();
    }

    /* renamed from: c */
    public static void m14084c(C3049h hVar) {
        if (hVar instanceof C3048g) {
            try {
                ((C3048g) hVar).mo10873a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(hVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: d */
    private final R mo10983d() {
        R r;
        synchronized (this.f10622b) {
            C3266s.m14920a(!this.f10631k, (Object) "Result has already been consumed.");
            C3266s.m14920a(mo10878f(), (Object) "Result is not ready.");
            r = this.f10629i;
            this.f10629i = null;
            this.f10627g = null;
            this.f10631k = true;
        }
        C3105bx bxVar = (C3105bx) this.f10628h.getAndSet(null);
        if (bxVar != null) {
            bxVar.mo10976a(this);
        }
        return r;
    }

    /* renamed from: a */
    public final R mo10866a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C3266s.m14926c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C3266s.m14920a(!this.f10631k, (Object) "Result has already been consumed.");
        if (this.f10635o != null) {
            z = false;
        }
        C3266s.m14920a(z, (Object) "Cannot await if then() has been called.");
        try {
            if (!this.f10625e.await(j, timeUnit)) {
                mo10877c(Status.f10573d);
            }
        } catch (InterruptedException unused) {
            mo10877c(Status.f10571b);
        }
        C3266s.m14920a(mo10878f(), (Object) "Result is not ready.");
        return mo10983d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo10740a(Status status);

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10867a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f10622b
            monitor-enter(r0)
            boolean r1 = r2.f10632l     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.f10631k     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x000c
            goto L_0x0028
        L_0x000c:
            com.google.android.gms.common.internal.n r1 = r2.f10634n     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.common.internal.n r1 = r2.f10634n     // Catch:{ RemoteException -> 0x0015 }
            r1.mo11284a()     // Catch:{ RemoteException -> 0x0015 }
        L_0x0015:
            R r1 = r2.f10629i     // Catch:{ all -> 0x002a }
            m14084c(r1)     // Catch:{ all -> 0x002a }
            r1 = 1
            r2.f10632l = r1     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f10574e     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.h r1 = r2.mo10740a(r1)     // Catch:{ all -> 0x002a }
            r2.mo10979a((R) r1)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0028:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo10867a():void");
    }

    /* renamed from: a */
    public final void mo10868a(C3045a aVar) {
        C3266s.m14924b(aVar != null, "Callback cannot be null.");
        synchronized (this.f10622b) {
            if (mo10878f()) {
                aVar.mo10872a(this.f10630j);
            } else {
                this.f10626f.add(aVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10869a(com.google.android.gms.common.api.C3050i<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f10622b
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000c
            r5 = 0
            r4.f10627g = r5     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x000a:
            r5 = move-exception
            goto L_0x003c
        L_0x000c:
            boolean r1 = r4.f10631k     // Catch:{ all -> 0x000a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            com.google.android.gms.common.internal.C3266s.m14920a(r1, r3)     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.internal.br<R> r1 = r4.f10635o     // Catch:{ all -> 0x000a }
            if (r1 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            com.google.android.gms.common.internal.C3266s.m14920a(r2, r1)     // Catch:{ all -> 0x000a }
            boolean r1 = r4.mo10870b()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0028
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0028:
            boolean r1 = r4.mo10878f()     // Catch:{ all -> 0x000a }
            if (r1 == 0) goto L_0x0038
            com.google.android.gms.common.api.internal.BasePendingResult$a<R> r1 = r4.f10623c     // Catch:{ all -> 0x000a }
            com.google.android.gms.common.api.h r2 = r4.mo10983d()     // Catch:{ all -> 0x000a }
            r1.mo10881a(r5, r2)     // Catch:{ all -> 0x000a }
            goto L_0x003a
        L_0x0038:
            r4.f10627g = r5     // Catch:{ all -> 0x000a }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo10869a(com.google.android.gms.common.api.i):void");
    }

    /* renamed from: a */
    public final void mo10875a(C3105bx bxVar) {
        this.f10628h.set(bxVar);
    }

    /* renamed from: b */
    public final void mo10876b(R r) {
        synchronized (this.f10622b) {
            if (this.f10633m || this.f10632l) {
                m14084c((C3049h) r);
                return;
            }
            mo10878f();
            C3266s.m14920a(!mo10878f(), (Object) "Results have already been set");
            C3266s.m14920a(!this.f10631k, (Object) "Result has already been consumed");
            mo10979a(r);
        }
    }

    /* renamed from: b */
    public boolean mo10870b() {
        boolean z;
        synchronized (this.f10622b) {
            z = this.f10632l;
        }
        return z;
    }

    /* renamed from: c */
    public final Integer mo10871c() {
        return null;
    }

    /* renamed from: c */
    public final void mo10877c(Status status) {
        synchronized (this.f10622b) {
            if (!mo10878f()) {
                mo10876b(mo10740a(status));
                this.f10633m = true;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo10878f() {
        return this.f10625e.getCount() == 0;
    }

    /* renamed from: g */
    public final boolean mo10879g() {
        boolean b;
        synchronized (this.f10622b) {
            if (((C3040d) this.f10624d.get()) == null || !this.f10636p) {
                mo10867a();
            }
            b = mo10870b();
        }
        return b;
    }

    /* renamed from: h */
    public final void mo10880h() {
        this.f10636p = this.f10636p || ((Boolean) f10621a.get()).booleanValue();
    }
}
