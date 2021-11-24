package com.bumptech.glide.request.p055a;

import com.bumptech.glide.p040g.C1258j;

/* renamed from: com.bumptech.glide.request.a.f */
public abstract class C1577f<Z> extends C1572a<Z> {

    /* renamed from: a */
    private final int f5112a;

    /* renamed from: b */
    private final int f5113b;

    public C1577f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C1577f(int i, int i2) {
        this.f5112a = i;
        this.f5113b = i2;
    }

    /* renamed from: a */
    public final void mo6446a(C1578g gVar) {
        if (C1258j.m6708a(this.f5112a, this.f5113b)) {
            gVar.mo6415a(this.f5112a, this.f5113b);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(this.f5112a);
        sb.append(" and height: ");
        sb.append(this.f5113b);
        sb.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public void mo6447b(C1578g gVar) {
    }
}
