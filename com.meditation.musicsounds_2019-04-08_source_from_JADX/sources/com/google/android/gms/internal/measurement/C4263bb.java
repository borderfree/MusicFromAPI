package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C3266s;
import com.google.android.gms.common.p120a.C3013a;

/* renamed from: com.google.android.gms.internal.measurement.bb */
public final class C4263bb<V> {

    /* renamed from: a */
    private final V f15785a;

    /* renamed from: b */
    private final C3013a<V> f15786b;

    private C4263bb(C3013a<V> aVar, V v) {
        C3266s.m14913a(aVar);
        this.f15786b = aVar;
        this.f15785a = v;
    }

    /* renamed from: a */
    static C4263bb<Float> m21036a(String str, float f, float f2) {
        return new C4263bb<>(C3013a.m13983a(str, Float.valueOf(0.5f)), Float.valueOf(0.5f));
    }

    /* renamed from: a */
    static C4263bb<Integer> m21037a(String str, int i, int i2) {
        return new C4263bb<>(C3013a.m13984a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    /* renamed from: a */
    static C4263bb<Long> m21038a(String str, long j, long j2) {
        return new C4263bb<>(C3013a.m13985a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    /* renamed from: a */
    static C4263bb<String> m21039a(String str, String str2, String str3) {
        return new C4263bb<>(C3013a.m13986a(str, str3), str2);
    }

    /* renamed from: a */
    static C4263bb<Boolean> m21040a(String str, boolean z, boolean z2) {
        return new C4263bb<>(C3013a.m13987a(str, z2), Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final V mo14166a() {
        return this.f15785a;
    }
}
