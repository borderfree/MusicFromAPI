package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.fw */
final class C4398fw<K> implements Entry<K, Object> {

    /* renamed from: a */
    private Entry<K, C4395ft> f16141a;

    private C4398fw(Entry<K, C4395ft> entry) {
        this.f16141a = entry;
    }

    /* renamed from: a */
    public final C4395ft mo14519a() {
        return (C4395ft) this.f16141a.getValue();
    }

    public final K getKey() {
        return this.f16141a.getKey();
    }

    public final Object getValue() {
        if (((C4395ft) this.f16141a.getValue()) == null) {
            return null;
        }
        return C4395ft.m21618a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C4419gq) {
            return ((C4395ft) this.f16141a.getValue()).mo14526a((C4419gq) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
