package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.p125a.C3294b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.firebase.iid.ai */
public final class C4931ai implements ServiceConnection {

    /* renamed from: a */
    private final Context f17711a;

    /* renamed from: b */
    private final Intent f17712b;

    /* renamed from: c */
    private final ScheduledExecutorService f17713c;

    /* renamed from: d */
    private final Queue<C4927ae> f17714d;

    /* renamed from: e */
    private C4929ag f17715e;

    /* renamed from: f */
    private boolean f17716f;

    public C4931ai(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C3294b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private C4931ai(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f17714d = new ArrayDeque();
        this.f17716f = false;
        this.f17711a = context.getApplicationContext();
        this.f17712b = new Intent(str).setPackage(this.f17711a.getPackageName());
        this.f17713c = scheduledExecutorService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m24556a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0011:
            java.util.Queue<com.google.firebase.iid.ae> r0 = r5.f17714d     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0028:
            com.google.firebase.iid.ag r0 = r5.f17715e     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0051
            com.google.firebase.iid.ag r0 = r5.f17715e     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0043:
            java.util.Queue<com.google.firebase.iid.ae> r0 = r5.f17714d     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00a7 }
            com.google.firebase.iid.ae r0 = (com.google.firebase.iid.C4927ae) r0     // Catch:{ all -> 0x00a7 }
            com.google.firebase.iid.ag r2 = r5.f17715e     // Catch:{ all -> 0x00a7 }
            r2.mo16189a(r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            r1 = 1
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = "EnhancedIntentService"
            boolean r2 = r5.f17716f     // Catch:{ all -> 0x00a7 }
            r2 = r2 ^ r1
            r3 = 39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r4.<init>(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "binder is dead. start connection? "
            r4.append(r3)     // Catch:{ all -> 0x00a7 }
            r4.append(r2)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x00a7 }
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0075:
            boolean r0 = r5.f17716f     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a3
            r5.f17716f = r1     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C3285a.m15014a()     // Catch:{ SecurityException -> 0x0095 }
            android.content.Context r1 = r5.f17711a     // Catch:{ SecurityException -> 0x0095 }
            android.content.Intent r2 = r5.f17712b     // Catch:{ SecurityException -> 0x0095 }
            r3 = 65
            boolean r0 = r0.mo11312a(r1, r2, r5, r3)     // Catch:{ SecurityException -> 0x0095 }
            if (r0 == 0) goto L_0x008d
            monitor-exit(r5)
            return
        L_0x008d:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r1 = "binding to the service failed"
            android.util.Log.e(r0, r1)     // Catch:{ SecurityException -> 0x0095 }
            goto L_0x009d
        L_0x0095:
            r0 = move-exception
            java.lang.String r1 = "EnhancedIntentService"
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x00a7 }
        L_0x009d:
            r0 = 0
            r5.f17716f = r0     // Catch:{ all -> 0x00a7 }
            r5.m24557b()     // Catch:{ all -> 0x00a7 }
        L_0x00a3:
            monitor-exit(r5)
            return
        L_0x00a5:
            monitor-exit(r5)
            return
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C4931ai.m24556a():void");
    }

    /* renamed from: b */
    private final void m24557b() {
        while (!this.f17714d.isEmpty()) {
            ((C4927ae) this.f17714d.poll()).mo16187a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo16191a(Intent intent, PendingResult pendingResult) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
        }
        this.f17714d.add(new C4927ae(intent, pendingResult, this.f17713c));
        m24556a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f17716f = false;
            this.f17715e = (C4929ag) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("EnhancedIntentService", sb.toString());
            }
            if (iBinder == null) {
                Log.e("EnhancedIntentService", "Null service connection");
                m24557b();
            } else {
                m24556a();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("EnhancedIntentService", sb.toString());
        }
        m24556a();
    }
}
