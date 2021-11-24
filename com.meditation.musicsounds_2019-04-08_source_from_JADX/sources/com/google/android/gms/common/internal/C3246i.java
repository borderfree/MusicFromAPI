package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C3040d.C3042b;
import com.google.android.gms.common.api.C3040d.C3043c;
import com.google.android.gms.internal.p128c.C4164e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.i */
public final class C3246i implements Callback {

    /* renamed from: a */
    private final C3247a f11093a;

    /* renamed from: b */
    private final ArrayList<C3042b> f11094b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C3042b> f11095c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<C3043c> f11096d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f11097e = false;

    /* renamed from: f */
    private final AtomicInteger f11098f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f11099g = false;

    /* renamed from: h */
    private final Handler f11100h;

    /* renamed from: i */
    private final Object f11101i = new Object();

    /* renamed from: com.google.android.gms.common.internal.i$a */
    public interface C3247a {
        /* renamed from: a */
        Bundle mo10910a();

        /* renamed from: h */
        boolean mo10911h();
    }

    public C3246i(Looper looper, C3247a aVar) {
        this.f11093a = aVar;
        this.f11100h = new C4164e(looper, this);
    }

    /* renamed from: a */
    public final void mo11263a() {
        this.f11097e = false;
        this.f11098f.incrementAndGet();
    }

    /* renamed from: a */
    public final void mo11264a(int i) {
        C3266s.m14920a(Looper.myLooper() == this.f11100h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f11100h.removeMessages(1);
        synchronized (this.f11101i) {
            this.f11099g = true;
            ArrayList arrayList = new ArrayList(this.f11094b);
            int i2 = this.f11098f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                C3042b bVar = (C3042b) obj;
                if (!this.f11097e || this.f11098f.get() != i2) {
                    break;
                } else if (this.f11094b.contains(bVar)) {
                    bVar.mo10863a(i);
                }
            }
            this.f11095c.clear();
            this.f11099g = false;
        }
    }

    /* renamed from: a */
    public final void mo11265a(Bundle bundle) {
        boolean z = true;
        C3266s.m14920a(Looper.myLooper() == this.f11100h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f11101i) {
            C3266s.m14919a(!this.f11099g);
            this.f11100h.removeMessages(1);
            this.f11099g = true;
            if (this.f11095c.size() != 0) {
                z = false;
            }
            C3266s.m14919a(z);
            ArrayList arrayList = new ArrayList(this.f11094b);
            int i = this.f11098f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                C3042b bVar = (C3042b) obj;
                if (!this.f11097e || !this.f11093a.mo10911h() || this.f11098f.get() != i) {
                    break;
                } else if (!this.f11095c.contains(bVar)) {
                    bVar.mo10864a(bundle);
                }
            }
            this.f11095c.clear();
            this.f11099g = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11266a(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r7.f11100h
            android.os.Looper r1 = r1.getLooper()
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            com.google.android.gms.common.internal.C3266s.m14920a(r0, r1)
            android.os.Handler r0 = r7.f11100h
            r0.removeMessages(r3)
            java.lang.Object r0 = r7.f11101i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0058 }
            java.util.ArrayList<com.google.android.gms.common.api.d$c> r3 = r7.f11096d     // Catch:{ all -> 0x0058 }
            r1.<init>(r3)     // Catch:{ all -> 0x0058 }
            java.util.concurrent.atomic.AtomicInteger r3 = r7.f11098f     // Catch:{ all -> 0x0058 }
            int r3 = r3.get()     // Catch:{ all -> 0x0058 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0058 }
            int r4 = r1.size()     // Catch:{ all -> 0x0058 }
        L_0x0031:
            if (r2 >= r4) goto L_0x0056
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x0058 }
            int r2 = r2 + 1
            com.google.android.gms.common.api.d$c r5 = (com.google.android.gms.common.api.C3040d.C3043c) r5     // Catch:{ all -> 0x0058 }
            boolean r6 = r7.f11097e     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x0054
            java.util.concurrent.atomic.AtomicInteger r6 = r7.f11098f     // Catch:{ all -> 0x0058 }
            int r6 = r6.get()     // Catch:{ all -> 0x0058 }
            if (r6 == r3) goto L_0x0048
            goto L_0x0054
        L_0x0048:
            java.util.ArrayList<com.google.android.gms.common.api.d$c> r6 = r7.f11096d     // Catch:{ all -> 0x0058 }
            boolean r6 = r6.contains(r5)     // Catch:{ all -> 0x0058 }
            if (r6 == 0) goto L_0x0031
            r5.mo10865a(r8)     // Catch:{ all -> 0x0058 }
            goto L_0x0031
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            return
        L_0x0058:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3246i.mo11266a(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: a */
    public final void mo11267a(C3042b bVar) {
        C3266s.m14913a(bVar);
        synchronized (this.f11101i) {
            if (this.f11094b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f11094b.add(bVar);
            }
        }
        if (this.f11093a.mo10911h()) {
            this.f11100h.sendMessage(this.f11100h.obtainMessage(1, bVar));
        }
    }

    /* renamed from: a */
    public final void mo11268a(C3043c cVar) {
        C3266s.m14913a(cVar);
        synchronized (this.f11101i) {
            if (this.f11096d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f11096d.add(cVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo11269b() {
        this.f11097e = true;
    }

    /* renamed from: b */
    public final void mo11270b(C3043c cVar) {
        C3266s.m14913a(cVar);
        synchronized (this.f11101i) {
            if (!this.f11096d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C3042b bVar = (C3042b) message.obj;
            synchronized (this.f11101i) {
                if (this.f11097e && this.f11093a.mo10911h() && this.f11094b.contains(bVar)) {
                    bVar.mo10864a(this.f11093a.mo10910a());
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
