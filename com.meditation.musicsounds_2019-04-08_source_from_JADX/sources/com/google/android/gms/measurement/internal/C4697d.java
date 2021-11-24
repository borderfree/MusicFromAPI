package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3266s;

/* renamed from: com.google.android.gms.measurement.internal.d */
final class C4697d {

    /* renamed from: a */
    final String f16928a;

    /* renamed from: b */
    final String f16929b;

    /* renamed from: c */
    final long f16930c;

    /* renamed from: d */
    final long f16931d;

    /* renamed from: e */
    final long f16932e;

    /* renamed from: f */
    final long f16933f;

    /* renamed from: g */
    final Long f16934g;

    /* renamed from: h */
    final Long f16935h;

    /* renamed from: i */
    final Long f16936i;

    /* renamed from: j */
    final Boolean f16937j;

    C4697d(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        C3266s.m14915a(str);
        C3266s.m14915a(str2);
        boolean z = false;
        C3266s.m14923b(j5 >= 0);
        C3266s.m14923b(j6 >= 0);
        if (j7 >= 0) {
            z = true;
        }
        C3266s.m14923b(z);
        this.f16928a = str;
        this.f16929b = str2;
        this.f16930c = j5;
        this.f16931d = j6;
        this.f16932e = j3;
        this.f16933f = j7;
        this.f16934g = l;
        this.f16935h = l2;
        this.f16936i = l3;
        this.f16937j = bool;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4697d mo15475a(long j) {
        C4697d dVar = new C4697d(this.f16928a, this.f16929b, this.f16930c, this.f16931d, j, this.f16933f, this.f16934g, this.f16935h, this.f16936i, this.f16937j);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4697d mo15476a(long j, long j2) {
        C4697d dVar = new C4697d(this.f16928a, this.f16929b, this.f16930c, this.f16931d, this.f16932e, j, Long.valueOf(j2), this.f16935h, this.f16936i, this.f16937j);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4697d mo15477a(Long l, Long l2, Boolean bool) {
        C4697d dVar = new C4697d(this.f16928a, this.f16929b, this.f16930c, this.f16931d, this.f16932e, this.f16933f, this.f16934g, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return dVar;
    }
}
