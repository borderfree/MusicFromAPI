package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

public final class agq extends ahl {

    /* renamed from: d */
    private static volatile aem f12001d;

    /* renamed from: e */
    private static final Object f12002e = new Object();

    /* renamed from: f */
    private C4015wb f12003f = null;

    public agq(aga aga, String str, String str2, C4110yz yzVar, int i, int i2, C4015wb wbVar) {
        super(aga, str, str2, yzVar, i, 27);
        this.f12003f = wbVar;
    }

    /* renamed from: c */
    private final String m16202c() {
        try {
            if (this.f12041a.mo11881l() != null) {
                this.f12041a.mo11881l().get();
            }
            C4110yz k = this.f12041a.mo11880k();
            if (!(k == null || k.f15148n == null)) {
                return k.f15148n;
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11906a() {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.aem r0 = f12001d
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.aem r0 = f12001d
            java.lang.String r0 = r0.f11643a
            boolean r0 = com.google.android.gms.internal.ads.agi.m16188b(r0)
            if (r0 != 0) goto L_0x002b
            com.google.android.gms.internal.ads.aem r0 = f12001d
            java.lang.String r0 = r0.f11643a
            java.lang.String r3 = "E"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x002b
            com.google.android.gms.internal.ads.aem r0 = f12001d
            java.lang.String r0 = r0.f11643a
            java.lang.String r3 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r0 = 0
            goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = f12002e
            monitor-enter(r0)
            com.google.android.gms.internal.ads.wb r3 = r9.f12003f     // Catch:{ all -> 0x00de }
            r3 = 0
            boolean r4 = com.google.android.gms.internal.ads.agi.m16188b(r3)     // Catch:{ all -> 0x00de }
            r5 = 3
            r6 = 2
            if (r4 != 0) goto L_0x003e
            r4 = 4
            goto L_0x0081
        L_0x003e:
            com.google.android.gms.internal.ads.wb r4 = r9.f12003f     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.agi.m16188b(r3)     // Catch:{ all -> 0x00de }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00de }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x0080
            com.google.android.gms.internal.ads.aga r4 = r9.f12041a     // Catch:{ all -> 0x00de }
            boolean r4 = r4.mo11878i()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aqm.f12702bO     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.aqk r7 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x00de }
            java.lang.Object r4 = r7.mo12297a(r4)     // Catch:{ all -> 0x00de }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00de }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x007b
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.aqm.f12703bP     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.aqk r7 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x00de }
            java.lang.Object r4 = r7.mo12297a(r4)     // Catch:{ all -> 0x00de }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00de }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00de }
            if (r4 == 0) goto L_0x007b
            r4 = 1
            goto L_0x007c
        L_0x007b:
            r4 = 0
        L_0x007c:
            if (r4 == 0) goto L_0x0080
            r4 = 3
            goto L_0x0081
        L_0x0080:
            r4 = 2
        L_0x0081:
            java.lang.reflect.Method r7 = r9.f12043c     // Catch:{ all -> 0x00de }
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.aga r8 = r9.f12041a     // Catch:{ all -> 0x00de }
            android.content.Context r8 = r8.mo11866a()     // Catch:{ all -> 0x00de }
            r5[r2] = r8     // Catch:{ all -> 0x00de }
            if (r4 != r6) goto L_0x0090
            r2 = 1
        L_0x0090:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x00de }
            r5[r1] = r2     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.aqc<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.aqm.f12696bI     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.aqk r2 = com.google.android.gms.internal.ads.ane.m16650f()     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = r2.mo12297a(r1)     // Catch:{ all -> 0x00de }
            r5[r6] = r1     // Catch:{ all -> 0x00de }
            java.lang.Object r1 = r7.invoke(r3, r5)     // Catch:{ all -> 0x00de }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00de }
            com.google.android.gms.internal.ads.aem r2 = new com.google.android.gms.internal.ads.aem     // Catch:{ all -> 0x00de }
            r2.<init>(r1)     // Catch:{ all -> 0x00de }
            f12001d = r2     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r2.f11643a     // Catch:{ all -> 0x00de }
            boolean r1 = com.google.android.gms.internal.ads.agi.m16188b(r1)     // Catch:{ all -> 0x00de }
            if (r1 != 0) goto L_0x00c3
            com.google.android.gms.internal.ads.aem r1 = f12001d     // Catch:{ all -> 0x00de }
            java.lang.String r1 = r1.f11643a     // Catch:{ all -> 0x00de }
            java.lang.String r2 = "E"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x00dc
        L_0x00c3:
            switch(r4) {
                case 3: goto L_0x00ce;
                case 4: goto L_0x00c7;
                default: goto L_0x00c6;
            }     // Catch:{ all -> 0x00de }
        L_0x00c6:
            goto L_0x00dc
        L_0x00c7:
            com.google.android.gms.internal.ads.aem r1 = f12001d     // Catch:{ all -> 0x00de }
            java.lang.String r2 = r3.f15017a     // Catch:{ all -> 0x00de }
            r1.f11643a = r2     // Catch:{ all -> 0x00de }
            goto L_0x00dc
        L_0x00ce:
            java.lang.String r1 = r9.m16202c()     // Catch:{ all -> 0x00de }
            boolean r2 = com.google.android.gms.internal.ads.agi.m16188b(r1)     // Catch:{ all -> 0x00de }
            if (r2 != 0) goto L_0x00dc
            com.google.android.gms.internal.ads.aem r2 = f12001d     // Catch:{ all -> 0x00de }
            r2.f11643a = r1     // Catch:{ all -> 0x00de }
        L_0x00dc:
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            goto L_0x00e1
        L_0x00de:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            throw r1
        L_0x00e1:
            com.google.android.gms.internal.ads.yz r0 = r9.f12042b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.aem r1 = f12001d     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0114
            com.google.android.gms.internal.ads.yz r1 = r9.f12042b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.aem r2 = f12001d     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f11643a     // Catch:{ all -> 0x0116 }
            r1.f15148n = r2     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.yz r1 = r9.f12042b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.aem r2 = f12001d     // Catch:{ all -> 0x0116 }
            long r2 = r2.f11644b     // Catch:{ all -> 0x0116 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0116 }
            r1.f15154t = r2     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.yz r1 = r9.f12042b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.aem r2 = f12001d     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f11645c     // Catch:{ all -> 0x0116 }
            r1.f15153s = r2     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.yz r1 = r9.f12042b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.aem r2 = f12001d     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f11646d     // Catch:{ all -> 0x0116 }
            r1.f15094C = r2     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.yz r1 = r9.f12042b     // Catch:{ all -> 0x0116 }
            com.google.android.gms.internal.ads.aem r2 = f12001d     // Catch:{ all -> 0x0116 }
            java.lang.String r2 = r2.f11647e     // Catch:{ all -> 0x0116 }
            r1.f15095D = r2     // Catch:{ all -> 0x0116 }
        L_0x0114:
            monitor-exit(r0)     // Catch:{ all -> 0x0116 }
            return
        L_0x0116:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0116 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.agq.mo11906a():void");
    }
}
