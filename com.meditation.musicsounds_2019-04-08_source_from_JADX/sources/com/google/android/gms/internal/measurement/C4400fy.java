package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fy */
public class C4400fy {

    /* renamed from: a */
    private static final C4371fb f16143a = C4371fb.m21502a();

    /* renamed from: b */
    private zzte f16144b;

    /* renamed from: c */
    private volatile C4419gq f16145c;

    /* renamed from: d */
    private volatile zzte f16146d;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.C4419gq m21621b(com.google.android.gms.internal.measurement.C4419gq r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.gq r0 = r1.f16145c
            if (r0 != 0) goto L_0x001c
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.gq r0 = r1.f16145c     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000b
        L_0x0009:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x000b:
            r1.f16145c = r2     // Catch:{ zzuv -> 0x0012 }
            com.google.android.gms.internal.measurement.zzte r0 = com.google.android.gms.internal.measurement.zzte.zzbtq     // Catch:{ zzuv -> 0x0012 }
            r1.f16146d = r0     // Catch:{ zzuv -> 0x0012 }
            goto L_0x0009
        L_0x0012:
            r1.f16145c = r2     // Catch:{ all -> 0x0019 }
            com.google.android.gms.internal.measurement.zzte r2 = com.google.android.gms.internal.measurement.zzte.zzbtq     // Catch:{ all -> 0x0019 }
            r1.f16146d = r2     // Catch:{ all -> 0x0019 }
            goto L_0x0009
        L_0x0019:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r2
        L_0x001c:
            com.google.android.gms.internal.measurement.gq r2 = r1.f16145c
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4400fy.m21621b(com.google.android.gms.internal.measurement.gq):com.google.android.gms.internal.measurement.gq");
    }

    /* renamed from: a */
    public final C4419gq mo14526a(C4419gq gqVar) {
        C4419gq gqVar2 = this.f16145c;
        this.f16144b = null;
        this.f16146d = null;
        this.f16145c = gqVar;
        return gqVar2;
    }

    /* renamed from: b */
    public final int mo14527b() {
        if (this.f16146d != null) {
            return this.f16146d.size();
        }
        if (this.f16145c != null) {
            return this.f16145c.mo14497h();
        }
        return 0;
    }

    /* renamed from: c */
    public final zzte mo14528c() {
        if (this.f16146d != null) {
            return this.f16146d;
        }
        synchronized (this) {
            if (this.f16146d != null) {
                zzte zzte = this.f16146d;
                return zzte;
            }
            this.f16146d = this.f16145c == null ? zzte.zzbtq : this.f16145c.mo14301d();
            zzte zzte2 = this.f16146d;
            return zzte2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4400fy)) {
            return false;
        }
        C4400fy fyVar = (C4400fy) obj;
        C4419gq gqVar = this.f16145c;
        C4419gq gqVar2 = fyVar.f16145c;
        return (gqVar == null && gqVar2 == null) ? mo14528c().equals(fyVar.mo14528c()) : (gqVar == null || gqVar2 == null) ? gqVar != null ? gqVar.equals(fyVar.m21621b(gqVar.mo14501l())) : m21621b(gqVar2.mo14501l()).equals(gqVar2) : gqVar.equals(gqVar2);
    }

    public int hashCode() {
        return 1;
    }
}
