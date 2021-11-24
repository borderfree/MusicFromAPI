package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

final class aay extends aaw {

    /* renamed from: a */
    private static final Class<?> f11383a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private aay() {
        super();
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.zb, com.google.android.gms.internal.ads.aau] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m15417a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m15418c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x001d
            boolean r0 = r0 instanceof com.google.android.gms.internal.ads.aav
            if (r0 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.aau r0 = new com.google.android.gms.internal.ads.aau
            r0.<init>(r6)
            goto L_0x0019
        L_0x0014:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0019:
            com.google.android.gms.internal.ads.adc.m15810a(r3, r4, r0)
            goto L_0x004f
        L_0x001d:
            java.lang.Class<?> r1 = f11383a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x003b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0036:
            com.google.android.gms.internal.ads.adc.m15810a(r3, r4, r1)
            r0 = r1
            goto L_0x004f
        L_0x003b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.acz
            if (r1 == 0) goto L_0x004f
            com.google.android.gms.internal.ads.aau r1 = new com.google.android.gms.internal.ads.aau
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.ads.acz r0 = (com.google.android.gms.internal.ads.acz) r0
            r1.addAll(r0)
            goto L_0x0036
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aay.m15417a(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: c */
    private static <E> List<E> m15418c(Object obj, long j) {
        return (List) adc.m15832f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo11529a(Object obj, long j) {
        return m15417a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo11530a(Object obj, Object obj2, long j) {
        List c = m15418c(obj2, j);
        List a = m15417a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        adc.m15810a(obj, j, (Object) c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo11531b(Object obj, long j) {
        Object obj2;
        List list = (List) adc.m15832f(obj, j);
        if (list instanceof aav) {
            obj2 = ((aav) list).mo11524e();
        } else if (!f11383a.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        adc.m15810a(obj, j, obj2);
    }
}
