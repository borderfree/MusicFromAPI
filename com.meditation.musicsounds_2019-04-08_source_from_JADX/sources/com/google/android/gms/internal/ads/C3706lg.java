package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@C3464ci
/* renamed from: com.google.android.gms.internal.ads.lg */
public final class C3706lg {

    /* renamed from: a */
    private Map<Integer, Bitmap> f14387a = new ConcurrentHashMap();

    /* renamed from: b */
    private AtomicInteger f14388b = new AtomicInteger(0);

    /* renamed from: a */
    public final int mo13216a(Bitmap bitmap) {
        if (bitmap == null) {
            C3643iy.m19172b("Bitmap is null. Skipping putting into the Memory Map.");
            return -1;
        }
        int andIncrement = this.f14388b.getAndIncrement();
        this.f14387a.put(Integer.valueOf(andIncrement), bitmap);
        return andIncrement;
    }

    /* renamed from: a */
    public final Bitmap mo13217a(Integer num) {
        return (Bitmap) this.f14387a.get(num);
    }

    /* renamed from: b */
    public final void mo13218b(Integer num) {
        this.f14387a.remove(num);
    }
}
