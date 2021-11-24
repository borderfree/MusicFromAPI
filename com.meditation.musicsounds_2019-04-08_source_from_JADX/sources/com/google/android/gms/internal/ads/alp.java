package com.google.android.gms.internal.ads;

public final class alp extends adn<alp> {

    /* renamed from: a */
    private Integer f12348a;

    /* renamed from: b */
    private Integer f12349b;

    public alp() {
        this.f12348a = null;
        this.f12349b = null;
        this.f11553Y = null;
        this.f11566Z = -1;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.alp mo11511a(com.google.android.gms.internal.ads.adk r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r7.mo11782a()
            if (r0 == 0) goto L_0x007b
            r1 = 8
            r2 = 2
            if (r0 == r1) goto L_0x0048
            r1 = 16
            if (r0 == r1) goto L_0x0016
            boolean r0 = super.mo11811a(r7, r0)
            if (r0 != 0) goto L_0x0000
            return r6
        L_0x0016:
            int r1 = r7.mo11799j()
            int r3 = r7.mo11796g()     // Catch:{ IllegalArgumentException -> 0x0074 }
            if (r3 < 0) goto L_0x0023
            if (r3 > r2) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r2 = 4
            if (r3 < r2) goto L_0x002f
            if (r3 > r2) goto L_0x002f
        L_0x0028:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            r6.f12349b = r2     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x0000
        L_0x002f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0074 }
            r4 = 51
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.append(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            java.lang.String r3 = " is not a valid enum CellularNetworkType"
            r5.append(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            java.lang.String r3 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0074 }
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0074 }
        L_0x0048:
            int r1 = r7.mo11799j()
            int r3 = r7.mo11796g()     // Catch:{ IllegalArgumentException -> 0x0074 }
            if (r3 < 0) goto L_0x005b
            if (r3 > r2) goto L_0x005b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            r6.f12348a = r2     // Catch:{ IllegalArgumentException -> 0x0074 }
            goto L_0x0000
        L_0x005b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0074 }
            r4 = 43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.<init>(r4)     // Catch:{ IllegalArgumentException -> 0x0074 }
            r5.append(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            java.lang.String r3 = " is not a valid enum NetworkType"
            r5.append(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            java.lang.String r3 = r5.toString()     // Catch:{ IllegalArgumentException -> 0x0074 }
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x0074 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0074 }
        L_0x0074:
            r7.mo11794e(r1)
            r6.mo11811a(r7, r0)
            goto L_0x0000
        L_0x007b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.alp.mo11511a(com.google.android.gms.internal.ads.adk):com.google.android.gms.internal.ads.alp");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo11510a() {
        int a = super.mo11510a();
        if (this.f12348a != null) {
            a += adm.m15974b(1, this.f12348a.intValue());
        }
        return this.f12349b != null ? a + adm.m15974b(2, this.f12349b.intValue()) : a;
    }

    /* renamed from: a */
    public final void mo11512a(adm adm) {
        if (this.f12348a != null) {
            adm.mo11801a(1, this.f12348a.intValue());
        }
        if (this.f12349b != null) {
            adm.mo11801a(2, this.f12349b.intValue());
        }
        super.mo11512a(adm);
    }
}
