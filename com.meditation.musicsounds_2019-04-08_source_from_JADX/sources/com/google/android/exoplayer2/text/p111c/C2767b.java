package com.google.android.exoplayer2.text.p111c;

import com.google.android.exoplayer2.p102c.C2488a;
import com.google.android.exoplayer2.p102c.C2511s;
import com.google.android.exoplayer2.text.C2741a;
import com.google.android.exoplayer2.text.C2768d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.text.c.b */
final class C2767b implements C2768d {

    /* renamed from: a */
    private final C2741a[] f9548a;

    /* renamed from: b */
    private final long[] f9549b;

    public C2767b(C2741a[] aVarArr, long[] jArr) {
        this.f9548a = aVarArr;
        this.f9549b = jArr;
    }

    /* renamed from: a */
    public int mo9424a(long j) {
        int b = C2511s.m11813b(this.f9549b, j, false, false);
        if (b < this.f9549b.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: a */
    public long mo9425a(int i) {
        boolean z = false;
        C2488a.m11666a(i >= 0);
        if (i < this.f9549b.length) {
            z = true;
        }
        C2488a.m11666a(z);
        return this.f9549b[i];
    }

    /* renamed from: b */
    public int mo9426b() {
        return this.f9549b.length;
    }

    /* renamed from: b */
    public List<C2741a> mo9427b(long j) {
        int a = C2511s.m11800a(this.f9549b, j, true, false);
        return (a == -1 || this.f9548a[a] == null) ? Collections.emptyList() : Collections.singletonList(this.f9548a[a]);
    }
}
