package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.ei */
final class C4351ei extends C4353ek {

    /* renamed from: a */
    private int f16062a = 0;

    /* renamed from: b */
    private final int f16063b = this.f16064c.size();

    /* renamed from: c */
    private final /* synthetic */ zzte f16064c;

    C4351ei(zzte zzte) {
        this.f16064c = zzte;
    }

    /* renamed from: a */
    public final byte mo14328a() {
        int i = this.f16062a;
        if (i < this.f16063b) {
            this.f16062a = i + 1;
            return this.f16064c.zzan(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f16062a < this.f16063b;
    }
}
