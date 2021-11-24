package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C3316u;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.d */
public class C3288d {

    /* renamed from: a */
    private static C3288d f11176a = new C3288d();

    /* renamed from: b */
    private static Boolean f11177b;

    /* renamed from: c */
    private static boolean f11178c = false;

    /* renamed from: a */
    public static C3288d m15019a() {
        return f11176a;
    }

    /* renamed from: a */
    public void mo11314a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        mo11315a(context, str, i, str2, str3, str4, i2, list, 0);
    }

    /* renamed from: a */
    public void mo11315a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        List<String> list2 = list;
        if (f11177b == null) {
            f11177b = Boolean.valueOf(false);
        }
        if (f11177b.booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                String str5 = "WakeLockTracker";
                String str6 = "missing wakeLock key. ";
                String valueOf = String.valueOf(str);
                Log.e(str5, valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                if (list2 != null && list.size() == 1 && "com.google.android.gms".equals(list2.get(0))) {
                    list2 = null;
                }
                List<String> list3 = list2;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int a = C3316u.m15104a(context);
                String packageName = context.getPackageName();
                WakeLockEvent wakeLockEvent = r1;
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(currentTimeMillis, i, str2, i2, list3, str, elapsedRealtime, a, str3, "com.google.android.gms".equals(packageName) ? null : packageName, C3316u.m15105b(context), j, str4);
                try {
                    context.startService(new Intent().setComponent(C3286b.f11167a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
                } catch (Exception e) {
                    Log.wtf("WakeLockTracker", e);
                }
            }
        }
    }
}
