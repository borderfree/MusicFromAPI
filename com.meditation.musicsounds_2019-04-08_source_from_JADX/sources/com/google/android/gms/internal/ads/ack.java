package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map.Entry;

final class ack extends acq {

    /* renamed from: a */
    private final /* synthetic */ ach f11483a;

    private ack(ach ach) {
        this.f11483a = ach;
        super(ach, null);
    }

    /* synthetic */ ack(ach ach, aci aci) {
        this(ach);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new acj(this.f11483a, null);
    }
}
