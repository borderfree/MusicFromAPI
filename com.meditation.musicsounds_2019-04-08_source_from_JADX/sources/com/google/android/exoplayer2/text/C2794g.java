package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.p100a.C2438e;

/* renamed from: com.google.android.exoplayer2.text.g */
public final class C2794g extends C2438e implements Comparable<C2794g> {

    /* renamed from: d */
    public long f9665d;

    public C2794g() {
        super(1);
    }

    /* renamed from: a */
    public int compareTo(C2794g gVar) {
        long j = this.f7789c - gVar.f7789c;
        if (j == 0) {
            return 0;
        }
        return j > 0 ? 1 : -1;
    }
}
