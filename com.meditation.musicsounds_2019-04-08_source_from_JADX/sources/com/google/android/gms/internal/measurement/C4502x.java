package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C3266s;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x */
public final class C4502x {

    /* renamed from: a */
    private final long f16387a = 0;

    /* renamed from: b */
    private final String f16388b;

    /* renamed from: c */
    private final String f16389c;

    /* renamed from: d */
    private final boolean f16390d;

    /* renamed from: e */
    private long f16391e;

    /* renamed from: f */
    private final Map<String, String> f16392f;

    public C4502x(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        C3266s.m14915a(str);
        C3266s.m14915a(str2);
        this.f16388b = str;
        this.f16389c = str2;
        this.f16390d = z;
        this.f16391e = j2;
        this.f16392f = map != null ? new HashMap<>(map) : Collections.emptyMap();
    }

    /* renamed from: a */
    public final long mo14862a() {
        return this.f16387a;
    }

    /* renamed from: a */
    public final void mo14863a(long j) {
        this.f16391e = j;
    }

    /* renamed from: b */
    public final String mo14864b() {
        return this.f16388b;
    }

    /* renamed from: c */
    public final String mo14865c() {
        return this.f16389c;
    }

    /* renamed from: d */
    public final boolean mo14866d() {
        return this.f16390d;
    }

    /* renamed from: e */
    public final long mo14867e() {
        return this.f16391e;
    }

    /* renamed from: f */
    public final Map<String, String> mo14868f() {
        return this.f16392f;
    }
}
