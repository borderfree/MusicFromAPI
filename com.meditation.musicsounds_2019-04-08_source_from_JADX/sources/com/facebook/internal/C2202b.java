package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.facebook.FacebookException;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.internal.b */
public class C2202b {

    /* renamed from: a */
    private static final String f7155a = C2202b.class.getCanonicalName();

    /* renamed from: g */
    private static C2202b f7156g;

    /* renamed from: b */
    private String f7157b;

    /* renamed from: c */
    private String f7158c;

    /* renamed from: d */
    private String f7159d;

    /* renamed from: e */
    private boolean f7160e;

    /* renamed from: f */
    private long f7161f;

    /* renamed from: com.facebook.internal.b$a */
    private static final class C2204a implements IInterface {

        /* renamed from: a */
        private IBinder f7162a;

        C2204a(IBinder iBinder) {
            this.f7162a = iBinder;
        }

        /* renamed from: a */
        public String mo7817a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f7162a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f7162a;
        }

        /* renamed from: b */
        public boolean mo7819b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f7162a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.facebook.internal.b$b */
    private static final class C2205b implements ServiceConnection {

        /* renamed from: a */
        private AtomicBoolean f7163a;

        /* renamed from: b */
        private final BlockingQueue<IBinder> f7164b;

        private C2205b() {
            this.f7163a = new AtomicBoolean(false);
            this.f7164b = new LinkedBlockingDeque();
        }

