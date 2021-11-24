package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

/* renamed from: com.facebook.internal.a */
public class C2201a {

    /* renamed from: a */
    private static C2201a f7151a;

    /* renamed from: b */
    private UUID f7152b;

    /* renamed from: c */
    private Intent f7153c;

    /* renamed from: d */
    private int f7154d;

    public C2201a(int i) {
        this(i, UUID.randomUUID());
    }

    public C2201a(int i, UUID uuid) {
        this.f7152b = uuid;
        this.f7154d = i;
    }

    /* renamed from: a */
    public static C2201a m10142a() {
        return f7151a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.internal.C2201a m10143a(java.util.UUID r4, int r5) {
        /*
            java.lang.Class<com.facebook.internal.a> r0 = com.facebook.internal.C2201a.class
            monitor-enter(r0)
            com.facebook.internal.a r1 = m10142a()     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            java.util.UUID r3 = r1.mo7810c()     // Catch:{ all -> 0x0022 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0022 }
            if (r4 == 0) goto L_0x0020
            int r4 = r1.mo7811d()     // Catch:{ all -> 0x0022 }
            if (r4 == r5) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            m10144a(r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)
            return r1
        L_0x0020:
            monitor-exit(r0)
            return r2
        L_0x0022:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2201a.m10143a(java.util.UUID, int):com.facebook.internal.a");
    }

    /* renamed from: a */
    private static synchronized boolean m10144a(C2201a aVar) {
        boolean z;
        synchronized (C2201a.class) {
            C2201a a = m10142a();
            f7151a = aVar;
            z = a != null;
        }
        return z;
    }

    /* renamed from: a */
    public void mo7808a(Intent intent) {
        this.f7153c = intent;
    }

    /* renamed from: b */
    public Intent mo7809b() {
        return this.f7153c;
    }

    /* renamed from: c */
    public UUID mo7810c() {
        return this.f7152b;
    }

    /* renamed from: d */
    public int mo7811d() {
        return this.f7154d;
    }

    /* renamed from: e */
    public boolean mo7812e() {
        return m10144a(this);
    }
}
