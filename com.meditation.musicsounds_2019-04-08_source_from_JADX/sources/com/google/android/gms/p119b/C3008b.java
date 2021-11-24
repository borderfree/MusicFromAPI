package com.google.android.gms.p119b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p122c.C3174a;
import com.google.android.gms.common.util.C3313r;
import com.google.android.gms.common.util.C3315t;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.google.android.gms.b.b */
public class C3008b {

    /* renamed from: n */
    private static ScheduledExecutorService f10537n;

    /* renamed from: o */
    private static volatile C3009a f10538o = new C3010c();

    /* renamed from: a */
    private final Object f10539a;

    /* renamed from: b */
    private final WakeLock f10540b;

    /* renamed from: c */
    private WorkSource f10541c;

    /* renamed from: d */
    private final int f10542d;

    /* renamed from: e */
    private final String f10543e;

    /* renamed from: f */
    private final String f10544f;

    /* renamed from: g */
    private final String f10545g;

    /* renamed from: h */
    private final Context f10546h;

    /* renamed from: i */
    private boolean f10547i;

    /* renamed from: j */
    private final Map<String, Integer[]> f10548j;

    /* renamed from: k */
    private final Set<Future<?>> f10549k;

    /* renamed from: l */
    private int f10550l;

    /* renamed from: m */
    private AtomicInteger f10551m;

    /* renamed from: com.google.android.gms.b.b$a */
    public interface C3009a {
    }

