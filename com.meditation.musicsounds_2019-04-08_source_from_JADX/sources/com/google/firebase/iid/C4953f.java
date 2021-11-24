package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.C3285a;
import com.google.android.gms.internal.p130e.C4172a;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.iid.f */
final class C4953f implements ServiceConnection {
    @GuardedBy("this")

    /* renamed from: a */
    int f17754a;

    /* renamed from: b */
    final Messenger f17755b;

    /* renamed from: c */
    C4958k f17756c;
    @GuardedBy("this")

    /* renamed from: d */
    final Queue<C4960m<?>> f17757d;
    @GuardedBy("this")

    /* renamed from: e */
    final SparseArray<C4960m<?>> f17758e;

    /* renamed from: f */
    final /* synthetic */ C4951d f17759f;

    private C4953f(C4951d dVar) {
        this.f17759f = dVar;
        this.f17754a = 0;
        this.f17755b = new Messenger(new C4172a(Looper.getMainLooper(), new C4954g(this)));
        this.f17757d = new ArrayDeque();
        this.f17758e = new SparseArray<>();
    }

    /* renamed from: c */
    private final void m24622c() {
        this.f17759f.f17751c.execute(new C4956i(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo16218a() {
        if (this.f17754a == 2 && this.f17757d.isEmpty() && this.f17758e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f17754a = 3;
            C3285a.m15014a().mo11311a(this.f17759f.f17750b, this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo16219a(int i) {
        C4960m mVar = (C4960m) this.f17758e.get(i);
        if (mVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f17758e.remove(i);
            mVar.mo16233a(new zzal(3, "Timed out waiting for response"));
            mo16218a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo16220a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "MessengerIpcClient";
            String str3 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        switch (this.f17754a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f17754a = 4;
                C3285a.m15014a().mo11311a(this.f17759f.f17750b, this);
                zzal zzal = new zzal(i, str);
                for (C4960m a : this.f17757d) {
                    a.mo16233a(zzal);
                }
                this.f17757d.clear();
                for (int i2 = 0; i2 < this.f17758e.size(); i2++) {
                    ((C4960m) this.f17758e.valueAt(i2)).mo16233a(zzal);
                }
                this.f17758e.clear();
                return;
            case 3:
                this.f17754a = 4;
                return;
            case 4:
                return;
            default:
                int i3 = this.f17754a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.m.a(com.google.firebase.iid.zzal):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.firebase.iid.m.a(android.os.Bundle):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.mo16233a(new com.google.firebase.iid.zzal(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.mo16231a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16221a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Received response to request: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r2 = r3.toString()
            android.util.Log.d(r1, r2)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.m<?>> r1 = r4.f17758e     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            com.google.firebase.iid.m r1 = (com.google.firebase.iid.C4960m) r1     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            r1 = 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r3.<init>(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Received response for unknown request: "
            r3.append(r1)     // Catch:{ all -> 0x006f }
            r3.append(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x006f }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0049:
            android.util.SparseArray<com.google.firebase.iid.m<?>> r3 = r4.f17758e     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.mo16218a()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x006b
            com.google.firebase.iid.zzal r5 = new com.google.firebase.iid.zzal
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo16233a(r5)
            goto L_0x006e
        L_0x006b:
            r1.mo16231a(r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4953f.mo16221a(android.os.Message):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo16222a(com.google.firebase.iid.C4960m r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f17754a     // Catch:{ all -> 0x008e }
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0017;
                case 2: goto L_0x000d;
                case 3: goto L_0x000b;
                case 4: goto L_0x000b;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x008e }
        L_0x0008:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008e }
            goto L_0x0075
        L_0x000b:
            monitor-exit(r5)
            return r1
        L_0x000d:
            java.util.Queue<com.google.firebase.iid.m<?>> r0 = r5.f17757d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            r5.m24622c()     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r2
        L_0x0017:
            java.util.Queue<com.google.firebase.iid.m<?>> r0 = r5.f17757d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            monitor-exit(r5)
            return r2
        L_0x001e:
            java.util.Queue<com.google.firebase.iid.m<?>> r0 = r5.f17757d     // Catch:{ all -> 0x008e }
            r0.add(r6)     // Catch:{ all -> 0x008e }
            int r6 = r5.f17754a     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0029
            r6 = 1
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            com.google.android.gms.common.internal.C3266s.m14919a(r6)     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "MessengerIpcClient"
            r0 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r0)     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x003d
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x008e }
        L_0x003d:
            r5.f17754a = r2     // Catch:{ all -> 0x008e }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x008e }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C3285a.m15014a()     // Catch:{ all -> 0x008e }
            com.google.firebase.iid.d r3 = r5.f17759f     // Catch:{ all -> 0x008e }
            android.content.Context r3 = r3.f17750b     // Catch:{ all -> 0x008e }
            boolean r6 = r0.mo11312a(r3, r6, r5, r2)     // Catch:{ all -> 0x008e }
            if (r6 != 0) goto L_0x0061
            java.lang.String r6 = "Unable to bind to service"
            r5.mo16220a(r1, r6)     // Catch:{ all -> 0x008e }
            goto L_0x0073
        L_0x0061:
            com.google.firebase.iid.d r6 = r5.f17759f     // Catch:{ all -> 0x008e }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f17751c     // Catch:{ all -> 0x008e }
            com.google.firebase.iid.h r0 = new com.google.firebase.iid.h     // Catch:{ all -> 0x008e }
            r0.<init>(r5)     // Catch:{ all -> 0x008e }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x008e }
            r6.schedule(r0, r3, r1)     // Catch:{ all -> 0x008e }
        L_0x0073:
            monitor-exit(r5)
            return r2
        L_0x0075:
            int r0 = r5.f17754a     // Catch:{ all -> 0x008e }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            r2.<init>(r1)     // Catch:{ all -> 0x008e }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x008e }
            r2.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x008e }
            r6.<init>(r0)     // Catch:{ all -> 0x008e }
            throw r6     // Catch:{ all -> 0x008e }
        L_0x008e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4953f.mo16222a(com.google.firebase.iid.m):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo16223b() {
        if (this.f17754a == 1) {
            mo16220a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        if (iBinder == null) {
            mo16220a(0, "Null service connection");
            return;
        }
        try {
            this.f17756c = new C4958k(iBinder);
            this.f17754a = 2;
            m24622c();
        } catch (RemoteException e) {
            mo16220a(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        mo16220a(2, "Service disconnected");
    }
}
