package com.seattleclouds.p154a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.Locale;

/* renamed from: com.seattleclouds.a.a */
public class C5228a {

    /* renamed from: a */
    private static final String f18640a = "a";

    /* renamed from: b */
    private static C5228a f18641b;

    /* renamed from: c */
    private static Context f18642c;

    /* renamed from: d */
    private SharedPreferences f18643d = f18642c.getSharedPreferences("com.seattleclouds.analytics.SCAnalyticsTracker", 0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Editor f18644e = this.f18643d.edit();

    /* renamed from: f */
    private long f18645f = this.f18643d.getLong("installationTimestamp", 0);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f18646g = this.f18643d.getLong("activationTimestamp", 0);

    private C5228a(Context context) {
        f18642c = context;
    }

    /* renamed from: a */
    public static C5228a m25878a(Context context) {
        if (context != null) {
            if (f18641b == null) {
                f18641b = new C5228a(context);
            }
            f18642c = context;
            return f18641b;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: a */
    private static String m25879a(String str, String str2) {
        String str3;
        if (str == null || str.trim().length() == 0) {
            str = "Unknown";
        }
        if (str2 == null || str2.trim().length() == 0) {
            str2 = "Unknown";
        }
        if (str.length() == 1) {
            str3 = str.toUpperCase(Locale.US);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 1).toUpperCase(Locale.US));
            sb.append(str.substring(1));
            str3 = sb.toString();
        }
        if (str2.startsWith(str3)) {
            return str2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(" ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean m25880a() {
        /*
            r6 = this;
            monitor-enter(r6)
            long r0 = r6.f18645f     // Catch:{ all -> 0x0029 }
            r2 = 0
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0027
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0029 }
            boolean r2 = r6.m25883b(r4)     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0025
            r6.f18645f = r0     // Catch:{ all -> 0x0029 }
            android.content.SharedPreferences$Editor r0 = r6.f18644e     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "installationTimestamp"
            long r2 = r6.f18645f     // Catch:{ all -> 0x0029 }
            r0.putLong(r1, r2)     // Catch:{ all -> 0x0029 }
            android.content.SharedPreferences$Editor r0 = r6.f18644e     // Catch:{ all -> 0x0029 }
            boolean r2 = r0.commit()     // Catch:{ all -> 0x0029 }
        L_0x0025:
            monitor-exit(r6)
            return r2
        L_0x0027:
            monitor-exit(r6)
            return r4
        L_0x0029:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p154a.C5228a.m25880a():boolean");
    }

    /* renamed from: b */
    private int m25882b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) f18642c.getSystemService("connectivity");
        try {
            if (connectivityManager.getActiveNetworkInfo() == null) {
                return 100;
            }
            int i = 1;
            if (connectivityManager.getActiveNetworkInfo().getType() != 1) {
                i = 2;
            }
            return i;
        } catch (NoSuchMethodError unused) {
            return 0;
        } catch (SecurityException unused2) {
            return 200;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00cb A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m25883b(int r5) {
        /*
            r4 = this;
            android.content.Context r0 = f18642c
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "type"
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r1.put(r2, r5)
            java.lang.String r5 = "param"
            java.lang.String r2 = ""
            r1.put(r5, r2)
            java.lang.String r5 = "username"
            java.lang.String r2 = com.seattleclouds.App.f18523y
            r1.put(r5, r2)
            java.lang.String r5 = "appId"
            java.lang.String r2 = com.seattleclouds.App.f18524z
            r1.put(r5, r2)
            java.lang.String r5 = "publisherid"
            java.lang.String r2 = com.seattleclouds.App.f18522x
            r1.put(r5, r2)
            java.lang.String r5 = "uniqueAppId"
            android.content.Context r2 = f18642c
            java.lang.String r2 = r2.getPackageName()
            r1.put(r5, r2)
            java.lang.String r5 = "deviceId"
            android.content.Context r2 = f18642c
            java.lang.String r2 = com.seattleclouds.C5323c.m26636a(r2)
            r1.put(r5, r2)
            java.lang.String r5 = "os"
            r2 = 1
            java.lang.String r3 = java.lang.Integer.toString(r2)
            r1.put(r5, r3)
            java.lang.String r5 = "osVersion"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            r1.put(r5, r3)
            java.lang.String r5 = "deviceModel"
            java.lang.String r3 = m25887d()
            r1.put(r5, r3)
            java.lang.String r5 = "connectionType"
            int r3 = r4.m25882b()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r1.put(r5, r3)
            java.lang.String r5 = "screenSize"
            int r3 = r4.m25885c()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            r1.put(r5, r3)
            java.lang.String r5 = "screenDensity"
            int r0 = r0.densityDpi
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r1.put(r5, r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            r5.<init>()     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            java.lang.String r0 = "http://"
            r5.append(r0)     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            java.lang.String r0 = com.seattleclouds.App.f18520v     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            r5.append(r0)     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            java.lang.String r0 = "/"
            r5.append(r0)     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            java.lang.String r0 = "trackevent.ashx"
            r5.append(r0)     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            java.lang.String r5 = r5.toString()     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            java.lang.String r5 = com.seattleclouds.util.HTTPUtil.m31768b(r5, r1)     // Catch:{ SecurityException -> 0x00ab, IOException -> 0x00c2 }
            goto L_0x00c3
        L_0x00ab:
            r5 = move-exception
            java.lang.String r0 = f18640a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Error performing analytics request: "
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.e(r0, r5)
        L_0x00c2:
            r5 = 0
        L_0x00c3:
            java.lang.String r0 = "OK"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x00cc
            return r2
        L_0x00cc:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.p154a.C5228a.m25883b(int):boolean");
    }

    /* renamed from: c */
    private int m25885c() {
        return f18642c.getResources().getConfiguration().screenLayout & 15;
    }

    /* renamed from: d */
    private static String m25887d() {
        return m25879a(Build.MANUFACTURER, Build.MODEL);
    }

    /* renamed from: a */
    public void mo16992a(final int i) {
        new Thread(new Runnable() {
            public void run() {
                if (i != 2) {
                    C5228a.this.m25883b(i);
                } else if (System.currentTimeMillis() - C5228a.this.f18646g > 43200000) {
                    boolean b = C5228a.this.m25880a();
                    if (b) {
                        b = C5228a.this.m25883b(i);
                    }
                    if (b) {
                        C5228a.this.f18646g = System.currentTimeMillis();
                        C5228a.this.f18644e.putLong("activationTimestamp", C5228a.this.f18646g);
                        C5228a.this.f18644e.commit();
                    }
                }
            }
        }).start();
    }
}
