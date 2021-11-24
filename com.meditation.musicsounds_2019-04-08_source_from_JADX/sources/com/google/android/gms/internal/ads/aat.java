package com.google.android.gms.internal.ads;

public class aat {

    /* renamed from: a */
    private static final C4135zx f11374a = C4135zx.m20598a();

    /* renamed from: b */
    private zzbah f11375b;

    /* renamed from: c */
    private volatile abl f11376c;

    /* renamed from: d */
    private volatile zzbah f11377d;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.abl m15397b(com.google.android.gms.internal.ads.abl r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.abl r0 = r1.f11376c
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.ads.abl r0 = r1.f11376c     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f11376c = r2     // Catch:{ zzbbu -> 0x0012 }
            com.google.android.gms.internal.ads.zzbah r0 = com.google.android.gms.internal.ads.zzbah.zzdpq     // Catch:{ zzbbu -> 0x0012 }
            r1.f11377d = r0     // Catch:{ zzbbu -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f11376c = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.ads.zzbah r2 = com.google.android.gms.internal.ads.zzbah.zzdpq     // Catch:{ all -> 0x0019 }
            r1.f11377d = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.ads.abl r2 = r1.f11376c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aat.m15397b(com.google.android.gms.internal.ads.abl):com.google.android.gms.internal.ads.abl");
    }

    /* renamed from: a */
    public final abl mo11516a(abl abl) {
        abl abl2 = this.f11376c;
        this.f11375b = null;
        this.f11377d = null;
        this.f11376c = abl;
        return abl2;
    }

    /* renamed from: b */
    public final int mo11517b() {
        if (this.f11377d != null) {
            return this.f11377d.size();
        }
        if (this.f11376c != null) {
            return this.f11376c.mo11481l();
        }
        return 0;
    }

    /* renamed from: c */
    public final zzbah mo11518c() {
        if (this.f11377d != null) {
            return this.f11377d;
        }
        synchronized (this) {
            if (this.f11377d != null) {
                zzbah zzbah = this.f11377d;
                return zzbah;
            }
            this.f11377d = this.f11376c == null ? zzbah.zzdpq : this.f11376c.mo11552h();
            zzbah zzbah2 = this.f11377d;
            return zzbah2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aat)) {
            return false;
        }
        aat aat = (aat) obj;
        abl abl = this.f11376c;
        abl abl2 = aat.f11376c;
        return (abl == null && abl2 == null) ? mo11518c().equals(aat.mo11518c()) : (abl == null || abl2 == null) ? abl != null ? abl.equals(aat.m15397b(abl.mo11484p())) : m15397b(abl2.mo11484p()).equals(abl2) : abl.equals(abl2);
    }

    public int hashCode() {
        return 1;
    }
}
