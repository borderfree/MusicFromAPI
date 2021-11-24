package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C3044e.C3045a;
import com.google.android.gms.common.api.C3049h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C4797g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.p */
public final class C3153p {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f10905a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C4797g<?>, Boolean> f10906b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    private final void m14537a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f10905a) {
            hashMap = new HashMap(this.f10905a);
        }
        synchronized (this.f10906b) {
            hashMap2 = new HashMap(this.f10906b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo10877c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C4797g) entry2.getKey()).mo15932b((Exception) new ApiException(status));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo11075a(BasePendingResult<? extends C3049h> basePendingResult, boolean z) {
        this.f10905a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo10868a((C3045a) new C3154q(this, basePendingResult));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo11076a() {
        return !this.f10905a.isEmpty() || !this.f10906b.isEmpty();
    }

    /* renamed from: b */
    public final void mo11077b() {
        m14537a(false, C3135d.f10849a);
    }

    /* renamed from: c */
    public final void mo11078c() {
        m14537a(true, C3102bu.f10754a);
    }
}
