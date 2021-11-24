package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.zh */
final class C4119zh implements Iterator {

    /* renamed from: a */
    private int f15171a = 0;

    /* renamed from: b */
    private final int f15172b = this.f15173c.size();

    /* renamed from: c */
    private final /* synthetic */ zzbah f15173c;

    C4119zh(zzbah zzbah) {
        this.f15173c = zzbah;
    }

    /* renamed from: a */
    private final byte m20426a() {
        try {
            zzbah zzbah = this.f15173c;
            int i = this.f15171a;
            this.f15171a = i + 1;
            return zzbah.zzbn(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f15171a < this.f15172b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m20426a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