    public C3008b(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    private C3008b(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, null, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    private C3008b(Context context, int i, String str, String str2, String str3, String str4) {
        this.f10539a = this;
        this.f10547i = true;
        this.f10548j = new HashMap();
        this.f10549k = Collections.synchronizedSet(new HashSet());
        this.f10551m = new AtomicInteger(0);
        C3266s.m14914a(context, (Object) "WakeLock: context must not be null");
        C3266s.m14916a(str, (Object) "WakeLock: wakeLockName must not be empty");
        this.f10542d = i;
        this.f10544f = null;
        this.f10545g = null;
        this.f10546h = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf("*gcore*:");
            String valueOf2 = String.valueOf(str);
            this.f10543e = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            this.f10543e = str;
        }
        this.f10540b = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C3315t.m15096a(context)) {
            if (C3313r.m15087a(str3)) {
                str3 = context.getPackageName();
            }
            this.f10541c = C3315t.m15091a(context, str3);
            WorkSource workSource = this.f10541c;
            if (workSource != null && C3315t.m15096a(this.f10546h)) {
                if (this.f10541c != null) {
                    this.f10541c.add(workSource);
                } else {
                    this.f10541c = workSource;
                }
                try {
                    this.f10540b.setWorkSource(this.f10541c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                    Log.wtf("WakeLock", e.toString());
                }
            }
        }
        if (f10537n == null) {
            f10537n = C3174a.m14624a().mo11105a();
        }
    }

    /* renamed from: a */
    private final String m13966a(String str) {
        return this.f10547i ? !TextUtils.isEmpty(str) ? str : this.f10544f : this.f10544f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13967a(int i) {
        if (this.f10540b.isHeld()) {
            try {
                this.f10540b.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.f10543e).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            this.f10540b.isHeld();
        }
    }

    /* renamed from: c */
    private final List<String> m13969c() {
        return C3315t.m15094a(this.f10541c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r1 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r12.f10550l == 1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        com.google.android.gms.common.stats.C3288d.m15019a().mo11314a(r12.f10546h, com.google.android.gms.common.stats.C3287c.m15018a(r12.f10540b, r6), 8, r12.f10543e, r6, null, r12.f10542d, m13969c());
        r12.f10550l--;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10753a() {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r12.f10551m
            int r0 = r0.decrementAndGet()
            if (r0 >= 0) goto L_0x0019
            java.lang.String r0 = "WakeLock"
            java.lang.String r1 = r12.f10543e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " release without a matched acquire!"
            java.lang.String r1 = r1.concat(r2)
            android.util.Log.e(r0, r1)
        L_0x0019:
            r0 = 0
            java.lang.String r6 = r12.m13966a(r0)
            java.lang.Object r0 = r12.f10539a
            monitor-enter(r0)
            boolean r1 = r12.f10547i     // Catch:{ all -> 0x007e }
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x0052
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f10548j     // Catch:{ all -> 0x007e }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x007e }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0050
        L_0x0033:
            r2 = r1[r11]     // Catch:{ all -> 0x007e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x007e }
            if (r2 != r10) goto L_0x0042
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r12.f10548j     // Catch:{ all -> 0x007e }
            r1.remove(r6)     // Catch:{ all -> 0x007e }
            r1 = 1
            goto L_0x0050
        L_0x0042:
            r2 = r1[r11]     // Catch:{ all -> 0x007e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x007e }
            int r2 = r2 - r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x007e }
            r1[r11] = r2     // Catch:{ all -> 0x007e }
            goto L_0x0031
        L_0x0050:
            if (r1 != 0) goto L_0x005a
        L_0x0052:
            boolean r1 = r12.f10547i     // Catch:{ all -> 0x007e }
            if (r1 != 0) goto L_0x0079
            int r1 = r12.f10550l     // Catch:{ all -> 0x007e }
            if (r1 != r10) goto L_0x0079
        L_0x005a:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C3288d.m15019a()     // Catch:{ all -> 0x007e }
            android.content.Context r2 = r12.f10546h     // Catch:{ all -> 0x007e }
            android.os.PowerManager$WakeLock r3 = r12.f10540b     // Catch:{ all -> 0x007e }
            java.lang.String r3 = com.google.android.gms.common.stats.C3287c.m15018a(r3, r6)     // Catch:{ all -> 0x007e }
            r4 = 8
            java.lang.String r5 = r12.f10543e     // Catch:{ all -> 0x007e }
            r7 = 0
            int r8 = r12.f10542d     // Catch:{ all -> 0x007e }
            java.util.List r9 = r12.m13969c()     // Catch:{ all -> 0x007e }
            r1.mo11314a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x007e }
            int r1 = r12.f10550l     // Catch:{ all -> 0x007e }
            int r1 = r1 - r10
            r12.f10550l = r1     // Catch:{ all -> 0x007e }
        L_0x0079:
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            r12.m13967a(r11)
            return
        L_0x007e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p119b.C3008b.mo10753a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r2 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r13.f10550l == 0) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        com.google.android.gms.common.stats.C3288d.m15019a().mo11315a(r13.f10546h, com.google.android.gms.common.stats.C3287c.m15018a(r13.f10540b, r6), 7, r13.f10543e, r6, null, r13.f10542d, m13969c(), r14);
        r13.f10550l++;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10754a(long r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r13.f10551m
            r0.incrementAndGet()
            r0 = 0
            java.lang.String r6 = r13.m13966a(r0)
            java.lang.Object r0 = r13.f10539a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f10548j     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            int r1 = r13.f10550l     // Catch:{ all -> 0x0096 }
            if (r1 <= 0) goto L_0x0029
        L_0x001a:
            android.os.PowerManager$WakeLock r1 = r13.f10540b     // Catch:{ all -> 0x0096 }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f10548j     // Catch:{ all -> 0x0096 }
            r1.clear()     // Catch:{ all -> 0x0096 }
            r13.f10550l = r2     // Catch:{ all -> 0x0096 }
        L_0x0029:
            boolean r1 = r13.f10547i     // Catch:{ all -> 0x0096 }
            r12 = 1
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f10548j     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0047
            java.util.Map<java.lang.String, java.lang.Integer[]> r1 = r13.f10548j     // Catch:{ all -> 0x0096 }
            java.lang.Integer[] r3 = new java.lang.Integer[r12]     // Catch:{ all -> 0x0096 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0096 }
            r3[r2] = r4     // Catch:{ all -> 0x0096 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0096 }
            r2 = 1
            goto L_0x0054
        L_0x0047:
            r3 = r1[r2]     // Catch:{ all -> 0x0096 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0096 }
            int r3 = r3 + r12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0096 }
            r1[r2] = r3     // Catch:{ all -> 0x0096 }
        L_0x0054:
            if (r2 != 0) goto L_0x005e
        L_0x0056:
            boolean r1 = r13.f10547i     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
            int r1 = r13.f10550l     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x007d
        L_0x005e:
            com.google.android.gms.common.stats.d r1 = com.google.android.gms.common.stats.C3288d.m15019a()     // Catch:{ all -> 0x0096 }
            android.content.Context r2 = r13.f10546h     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r3 = r13.f10540b     // Catch:{ all -> 0x0096 }
            java.lang.String r3 = com.google.android.gms.common.stats.C3287c.m15018a(r3, r6)     // Catch:{ all -> 0x0096 }
            r4 = 7
            java.lang.String r5 = r13.f10543e     // Catch:{ all -> 0x0096 }
            r7 = 0
            int r8 = r13.f10542d     // Catch:{ all -> 0x0096 }
            java.util.List r9 = r13.m13969c()     // Catch:{ all -> 0x0096 }
            r10 = r14
            r1.mo11315a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0096 }
            int r1 = r13.f10550l     // Catch:{ all -> 0x0096 }
            int r1 = r1 + r12
            r13.f10550l = r1     // Catch:{ all -> 0x0096 }
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            android.os.PowerManager$WakeLock r0 = r13.f10540b
            r0.acquire()
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            java.util.concurrent.ScheduledExecutorService r0 = f10537n
            com.google.android.gms.b.d r1 = new com.google.android.gms.b.d
            r1.<init>(r13)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r14, r2)
        L_0x0095:
            return
        L_0x0096:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.p119b.C3008b.mo10754a(long):void");
    }

    /* renamed from: a */
    public void mo10755a(boolean z) {
        this.f10540b.setReferenceCounted(z);
        this.f10547i = z;
    }

    /* renamed from: b */
    public boolean mo10756b() {
        return this.f10540b.isHeld();
    }
}
