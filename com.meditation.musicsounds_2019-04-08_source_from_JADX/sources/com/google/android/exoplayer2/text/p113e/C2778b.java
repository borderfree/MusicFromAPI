package com.google.android.exoplayer2.text.p113e;

import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2768d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.e.b */
final class C2778b implements C2768d {

    /* renamed from: a */
    public static final C2778b f9603a = new C2778b();

    /* renamed from: b */
    private final List<C2741a> f9604b;

    private C2778b() {
        this.f9604b = Collections.emptyList();
    }

    public C2778b(C2741a aVar) {
        this.f9604b = Collections.singletonList(aVar);
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
        return j >= 0 ? this.f9604b : Collections.emptyList();
    }
}
