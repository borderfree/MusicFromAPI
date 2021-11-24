package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.common.internal.C3219aq;
import com.google.android.gms.common.internal.C3220ar;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.dynamic.C3327d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.l */
final class C3277l {

    /* renamed from: a */
    private static volatile C3219aq f11134a;

    /* renamed from: b */
    private static final Object f11135b = new Object();

    /* renamed from: c */
    private static Context f11136c;

    /* renamed from: a */
    static C3291u m14993a(String str, C3279n nVar, boolean z) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m14996b(str, nVar, z);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m14994a(boolean z, String str, C3279n nVar) {
        boolean z2 = true;
        if (z || !m14996b(str, nVar, true).f11180a) {
            z2 = false;
        }
        return C3291u.m15026a(str, nVar, z, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m14995a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.l> r0 = com.google.android.gms.common.C3277l.class
            monitor-enter(r0)
            android.content.Context r1 = f11136c     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0018
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x001a }
            f11136c = r2     // Catch:{ all -> 0x001a }
            monitor-exit(r0)
            return
        L_0x0011:
            java.lang.String r2 = "GoogleCertificates"
            java.lang.String r1 = "GoogleCertificates has been initialized already"
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r0)
            return
        L_0x001a:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C3277l.m14995a(android.content.Context):void");
    }

    /* renamed from: b */
    private static C3291u m14996b(String str, C3279n nVar, boolean z) {
        try {
            if (f11134a == null) {
                C3266s.m14913a(f11136c);
                synchronized (f11135b) {
                    if (f11134a == null) {
                        f11134a = C3220ar.m14744a(DynamiteModule.m15147a(f11136c, DynamiteModule.f11243c, "com.google.android.gms.googlecertificates").mo11352a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C3266s.m14913a(f11136c);
            try {
                return f11134a.mo11195a(new zzk(str, nVar, z), C3327d.m15136a(f11136c.getPackageManager())) ? C3291u.m15022a() : C3291u.m15025a((Callable<String>) new C3278m<String>(z, str, nVar));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return C3291u.m15024a("module call", e);
            }
        } catch (LoadingException e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return C3291u.m15024a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }
}
