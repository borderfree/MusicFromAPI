package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class aid implements awc {

    /* renamed from: a */
    private final Map<String, List<auc<?>>> f12097a = new HashMap();

    /* renamed from: b */
    private final agb f12098b;

    aid(agb agb) {
        this.f12098b = agb;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m16312b(com.google.android.gms.internal.ads.auc<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo12503e()     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.auc<?>>> r1 = r5.f12097a     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.auc<?>>> r1 = r5.f12097a     // Catch:{ all -> 0x0052 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
            r1.<init>()     // Catch:{ all -> 0x0052 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo12498b(r4)     // Catch:{ all -> 0x0052 }
            r1.add(r6)     // Catch:{ all -> 0x0052 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.auc<?>>> r6 = r5.f12097a     // Catch:{ all -> 0x0052 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C3504dv.f13779a     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C3504dv.m18312b(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0038:
            monitor-exit(r5)
            return r2
        L_0x003a:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.auc<?>>> r1 = r5.f12097a     // Catch:{ all -> 0x0052 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
            r6.mo12492a(r5)     // Catch:{ all -> 0x0052 }
            boolean r6 = com.google.android.gms.internal.ads.C3504dv.f13779a     // Catch:{ all -> 0x0052 }
            if (r6 == 0) goto L_0x0050
            java.lang.String r6 = "new request, sending to network %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
            r1[r3] = r0     // Catch:{ all -> 0x0052 }
            com.google.android.gms.internal.ads.C3504dv.m18312b(r6, r1)     // Catch:{ all -> 0x0052 }
        L_0x0050:
            monitor-exit(r5)
            return r3
        L_0x0052:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aid.m16312b(com.google.android.gms.internal.ads.auc):boolean");
    }

    /* renamed from: a */
    public final synchronized void mo11969a(auc<?> auc) {
        String e = auc.mo12503e();
        List list = (List) this.f12097a.remove(e);
        if (list != null && !list.isEmpty()) {
            if (C3504dv.f13779a) {
                C3504dv.m18310a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), e);
            }
            auc auc2 = (auc) list.remove(0);
            this.f12097a.put(e, list);
            auc2.mo12492a((awc) this);
            try {
                this.f12098b.f11955c.put(auc2);
            } catch (InterruptedException e2) {
                C3504dv.m18313c("Couldn't add request to queue. %s", e2.toString());
                Thread.currentThread().interrupt();
                this.f12098b.mo11885a();
            }
        }
    }

    /* renamed from: a */
    public final void mo11970a(auc<?> auc, bae<?> bae) {
        List<auc> list;
        if (bae.f13444b == null || bae.f13444b.mo11841a()) {
            mo11969a(auc);
            return;
        }
        String e = auc.mo12503e();
        synchronized (this) {
            list = (List) this.f12097a.remove(e);
        }
        if (list != null) {
            if (C3504dv.f13779a) {
                C3504dv.m18310a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), e);
            }
            for (auc a : list) {
                this.f12098b.f11957e.mo11427a(a, bae);
            }
        }
    }
}
