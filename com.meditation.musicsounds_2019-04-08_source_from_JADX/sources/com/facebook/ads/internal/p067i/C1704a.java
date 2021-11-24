package com.facebook.ads.internal.p067i;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.i.a */
public class C1704a {

    /* renamed from: a */
    private static SensorManager f5615a;

    /* renamed from: b */
    private static Sensor f5616b;

    /* renamed from: c */
    private static Sensor f5617c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile float[] f5618d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile float[] f5619e;

    /* renamed from: f */
    private static Map<String, String> f5620f = new ConcurrentHashMap();

    /* renamed from: g */
    private static String[] f5621g = {"x", "y", "z"};

    /* renamed from: h */
    private static SensorEventListener f5622h;

    /* renamed from: i */
    private static SensorEventListener f5623i;

    /* renamed from: com.facebook.ads.internal.i.a$a */
    private static class C1706a implements SensorEventListener {
        private C1706a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1704a.f5618d = sensorEvent.values;
            C1704a.m8540d();
        }
    }

    /* renamed from: com.facebook.ads.internal.i.a$b */
    private static class C1707b implements SensorEventListener {
        private C1707b() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1704a.f5619e = sensorEvent.values;
            C1704a.m8542e();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m8531a() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f5620f);
        m8533a((Map<String, String>) hashMap);
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m8532a(android.content.Context r5) {
        /*
            java.lang.Class<com.facebook.ads.internal.i.a> r0 = com.facebook.ads.internal.p067i.C1704a.class
            monitor-enter(r0)
            m8536b(r5)     // Catch:{ all -> 0x006e }
            m8539c(r5)     // Catch:{ all -> 0x006e }
            m8541d(r5)     // Catch:{ all -> 0x006e }
            android.hardware.SensorManager r1 = f5615a     // Catch:{ all -> 0x006e }
            if (r1 != 0) goto L_0x0020
            java.lang.String r1 = "sensor"
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch:{ all -> 0x006e }
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5     // Catch:{ all -> 0x006e }
            f5615a = r5     // Catch:{ all -> 0x006e }
            android.hardware.SensorManager r5 = f5615a     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x0020
            monitor-exit(r0)
            return
        L_0x0020:
            android.hardware.Sensor r5 = f5616b     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x002d
            android.hardware.SensorManager r5 = f5615a     // Catch:{ all -> 0x006e }
            r1 = 1
            android.hardware.Sensor r5 = r5.getDefaultSensor(r1)     // Catch:{ all -> 0x006e }
            f5616b = r5     // Catch:{ all -> 0x006e }
        L_0x002d:
            android.hardware.Sensor r5 = f5617c     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x003a
            android.hardware.SensorManager r5 = f5615a     // Catch:{ all -> 0x006e }
            r1 = 4
            android.hardware.Sensor r5 = r5.getDefaultSensor(r1)     // Catch:{ all -> 0x006e }
            f5617c = r5     // Catch:{ all -> 0x006e }
        L_0x003a:
            android.hardware.SensorEventListener r5 = f5622h     // Catch:{ all -> 0x006e }
            r1 = 3
            r2 = 0
            if (r5 != 0) goto L_0x0054
            com.facebook.ads.internal.i.a$a r5 = new com.facebook.ads.internal.i.a$a     // Catch:{ all -> 0x006e }
            r5.<init>()     // Catch:{ all -> 0x006e }
            f5622h = r5     // Catch:{ all -> 0x006e }
            android.hardware.Sensor r5 = f5616b     // Catch:{ all -> 0x006e }
            if (r5 == 0) goto L_0x0054
            android.hardware.SensorManager r5 = f5615a     // Catch:{ all -> 0x006e }
            android.hardware.SensorEventListener r3 = f5622h     // Catch:{ all -> 0x006e }
            android.hardware.Sensor r4 = f5616b     // Catch:{ all -> 0x006e }
            r5.registerListener(r3, r4, r1)     // Catch:{ all -> 0x006e }
        L_0x0054:
            android.hardware.SensorEventListener r5 = f5623i     // Catch:{ all -> 0x006e }
            if (r5 != 0) goto L_0x006c
            com.facebook.ads.internal.i.a$b r5 = new com.facebook.ads.internal.i.a$b     // Catch:{ all -> 0x006e }
            r5.<init>()     // Catch:{ all -> 0x006e }
            f5623i = r5     // Catch:{ all -> 0x006e }
            android.hardware.Sensor r5 = f5617c     // Catch:{ all -> 0x006e }
            if (r5 == 0) goto L_0x006c
            android.hardware.SensorManager r5 = f5615a     // Catch:{ all -> 0x006e }
            android.hardware.SensorEventListener r2 = f5623i     // Catch:{ all -> 0x006e }
            android.hardware.Sensor r3 = f5617c     // Catch:{ all -> 0x006e }
            r5.registerListener(r2, r3, r1)     // Catch:{ all -> 0x006e }
        L_0x006c:
            monitor-exit(r0)
            return
        L_0x006e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.p067i.C1704a.m8532a(android.content.Context):void");
    }

    /* renamed from: a */
    private static void m8533a(Map<String, String> map) {
        float[] fArr = f5618d;
        float[] fArr2 = f5619e;
        if (fArr != null) {
            int min = Math.min(f5621g.length, fArr.length);
            for (int i = 0; i < min; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("accelerometer_");
                sb.append(f5621g[i]);
                map.put(sb.toString(), String.valueOf(fArr[i]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(f5621g.length, fArr2.length);
            for (int i2 = 0; i2 < min2; i2++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("rotation_");
                sb2.append(f5621g[i2]);
                map.put(sb2.toString(), String.valueOf(fArr2[i2]));
            }
        }
    }

    /* renamed from: b */
    private static void m8536b(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        f5620f.put("available_memory", String.valueOf(memoryInfo.availMem));
        if (VERSION.SDK_INT >= 16) {
            f5620f.put("total_memory", String.valueOf(memoryInfo.totalMem));
        }
    }

    /* renamed from: c */
    private static void m8539c(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long availableBlocks = (long) statFs.getAvailableBlocks();
        f5620f.put("free_space", String.valueOf(availableBlocks * ((long) statFs.getBlockSize())));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static synchronized void m8540d() {
        synchronized (C1704a.class) {
            if (f5615a != null) {
                f5615a.unregisterListener(f5622h);
            }
            f5622h = null;
        }
    }

    /* renamed from: d */
    private static void m8541d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            boolean z = intExtra3 == 2 || intExtra3 == 5;
            float f = 0.0f;
            if (intExtra2 > 0) {
                f = 100.0f * (((float) intExtra) / ((float) intExtra2));
            }
            f5620f.put("battery", String.valueOf(f));
            f5620f.put("charging", z ? "1" : "0");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static synchronized void m8542e() {
        synchronized (C1704a.class) {
            if (f5615a != null) {
                f5615a.unregisterListener(f5623i);
            }
            f5623i = null;
        }
    }
}
