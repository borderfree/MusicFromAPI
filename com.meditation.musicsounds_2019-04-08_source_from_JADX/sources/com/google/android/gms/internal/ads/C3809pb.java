package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.pb */
public final class C3809pb {

    /* renamed from: a */
    private final int f14638a;

    /* renamed from: b */
    private final List<aod> f14639b;

    /* renamed from: c */
    private final int f14640c;

    /* renamed from: d */
    private final InputStream f14641d;

    public C3809pb(int i, List<aod> list) {
        this(i, list, -1, null);
    }

    public C3809pb(int i, List<aod> list, int i2, InputStream inputStream) {
        this.f14638a = i;
        this.f14639b = list;
        this.f14640c = i2;
        this.f14641d = inputStream;
    }

    /* renamed from: a */
    public final int mo13437a() {
        return this.f14638a;
    }

    /* renamed from: b */
    public final List<aod> mo13438b() {
        return Collections.unmodifiableList(this.f14639b);
    }

    /* renamed from: c */
    public final int mo13439c() {
        return this.f14640c;
    }

    /* renamed from: d */
    public final InputStream mo13440d() {
        return this.f14641d;
    }
}
