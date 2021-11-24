package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.gd */
final class C4406gd extends C4404gb {

    /* renamed from: a */
    private static final Class<?> f16160a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C4406gd() {
        super();
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.ee, com.google.android.gms.internal.measurement.fz] */
    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m21656a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m21657c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4403ga
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.fz r0 = new com.google.android.gms.internal.measurement.fz
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4432hc
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4394fs
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.fs r0 = (com.google.android.gms.internal.measurement.C4394fs) r0
            com.google.android.gms.internal.measurement.fs r6 = r0.mo14322a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.C4462if.m22005a(r3, r4, r0)
            goto L_0x007a
        L_0x002d:
            java.lang.Class<?> r1 = f16160a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L_0x0046:
            com.google.android.gms.internal.measurement.C4462if.m22005a(r3, r4, r1)
            r0 = r1
            goto L_0x007a
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4459ic
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.measurement.fz r1 = new com.google.android.gms.internal.measurement.fz
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.measurement.ic r0 = (com.google.android.gms.internal.measurement.C4459ic) r0
            r1.addAll(r0)
            goto L_0x0046
        L_0x005f:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4432hc
            if (r1 == 0) goto L_0x007a
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C4394fs
            if (r1 == 0) goto L_0x007a
            r1 = r0
            com.google.android.gms.internal.measurement.fs r1 = (com.google.android.gms.internal.measurement.C4394fs) r1
            boolean r2 = r1.mo14307a()
            if (r2 != 0) goto L_0x007a
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.fs r0 = r1.mo14322a(r0)
            goto L_0x0029
        L_0x007a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4406gd.m21656a(java.lang.Object, long, int):java.util.List");
    }

    /* renamed from: c */
    private static <E> List<E> m21657c(Object obj, long j) {
        return (List) C4462if.m22028f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo14550a(Object obj, long j) {
        return m21656a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo14551a(Object obj, Object obj2, long j) {
        List c = m21657c(obj2, j);
        List a = m21656a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C4462if.m22005a(obj, j, (Object) c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo14552b(Object obj, long j) {
        Object obj2;
        List list = (List) C4462if.m22028f(obj, j);
        if (list instanceof C4403ga) {
            obj2 = ((C4403ga) list).mo14532e();
        } else if (!f16160a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C4432hc) || !(list instanceof C4394fs)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C4394fs fsVar = (C4394fs) list;
                if (fsVar.mo14307a()) {
                    fsVar.mo14312b();
                }
                return;
            }
        } else {
            return;
        }
        C4462if.m22005a(obj, j, obj2);
    }
}
