package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.C3171b;
import com.google.android.gms.common.C3182e;
import com.google.android.gms.common.C3183f;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.stats.C3285a;
import com.google.android.gms.internal.p126a.C3384e;
import com.google.android.gms.internal.p126a.C3385f;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public class AdvertisingIdClient {
    @GuardedBy("this")

    /* renamed from: a */
    private C3171b f9908a;
    @GuardedBy("this")

    /* renamed from: b */
    private C3384e f9909b;
    @GuardedBy("this")

    /* renamed from: c */
    private boolean f9910c;

    /* renamed from: d */
    private final Object f9911d;
    @GuardedBy("mAutoDisconnectTaskLock")

    /* renamed from: e */
    private C2848a f9912e;
    @GuardedBy("this")

    /* renamed from: f */
    private final Context f9913f;

    /* renamed from: g */
    private final boolean f9914g;

    /* renamed from: h */
    private final long f9915h;

    public static final class Info {

        /* renamed from: a */
        private final String f9916a;

        /* renamed from: b */
        private final boolean f9917b;

        public Info(String str, boolean z) {
            this.f9916a = str;
            this.f9917b = z;
        }

        public final String getId() {
            return this.f9916a;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.f9917b;
        }

        public final String toString() {
            String str = this.f9916a;
            boolean z = this.f9917b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.identifier.AdvertisingIdClient$a */
    static class C2848a extends Thread {

        /* renamed from: a */
        CountDownLatch f9918a = new CountDownLatch(1);

        /* renamed from: b */
        boolean f9919b = false;

        /* renamed from: c */
        private WeakReference<AdvertisingIdClient> f9920c;

        /* renamed from: d */
        private long f9921d;

        public C2848a(AdvertisingIdClient advertisingIdClient, long j) {
            this.f9920c = new WeakReference<>(advertisingIdClient);
            this.f9921d = j;
            start();
        }

        /* renamed from: a */
        private final void m13531a() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.f9920c.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.f9919b = true;
            }
        }

        public final void run() {
            try {
                if (!this.f9918a.await(this.f9921d, TimeUnit.MILLISECONDS)) {
                    m13531a();
                }
            } catch (InterruptedException unused) {
                m13531a();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        this.f9911d = new Object();
        C3266s.m14913a(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.f9913f = context;
        this.f9910c = false;
        this.f9915h = j;
        this.f9914g = z2;
    }

    /* renamed from: a */
    private static C3171b m13525a(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int b = C3182e.m14660b().mo11117b(context, (int) C3183f.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (b == 0 || b == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C3171b bVar = new C3171b();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C3285a.m15014a().mo11312a(context, intent, bVar, 1)) {
                        return bVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    /* renamed from: a */
    private static C3384e m13526a(Context context, C3171b bVar) {
        try {
            return C3385f.m15284a(bVar.mo11094a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m13527a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f9911d
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.f9912e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.f9912e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f9918a     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.f9912e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.f9915h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$a     // Catch:{ all -> 0x0026 }
            long r2 = r6.f9915h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.f9912e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.m13527a():void");
    }

    /* renamed from: a */
    private final void m13528a(boolean z) {
        C3266s.m14926c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f9910c) {
                finish();
            }
            this.f9908a = m13525a(this.f9913f, this.f9914g);
            this.f9909b = m13526a(this.f9913f, this.f9908a);
            this.f9910c = true;
            if (z) {
                m13527a();
            }
        }
    }

    /* renamed from: a */
    private final boolean m13529a(Info info, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (info != null) {
            hashMap.put("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? "1" : "0");
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C2849a(this, hashMap).start();
        return true;
    }

    /* renamed from: b */
    private final boolean m13530b() {
        boolean b;
        C3266s.m14926c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f9910c) {
                synchronized (this.f9911d) {
                    if (this.f9912e == null || !this.f9912e.f9919b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m13528a(false);
                    if (!this.f9910c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C3266s.m14913a(this.f9908a);
            C3266s.m14913a(this.f9909b);
            b = this.f9909b.mo11426b();
        }
        m13527a();
        return b;
    }

    public static Info getAdvertisingIdInfo(Context context) {
        zzb zzb = new zzb(context);
        boolean z = zzb.getBoolean("gads:ad_id_app_context:enabled", false);
        float a = zzb.mo9968a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a2 = zzb.mo9969a("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, z, zzb.getBoolean("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.m13528a(false);
            Info info = advertisingIdClient.getInfo();
            advertisingIdClient.m13529a(info, z, a, SystemClock.elapsedRealtime() - elapsedRealtime, a2, null);
            advertisingIdClient.finish();
            return info;
        } catch (Throwable th) {
            advertisingIdClient.finish();
            throw th;
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        zzb zzb = new zzb(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1, zzb.getBoolean("gads:ad_id_app_context:enabled", false), zzb.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            advertisingIdClient.m13528a(false);
            return advertisingIdClient.m13530b();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C3266s.m14926c(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f9913f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.common.b r0 = r3.f9908a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f9910c     // Catch:{ Throwable -> 0x001f }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C3285a.m15014a()     // Catch:{ Throwable -> 0x001f }
            android.content.Context r1 = r3.f9913f     // Catch:{ Throwable -> 0x001f }
            com.google.android.gms.common.b r2 = r3.f9908a     // Catch:{ Throwable -> 0x001f }
            r0.mo11311a(r1, r2)     // Catch:{ Throwable -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f9910c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f9909b = r0     // Catch:{ all -> 0x0033 }
            r3.f9908a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    public Info getInfo() {
        Info info;
        C3266s.m14926c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f9910c) {
                synchronized (this.f9911d) {
                    if (this.f9912e == null || !this.f9912e.f9919b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    m13528a(false);
                    if (!this.f9910c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            C3266s.m14913a(this.f9908a);
            C3266s.m14913a(this.f9909b);
            info = new Info(this.f9909b.mo11424a(), this.f9909b.mo11425a(true));
        }
        m13527a();
        return info;
    }

    public void start() {
        m13528a(true);
    }
}
