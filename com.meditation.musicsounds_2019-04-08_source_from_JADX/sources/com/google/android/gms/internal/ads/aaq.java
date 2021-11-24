package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class aaq<K> implements Entry<K, Object> {

    /* renamed from: a */
    private Entry<K, aao> f11367a;

    private aaq(Entry<K, aao> entry) {
        this.f11367a = entry;
    }

    /* renamed from: a */
    public final aao mo11506a() {
        return (aao) this.f11367a.getValue();
    }

    public final K getKey() {
        return this.f11367a.getKey();
    }

    public final Object getValue() {
        if (((aao) this.f11367a.getValue()) == null) {
            return null;
        }
        return aao.m15392a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof abl) {
            return ((aao) this.f11367a.getValue()).mo11516a((abl) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
