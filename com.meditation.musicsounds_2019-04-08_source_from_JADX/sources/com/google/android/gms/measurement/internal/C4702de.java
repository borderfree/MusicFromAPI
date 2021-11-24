package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3227d.C3228a;
import com.google.android.gms.common.internal.C3227d.C3229b;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.stats.C3285a;

/* renamed from: com.google.android.gms.measurement.internal.de */
public final class C4702de implements ServiceConnection, C3228a, C3229b {

    /* renamed from: a */
    final /* synthetic */ C4689cs f16961a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f16962b;

    /* renamed from: c */
    private volatile C4766q f16963c;

    protected C4702de(C4689cs csVar) {
        this.f16961a = csVar;
    }

    /* renamed from: a */
    public final void mo15482a() {
        if (this.f16963c != null && (this.f16963c.mo11212h() || this.f16963c.mo11213i())) {
            this.f16963c.mo11211g();
        }
        this.f16963c = null;
    }

    /* renamed from: a */
    public final void mo11230a(int i) {
        C3266s.m14922b("MeasurementServiceConnection.onConnectionSuspended");
        this.f16961a.mo15253r().mo15854w().mo15858a("Service connection suspended");
        this.f16961a.mo15252q().mo15314a((Runnable) new C4706di(this));
    }

    /* renamed from: a */
    public final void mo15483a(Intent intent) {
        this.f16961a.mo15239d();
        Context n = this.f16961a.mo15249n();
        C3285a a = C3285a.m15014a();
        synchronized (this) {
            if (this.f16962b) {
                this.f16961a.mo15253r().mo15855x().mo15858a("Connection attempt already in progress");
                return;
            }
            this.f16961a.mo15253r().mo15855x().mo15858a("Using local app measurement service");
            this.f16962b = true;
            a.mo11312a(n, intent, this.f16961a.f16904a, 129);
        }
    }

    /* renamed from: a */
    public final void mo11231a(Bundle bundle) {
        C3266s.m14922b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f16961a.mo15252q().mo15314a((Runnable) new C4705dh(this, (C4758i) this.f16963c.mo11227w()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f16963c = null;
                this.f16962b = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo11160a(ConnectionResult connectionResult) {
        C3266s.m14922b("MeasurementServiceConnection.onConnectionFailed");
        C4767r d = this.f16961a.f16825q.mo15337d();
        if (d != null) {
            d.mo15849i().mo15859a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f16962b = false;
            this.f16963c = null;
        }
        this.f16961a.mo15252q().mo15314a((Runnable) new C4707dj(this));
    }

    /* renamed from: b */
    public final void mo15484b() {
        this.f16961a.mo15239d();
        Context n = this.f16961a.mo15249n();
        synchronized (this) {
            if (this.f16962b) {
                this.f16961a.mo15253r().mo15855x().mo15858a("Connection attempt already in progress");
            } else if (this.f16963c == null || (!this.f16963c.mo11213i() && !this.f16963c.mo11212h())) {
                this.f16963c = new C4766q(n, Looper.getMainLooper(), this, this);
                this.f16961a.mo15253r().mo15855x().mo15858a("Connecting to remote service");
                this.f16962b = true;
                this.f16963c.mo11221q();
            } else {
                this.f16961a.mo15253r().mo15855x().mo15858a("Already awaiting connection attempt");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f16961a.mo15253r().mo15852u_().mo15858a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C3266s.m14922b(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001f
            r3.f16962b = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.cs r4 = r3.f16961a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r r4 = r4.mo15253r()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.t r4 = r4.mo15852u_()     // Catch:{ all -> 0x001c }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo15858a(r5)     // Catch:{ all -> 0x001c }
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x001c:
            r4 = move-exception
            goto L_0x009a
        L_0x001f:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0063 }
            if (r2 == 0) goto L_0x0053
            if (r5 != 0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0063 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C4758i     // Catch:{ RemoteException -> 0x0063 }
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.measurement.internal.i r1 = (com.google.android.gms.measurement.internal.C4758i) r1     // Catch:{ RemoteException -> 0x0063 }
        L_0x003b:
            r0 = r1
            goto L_0x0043
        L_0x003d:
            com.google.android.gms.measurement.internal.k r1 = new com.google.android.gms.measurement.internal.k     // Catch:{ RemoteException -> 0x0063 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x003b
        L_0x0043:
            com.google.android.gms.measurement.internal.cs r5 = r3.f16961a     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo15253r()     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo15855x()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo15858a(r1)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0072
        L_0x0053:
            com.google.android.gms.measurement.internal.cs r5 = r3.f16961a     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.r r5 = r5.mo15253r()     // Catch:{ RemoteException -> 0x0063 }
            com.google.android.gms.measurement.internal.t r5 = r5.mo15852u_()     // Catch:{ RemoteException -> 0x0063 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo15859a(r2, r1)     // Catch:{ RemoteException -> 0x0063 }
            goto L_0x0072
        L_0x0063:
            com.google.android.gms.measurement.internal.cs r5 = r3.f16961a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.r r5 = r5.mo15253r()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.t r5 = r5.mo15852u_()     // Catch:{ all -> 0x001c }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo15858a(r1)     // Catch:{ all -> 0x001c }
        L_0x0072:
            if (r0 != 0) goto L_0x008a
            r3.f16962b = r4     // Catch:{ all -> 0x001c }
            com.google.android.gms.common.stats.a r4 = com.google.android.gms.common.stats.C3285a.m15014a()     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.cs r5 = r3.f16961a     // Catch:{ IllegalArgumentException -> 0x0098 }
            android.content.Context r5 = r5.mo15249n()     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.cs r0 = r3.f16961a     // Catch:{ IllegalArgumentException -> 0x0098 }
            com.google.android.gms.measurement.internal.de r0 = r0.f16904a     // Catch:{ IllegalArgumentException -> 0x0098 }
            r4.mo11311a(r5, r0)     // Catch:{ IllegalArgumentException -> 0x0098 }
            goto L_0x0098
        L_0x008a:
            com.google.android.gms.measurement.internal.cs r4 = r3.f16961a     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.ar r4 = r4.mo15252q()     // Catch:{ all -> 0x001c }
            com.google.android.gms.measurement.internal.df r5 = new com.google.android.gms.measurement.internal.df     // Catch:{ all -> 0x001c }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001c }
            r4.mo15314a(r5)     // Catch:{ all -> 0x001c }
        L_0x0098:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            return
        L_0x009a:
            monitor-exit(r3)     // Catch:{ all -> 0x001c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4702de.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C3266s.m14922b("MeasurementServiceConnection.onServiceDisconnected");
        this.f16961a.mo15253r().mo15854w().mo15858a("Service disconnected");
        this.f16961a.mo15252q().mo15314a((Runnable) new C4704dg(this, componentName));
    }
}
