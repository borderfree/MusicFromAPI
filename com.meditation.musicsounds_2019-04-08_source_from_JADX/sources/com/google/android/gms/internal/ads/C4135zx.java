package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.aai.C3392d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zx */
public final class C4135zx {

    /* renamed from: a */
    static final C4135zx f15222a = new C4135zx(true);

    /* renamed from: b */
    private static volatile boolean f15223b = false;

    /* renamed from: c */
    private static final Class<?> f15224c = m20599b();

    /* renamed from: d */
    private final Map<C4136zy, C3392d<?, ?>> f15225d;

    C4135zx() {
        this.f15225d = new HashMap();
    }

    private C4135zx(boolean z) {
        this.f15225d = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C4135zx m20598a() {
        return C4134zw.m20596a();
    }

    /* renamed from: b */
    private static Class<?> m20599b() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final <ContainingType extends abl> C3392d<ContainingType, ?> mo13875a(ContainingType containingtype, int i) {
        return (C3392d) this.f15225d.get(new C4136zy(containingtype, i));
    }
}
