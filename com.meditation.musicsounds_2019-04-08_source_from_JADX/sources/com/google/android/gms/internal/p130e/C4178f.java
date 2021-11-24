package com.google.android.gms.internal.p130e;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.e.f */
final class C4178f extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f15617a;

    public C4178f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f15617a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C4178f fVar = (C4178f) obj;
            return this.f15617a == fVar.f15617a && get() == fVar.get();
        }
    }

    public final int hashCode() {
        return this.f15617a;
    }
}
