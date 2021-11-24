package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C1375c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.p */
final class C1478p {

    /* renamed from: a */
    private final Map<C1375c, C1469j<?>> f4897a = new HashMap();

    /* renamed from: b */
    private final Map<C1375c, C1469j<?>> f4898b = new HashMap();

    C1478p() {
    }

    /* renamed from: a */
    private Map<C1375c, C1469j<?>> m7413a(boolean z) {
        return z ? this.f4898b : this.f4897a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1469j<?> mo6279a(C1375c cVar, boolean z) {
        return (C1469j) m7413a(z).get(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6280a(C1375c cVar, C1469j<?> jVar) {
        m7413a(jVar.mo6257a()).put(cVar, jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6281b(C1375c cVar, C1469j<?> jVar) {
        Map a = m7413a(jVar.mo6257a());
        if (jVar.equals(a.get(cVar))) {
            a.remove(cVar);
        }
    }
}
