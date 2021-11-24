package com.google.android.gms.internal.ads;

import java.util.List;

final class aaz extends aaw {
    private aaz() {
        super();
    }

    /* renamed from: c */
    private static <E> aan<E> m15422c(Object obj, long j) {
        return (aan) adc.m15832f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo11529a(Object obj, long j) {
        aan c = m15422c(obj, j);
        if (c.mo11501a()) {
            return c;
        }
        int size = c.size();
        aan a = c.mo11460a(size == 0 ? 10 : size << 1);
        adc.m15810a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo11530a(Object obj, Object obj2, long j) {
        aan c = m15422c(obj, j);
        aan c2 = m15422c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo11501a()) {
                c = c.mo11460a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        adc.m15810a(obj, j, (Object) c2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo11531b(Object obj, long j) {
        m15422c(obj, j).mo11502b();
    }
}
