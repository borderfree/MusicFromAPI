package com.facebook.ads.internal.adapters;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p072o.C1728c;
import com.facebook.ads.internal.p077s.p080c.C1823a;
import com.facebook.ads.internal.p083t.C1838a;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.adapters.f */
public class C1667f extends C1639a {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f5468c = "f";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C1823a f5469d;

    /* renamed from: e */
    private final C1728c f5470e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C1666e f5471f;

    /* renamed from: g */
    private boolean f5472g;

    public C1667f(Context context, C1728c cVar, C1823a aVar, C1838a aVar2, C1657b bVar) {
        super(context, bVar, aVar2);
        this.f5470e = cVar;
        this.f5469d = aVar;
    }

    /* renamed from: a */
    public void mo6786a(C1666e eVar) {
        this.f5471f = eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6675a(Map<String, String> map) {
        if (this.f5471f != null && !TextUtils.isEmpty(this.f5471f.mo6784f())) {
            this.f5470e.mo6939a(this.f5471f.mo6784f(), map);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo6787b() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f5472g     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0029
            com.facebook.ads.internal.adapters.e r0 = r2.f5471f     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x000a
            goto L_0x0029
        L_0x000a:
            r0 = 1
            r2.f5472g = r0     // Catch:{ all -> 0x002b }
            com.facebook.ads.internal.s.c.a r0 = r2.f5469d     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            com.facebook.ads.internal.adapters.e r0 = r2.f5471f     // Catch:{ all -> 0x002b }
            java.lang.String r0 = r0.mo6780b()     // Catch:{ all -> 0x002b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0027
            com.facebook.ads.internal.s.c.a r0 = r2.f5469d     // Catch:{ all -> 0x002b }
            com.facebook.ads.internal.adapters.f$1 r1 = new com.facebook.ads.internal.adapters.f$1     // Catch:{ all -> 0x002b }
            r1.<init>()     // Catch:{ all -> 0x002b }
            r0.post(r1)     // Catch:{ all -> 0x002b }
        L_0x0027:
            monitor-exit(r2)
            return
        L_0x0029:
            monitor-exit(r2)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.adapters.C1667f.mo6787b():void");
    }
}
