package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hn */
final class C4443hn extends C4449ht {

    /* renamed from: a */
    private final /* synthetic */ C4440hk f16228a;

    private C4443hn(C4440hk hkVar) {
        this.f16228a = hkVar;
        super(hkVar, null);
    }

    /* synthetic */ C4443hn(C4440hk hkVar, C4441hl hlVar) {
        this(hkVar);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new C4442hm(this.f16228a, null);
    }
}
