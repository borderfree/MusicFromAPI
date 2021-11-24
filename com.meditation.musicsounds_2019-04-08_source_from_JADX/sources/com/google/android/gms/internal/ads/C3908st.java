package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3227d.C3228a;
import com.google.android.gms.common.internal.C3227d.C3229b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.st */
final class C3908st implements C3228a, C3229b {

    /* renamed from: a */
    private C3909su f14935a;

    /* renamed from: b */
    private final String f14936b;

    /* renamed from: c */
    private final String f14937c;

    /* renamed from: d */
    private final LinkedBlockingQueue<C4110yz> f14938d;

    /* renamed from: e */
    private final HandlerThread f14939e = new HandlerThread("GassClient");

    public C3908st(Context context, String str, String str2) {
        this.f14936b = str;
        this.f14937c = str2;
        this.f14939e.start();
        this.f14935a = new C3909su(context, this.f14939e.getLooper(), this, this);
        this.f14938d = new LinkedBlockingQueue<>();
        this.f14935a.mo11221q();
    }

    /* renamed from: a */
    private final C3912sx m19857a() {
        try {
            return this.f14935a.mo10737e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private final void m19858b() {
        if (this.f14935a == null) {
            return;
        }
        if (this.f14935a.mo11212h() || this.f14935a.mo11213i()) {
            this.f14935a.mo11211g();
        }
    }

    /* renamed from: c */
    private static C4110yz m19859c() {
        C4110yz yzVar = new C4110yz();
        yzVar.f15145k = Long.valueOf(32768);
        return yzVar;
    }

    /* renamed from: a */
    public final void mo11230a(int i) {
        try {
            this.f14938d.put(m19859c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        m19858b();
        r3.f14939e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A[ExcHandler: all (r4v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11231a(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.sx r4 = r3.m19857a()
            if (r4 == 0) goto L_0x003a
            com.google.android.gms.internal.ads.zzatt r0 = new com.google.android.gms.internal.ads.zzatt     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r1 = r3.f14936b     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.lang.String r2 = r3.f14937c     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.zzatv r4 = r4.mo13680a(r0)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            com.google.android.gms.internal.ads.yz r4 = r4.mo13896a()     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.yz> r0 = r3.f14938d     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
            r0.put(r4)     // Catch:{ Throwable -> 0x0027, all -> 0x0025 }
        L_0x001c:
            r3.m19858b()
            android.os.HandlerThread r4 = r3.f14939e
            r4.quit()
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0031
        L_0x0027:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.yz> r4 = r3.f14938d     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            com.google.android.gms.internal.ads.yz r0 = m19859c()     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x0025 }
            goto L_0x001c
        L_0x0031:
            r3.m19858b()
            android.os.HandlerThread r0 = r3.f14939e
            r0.quit()
            throw r4
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3908st.mo11231a(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo11160a(ConnectionResult connectionResult) {
        try {
            this.f14938d.put(m19859c());
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: b */
    public final C4110yz mo13675b(int i) {
        C4110yz yzVar;
        try {
            yzVar = (C4110yz) this.f14938d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            yzVar = null;
        }
        return yzVar == null ? m19859c() : yzVar;
    }
}
