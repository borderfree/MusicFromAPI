package com.facebook.ads.internal.p070l;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.internal.l.b */
public class C1716b {

    /* renamed from: a */
    private static final List<C1714a> f5655a = new ArrayList();

    /* renamed from: a */
    public static void m8601a(C1714a aVar) {
        synchronized (f5655a) {
            f5655a.add(aVar);
        }
    }
}