        /* renamed from: a */
        public IBinder mo7820a() {
            if (!this.f7163a.compareAndSet(true, true)) {
                return (IBinder) this.f7164b.take();
            }
            throw new IllegalStateException("Binder already consumed");
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f7164b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[Catch:{ Exception -> 0x00d7, all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[Catch:{ Exception -> 0x00d7, all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0072 A[Catch:{ Exception -> 0x00d7, all -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.internal.C2202b m10150a(android.content.Context r10) {
        /*
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0011
            java.lang.String r0 = f7155a
            java.lang.String r1 = "getAttributionIdentifiers should not be called from the main thread"
            android.util.Log.e(r0, r1)
        L_0x0011:
            com.facebook.internal.b r0 = f7156g
            if (r0 == 0) goto L_0x0028
            long r0 = java.lang.System.currentTimeMillis()
            com.facebook.internal.b r2 = f7156g
            long r2 = r2.f7161f
            long r0 = r0 - r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0028
            com.facebook.internal.b r10 = f7156g
            return r10
        L_0x0028:
            com.facebook.internal.b r0 = m10152b(r10)
            r1 = 3
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            java.lang.String r1 = "aid"
            r3 = 0
            r5[r3] = r1     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            r1 = 1
            java.lang.String r4 = "androidid"
            r5[r1] = r4     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            r1 = 2
            java.lang.String r4 = "limit_tracking"
            r5[r1] = r4     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            java.lang.String r4 = "com.facebook.katana.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r4, r3)     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            if (r1 == 0) goto L_0x0053
            java.lang.String r1 = "content://com.facebook.katana.provider.AttributionIdProvider"
        L_0x004d:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            r4 = r1
            goto L_0x0063
        L_0x0053:
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            java.lang.String r4 = "com.facebook.wakizashi.provider.AttributionIdProvider"
            android.content.pm.ProviderInfo r1 = r1.resolveContentProvider(r4, r3)     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            if (r1 == 0) goto L_0x0062
            java.lang.String r1 = "content://com.facebook.wakizashi.provider.AttributionIdProvider"
            goto L_0x004d
        L_0x0062:
            r4 = r2
        L_0x0063:
            java.lang.String r1 = m10155e(r10)     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            if (r1 == 0) goto L_0x006b
            r0.f7159d = r1     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
        L_0x006b:
            if (r4 != 0) goto L_0x0072
            com.facebook.internal.b r10 = m10151a(r0)     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            return r10
        L_0x0072:
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00d7, all -> 0x00d5 }
            if (r10 == 0) goto L_0x00cb
            boolean r1 = r10.moveToFirst()     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            if (r1 != 0) goto L_0x0086
            goto L_0x00cb
        L_0x0086:
            java.lang.String r1 = "aid"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            java.lang.String r3 = "androidid"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            java.lang.String r4 = "limit_tracking"
            int r4 = r10.getColumnIndex(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            r0.f7157b = r1     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            if (r3 <= 0) goto L_0x00b8
            if (r4 <= 0) goto L_0x00b8
            java.lang.String r1 = r0.mo7814b()     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = r10.getString(r3)     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            r0.f7158c = r1     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            java.lang.String r1 = r10.getString(r4)     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            r0.f7160e = r1     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
        L_0x00b8:
            if (r10 == 0) goto L_0x00bd
            r10.close()
        L_0x00bd:
            com.facebook.internal.b r10 = m10151a(r0)
            return r10
        L_0x00c2:
            r0 = move-exception
            r2 = r10
            r10 = r0
            goto L_0x00fb
        L_0x00c6:
            r0 = move-exception
            r9 = r0
            r0 = r10
            r10 = r9
            goto L_0x00d9
        L_0x00cb:
            com.facebook.internal.b r0 = m10151a(r0)     // Catch:{ Exception -> 0x00c6, all -> 0x00c2 }
            if (r10 == 0) goto L_0x00d4
            r10.close()
        L_0x00d4:
            return r0
        L_0x00d5:
            r10 = move-exception
            goto L_0x00fb
        L_0x00d7:
            r10 = move-exception
            r0 = r2
        L_0x00d9:
            java.lang.String r1 = f7155a     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r3.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r4 = "Caught unexpected exception in getAttributionId(): "
            r3.append(r4)     // Catch:{ all -> 0x00f9 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00f9 }
            r3.append(r10)     // Catch:{ all -> 0x00f9 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x00f9 }
            android.util.Log.d(r1, r10)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x00f8
            r0.close()
        L_0x00f8:
            return r2
        L_0x00f9:
            r10 = move-exception
            r2 = r0
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            r2.close()
        L_0x0100:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2202b.m10150a(android.content.Context):com.facebook.internal.b");
    }

    /* renamed from: a */
    private static C2202b m10151a(C2202b bVar) {
        bVar.f7161f = System.currentTimeMillis();
        f7156g = bVar;
        return bVar;
    }

    /* renamed from: b */
    private static C2202b m10152b(Context context) {
        C2202b c = m10153c(context);
        if (c != null) {
            return c;
        }
        C2202b d = m10154d(context);
        return d == null ? new C2202b() : d;
    }

    /* renamed from: c */
    private static C2202b m10153c(Context context) {
        try {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                Method a = C2258x.m10370a("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", (Class<?>[]) new Class[]{Context.class});
                if (a == null) {
                    return null;
                }
                Object a2 = C2258x.m10360a((Object) null, a, context);
                if (a2 instanceof Integer) {
                    if (((Integer) a2).intValue() == 0) {
                        Method a3 = C2258x.m10370a("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", (Class<?>[]) new Class[]{Context.class});
                        if (a3 == null) {
                            return null;
                        }
                        Object a4 = C2258x.m10360a((Object) null, a3, context);
                        if (a4 == null) {
                            return null;
                        }
                        Method a5 = C2258x.m10369a(a4.getClass(), "getId", (Class<?>[]) new Class[0]);
                        Method a6 = C2258x.m10369a(a4.getClass(), "isLimitAdTrackingEnabled", (Class<?>[]) new Class[0]);
                        if (a5 != null) {
                            if (a6 != null) {
                                C2202b bVar = new C2202b();
                                bVar.f7158c = (String) C2258x.m10360a(a4, a5, new Object[0]);
                                bVar.f7160e = ((Boolean) C2258x.m10360a(a4, a6, new Object[0])).booleanValue();
                                return bVar;
                            }
                        }
                    }
                }
                return null;
            }
            throw new FacebookException("getAndroidId cannot be called on the main thread.");
        } catch (Exception e) {
            C2258x.m10383a("android_id", e);
            return null;
        }
    }

    /* renamed from: d */
    private static C2202b m10154d(Context context) {
        C2205b bVar = new C2205b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, bVar, 1)) {
            try {
                C2204a aVar = new C2204a(bVar.mo7820a());
                C2202b bVar2 = new C2202b();
                bVar2.f7158c = aVar.mo7817a();
                bVar2.f7160e = aVar.mo7819b();
                return bVar2;
            } catch (Exception e) {
                C2258x.m10383a("android_id", e);
            } finally {
                context.unbindService(bVar);
            }
        }
        return null;
    }

    /* renamed from: e */
    private static String m10155e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        return null;
    }

    /* renamed from: a */
    public String mo7813a() {
        return this.f7157b;
    }

    /* renamed from: b */
    public String mo7814b() {
        return this.f7158c;
    }

    /* renamed from: c */
    public String mo7815c() {
        return this.f7159d;
    }

    /* renamed from: d */
    public boolean mo7816d() {
        return this.f7160e;
    }
}
