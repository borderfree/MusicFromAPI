package com.google.android.exoplayer2.text.p109a;

import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2768d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.a.f */
final class C2751f implements C2768d {

    /* renamed from: a */
    private final List<C2741a> f9485a;

    public C2751f(List<C2741a> list) {
        this.f9485a = list;
    }

    /* renamed from: a */
    public int mo9424a(long j) {
        return j < 0 ? 0 : -1;
    }

    /* renamed from: a */
    public long mo9425a(int i) {
        C2488a.m11666a(i == 0);
        return 0;
    }

    /* renamed from: b */
    public int mo9426b() {
        return 1;
    }

    /* renamed from: b */
    public List<C2741a> mo9427b(long j) {
        return j >= 0 ? this.f9485a : Collections.emptyList();
    }
}
