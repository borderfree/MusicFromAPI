package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class aco implements Comparable<aco>, Entry<K, V> {

    /* renamed from: a */
    private final K f11486a;

    /* renamed from: b */
    private V f11487b;

    /* renamed from: c */
    private final /* synthetic */ ach f11488c;

    aco(ach ach, K k, V v) {
        this.f11488c = ach;
        this.f11486a = k;
        this.f11487b = v;
    }

    aco(ach ach, Entry<K, V> entry) {
        this(ach, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: a */
    private static boolean m15733a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((aco) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m15733a(this.f11486a, entry.getKey()) && m15733a(this.f11487b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f11486a;
    }

    public final V getValue() {
        return this.f11487b;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f11486a == null ? 0 : this.f11486a.hashCode();
        if (this.f11487b != null) {
            i = this.f11487b.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.f11488c.m15720f();
        V v2 = this.f11487b;
        this.f11487b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11486a);
        String valueOf2 = String.valueOf(this.f11487b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
