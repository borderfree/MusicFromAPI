package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import javax.annotation.concurrent.GuardedBy;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.in */
public final class C3632in {

    /* renamed from: a */
    int f14216a = -1;

    /* renamed from: b */
    private long f14217b = -1;

    /* renamed from: c */
    private long f14218c = -1;
    @GuardedBy("mLock")

    /* renamed from: d */
    private int f14219d = -1;

    /* renamed from: e */
    private long f14220e = 0;

    /* renamed from: f */
    private final Object f14221f = new Object();

    /* renamed from: g */
    private final String f14222g;
    @GuardedBy("mLock")

    /* renamed from: h */
    private int f14223h = 0;
    @GuardedBy("mLock")

    /* renamed from: i */
    private int f14224i = 0;

    public C3632in(String str) {
        this.f14222g = str;
    }

    /* renamed from: a */
    private static boolean m18749a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier != 0) {
            try {
                if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                    return true;
                }
                C3643iy.m19176d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                return false;
            } catch (NameNotFoundException unused) {
                C3643iy.m19178e("Fail to fetch AdActivity theme");
            }
        }
        C3643iy.m19176d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        return false;
    }

    /* renamed from: a */
    public final Bundle mo13069a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f14221f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f14222g);
            bundle.putLong("basets", this.f14218c);
            bundle.putLong("currts", this.f14217b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f14219d);
            bundle.putInt("preqs_in_session", this.f14216a);
            bundle.putLong("time_in_session", this.f14220e);
            bundle.putInt("pclick", this.f14223h);
            bundle.putInt("pimp", this.f14224i);
            bundle.putBoolean("support_transparent_background", m18749a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo13070a() {
        synchronized (this.f14221f) {
            this.f14223h++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13071a(com.google.android.gms.internal.ads.zzjj r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f14221f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.ii r1 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.ja r1 = r1.mo13060l()     // Catch:{ all -> 0x0091 }
            long r1 = r1.mo13117i()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.zzbv.zzer()     // Catch:{ all -> 0x0091 }
            long r3 = r3.mo11326a()     // Catch:{ all -> 0x0091 }
            long r5 = r10.f14218c     // Catch:{ all -> 0x0091 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x004b
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.aqc<java.lang.Long> r5 = com.google.android.gms.internal.ads.aqm.f12643aI     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.aqk r6 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x0091 }
            java.lang.Object r5 = r6.mo12297a(r5)     // Catch:{ all -> 0x0091 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0091 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0091 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0039
            r1 = -1
            r10.f14216a = r1     // Catch:{ all -> 0x0091 }
            goto L_0x0047
        L_0x0039:
            com.google.android.gms.internal.ads.ii r1 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.ja r1 = r1.mo13060l()     // Catch:{ all -> 0x0091 }
            int r1 = r1.mo13118j()     // Catch:{ all -> 0x0091 }
            r10.f14216a = r1     // Catch:{ all -> 0x0091 }
        L_0x0047:
            r10.f14218c = r12     // Catch:{ all -> 0x0091 }
            long r12 = r10.f14218c     // Catch:{ all -> 0x0091 }
        L_0x004b:
            r10.f14217b = r12     // Catch:{ all -> 0x0091 }
            r12 = 1
            if (r11 == 0) goto L_0x0061
            android.os.Bundle r13 = r11.f15483c     // Catch:{ all -> 0x0091 }
            if (r13 == 0) goto L_0x0061
            android.os.Bundle r11 = r11.f15483c     // Catch:{ all -> 0x0091 }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0091 }
            if (r11 != r12) goto L_0x0061
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            return
        L_0x0061:
            int r11 = r10.f14219d     // Catch:{ all -> 0x0091 }
            int r11 = r11 + r12
            r10.f14219d = r11     // Catch:{ all -> 0x0091 }
            int r11 = r10.f14216a     // Catch:{ all -> 0x0091 }
            int r11 = r11 + r12
            r10.f14216a = r11     // Catch:{ all -> 0x0091 }
            int r11 = r10.f14216a     // Catch:{ all -> 0x0091 }
            if (r11 != 0) goto L_0x007f
            r11 = 0
            r10.f14220e = r11     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.ii r11 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.ja r11 = r11.mo13060l()     // Catch:{ all -> 0x0091 }
            r11.mo13101b(r3)     // Catch:{ all -> 0x0091 }
            goto L_0x008f
        L_0x007f:
            com.google.android.gms.internal.ads.ii r11 = com.google.android.gms.ads.internal.zzbv.zzeo()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.ja r11 = r11.mo13060l()     // Catch:{ all -> 0x0091 }
            long r11 = r11.mo13119k()     // Catch:{ all -> 0x0091 }
            r13 = 0
            long r3 = r3 - r11
            r10.f14220e = r3     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            return
        L_0x0091:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3632in.mo13071a(com.google.android.gms.internal.ads.zzjj, long):void");
    }

    /* renamed from: b */
    public final void mo13072b() {
        synchronized (this.f14221f) {
            this.f14224i++;
        }
    }
}
