package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.i */
public class C3146i {

    /* renamed from: a */
    private final Set<C3142h<?>> f10899a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo11068a() {
        for (C3142h a : this.f10899a) {
            a.mo11060a();
        }
        this.f10899a.clear();
    }
}
