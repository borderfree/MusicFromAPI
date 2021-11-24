package com.google.android.exoplayer2.text.p114f;

import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2768d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.f.c */
final class C2783c implements C2768d {

    /* renamed from: a */
    private final List<C2741a> f9614a;

    public C2783c(List<C2741a> list) {
        this.f9614a = Collections.unmodifiableList(list);
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
        return j >= 0 ? this.f9614a : Collections.emptyList();
    }
}
