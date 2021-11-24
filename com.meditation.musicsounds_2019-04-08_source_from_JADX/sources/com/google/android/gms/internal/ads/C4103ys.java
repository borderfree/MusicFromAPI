package com.google.android.gms.internal.ads;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.ys */
final class C4103ys extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f15087a;

    public C4103ys(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, null);
        if (th != null) {
            this.f15087a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C4103ys ysVar = (C4103ys) obj;
            return this.f15087a == ysVar.f15087a && get() == ysVar.get();
        }
    }

    public final int hashCode() {
        return this.f15087a;
    }
}
