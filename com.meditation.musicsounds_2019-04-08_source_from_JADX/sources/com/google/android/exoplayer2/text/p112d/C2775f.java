package com.google.android.exoplayer2.text.p112d;

import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2768d;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.text.d.f */
final class C2775f implements C2768d {

    /* renamed from: a */
    private final C2771b f9590a;

    /* renamed from: b */
    private final long[] f9591b;

    /* renamed from: c */
    private final Map<String, C2774e> f9592c;

    /* renamed from: d */
    private final Map<String, C2772c> f9593d;

    public C2775f(C2771b bVar, Map<String, C2774e> map, Map<String, C2772c> map2) {
        this.f9590a = bVar;
        this.f9593d = map2;
        this.f9592c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f9591b = bVar.mo9445b();
    }

    /* renamed from: a */
    public int mo9424a(long j) {
        int b = C2511s.m11813b(this.f9591b, j, false, false);
        if (b < this.f9591b.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo9425a(int i) {
        return this.f9591b[i];
    }

    /* renamed from: b */
    public int mo9426b() {
        return this.f9591b.length;
    }

    /* renamed from: b */
    public List<C2741a> mo9427b(long j) {
        return this.f9590a.mo9442a(j, this.f9592c, this.f9593d);
    }
}
