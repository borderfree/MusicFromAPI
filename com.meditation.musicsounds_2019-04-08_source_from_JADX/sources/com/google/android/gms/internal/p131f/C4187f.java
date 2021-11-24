package com.google.android.gms.internal.p131f;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.f.f */
final class C4187f extends WeakReference<Throwable> {

    /* renamed from: a */
    private final int f15627a;

    public C4187f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f15627a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (this == obj) {
                return true;
            }
            C4187f fVar = (C4187f) obj;
            return this.f15627a == fVar.f15627a && get() == fVar.get();
        }
    }

    public final int hashCode() {
        return this.f15627a;
    }
}
