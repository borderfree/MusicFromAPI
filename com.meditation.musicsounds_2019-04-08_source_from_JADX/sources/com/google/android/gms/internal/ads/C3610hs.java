package com.google.android.gms.internal.ads;

import android.content.Context;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.hs */
public final class C3610hs implements aix {

    /* renamed from: a */
    private final Context f14089a;

    /* renamed from: b */
    private final Object f14090b;

    /* renamed from: c */
    private String f14091c;

    /* renamed from: d */
    private boolean f14092d;

    public C3610hs(Context context, String str) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f14089a = context;
        this.f14091c = str;
        this.f14092d = false;
        this.f14090b = new Object();
    }

    /* renamed from: a */
    public final void mo11994a(aiw aiw) {
        mo12995a(aiw.f12142a);
    }

    /* renamed from: a */
    public final void mo12994a(String str) {
        this.f14091c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12995a(boolean r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.ht r0 = com.google.android.gms.ads.internal.zzbv.zzfh()
            android.content.Context r1 = r3.f14089a
            boolean r0 = r0.mo12999a(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Object r0 = r3.f14090b
            monitor-enter(r0)
            boolean r1 = r3.f14092d     // Catch:{ all -> 0x003f }
            if (r1 != r4) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0016:
            r3.f14092d = r4     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r3.f14091c     // Catch:{ all -> 0x003f }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x0022:
            boolean r4 = r3.f14092d     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0032
            com.google.android.gms.internal.ads.ht r4 = com.google.android.gms.ads.internal.zzbv.zzfh()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f14089a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f14091c     // Catch:{ all -> 0x003f }
            r4.mo12996a(r1, r2)     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0032:
            com.google.android.gms.internal.ads.ht r4 = com.google.android.gms.ads.internal.zzbv.zzfh()     // Catch:{ all -> 0x003f }
            android.content.Context r1 = r3.f14089a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = r3.f14091c     // Catch:{ all -> 0x003f }
            r4.mo13000b(r1, r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3610hs.mo12995a(boolean):void");
    }
}
