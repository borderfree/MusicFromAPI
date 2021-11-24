package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ge */
final class C4407ge extends C4404gb {
    private C4407ge() {
        super();
    }

    /* renamed from: c */
    private static <E> C4394fs<E> m21661c(Object obj, long j) {
        return (C4394fs) C4462if.m22028f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo14550a(Object obj, long j) {
        C4394fs c = m21661c(obj, j);
        if (c.mo14307a()) {
            return c;
        }
        int size = c.size();
        C4394fs a = c.mo14322a(size == 0 ? 10 : size << 1);
        C4462if.m22005a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo14551a(Object obj, Object obj2, long j) {
        C4394fs c = m21661c(obj, j);
        C4394fs c2 = m21661c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo14307a()) {
                c = c.mo14322a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C4462if.m22005a(obj, j, (Object) c2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14552b(Object obj, long j) {
        m21661c(obj, j).mo14312b();
    }
}
